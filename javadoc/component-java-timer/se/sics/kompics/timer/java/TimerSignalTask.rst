.. java:import:: java.util TimerTask

.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.timer Timeout

TimerSignalTask
===============

.. java:package:: se.sics.kompics.timer.java
   :noindex:

.. java:type:: final class TimerSignalTask extends TimerTask

   The \ ``TimerSignalTask``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
timeout
^^^^^^^

.. java:field:: final Timeout timeout
   :outertype: TimerSignalTask

Constructors
------------
TimerSignalTask
^^^^^^^^^^^^^^^

.. java:constructor::  TimerSignalTask(JavaTimer timerComponent, Timeout timeout, UUID timerId)
   :outertype: TimerSignalTask

   Instantiates a new timer signal task.

   :param timerComponent: the timer component
   :param timeout: the timeout
   :param timerId: the timer id

Methods
-------
run
^^^

.. java:method:: @Override public final void run()
   :outertype: TimerSignalTask

