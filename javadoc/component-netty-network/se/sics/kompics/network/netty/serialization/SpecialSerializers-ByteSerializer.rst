.. java:import:: java.util Optional

.. java:import:: com.google.common.primitives Ints

.. java:import:: com.google.common.primitives UnsignedBytes

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: java.net UnknownHostException

.. java:import:: java.util ArrayList

.. java:import:: java.util Arrays

.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty DirectMessage

.. java:import:: se.sics.kompics.network.netty NettyAddress

SpecialSerializers.ByteSerializer
=================================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class ByteSerializer implements Serializer
   :outertype: SpecialSerializers

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: SpecialSerializers.ByteSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: SpecialSerializers.ByteSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: SpecialSerializers.ByteSerializer

