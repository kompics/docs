.. java:import:: java.util.concurrent ForkJoinPool

.. java:import:: java.util.concurrent ForkJoinTask

.. java:import:: java.util.concurrent ForkJoinWorkerThread

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

ForkJoinScheduler.KompicsThreadFactory
======================================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: static class KompicsThreadFactory implements ForkJoinPool.ForkJoinWorkerThreadFactory
   :outertype: ForkJoinScheduler

Fields
------
namePrefix
^^^^^^^^^^

.. java:field:: final String namePrefix
   :outertype: ForkJoinScheduler.KompicsThreadFactory

Methods
-------
newThread
^^^^^^^^^

.. java:method:: @Override public ForkJoinWorkerThread newThread(ForkJoinPool pool)
   :outertype: ForkJoinScheduler.KompicsThreadFactory

