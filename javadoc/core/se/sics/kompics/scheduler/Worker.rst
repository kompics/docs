.. java:import:: java.util.concurrent.atomic AtomicBoolean

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: se.sics.kompics ComponentCore

.. java:import:: se.sics.kompics SpinlockQueue

Worker
======

.. java:package:: se.sics.kompics.scheduler
   :noindex:

.. java:type:: public class Worker extends Thread

   The \ ``Worker``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
executionCount
^^^^^^^^^^^^^^

.. java:field::  int executionCount
   :outertype: Worker

Constructors
------------
Worker
^^^^^^

.. java:constructor:: public Worker(WorkStealingScheduler scheduler, int wid)
   :outertype: Worker

   Instantiates a new worker.

   :param scheduler: the scheduler
   :param wid: the wid

Methods
-------
addWork
^^^^^^^

.. java:method:: final void addWork(ComponentCore core)
   :outertype: Worker

getWid
^^^^^^

.. java:method:: public final int getWid()
   :outertype: Worker

   Gets the wid.

   :return: the wid

getWork
^^^^^^^

.. java:method:: final ComponentCore getWork()
   :outertype: Worker

getWorkCount
^^^^^^^^^^^^

.. java:method:: public final int getWorkCount()
   :outertype: Worker

   Gets the work count.

   :return: the work count

quitWhenNoMoreWork
^^^^^^^^^^^^^^^^^^

.. java:method:: final void quitWhenNoMoreWork()
   :outertype: Worker

run
^^^

.. java:method:: @Override public final void run()
   :outertype: Worker

waitForWork
^^^^^^^^^^^

.. java:method::  void waitForWork()
   :outertype: Worker

   The caller is expected to hold the object lock on entry

