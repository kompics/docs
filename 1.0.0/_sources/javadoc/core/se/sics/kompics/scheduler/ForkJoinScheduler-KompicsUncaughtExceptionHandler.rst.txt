.. java:import:: java.util.concurrent ForkJoinPool

.. java:import:: java.util.concurrent ForkJoinTask

.. java:import:: java.util.concurrent ForkJoinWorkerThread

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

ForkJoinScheduler.KompicsUncaughtExceptionHandler
=================================================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: static class KompicsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
   :outertype: ForkJoinScheduler

Methods
-------
uncaughtException
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void uncaughtException(Thread t, Throwable e)
   :outertype: ForkJoinScheduler.KompicsUncaughtExceptionHandler

