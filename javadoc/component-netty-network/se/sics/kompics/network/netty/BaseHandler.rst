.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelHandler

.. java:import:: io.netty.channel ChannelHandlerContext

.. java:import:: io.netty.channel SimpleChannelInboundHandler

.. java:import:: java.net InetSocketAddress

.. java:import:: java.net SocketAddress

.. java:import:: se.sics.kompics.network NetworkException

.. java:import:: se.sics.kompics.network Transport

BaseHandler
===========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: @ChannelHandler.Sharable public abstract class BaseHandler<M> extends SimpleChannelInboundHandler<M>

   :author: Lars Kroll
   :param <M>:

Fields
------
component
^^^^^^^^^

.. java:field:: protected final NettyNetwork component
   :outertype: BaseHandler

protocol
^^^^^^^^

.. java:field:: protected final Transport protocol
   :outertype: BaseHandler

Constructors
------------
BaseHandler
^^^^^^^^^^^

.. java:constructor:: public BaseHandler(NettyNetwork component, Transport protocol)
   :outertype: BaseHandler

Methods
-------
channelActive
^^^^^^^^^^^^^

.. java:method:: @Override public void channelActive(ChannelHandlerContext ctx)
   :outertype: BaseHandler

exceptionCaught
^^^^^^^^^^^^^^^

.. java:method:: @Override public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
   :outertype: BaseHandler

