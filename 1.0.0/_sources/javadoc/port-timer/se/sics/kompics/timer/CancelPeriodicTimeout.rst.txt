.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Event

CancelPeriodicTimeout
=====================

.. java:package:: se.sics.kompics.timer
   :noindex:

.. java:type:: public final class CancelPeriodicTimeout extends Event

   The \ ``CancelPeriodicTimeout``\  class.

   :author: Cosmin Arad , Jim Dowling

Constructors
------------
CancelPeriodicTimeout
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public CancelPeriodicTimeout(UUID timeoutId)
   :outertype: CancelPeriodicTimeout

   Instantiates a new cancel periodic timeout.

   :param timeoutId: the timeout id

Methods
-------
getTimeoutId
^^^^^^^^^^^^

.. java:method:: public final UUID getTimeoutId()
   :outertype: CancelPeriodicTimeout

   Gets the timeout id.

   :return: the timeout id

