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

SpecialSerializers.BitBuffer
============================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: static class BitBuffer
   :outertype: SpecialSerializers

Methods
-------
create
^^^^^^

.. java:method:: public static BitBuffer create(Boolean... args)
   :outertype: SpecialSerializers.BitBuffer

extract
^^^^^^^

.. java:method:: public static boolean[] extract(int numValues, byte[] bytes)
   :outertype: SpecialSerializers.BitBuffer

finalise
^^^^^^^^

.. java:method:: public byte[] finalise()
   :outertype: SpecialSerializers.BitBuffer

write
^^^^^

.. java:method:: public BitBuffer write(Boolean... args)
   :outertype: SpecialSerializers.BitBuffer

