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

FaultTest
=========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @RunWith public class FaultTest

   :author: lkroll

Methods
-------
escalateTest
^^^^^^^^^^^^

.. java:method:: @Test public void escalateTest()
   :outertype: FaultTest

ignoreTest
^^^^^^^^^^

.. java:method:: @Test public void ignoreTest()
   :outertype: FaultTest

parentFaultTest
^^^^^^^^^^^^^^^

.. java:method:: @Test public void parentFaultTest()
   :outertype: FaultTest

