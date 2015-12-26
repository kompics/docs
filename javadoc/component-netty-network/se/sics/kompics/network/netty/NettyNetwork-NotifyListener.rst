.. java:import:: io.netty.bootstrap Bootstrap

.. java:import:: io.netty.bootstrap ServerBootstrap

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel AdaptiveRecvByteBufAllocator

.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelFuture

.. java:import:: io.netty.channel ChannelFutureListener

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

.. java:import:: java.net UnknownHostException

.. java:import:: java.util HashSet

.. java:import:: java.util Iterator

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util.concurrent Executor

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics Stop

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.network NetworkControl

.. java:import:: se.sics.kompics.network NetworkException

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

NettyNetwork.NotifyListener
===========================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class NotifyListener implements ChannelFutureListener
   :outertype: NettyNetwork

Fields
------
notify
^^^^^^

.. java:field:: public final MessageNotify.Req notify
   :outertype: NettyNetwork.NotifyListener

Constructors
------------
NotifyListener
^^^^^^^^^^^^^^

.. java:constructor::  NotifyListener(MessageNotify.Req notify)
   :outertype: NettyNetwork.NotifyListener

Methods
-------
operationComplete
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void operationComplete(ChannelFuture future) throws Exception
   :outertype: NettyNetwork.NotifyListener

