.. java:import:: io.netty.channel ChannelHandler.Sharable

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

StreamHandler
=============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @Sharable public class StreamHandler extends BaseHandler<Msg<?, ?>>

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
StreamHandler
^^^^^^^^^^^^^

.. java:constructor:: public StreamHandler(NettyNetwork component, Transport protocol)
   :outertype: StreamHandler

Methods
-------
channelInactive
^^^^^^^^^^^^^^^

.. java:method:: @Override public void channelInactive(ChannelHandlerContext ctx) throws Exception
   :outertype: StreamHandler

channelRead0
^^^^^^^^^^^^

.. java:method:: @Override protected void channelRead0(ChannelHandlerContext ctx, Msg<?, ?> msg) throws Exception
   :outertype: StreamHandler

