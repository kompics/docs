.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Direct

MessageNotify.Resp
==================

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public static class Resp implements Direct.Response, Cloneable
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
clone
^^^^^

.. java:method:: @Override public Resp clone() throws CloneNotSupportedException
   :outertype: MessageNotify.Resp

getDeliveryTime
^^^^^^^^^^^^^^^

.. java:method:: public long getDeliveryTime()
   :outertype: MessageNotify.Resp

getSendTime
^^^^^^^^^^^

.. java:method:: public long getSendTime()
   :outertype: MessageNotify.Resp

   :return: the time it took to send the data over the wire in ns

getSize
^^^^^^^

.. java:method:: public int getSize()
   :outertype: MessageNotify.Resp

getState
^^^^^^^^

.. java:method:: public State getState()
   :outertype: MessageNotify.Resp

getTime
^^^^^^^

.. java:method:: public long getTime()
   :outertype: MessageNotify.Resp

   :return: the time when then data was sent in ms

isSuccess
^^^^^^^^^

.. java:method:: public boolean isSuccess()
   :outertype: MessageNotify.Resp

setDeliveryTime
^^^^^^^^^^^^^^^

.. java:method::  void setDeliveryTime(long deliveryTime)
   :outertype: MessageNotify.Resp

setSendTime
^^^^^^^^^^^

.. java:method::  void setSendTime(long sendTime)
   :outertype: MessageNotify.Resp

setSize
^^^^^^^

.. java:method::  void setSize(int size)
   :outertype: MessageNotify.Resp

setState
^^^^^^^^

.. java:method::  void setState(State state)
   :outertype: MessageNotify.Resp

setTime
^^^^^^^

.. java:method::  void setTime(long time)
   :outertype: MessageNotify.Resp

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: MessageNotify.Resp

