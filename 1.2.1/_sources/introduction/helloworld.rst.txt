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
Kompics has built-in logging support, which adds context information to the logging output, such as what state the component is in and what its unique id is. You can access the provided `SLF4J <https://www.slf4j.org/>`_ logger via the ``logger`` field.

In order to make use of these features, a mapped diagnostic context (MDC) capable logging backend is required, such as `Logback Classic <https://logback.qos.ch/manual/mdc.html>`_, for example, which is imported in the :download:`pom.xml <helloworld/pom.xml>` file.

Logback requires a configuration file to work. Adding a simple :file:`src/main/resources/logback.xml` file to the project will configure the logging system, in this case such that all MDC information is printed:

.. literalinclude:: helloworld/src/main/resources/logback.xml

It is also possible to add custom context information to a particular component, by using either :java:ref:`ComponentDefinition.loggingCtxPut(String, String)` for potentially transient values, or :java:ref:`ComponentDefinition.loggingCtxPutAlways(String, String)` for context values that definitely span the life-time of the component.

Download
--------
You can download the whole maven project :download:`here <helloworld.zip>`.