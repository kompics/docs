.. _kshelloworld:

Hello World in Kompics Scala
============================

As we did in section :ref:`helloworld`, we will start introducing the Kompics Scala DSL by giving a *Hello World* example.

SBT Setup
-----------
Set up a new SBT project and follow the instructions in :ref:`repos` and :ref:`ksgettingstarted` to include the necessary dependencies. For this simple example no additional Java API modules will be needed. We are, however, adding `logback <http://logback.qos.ch/>`_ classic to the dependencies, in order to get some logging output from Kompics. An example logback configuration file can be found in the full download package below.

The resulting :download:`helloworld.sbt <helloworld/helloworld.sbt>` might look something like:

.. literalinclude:: helloworld/helloworld.sbt
	:language: scala


Hello World Component
---------------------
As in the Java version we only have a very simple component ``HelloWorldC`` whose sole handler reacts to ``Start`` events on the control port (which is called ``ctrl`` in Scala). Notice however, that now the event type ``Start`` is simply pattern matched and the actual handle function starts afterwards. Kompics Scala's pattern matching handlers will be described in detail in the next section (:ref:`ksengine`).
The ``HelloWorld`` object acts as the *Main Class* for our project and simply starts Kompics in the usual way with the the component as its only argument.

.. literalinclude:: helloworld/src/main/scala/se/sics/test/HelloWorld.scala
	:language: scala

.. note::

	As opposed to the Java API, handler subscription is done directly by the ``uponEvent`` where the handler is also created. The method returns the created handler, so it can be unsubscribed later if so desired.

Compiling and Running
---------------------
To compile run the source code with SBT do::

	sbt
	> run

This is all. Say hello to Kompics Scala ;)

Download
--------
You can download the whole SBT project :download:`here <helloworld.zip>`.