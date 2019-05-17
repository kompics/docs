.. java:import:: se.sics.kompics KompicsEvent

ConnectionStatus.Dropped
========================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public static class Dropped extends ConnectionStatus
   :outertype: ConnectionStatus

   Indicates that a connection to the \ ``peer``\  was dropped.

Fields
------
last
^^^^

.. java:field:: public final boolean last
   :outertype: ConnectionStatus.Dropped

   Was the last channel to the \ ``peer``\  dropped? If \ ``true``\ , this is definitely equivalent to a session loss event. If \ ``false``\ , it may just be the case that a duplicate channel was closed, which does not incur message losses, and should thus not be treated as a session loss event.

