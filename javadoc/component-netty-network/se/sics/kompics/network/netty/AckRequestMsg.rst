.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

AckRequestMsg
=============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class AckRequestMsg implements Msg

   :author: lkroll

Fields
------
content
^^^^^^^

.. java:field:: public final Msg content
   :outertype: AckRequestMsg

id
^^

.. java:field:: public final UUID id
   :outertype: AckRequestMsg

Constructors
------------
AckRequestMsg
^^^^^^^^^^^^^

.. java:constructor:: public AckRequestMsg(Msg msg, UUID id)
   :outertype: AckRequestMsg

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public Address getDestination()
   :outertype: AckRequestMsg

getHeader
^^^^^^^^^

.. java:method:: @Override public Header getHeader()
   :outertype: AckRequestMsg

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: AckRequestMsg

getSource
^^^^^^^^^

.. java:method:: @Override public Address getSource()
   :outertype: AckRequestMsg

reply
^^^^^

.. java:method:: public NotifyAck reply()
   :outertype: AckRequestMsg

