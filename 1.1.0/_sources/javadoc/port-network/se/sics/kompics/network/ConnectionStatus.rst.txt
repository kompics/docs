.. java:import:: se.sics.kompics KompicsEvent

ConnectionStatus
================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public abstract class ConnectionStatus implements KompicsEvent

   All subclasses indicate a status change of a connection to the specified \ ``peer``\ .

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
peer
^^^^

.. java:field:: public final Address peer
   :outertype: ConnectionStatus

   The address of the node the connection relates to.

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: ConnectionStatus

   The transport protocol of the connection to the \ ``peer``\ .

Methods
-------
dropped
^^^^^^^

.. java:method:: public static Dropped dropped(Address peer, Transport protocol, boolean last)
   :outertype: ConnectionStatus

established
^^^^^^^^^^^

.. java:method:: public static Established established(Address peer, Transport protocol)
   :outertype: ConnectionStatus

requested
^^^^^^^^^

.. java:method:: public static Requested requested(Address peer, Transport protocol)
   :outertype: ConnectionStatus

