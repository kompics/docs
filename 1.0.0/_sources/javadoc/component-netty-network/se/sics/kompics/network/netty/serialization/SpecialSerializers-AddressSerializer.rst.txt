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

SpecialSerializers.AddressSerializer
====================================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class AddressSerializer implements Serializer
   :outertype: SpecialSerializers

Fields
------
BYTE_KEY_SIZE
^^^^^^^^^^^^^

.. java:field:: public static final int BYTE_KEY_SIZE
   :outertype: SpecialSerializers.AddressSerializer

INSTANCE
^^^^^^^^

.. java:field:: public static final AddressSerializer INSTANCE
   :outertype: SpecialSerializers.AddressSerializer

INT_BYTE_SIZE
^^^^^^^^^^^^^

.. java:field:: public static final int INT_BYTE_SIZE
   :outertype: SpecialSerializers.AddressSerializer

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: SpecialSerializers.AddressSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: SpecialSerializers.AddressSerializer

socketFromBinary
^^^^^^^^^^^^^^^^

.. java:method:: public InetSocketAddress socketFromBinary(ByteBuf buf)
   :outertype: SpecialSerializers.AddressSerializer

socketToBinary
^^^^^^^^^^^^^^

.. java:method:: public void socketToBinary(InetSocketAddress isa, ByteBuf buf)
   :outertype: SpecialSerializers.AddressSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: SpecialSerializers.AddressSerializer

