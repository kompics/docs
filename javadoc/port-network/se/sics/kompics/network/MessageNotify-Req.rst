.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Direct

MessageNotify.Req
=================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public static class Req extends Direct.Request<Resp>
   :outertype: MessageNotify

Fields
------
msg
^^^

.. java:field:: public final Msg msg
   :outertype: MessageNotify.Req

Constructors
------------
Req
^^^

.. java:constructor:: public Req(Msg msg)
   :outertype: MessageNotify.Req

Methods
-------
getMsgId
^^^^^^^^

.. java:method:: public UUID getMsgId()
   :outertype: MessageNotify.Req

injectSize
^^^^^^^^^^

.. java:method:: public void injectSize(int size)
   :outertype: MessageNotify.Req

prepareResponse
^^^^^^^^^^^^^^^

.. java:method:: public void prepareResponse(long time, boolean success)
   :outertype: MessageNotify.Req

