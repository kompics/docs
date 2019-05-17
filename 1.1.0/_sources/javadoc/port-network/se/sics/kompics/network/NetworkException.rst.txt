.. java:import:: se.sics.kompics KompicsEvent

NetworkException
================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: @SuppressWarnings public final class NetworkException extends Exception implements KompicsEvent

   The \ ``NetworkException``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
message
^^^^^^^

.. java:field:: public final String message
   :outertype: NetworkException

peer
^^^^

.. java:field:: public final Address peer
   :outertype: NetworkException

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: NetworkException

Constructors
------------
NetworkException
^^^^^^^^^^^^^^^^

.. java:constructor:: public NetworkException(String message, Address peer, Transport protocol)
   :outertype: NetworkException

NetworkException
^^^^^^^^^^^^^^^^

.. java:constructor:: public NetworkException(String message, Address peer, Transport protocol, Throwable cause)
   :outertype: NetworkException

