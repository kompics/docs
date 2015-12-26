.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Response

Timeout
=======

.. java:package:: se.sics.kompics.timer
   :noindex:

.. java:type:: public abstract class Timeout extends Response implements Cloneable

   The \ ``Timeout``\  class.

   :author: Cosmin Arad , Jim Dowling

Constructors
------------
Timeout
^^^^^^^

.. java:constructor:: protected Timeout(ScheduleTimeout request)
   :outertype: Timeout

   Instantiates a new timeout.

   :param request: the request

Timeout
^^^^^^^

.. java:constructor:: protected Timeout(SchedulePeriodicTimeout request)
   :outertype: Timeout

   Instantiates a new timeout.

   :param request: the request

Methods
-------
clone
^^^^^

.. java:method:: @Override public final Object clone() throws CloneNotSupportedException
   :outertype: Timeout

getTimeoutId
^^^^^^^^^^^^

.. java:method:: public final UUID getTimeoutId()
   :outertype: Timeout

   Gets the timeout id.

   :return: the timeout id

