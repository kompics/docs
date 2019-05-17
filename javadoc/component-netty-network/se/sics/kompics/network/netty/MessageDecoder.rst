.. java:import:: java.util Optional

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.handler.codec LengthFieldBasedFrameDecoder

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

MessageDecoder
==============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class MessageDecoder extends LengthFieldBasedFrameDecoder

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
MessageDecoder
^^^^^^^^^^^^^^

.. java:constructor:: public MessageDecoder(NettyNetwork component)
   :outertype: MessageDecoder

Methods
-------
decode
^^^^^^

.. java:method:: @Override protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception
   :outertype: MessageDecoder

extractFrame
^^^^^^^^^^^^

.. java:method:: @Override protected ByteBuf extractFrame(ChannelHandlerContext ctx, ByteBuf buffer, int index, int length)
   :outertype: MessageDecoder

