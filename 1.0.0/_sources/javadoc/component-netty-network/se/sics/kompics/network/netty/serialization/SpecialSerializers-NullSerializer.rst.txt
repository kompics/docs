.. java:import:: com.google.common.base Optional

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

SpecialSerializers.NullSerializer
=================================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class NullSerializer implements Serializer
   :outertype: SpecialSerializers

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: SpecialSerializers.NullSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: SpecialSerializers.NullSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: SpecialSerializers.NullSerializer

