.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Fault.ResolveAction

FaultTest.ParentComponent
=========================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class ParentComponent extends ComponentDefinition
   :outertype: FaultTest

Fields
------
child
^^^^^

.. java:field::  Component child
   :outertype: FaultTest.ParentComponent

startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: FaultTest.ParentComponent

Constructors
------------
ParentComponent
^^^^^^^^^^^^^^^

.. java:constructor:: public ParentComponent()
   :outertype: FaultTest.ParentComponent

Methods
-------
handleFault
^^^^^^^^^^^

.. java:method:: @Override public ResolveAction handleFault(Fault fault)
   :outertype: FaultTest.ParentComponent

