.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Transport

DirectHeader
============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class DirectHeader implements Header<Address>

   :author: lkroll

Fields
------
dst
^^^

.. java:field:: public final Address dst
   :outertype: DirectHeader

proto
^^^^^

.. java:field:: public final Transport proto
   :outertype: DirectHeader

src
^^^

.. java:field:: public final Address src
   :outertype: DirectHeader

Constructors
------------
DirectHeader
^^^^^^^^^^^^

.. java:constructor:: public DirectHeader(Address src, Address dst, Transport proto)
   :outertype: DirectHeader

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public Address getDestination()
   :outertype: DirectHeader

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: DirectHeader

getSource
^^^^^^^^^

.. java:method:: @Override public Address getSource()
   :outertype: DirectHeader

