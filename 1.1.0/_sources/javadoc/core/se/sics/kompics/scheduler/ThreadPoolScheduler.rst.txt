.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent ThreadFactory

.. java:import:: java.util.concurrent ThreadPoolExecutor

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Scheduler

ThreadPoolScheduler
===================

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: public class ThreadPoolScheduler extends Scheduler

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
ThreadPoolScheduler
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ThreadPoolScheduler(int workers)
   :outertype: ThreadPoolScheduler

Methods
-------
asyncShutdown
^^^^^^^^^^^^^

.. java:method:: @Override public void asyncShutdown()
   :outertype: ThreadPoolScheduler

proceed
^^^^^^^

.. java:method:: @Override public void proceed()
   :outertype: ThreadPoolScheduler

schedule
^^^^^^^^

.. java:method:: @Override public void schedule(Component c, int w)
   :outertype: ThreadPoolScheduler

shutdown
^^^^^^^^

.. java:method:: @Override public void shutdown()
   :outertype: ThreadPoolScheduler

