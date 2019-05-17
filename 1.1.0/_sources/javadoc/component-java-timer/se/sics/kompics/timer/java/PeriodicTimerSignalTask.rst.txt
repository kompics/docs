.. java:import:: java.util TimerTask

.. java:import:: se.sics.kompics.timer Timeout

PeriodicTimerSignalTask
=======================

.. java:package:: se.sics.kompics.timer.java
   :noindex:

.. java:type:: final class PeriodicTimerSignalTask extends TimerTask

   The \ ``PeriodicTimerSignalTask``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
timeout
^^^^^^^

.. java:field:: final Timeout timeout
   :outertype: PeriodicTimerSignalTask

Constructors
------------
PeriodicTimerSignalTask
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor::  PeriodicTimerSignalTask(Timeout timeout, JavaTimer timerComponent)
   :outertype: PeriodicTimerSignalTask

   Instantiates a new periodic timer signal task.

   :param timeout: the timeout
   :param timerComponent: the timer component

Methods
-------
run
^^^

.. java:method:: @Override public final void run()
   :outertype: PeriodicTimerSignalTask

