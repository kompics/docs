.. java:import:: io.netty.channel ChannelHandler

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.channel.udt UdtChannel

.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

UDTServerHandler
================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @ChannelHandler.Sharable public class UDTServerHandler extends StreamHandler

   :author: Lars Kroll

Constructors
------------
UDTServerHandler
^^^^^^^^^^^^^^^^

.. java:constructor:: public UDTServerHandler(NettyNetwork component)
   :outertype: UDTServerHandler

Methods
-------
channelActive
^^^^^^^^^^^^^

.. java:method:: @Override public void channelActive(ChannelHandlerContext ctx)
   :outertype: UDTServerHandler

messageReceived
^^^^^^^^^^^^^^^

.. java:method:: @Override protected void messageReceived(ChannelHandlerContext ctx, Msg msg) throws Exception
   :outertype: UDTServerHandler

