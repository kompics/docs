.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util Map

.. java:import:: java.util Optional

.. java:import:: java.util.function Function

.. java:import:: com.google.common.collect ImmutableMap

.. java:import:: se.sics.kompics Direct

.. java:import:: se.sics.kompics KompicsEvent

ListeningStatus.Request
=======================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public static class Request extends Direct.Request<Response>
   :outertype: ListeningStatus

   Ask a network component to send the current status of the listening sockets.

