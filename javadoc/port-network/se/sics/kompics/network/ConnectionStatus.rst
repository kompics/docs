.. java:import:: se.sics.kompics KompicsEvent

ConnectionStatus
================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public class ConnectionStatus implements KompicsEvent

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
peer
^^^^

.. java:field:: public final Address peer
   :outertype: ConnectionStatus

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: ConnectionStatus

state
^^^^^

.. java:field:: public final State state
   :outertype: ConnectionStatus

Methods
-------
dropped
^^^^^^^

.. java:method:: public static ConnectionStatus dropped(Address peer, Transport protocol)
   :outertype: ConnectionStatus

established
^^^^^^^^^^^

.. java:method:: public static ConnectionStatus established(Address peer, Transport protocol)
   :outertype: ConnectionStatus

requested
^^^^^^^^^

.. java:method:: public static ConnectionStatus requested(Address peer, Transport protocol)
   :outertype: ConnectionStatus

