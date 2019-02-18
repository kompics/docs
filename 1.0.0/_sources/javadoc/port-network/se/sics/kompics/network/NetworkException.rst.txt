.. java:import:: com.google.common.base Optional

.. java:import:: se.sics.kompics KompicsEvent

NetworkException
================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public final class NetworkException implements KompicsEvent

   The \ ``NetworkException``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
cause
^^^^^

.. java:field:: public final Optional<Throwable> cause
   :outertype: NetworkException

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

.. java:constructor:: public NetworkException(String message, Address peer, Transport protocol, Optional<Throwable> cause)
   :outertype: NetworkException

