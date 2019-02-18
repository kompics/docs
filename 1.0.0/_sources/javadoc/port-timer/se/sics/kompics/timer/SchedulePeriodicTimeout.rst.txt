.. java:import:: se.sics.kompics Request

SchedulePeriodicTimeout
=======================

.. java:package:: se.sics.kompics.timer
   :noindex:

.. java:type:: public final class SchedulePeriodicTimeout extends Request

   The \ ``SchedulePeriodicTimeout``\  class.

   :author: Cosmin Arad , Jim Dowling

Constructors
------------
SchedulePeriodicTimeout
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SchedulePeriodicTimeout(long delay, long period)
   :outertype: SchedulePeriodicTimeout

   Instantiates a new schedule periodic timeout.

   :param delay: the delay
   :param period: the period

Methods
-------
getDelay
^^^^^^^^

.. java:method:: public final long getDelay()
   :outertype: SchedulePeriodicTimeout

   Gets the delay.

   :return: the delay

getPeriod
^^^^^^^^^

.. java:method:: public final long getPeriod()
   :outertype: SchedulePeriodicTimeout

   Gets the period.

   :return: the period

getTimeoutEvent
^^^^^^^^^^^^^^^

.. java:method:: public final Timeout getTimeoutEvent()
   :outertype: SchedulePeriodicTimeout

   Gets the timeout event.

   :return: the timeout event

setTimeoutEvent
^^^^^^^^^^^^^^^

.. java:method:: public final void setTimeoutEvent(Timeout timeout)
   :outertype: SchedulePeriodicTimeout

   Sets the timeout event.

   :param timeout: the new timeout event

