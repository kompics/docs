.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.buffer ByteBufUtil

.. java:import:: io.netty.channel ChannelHandler

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.channel.socket DatagramPacket

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

DatagramHandler
===============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @ChannelHandler.Sharable public class DatagramHandler extends BaseHandler<DatagramPacket>

   :author: Lars Kroll

Constructors
------------
DatagramHandler
^^^^^^^^^^^^^^^

.. java:constructor:: public DatagramHandler(NettyNetwork component, Transport protocol)
   :outertype: DatagramHandler

Methods
-------
messageReceived
^^^^^^^^^^^^^^^

.. java:method:: @Override protected void messageReceived(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception
   :outertype: DatagramHandler

