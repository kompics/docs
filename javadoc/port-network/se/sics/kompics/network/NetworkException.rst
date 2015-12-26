.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics Event

NetworkException
================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public final class NetworkException extends Event

   The \ ``NetworkException``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling

Constructors
------------
NetworkException
^^^^^^^^^^^^^^^^

.. java:constructor:: public NetworkException(InetSocketAddress remoteAddress, Transport protocol)
   :outertype: NetworkException

   Instantiates a new network exception.

   :param remoteAddress: the remote address

Methods
-------
getProtocol
^^^^^^^^^^^

.. java:method:: public final Transport getProtocol()
   :outertype: NetworkException

   Gets the protocol

   :return: the protocol

getRemoteAddress
^^^^^^^^^^^^^^^^

.. java:method:: public final InetSocketAddress getRemoteAddress()
   :outertype: NetworkException

   Gets the remote address.

   :return: the remote address

