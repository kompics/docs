.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

DirectMessage
=============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public abstract class DirectMessage implements Msg

   :author: lkroll

Fields
------
header
^^^^^^

.. java:field:: public final DirectHeader header
   :outertype: DirectMessage

Constructors
------------
DirectMessage
^^^^^^^^^^^^^

.. java:constructor:: public DirectMessage(Address src, Address dst, Transport protocol)
   :outertype: DirectMessage

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public Address getDestination()
   :outertype: DirectMessage

getHeader
^^^^^^^^^

.. java:method:: @Override public Header getHeader()
   :outertype: DirectMessage

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: DirectMessage

getSource
^^^^^^^^^

.. java:method:: @Override public Address getSource()
   :outertype: DirectMessage

