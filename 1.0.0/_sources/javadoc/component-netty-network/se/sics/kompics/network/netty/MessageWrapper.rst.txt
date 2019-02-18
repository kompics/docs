.. java:import:: com.google.common.base Optional

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Msg

MessageWrapper
==============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class MessageWrapper

   :author: lkroll

Fields
------
msg
^^^

.. java:field:: public final Msg msg
   :outertype: MessageWrapper

notify
^^^^^^

.. java:field:: public final Optional<MessageNotify.Req> notify
   :outertype: MessageWrapper

Constructors
------------
MessageWrapper
^^^^^^^^^^^^^^

.. java:constructor::  MessageWrapper(MessageNotify.Req notify)
   :outertype: MessageWrapper

MessageWrapper
^^^^^^^^^^^^^^

.. java:constructor::  MessageWrapper(Msg msg)
   :outertype: MessageWrapper

Methods
-------
injectSize
^^^^^^^^^^

.. java:method::  void injectSize(int diff, long startTS)
   :outertype: MessageWrapper

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: MessageWrapper

