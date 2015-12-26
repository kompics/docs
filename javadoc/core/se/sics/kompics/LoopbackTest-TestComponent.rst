.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

LoopbackTest.TestComponent
==========================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: static class TestComponent extends ComponentDefinition
   :outertype: LoopbackTest

Fields
------
startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: LoopbackTest.TestComponent

testHandler
^^^^^^^^^^^

.. java:field::  Handler<TestEvent> testHandler
   :outertype: LoopbackTest.TestComponent

Constructors
------------
TestComponent
^^^^^^^^^^^^^

.. java:constructor:: public TestComponent()
   :outertype: LoopbackTest.TestComponent

