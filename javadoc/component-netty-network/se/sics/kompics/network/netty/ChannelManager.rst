.. java:import:: com.barchart.udt ExceptionUDT

.. java:import:: com.barchart.udt OptionUDT

.. java:import:: com.barchart.udt SocketUDT

.. java:import:: com.google.common.collect HashMultimap

.. java:import:: io.netty.bootstrap Bootstrap

.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelFuture

.. java:import:: io.netty.channel ChannelFutureListener

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.channel.socket SocketChannel

.. java:import:: io.netty.channel.udt UdtChannel

.. java:import:: io.netty.channel.udt.nio NioUdtProvider

.. java:import:: java.net InetSocketAddress

.. java:import:: java.net SocketAddress

.. java:import:: java.util Collections

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util Map.Entry

.. java:import:: java.util Set

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentMap

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network ConnectionStatus

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

.. java:import:: sun.reflect.generics.reflectiveObjects NotImplementedException

ChannelManager
==============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class ChannelManager

   :author: lkroll

Constructors
------------
ChannelManager
^^^^^^^^^^^^^^

.. java:constructor:: public ChannelManager(NettyNetwork comp)
   :outertype: ChannelManager

Methods
-------
addLocalSocket
^^^^^^^^^^^^^^

.. java:method::  void addLocalSocket(UdtChannel channel)
   :outertype: ChannelManager

addLocalSocket
^^^^^^^^^^^^^^

.. java:method::  void addLocalSocket(SocketChannel channel)
   :outertype: ChannelManager

channelInactive
^^^^^^^^^^^^^^^

.. java:method::  void channelInactive(ChannelHandlerContext ctx, Transport protocol)
   :outertype: ChannelManager

checkActive
^^^^^^^^^^^

.. java:method::  void checkActive(CheckChannelActive msg, Channel c)
   :outertype: ChannelManager

checkTCPChannel
^^^^^^^^^^^^^^^

.. java:method::  void checkTCPChannel(Msg msg, SocketChannel c)
   :outertype: ChannelManager

checkUDTChannel
^^^^^^^^^^^^^^^

.. java:method::  void checkUDTChannel(Msg msg, UdtChannel c)
   :outertype: ChannelManager

clearConnections
^^^^^^^^^^^^^^^^

.. java:method::  void clearConnections()
   :outertype: ChannelManager

createTCPChannel
^^^^^^^^^^^^^^^^

.. java:method::  SocketChannel createTCPChannel(Address destination, Bootstrap bootstrapTCPClient)
   :outertype: ChannelManager

createUDTChannel
^^^^^^^^^^^^^^^^

.. java:method::  UdtChannel createUDTChannel(Address destination, Bootstrap bootstrapUDTClient)
   :outertype: ChannelManager

disambiguate
^^^^^^^^^^^^

.. java:method::  void disambiguate(DisambiguateConnection msg, Channel c)
   :outertype: ChannelManager

flushAndClose
^^^^^^^^^^^^^

.. java:method::  void flushAndClose(CloseChannel msg, Channel c)
   :outertype: ChannelManager

getTCPChannel
^^^^^^^^^^^^^

.. java:method::  SocketChannel getTCPChannel(Address destination)
   :outertype: ChannelManager

getUDTChannel
^^^^^^^^^^^^^

.. java:method::  UdtChannel getUDTChannel(Address destination)
   :outertype: ChannelManager

monitor
^^^^^^^

.. java:method::  void monitor()
   :outertype: ChannelManager

