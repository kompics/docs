.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit.jupiter.api Test

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Fault.ResolveAction

FaultTest.GrandChildComponent
=============================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class GrandChildComponent extends ComponentDefinition
   :outertype: FaultTest

Fields
------
startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: FaultTest.GrandChildComponent

testHandler
^^^^^^^^^^^

.. java:field::  Handler<TestEvent> testHandler
   :outertype: FaultTest.GrandChildComponent

testport
^^^^^^^^

.. java:field::  Negative<TestPort> testport
   :outertype: FaultTest.GrandChildComponent

Constructors
------------
GrandChildComponent
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public GrandChildComponent()
   :outertype: FaultTest.GrandChildComponent

