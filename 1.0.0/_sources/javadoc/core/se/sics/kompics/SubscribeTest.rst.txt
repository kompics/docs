.. java:import:: java.util LinkedList

.. java:import:: java.util.concurrent Semaphore

.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: se.sics.kompics Fault.ResolveAction

SubscribeTest
=============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @SuppressWarnings public class SubscribeTest

   The \ ``SubscribeTest``\  class tests dynamic subscriptions.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Methods
-------
testFifoDynamicSubscriptions
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testFifoDynamicSubscriptions() throws Exception
   :outertype: SubscribeTest

   Tests FIFO handling of events with dynamic subscriptions.

   :throws Exception: the exception

testFifoExecution
^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testFifoExecution() throws Exception
   :outertype: SubscribeTest

   Tests FIFO handling of events.

   :throws Exception: the exception

