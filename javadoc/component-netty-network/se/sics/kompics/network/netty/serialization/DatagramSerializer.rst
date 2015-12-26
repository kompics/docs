.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel.socket DatagramPacket

DatagramSerializer
==================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public interface DatagramSerializer extends Serializer

   :author: lkroll

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: public Object fromBinary(ByteBuf buf, DatagramPacket datagram)
   :outertype: DatagramSerializer

