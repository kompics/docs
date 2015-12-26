.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Direct

MessageNotify.Resp
==================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public static class Resp implements Direct.Response
   :outertype: MessageNotify

Fields
------
msgId
^^^^^

.. java:field:: public final UUID msgId
   :outertype: MessageNotify.Resp

Constructors
------------
Resp
^^^^

.. java:constructor:: public Resp()
   :outertype: MessageNotify.Resp

Methods
-------
getSize
^^^^^^^

.. java:method:: public int getSize()
   :outertype: MessageNotify.Resp

getTime
^^^^^^^

.. java:method:: public long getTime()
   :outertype: MessageNotify.Resp

isSuccess
^^^^^^^^^

.. java:method:: public boolean isSuccess()
   :outertype: MessageNotify.Resp

setSize
^^^^^^^

.. java:method::  void setSize(int size)
   :outertype: MessageNotify.Resp

setSuccess
^^^^^^^^^^

.. java:method::  void setSuccess(boolean status)
   :outertype: MessageNotify.Resp

setTime
^^^^^^^

.. java:method::  void setTime(long time)
   :outertype: MessageNotify.Resp

