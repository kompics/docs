.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent ThreadFactory

.. java:import:: java.util.concurrent ThreadPoolExecutor

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

ThreadPoolScheduler.KompicsThreadFactory
========================================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: static class KompicsThreadFactory implements ThreadFactory
   :outertype: ThreadPoolScheduler

Fields
------
namePrefix
^^^^^^^^^^

.. java:field:: final String namePrefix
   :outertype: ThreadPoolScheduler.KompicsThreadFactory

threadNumber
^^^^^^^^^^^^

.. java:field:: final AtomicInteger threadNumber
   :outertype: ThreadPoolScheduler.KompicsThreadFactory

Constructors
------------
KompicsThreadFactory
^^^^^^^^^^^^^^^^^^^^

.. java:constructor::  KompicsThreadFactory()
   :outertype: ThreadPoolScheduler.KompicsThreadFactory

Methods
-------
newThread
^^^^^^^^^

.. java:method:: @Override public Thread newThread(Runnable r)
   :outertype: ThreadPoolScheduler.KompicsThreadFactory

