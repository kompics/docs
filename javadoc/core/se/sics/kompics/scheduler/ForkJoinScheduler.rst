.. java:import:: java.util.concurrent ForkJoinPool

.. java:import:: java.util.concurrent ForkJoinTask

.. java:import:: java.util.concurrent ForkJoinWorkerThread

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

ForkJoinScheduler
=================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: public class ForkJoinScheduler extends Scheduler

   :author: Lars Kroll

Constructors
------------
ForkJoinScheduler
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ForkJoinScheduler(int workers)
   :outertype: ForkJoinScheduler

Methods
-------
asyncShutdown
^^^^^^^^^^^^^

.. java:method:: @Override public void asyncShutdown()
   :outertype: ForkJoinScheduler

proceed
^^^^^^^

.. java:method:: @Override public void proceed()
   :outertype: ForkJoinScheduler

schedule
^^^^^^^^

.. java:method:: @Override public void schedule(Component c, int w)
   :outertype: ForkJoinScheduler

shutdown
^^^^^^^^

.. java:method:: @Override public void shutdown()
   :outertype: ForkJoinScheduler

