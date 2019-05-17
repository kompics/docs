.. java:import:: com.google.common.collect ImmutableSet

.. java:import:: org.junit.jupiter.api Test

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

.. java:type:: public class NetworkTest

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
datagramTest
^^^^^^^^^^^^

.. java:method:: @Test public void datagramTest()
   :outertype: NetworkTest

droppedConnectionTest
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void droppedConnectionTest()
   :outertype: NetworkTest

failedPortBindingTest
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void failedPortBindingTest()
   :outertype: NetworkTest

streamTest
^^^^^^^^^^

.. java:method:: @Test public void streamTest()
   :outertype: NetworkTest

