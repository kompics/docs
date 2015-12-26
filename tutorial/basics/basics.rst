.. _basics:

Kompics Basics
==============
This section of the tutorial will properly introduce the basic concepts in Kompics, namely *components*, *ports*, *handlers*, and *channels*.

The example application is a simple *PingPong* application, with two components that send messages back and forth between them.

Components
----------
A *component* in Kompics is a stateful object that can be scheduled and can access its own state without need for synchronisation. Typically components encapsulate some kind of functionality, providing certain services and possibly requiring others. Components can also have *child* components *created* within and these *parent*-*child* relations form a supervision hierarchy tree.

In Java terms a component is class that extends :java:ref:`se.sics.kompics.ComponentDefinition`. If a component needs any additional parameters upon creation, a constructor that takes implementation of :java:ref:`se.sics.kompics.Init` can be used and the instance passed on creation. Otherwise simply pass ``Init.NONE``.

For this example we need three components, two to do the work, and a parent that handles setup:

.. code-block:: java

	public class Pinger extends ComponentDefinition {

	}

.. code-block:: java
	
	public class Ponger extends ComponentDefinition {

	}

.. code-block:: java
	
	public class Parent extends ComponentDefinition {
		Component pinger = create(Pinger.class, Init.NONE);
		Component ponger = create(Ponger.class, Init.NONE);
	}

Ports and Events
-----------------
A *port type* in Kompics is a bit like a service interface. It defines what kind of *events* (you may think of *messages*, although in Kompics we typically reserve that term for events that are addressable via the network) may pass through the port and in which direction. Events may be declared in a port type in either *indication* (*positive*) or *request* (*negative*) direction. In a similar fashion a component either *requires* or *provides* a *port* (think port type instance).

The closest analogy to the Kompics terminology in this respect might be electric charge carriers and electrodes in some kind of conductive medium. Think of the events as charge carriers (indications carry positive charge, and requests carry negative charge). Every port has both an anode and a cathode side. If a component requires port *A* then inside the component you have access to *A*'s positive (cathode) side where indications (positive charge carriers) come out of, and outside the component you have access to *A* negative (anode) side where requests (negative charge carriers) come out of. Conversely if a component provides *A* then inside the component the negative (anode) side spits out requests (negative charge carriers) and the outside is positive (cathode) and indications (positive charge carriers) come out this way. In both cases the charge that isn't going out is the one that's going in.

An alternativ analogy that is a bit more limited but usually easier to keep in mind is that of service providers and consumers. Consider a port *A* to be a service contract. A component that provides service *A* handles events that are specified as requests in *A* and sends out events that are specified as indications in *A*. Conversely a component that requires service *A* sends out events that are specified as requests in *A* and handles events that are specified as indications in *A* (thus are in a sense replies to its own requests).

In Java terms an event is a class that implements :java:ref:`se.sics.kompics.KompicsEvent` (which is only a marker interface with no required methods) and a port type is a singleton that extends :java:ref:`se.sics.kompics.PortType` and registers its types on load. All port types are automatically instantiated when their classes get loaded. Port instances fall in the two categeories: Those that implement :java:ref:`se.sics.kompics.Positive` of the port type (the result of a call to ``requires``) and those that implement :java:ref:`se.sics.kompics.Negative` of the port type (the result of a call to ``provides``). Internally ports a binary linked with both a positive and a negative side.

For the this example we need two events and one port type:

.. code-block:: java

	public class Ping implements KompicsEvent {

	}

.. code-block:: java

	public class Pong implements KompicsEvent {

	}

.. code-block:: java

	public class PingPongPort extends PortType {{
		request(Ping.class);
		indication(Pong.class);
	}}

.. note::

	It is highly recommended to only write completely immutable events. Since Kompics will deliver the same event instance to all subscribed handlers in all connected components, writing mutable events can lead to some nasty and difficult to find bugs.
	For encapsulating collections in a safe manner, the reader is referred Google's excellent `Guava <https://github.com/google/guava/wiki>`_ library (which is already a dependency of Kompics core anyway) and its immutable collection types.

We also want to add the ports to the two components such that ``Pinger`` sends ``Ping``\s and ``Ponger`` sends ``Pong``\s, which is hopefully somewhat intuitive:

.. code-block:: java

	public class Pinger extends ComponentDefinition {
		Positive<PingPongPort> ppp = requires(PingPongPort.class);
	}

.. code-block:: java
	
	public class Ponger extends ComponentDefinition {
		Negative<PingPongPort> ppp = provides(PingPongPort.class);
	}


Handlers
--------
In order for components to actually get scheduled and process events, a *handler* for a specific event type must be *subscribed* to a port that spits out that kind of event. If an event arrives at a component's port and no handler is subscribed for its type, then the event is simply silently dropped.

In Java terms the most common way of working with handlers is to assign an anonymous class that extends :java:ref:`se.sics.kompics.Handler` of the desired event type to either a class field or a block variable and then call ``subscribe`` with that variable and the target port.

In our example we want the ``Pinger`` to send the first ``Ping`` when it received the ``Start`` event (which we saw in the :ref:`helloworld` example already), and then reply to every ``Pong`` event it receives with a new ``Ping``. The ``Ponger`` simply waits for a ``Ping`` and replies with a ``Pong``.
We also print something so we can see it working on the console.

.. code-block:: java

	public class Pinger extends ComponentDefinition {
		Positive<PingPongPort> ppp = requires(PingPongPort.class);

		Handler<Start> startHandler = new Handler<Start>(){
			public void handle(Start event) {
				trigger(new Ping(), ppp);
			}
		};
		Handler<Pong> pongHandler = new Handler<Pong>(){
			public void handle(Pong event) {
				System.out.println("Got a Pong!");
				trigger(new Ping(), ppp);
			}
		};
		{
			subscribe(startHandler, control);
			subscribe(pongHandler, ppp);
		}
	}

.. code-block:: java
	
	public class Ponger extends ComponentDefinition {
		Negative<PingPongPort> ppp = provides(PingPongPort.class);

		Handler<Ping> pingHandler = new Handler<Ping>(){
			public void handle(Ping event) {
				System.out.println("Got a Ping!");
				trigger(new Pong(), ppp);
			}
		};
		{
			subscribe(pingHandler, ppp);
		}
	}

Channels
--------
Since normal in events in Kompics are not addressed, we need to tell the system somehow where a triggered event is supposed to go. The method for this is by connecting *channels*. A single channel connects exactly two ports of opposite polarity (or direction, if you prefer). You can connect both ports that are inside and outside of a component. The normal way is to connect the outside of a required port of a component *A* to the outside of a required port of another component *B*. In this setup *B* provides the port's service to *A*, so to speak. The alternative setup is to connect the inside of required port of *A* to the outside of a required port of *B* (remember that insides and outsides are of opposite types, so this actually works). This setup is called *chaining* and it has both *A* and *B* share the service of whatever component connects to the outside of *A*\s port. Alternatively, *A* (or its parent) could pass on the outside of the port that *A* is connected to directly to *B*. This has the same effect, but is a bit more efficient (fewer method invocations while travelling along channel chains). However, it might also break abstraction in some cases. The decision which method is appropriate under certain conditions is left up to the programmer.

In Java channels are created with the ``connect`` method.

.. code-block:: java
	
	public class Parent extends ComponentDefinition {
		Component pinger = create(Pinger.class, Init.NONE);
		Component ponger = create(Ponger.class, Init.NONE);

		{
			connect(pinger.getNegative(PingPongPort.class), ponger.getPositive(PingPongPort.clas));
		}
	}

Kompics Runtime
---------------------
The runtime itself is responsible for starting and stopping the scheduler and initialising the component hierarchy. The entry point to start Kompics is ``Kompics.createAndStart`` which comes in several variants for tuning and parameters. The most basic one simply takes the top-level component's class.

For our example we want to start Kompics with the ``Parent`` top-level component and since it would ping-pong forever on its own, we also want to stop it again after waiting for some time, say ten seconds:

.. code-block:: java
	
	public class Main {
		public static void main(String[] args) {
			Kompics.createAndStart(Parent.class);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ex) {
				System.exit(1);
			}
			Kompics.shutdown();
			System.exit(0);
		}
	}

Now finally compile with::

	mvn clean compile

To run the project from within maven::

	mvn exec:java -Dexec.mainClass="se.sics.test.Main"


Component State
---------------
So far the compics components we used haven't really used any state. To show a simple example we are going to introduce a ``counter`` variable in both ``Pinger`` and ``Pinger`` and print the sequence number of the current ``Ping`` or ``Pong`` to console. To show that this works correctly even in multi-threaded execution we'll also add as a second thread to the Kompics runtime. And since using ``System.out.println`` is not the nicest way, we'll introduce ``slf4j`` loggers into both components.

.. literalinclude:: pingpong/src/main/java/se/sics/test/Main.java

.. literalinclude:: pingpong/src/main/java/se/sics/test/Pinger.java

.. literalinclude:: pingpong/src/main/java/se/sics/test/Ponger.java

Compile and run in the same way as before.

The whole example project can be downloaded :download:`here <pingpong.zip>`.
