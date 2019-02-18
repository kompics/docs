.. java:import:: io.netty.channel ChannelHandler

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.channel.socket SocketChannel

.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

TCPServerHandler
================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @ChannelHandler.Sharable public class TCPServerHandler extends StreamHandler

   :author: Lars Kroll

Constructors
------------
TCPServerHandler
^^^^^^^^^^^^^^^^

.. java:constructor:: public TCPServerHandler(NettyNetwork component)
   :outertype: TCPServerHandler

Methods
-------
channelActive
^^^^^^^^^^^^^

.. java:method:: @Override public void channelActive(ChannelHandlerContext ctx)
   :outertype: TCPServerHandler

messageReceived
^^^^^^^^^^^^^^^

.. java:method:: @Override protected void messageReceived(ChannelHandlerContext ctx, Msg msg) throws Exception
   :outertype: TCPServerHandler

