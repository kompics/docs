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

FaultTest.ChildComponent
========================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class ChildComponent extends ComponentDefinition
   :outertype: FaultTest

Fields
------
child
^^^^^

.. java:field::  Component child
   :outertype: FaultTest.ChildComponent

startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: FaultTest.ChildComponent

testport
^^^^^^^^

.. java:field::  Negative<TestPort> testport
   :outertype: FaultTest.ChildComponent

Constructors
------------
ChildComponent
^^^^^^^^^^^^^^

.. java:constructor:: public ChildComponent()
   :outertype: FaultTest.ChildComponent

Methods
-------
handleFault
^^^^^^^^^^^

.. java:method:: @Override public ResolveAction handleFault(Fault fault)
   :outertype: FaultTest.ChildComponent

