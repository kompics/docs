.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util Map

.. java:import:: java.util Optional

.. java:import:: java.util.function Function

.. java:import:: com.google.common.collect ImmutableMap

.. java:import:: se.sics.kompics Direct

.. java:import:: se.sics.kompics KompicsEvent

ListeningStatus
===============

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public class ListeningStatus implements KompicsEvent

   Indicates a status change or report of the listening sockets.

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
boundInterface
^^^^^^^^^^^^^^

.. java:field:: public final InetAddress boundInterface
   :outertype: ListeningStatus

openSockets
^^^^^^^^^^^

.. java:field:: public final ImmutableMap<Transport, Integer> openSockets
   :outertype: ListeningStatus

publicInterface
^^^^^^^^^^^^^^^

.. java:field:: public final InetAddress publicInterface
   :outertype: ListeningStatus

Constructors
------------
ListeningStatus
^^^^^^^^^^^^^^^

.. java:constructor:: public ListeningStatus(ImmutableMap<Transport, Integer> openSockets, InetAddress boundInterface, InetAddress publicInterface)
   :outertype: ListeningStatus

ListeningStatus
^^^^^^^^^^^^^^^

.. java:constructor:: public ListeningStatus(Map<Transport, Integer> openSockets, InetAddress boundInterface, InetAddress publicInterface)
   :outertype: ListeningStatus

Methods
-------
address
^^^^^^^

.. java:method:: public <A extends Address> Optional<A> address(Transport proto, Function<InetSocketAddress, A> f)
   :outertype: ListeningStatus

   Get an address for the public interface and the given transport protocol.

   :param <A>: the address type to use
   :param proto: the transport to use
   :param f: a function mapping an \ ``InetSocketAddress``\  to an instance of \ ``A``\ .
   :return: the created instance of \ ``A``\ .

asResponse
^^^^^^^^^^

.. java:method:: public Response asResponse()
   :outertype: ListeningStatus

   Convert this into an instance of \ ``Response``\ .

   :return: A \ ``Response``\  containing \ ``this``\ .

checkPort
^^^^^^^^^

.. java:method:: public Optional<Integer> checkPort(Transport proto)
   :outertype: ListeningStatus

   The port where the current listening socket for the given protocol is bound, if any.

   :param proto: the protocol of the socket
   :return: the current listening socket for that protocol or \ ``Optional.absent()``\  if none is bound

getPort
^^^^^^^

.. java:method:: public int getPort(Transport proto)
   :outertype: ListeningStatus

   The port where the current listening socket for the given protocol is bound.

   :param proto: the protocol of the socket
   :return: the current listening socket for that protocol or \ ``null``\  if none is bound

request
^^^^^^^

.. java:method:: public static Request request()
   :outertype: ListeningStatus

   :return: a new \ ``Request``\

socket
^^^^^^

.. java:method:: public Optional<InetSocketAddress> socket(Transport proto)
   :outertype: ListeningStatus

   Get a socket address for the public interface and the given transport protocol.

   :param proto: the transport to use
   :return: the socket address

