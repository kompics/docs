.. java:import:: java.util UUID

.. java:import:: se.sics.kompics KompicsEvent

CancelTimeout
=============

.. java:package:: se.sics.kompics.timer
   :noindex:

.. java:type:: public class CancelTimeout implements KompicsEvent

   The \ ``CancelTimeout``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
stackTrace
^^^^^^^^^^

.. java:field:: public StackTraceElement[] stackTrace
   :outertype: CancelTimeout

Constructors
------------
CancelTimeout
^^^^^^^^^^^^^

.. java:constructor:: public CancelTimeout(UUID timeoutId)
   :outertype: CancelTimeout

   Instantiates a new cancel timeout.

   :param timeoutId: the timeout id

Methods
-------
getStackTrace
^^^^^^^^^^^^^

.. java:method:: public StackTraceElement[] getStackTrace()
   :outertype: CancelTimeout

getTimeoutId
^^^^^^^^^^^^

.. java:method:: public final UUID getTimeoutId()
   :outertype: CancelTimeout

   Gets the timeout id.

   :return: the timeout id

