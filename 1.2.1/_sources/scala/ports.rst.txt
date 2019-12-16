.. _ksports:

Ports and Port Types
====================
One thing that wasn't included in the long *PingPong* example from the previous section, was the Scala DSL to define new port types.

It was pointed out before that the correct way to deal with singleton classes in Scala is to create objects and this philosophy is followed by the port type DSL. The major change this brings with it, is that now there are two ways to deal with ports type: Java port types are classes and need to be used with either ``classOf`` or `TypeTags <http://docs.scala-lang.org/overviews/reflection/typetags-manifests.html>`_. On the other hand, Scala port types are objects and need to be treated like values, since objects are not types in Scala. And the same holds true for the difference between (case) classes and (case) objects for events.

To make this clear, we will use a somewhat artificial example. Consider the following three Kompics events:

.. code-block:: scala

	case class Ping(n: Int) extends KompicsEvent
	case class Pong(n: Int) extends KompicsEvent
	case object Ack extends KompicsEvent

Now a ``PingPong`` port in Scala could look like this:

.. code-block:: scala

	import se.sics.kompics.sl._

	object PingPong extends Port {
		request[Ping] // class -> TypeTag
		indication[Pong] // class -> TypeTag
		request(Ack) // object -> value
	}

Note the important difference between the square brackets where *TypeTags* are used to declare the event on the port, and and the parenthesis where a value is passed as an argument.

The same things happens again when port types are used. In the previous section we declared

.. code-block:: scala

	val net = requires[Network];

and wrote

.. code-block:: scala

	connect[Network](network -> ponger);


For our new ``PingPong`` port we would have to write the following instead:

.. code-block:: scala

	val pp = requires(PingPong);
	connect(PingPong)(ponger -> pinger);

While this dichotomy of invocations might seem a bit inconsistent it is practically easily applied as the compiler will simply complain when one is trying to do the wrong thing.
