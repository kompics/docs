.. java:import:: io.netty.channel Channel

.. java:import:: io.netty.channel ChannelFuture

.. java:import:: io.netty.channel ChannelFutureListener

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util Queue

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

MessageQueueManager.NotifyListener
==================================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class NotifyListener implements ChannelFutureListener
   :outertype: MessageQueueManager

Fields
------
notify
^^^^^^

.. java:field:: public final MessageNotify.Req notify
   :outertype: MessageQueueManager.NotifyListener

Constructors
------------
NotifyListener
^^^^^^^^^^^^^^

.. java:constructor::  NotifyListener(MessageNotify.Req notify)
   :outertype: MessageQueueManager.NotifyListener

Methods
-------
operationComplete
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void operationComplete(ChannelFuture future) throws Exception
   :outertype: MessageQueueManager.NotifyListener

