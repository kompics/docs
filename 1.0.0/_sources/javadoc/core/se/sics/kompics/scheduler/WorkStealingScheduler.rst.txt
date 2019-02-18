.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentCore

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

.. java:import:: se.sics.kompics SpinlockQueue

WorkStealingScheduler
=====================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: public final class WorkStealingScheduler extends Scheduler

   The \ ``Scheduler``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Constructors
------------
WorkStealingScheduler
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public WorkStealingScheduler(int wc)
   :outertype: WorkStealingScheduler

   Instantiates a new scheduler.

   :param wc: the wc

Methods
-------
asyncShutdown
^^^^^^^^^^^^^

.. java:method:: @Override public void asyncShutdown()
   :outertype: WorkStealingScheduler

execute
^^^^^^^

.. java:method:: final void execute(Component component, int w)
   :outertype: WorkStealingScheduler

logStats
^^^^^^^^

.. java:method:: public final void logStats()
   :outertype: WorkStealingScheduler

proceed
^^^^^^^

.. java:method:: public final void proceed()
   :outertype: WorkStealingScheduler

schedule
^^^^^^^^

.. java:method:: public final void schedule(Component component, int wid)
   :outertype: WorkStealingScheduler

shutdown
^^^^^^^^

.. java:method:: public final void shutdown()
   :outertype: WorkStealingScheduler

stealWork
^^^^^^^^^

.. java:method:: final ComponentCore stealWork(int wid)
   :outertype: WorkStealingScheduler

waitForWork
^^^^^^^^^^^

.. java:method:: final void waitForWork(Worker w)
   :outertype: WorkStealingScheduler

