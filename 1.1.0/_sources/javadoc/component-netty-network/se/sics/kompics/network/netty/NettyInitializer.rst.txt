.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelInitializer

.. java:import:: io.netty.channel ChannelPipeline

.. java:import:: io.netty.handler.codec.compression SnappyFrameDecoder

.. java:import:: io.netty.handler.codec.compression SnappyFrameEncoder

NettyInitializer
================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettyInitializer<C extends Channel> extends ChannelInitializer<C>

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
NettyInitializer
^^^^^^^^^^^^^^^^

.. java:constructor:: public NettyInitializer(BaseHandler<?> handler)
   :outertype: NettyInitializer

   :param handler:
   :param msgDecoderClass:

Methods
-------
initChannel
^^^^^^^^^^^

.. java:method:: @Override protected void initChannel(C ch) throws Exception
   :outertype: NettyInitializer

   Initiate the Pipeline for the newly active connection.

