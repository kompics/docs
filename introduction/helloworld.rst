.. _helloworld:

Hello World in Kompics
======================

This section describes the simplest possible Kompics program, the well-known *Hello World*.

A proper introduction can be found in the :ref:`tutorial`.

Maven Setup
-----------
Set up a new maven project and follow the instructions in :ref:`repos` and :ref:`gettingstarted` to include the necessary dependencies. For this simple example the ``kompics-core`` module will be sufficient.

The resulting :download:`pom.xml <helloworld/pom.xml>` might look something like:

.. literalinclude:: helloworld/pom.xml
	:language: xml


Hello World Component
---------------------
This very simple component contains but a single handler, which is executed when a ``Start`` event is triggered on the ``control`` port. ``Start`` events are part of Kompic's component lifecycle and always need to be triggered on a component exactly once to get it to handle events. A component that is never started is considered paused and will queue up events on its ports, but never execute them.

.. literalinclude:: helloworld/src/main/java/se/sics/test/HelloComponent.java

.. warning::

	Do not forget to subscribe Kompics handlers to ports! It is the most common mistake, and it is very easy to overlook when debugging.

Main
----
The :file:`Main.java` is very simple and only starts the Kompics framework by calling ``Kompics.createAndStart`` with the class of the root component. It also automatically sends a ``Start`` event to the component once the constructor has finished.

.. literalinclude:: helloworld/src/main/java/se/sics/test/Main.java

Compiling and Running
---------------------
To compile the source code use::

	mvn clean compile

To run the project from within maven::

	mvn exec:java -Dexec.mainClass="se.sics.test.Main"

This is all. Say hello to Kompics ;)

Logging
-------
You might notice that if you used only the code from above ``log4j`` complains that is improperly configured. To fix that you can add a simple :file:`src/main/resources/log4j.properties` file to the project to configure the logging system:

.. literalinclude:: helloworld/src/main/resources/log4j.properties

If you run it again the ``log4j`` warnings should have disappeared.

Download
--------
You can download the whole maven project :download:`here <helloworld.zip>`.