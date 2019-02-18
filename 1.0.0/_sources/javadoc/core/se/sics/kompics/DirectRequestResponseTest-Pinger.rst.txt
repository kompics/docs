.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

DirectRequestResponseTest.Pinger
================================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Pinger extends ComponentDefinition
   :outertype: DirectRequestResponseTest

Fields
------
p
^

.. java:field::  Positive<PPPort> p
   :outertype: DirectRequestResponseTest.Pinger

startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: DirectRequestResponseTest.Pinger

starver
^^^^^^^

.. java:field::  Component starver
   :outertype: DirectRequestResponseTest.Pinger

upHandler
^^^^^^^^^

.. java:field::  Handler<Up> upHandler
   :outertype: DirectRequestResponseTest.Pinger

