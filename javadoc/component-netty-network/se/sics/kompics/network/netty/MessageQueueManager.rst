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

MessageQueueManager
===================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class MessageQueueManager

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
MessageQueueManager
^^^^^^^^^^^^^^^^^^^

.. java:constructor::  MessageQueueManager(NettyNetwork component)
   :outertype: MessageQueueManager

Methods
-------
ack
^^^

.. java:method::  void ack(NotifyAck ack)
   :outertype: MessageQueueManager

clear
^^^^^

.. java:method::  void clear()
   :outertype: MessageQueueManager

drop
^^^^

.. java:method::  void drop(DropDelayed event)
   :outertype: MessageQueueManager

retry
^^^^^

.. java:method::  void retry(SendDelayed event)
   :outertype: MessageQueueManager

send
^^^^

.. java:method::  void send(Msg<?, ?> msg)
   :outertype: MessageQueueManager

send
^^^^

.. java:method::  void send(MessageNotify.Req notify)
   :outertype: MessageQueueManager

