.. highlight:: scala

.. _ksengine:

Kompics Scala Engine Changes
============================

There is really only a single change to Kompics' underlying execution engine in Kompics Scala, while everything else is merely cosmetical in nature. That difference concerns the way events are matched to handlers and then executed. 

In order to understand the difference it is necessary to understand the Java execution first.

Java Handler Execution
----------------------
In the Java implementation an event that is coming in on a port is matched solely based on its type hierarchy. The event's type and supertypes are traversed from most specific to most general until a match is found in the map containing all handlers subscribed on the port, indexed by their event type (the argument type of the ``handle`` method). If such a match is found, the event is then queued at the port, the port is added to a ready queue, and the component is then submitted to the scheduler for execution (if it isn't already being scheduled). The matching time complexity in this implementation is constant (hash map lookup isn't cheap, though) in the number of subscribed handlers and (worst case) linear in the number :math:`s` of supertypes, so in total :math:`O(1s)`.

When the scheduler decides to execute the component, the component picks the first port with waiting events, takes the first event out of the queue and executes all handlers that match that event [#fproc]_. If ``maxEventExecuteNumber`` was set to some :math:`n` other than 1 when starting Kompics, the component will continue in this way of picking ports and events until all the queues are empty or it has executed :math:`n` events (but possibly more handlers).

Scala Handler Execution
-----------------------
In Kompics Scala, the :java:ref:`se.sics.kompics.ComponentCore` and :java:ref:`se.sics.kompics.PortCore` implementations have been replaced to allow handers use Scala's built-in pattern matching facilities instead. To this end in Scala the type ``Handler`` is in fact only a `type alias <http://twitter.github.io/effectivescala/#Types%20and%20Generics-Type%20aliases>`_ for ``KompicsEvent => () => Unit`` [#fpartial]_. From that signature is should become clear, that in Scala when an event comes in on a port, all the subscribed ``Handler``\s must be tested for matches, that means event matching is linear in the number of subscribed handlers :math:`h`. The pattern matching itself also has some internal complexity :math:`p`, which depends on the sizes of the extracted pattern and the number of cases to match against. In total the computational complexity in the Scala version is then :math:`O(ph)`. However, as opposed to the Java version, this matching cost is only incurred once, as the resulting ``MatchedHandler`` (type alias for ``() => Unit``) closure is stored along with the event that it matched.

This can be seen somewhat easier by removing some syntactic sugar from the handler definition from the :ref:`kshelloworld` example. Instead of

.. code-block:: scala

    ctrl uponEvent {
        case _: Start => handle {
            println("Hello World!");
            Kompics.asyncShutdown();
        }
    }

we can also write:

.. code-block:: scala

    val startHandler = (e: KompicsEvent) => e match {
        case _: Start => () => {
            println("Hello World!");
            Kompics.asyncShutdown();
        }
    }
    ctrl uponEvent startHandler;

Finally, similar to before in Java, once the component is being executed by the scheduler a port and an event are picked and all stored ``MatchedHandler``\s for that event are run, and so on, until all the queues are empty or it has executed :math:`n` events.

.. rubric:: Footnotes

.. [#fproc] Here the whole matching procedure is executed a second time.
.. [#fpartial] The fact that most handlers will in fact be `partial functions <http://twitter.github.io/effectivescala/#Functional%20programming-Partial%20functions>`_ is dealt with internally by Kompics by catching MatchErrors.