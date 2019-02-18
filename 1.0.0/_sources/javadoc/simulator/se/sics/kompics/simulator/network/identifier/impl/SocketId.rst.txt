.. java:import:: com.google.common.primitives Ints

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util Objects

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

SocketId
========

.. java:package:: se.sics.kompics.simulator.network.identifier.impl
   :noindex:

.. java:type:: public class SocketId implements Identifier

   :author: Alex Ormenisan

Constructors
------------
SocketId
^^^^^^^^

.. java:constructor:: public SocketId(InetSocketAddress isa)
   :outertype: SocketId

Methods
-------
equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: SocketId

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: SocketId

partition
^^^^^^^^^

.. java:method:: @Override public int partition(int nrPartitions)
   :outertype: SocketId

