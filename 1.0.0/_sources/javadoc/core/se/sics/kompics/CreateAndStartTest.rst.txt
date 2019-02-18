.. java:import:: java.util.concurrent Semaphore

.. java:import:: org.junit Test

CreateAndStartTest
==================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @SuppressWarnings public class CreateAndStartTest

   The \ ``CreateAndStartTest``\  class tests component creation and start.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Methods
-------
testBootstrap
^^^^^^^^^^^^^

.. java:method:: @Test public void testBootstrap() throws Exception
   :outertype: CreateAndStartTest

   Tests the creation of the main component.

   :throws Exception: the exception

testCreate
^^^^^^^^^^

.. java:method:: @Test public void testCreate() throws Exception
   :outertype: CreateAndStartTest

   Test the creation of a subcomponent.

   :throws Exception: the exception

testCreateAndStart
^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testCreateAndStart() throws Exception
   :outertype: CreateAndStartTest

   Tests that a child component of the main component is automatically started.

   :throws Exception: the exception

testStart
^^^^^^^^^

.. java:method:: @Test public void testStart() throws Exception
   :outertype: CreateAndStartTest

   Tests that the main component is automatically started.

   :throws Exception: the exception

