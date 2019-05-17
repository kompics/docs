.. java:import:: java.util Optional

.. java:import:: com.google.common.collect ImmutableMap

.. java:import:: io.netty.bootstrap Bootstrap

.. java:import:: io.netty.bootstrap ServerBootstrap

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel AdaptiveRecvByteBufAllocator

.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelFuture

.. java:import:: io.netty.channel ChannelOption

.. java:import:: io.netty.channel EventLoopGroup

.. java:import:: io.netty.channel.nio NioEventLoopGroup

.. java:import:: io.netty.channel.socket DatagramChannel

.. java:import:: io.netty.channel.socket DatagramPacket

.. java:import:: io.netty.channel.socket SocketChannel

.. java:import:: io.netty.channel.socket.nio NioDatagramChannel

.. java:import:: io.netty.channel.socket.nio NioServerSocketChannel

.. java:import:: io.netty.channel.socket.nio NioSocketChannel

.. java:import:: io.netty.channel.udt UdtChannel

.. java:import:: io.netty.channel.udt UdtChannelOption

.. java:import:: io.netty.channel.udt.nio NioUdtProvider

.. java:import:: io.netty.util.concurrent Future

.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util.concurrent Executor

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics Stop

.. java:import:: se.sics.kompics.network ConnectionStatus

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network ListeningStatus

.. java:import:: se.sics.kompics.network ListeningStatus.Request

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.network NetworkControl

.. java:import:: se.sics.kompics.network NetworkException

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

NettyNetwork
============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettyNetwork extends ComponentDefinition

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
DATAGRAM_MAX
^^^^^^^^^^^^

.. java:field:: public static final int DATAGRAM_MAX
   :outertype: NettyNetwork

INITIAL_BUFFER_SIZE
^^^^^^^^^^^^^^^^^^^

.. java:field:: static final int INITIAL_BUFFER_SIZE
   :outertype: NettyNetwork

MDC_KEY_ALT_IF
^^^^^^^^^^^^^^

.. java:field:: public static final String MDC_KEY_ALT_IF
   :outertype: NettyNetwork

MDC_KEY_IF
^^^^^^^^^^

.. java:field:: public static final String MDC_KEY_IF
   :outertype: NettyNetwork

MDC_KEY_PORT
^^^^^^^^^^^^

.. java:field:: public static final String MDC_KEY_PORT
   :outertype: NettyNetwork

RECV_BUFFER_SIZE
^^^^^^^^^^^^^^^^

.. java:field:: static final int RECV_BUFFER_SIZE
   :outertype: NettyNetwork

SEND_BUFFER_SIZE
^^^^^^^^^^^^^^^^

.. java:field:: static final int SEND_BUFFER_SIZE
   :outertype: NettyNetwork

STREAM_MAX
^^^^^^^^^^

.. java:field:: public static final int STREAM_MAX
   :outertype: NettyNetwork

bootstrapTCPClient
^^^^^^^^^^^^^^^^^^

.. java:field:: final Bootstrap bootstrapTCPClient
   :outertype: NettyNetwork

bootstrapUDTClient
^^^^^^^^^^^^^^^^^^

.. java:field:: final Bootstrap bootstrapUDTClient
   :outertype: NettyNetwork

boundUDTPort
^^^^^^^^^^^^

.. java:field:: volatile int boundUDTPort
   :outertype: NettyNetwork

channels
^^^^^^^^

.. java:field:: final ChannelManager channels
   :outertype: NettyNetwork

delayedHandler
^^^^^^^^^^^^^^

.. java:field::  Handler<SendDelayed> delayedHandler
   :outertype: NettyNetwork

dropHandler
^^^^^^^^^^^

.. java:field::  Handler<DropDelayed> dropHandler
   :outertype: NettyNetwork

extLog
^^^^^^

.. java:field:: final Logger extLog
   :outertype: NettyNetwork

messages
^^^^^^^^

.. java:field:: final MessageQueueManager messages
   :outertype: NettyNetwork

msgHandler
^^^^^^^^^^

.. java:field::  Handler<Msg<?, ?>> msgHandler
   :outertype: NettyNetwork

net
^^^

.. java:field::  Negative<Network> net
   :outertype: NettyNetwork

netC
^^^^

.. java:field::  Negative<NetworkControl> netC
   :outertype: NettyNetwork

notifyHandler
^^^^^^^^^^^^^

.. java:field::  Handler<MessageNotify.Req> notifyHandler
   :outertype: NettyNetwork

self
^^^^

.. java:field:: final NettyAddress self
   :outertype: NettyNetwork

startHandler
^^^^^^^^^^^^

.. java:field::  Handler<Start> startHandler
   :outertype: NettyNetwork

statusHandler
^^^^^^^^^^^^^

.. java:field::  Handler<ListeningStatus.Request> statusHandler
   :outertype: NettyNetwork

stopHandler
^^^^^^^^^^^

.. java:field::  Handler<Stop> stopHandler
   :outertype: NettyNetwork

udtBufferSizes
^^^^^^^^^^^^^^

.. java:field:: final int udtBufferSizes
   :outertype: NettyNetwork

udtMSS
^^^^^^

.. java:field:: final int udtMSS
   :outertype: NettyNetwork

Constructors
------------
NettyNetwork
^^^^^^^^^^^^

.. java:constructor:: @SuppressWarnings public NettyNetwork(NettyInit init)
   :outertype: NettyNetwork

Methods
-------
deliverMessage
^^^^^^^^^^^^^^

.. java:method:: protected void deliverMessage(Msg<?, ?> message, Channel c)
   :outertype: NettyNetwork

networkException
^^^^^^^^^^^^^^^^

.. java:method:: protected void networkException(NetworkException networkException)
   :outertype: NettyNetwork

networkStatus
^^^^^^^^^^^^^

.. java:method:: protected void networkStatus(ConnectionStatus status)
   :outertype: NettyNetwork

notify
^^^^^^

.. java:method::  void notify(MessageNotify.Req notify)
   :outertype: NettyNetwork

notify
^^^^^^

.. java:method::  void notify(MessageNotify.Req notify, MessageNotify.Resp response)
   :outertype: NettyNetwork

sendUdpMessage
^^^^^^^^^^^^^^

.. java:method::  ChannelFuture sendUdpMessage(MessageWrapper msgw)
   :outertype: NettyNetwork

setCustomMDC
^^^^^^^^^^^^

.. java:method::  void setCustomMDC()
   :outertype: NettyNetwork

tearDown
^^^^^^^^

.. java:method:: @Override public void tearDown()
   :outertype: NettyNetwork

trigger
^^^^^^^

.. java:method::  void trigger(KompicsEvent event)
   :outertype: NettyNetwork

