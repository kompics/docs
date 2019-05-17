.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.handler.codec MessageToMessageEncoder

.. java:import:: java.util List

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

MessageEncoder
==============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class MessageEncoder extends MessageToMessageEncoder<MessageWrapper>

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
MessageEncoder
^^^^^^^^^^^^^^

.. java:constructor:: public MessageEncoder(NettyNetwork component)
   :outertype: MessageEncoder

Methods
-------
encode
^^^^^^

.. java:method:: @Override protected void encode(ChannelHandlerContext ctx, MessageWrapper msgw, List<Object> outL) throws Exception
   :outertype: MessageEncoder

