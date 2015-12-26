.. java:import:: se.sics.kompics Request

ScheduleTimeout
===============

.. java:package:: se.sics.kompics.timer
   :noindex:

.. java:type:: public final class ScheduleTimeout extends Request

   The \ ``ScheduleTimeout``\  class.

   :author: Cosmin Arad , Jim Dowling

Constructors
------------
ScheduleTimeout
^^^^^^^^^^^^^^^

.. java:constructor:: public ScheduleTimeout(long delay)
   :outertype: ScheduleTimeout

   Instantiates a new schedule timeout.

   :param delay: the delay

Methods
-------
getDelay
^^^^^^^^

.. java:method:: public final long getDelay()
   :outertype: ScheduleTimeout

   Gets the delay.

   :return: the delay

getTimeoutEvent
^^^^^^^^^^^^^^^

.. java:method:: public final Timeout getTimeoutEvent()
   :outertype: ScheduleTimeout

   Gets the timeout event.

   :return: the timeout event

setTimeoutEvent
^^^^^^^^^^^^^^^

.. java:method:: public final void setTimeoutEvent(Timeout timeout)
   :outertype: ScheduleTimeout

   Sets the timeout event.

   :param timeout: the new timeout event

