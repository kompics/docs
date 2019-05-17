.. java:import:: java.util Optional

.. java:import:: com.google.common.primitives Ints

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel.socket DatagramPacket

.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty.serialization DatagramSerializer

.. java:import:: se.sics.kompics.network.netty.serialization Serializers

.. java:import:: se.sics.kompics.network.netty.serialization SpecialSerializers

NettySerializer
===============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettySerializer implements DatagramSerializer

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: NettySerializer

fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, DatagramPacket datagram)
   :outertype: NettySerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: NettySerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: NettySerializer

