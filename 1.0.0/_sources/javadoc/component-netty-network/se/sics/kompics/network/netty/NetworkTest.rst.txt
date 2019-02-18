.. java:import:: com.google.common.collect ImmutableSet

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.test ComponentProxy

.. java:import:: se.sics.kompics.network.test NetworkGenerator

NetworkTest
===========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @RunWith public class NetworkTest

   :author: Lars Kroll

Methods
-------
datagramTest
^^^^^^^^^^^^

.. java:method:: @Test public void datagramTest()
   :outertype: NetworkTest

streamTest
^^^^^^^^^^

.. java:method:: @Test public void streamTest()
   :outertype: NetworkTest

