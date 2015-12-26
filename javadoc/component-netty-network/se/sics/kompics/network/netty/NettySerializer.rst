.. java:import:: com.google.common.base Optional

.. java:import:: com.google.common.primitives Ints

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: se.sics.kompics.network.netty.serialization Serializer

.. java:import:: se.sics.kompics.network.netty.serialization SpecialSerializers

NettySerializer
===============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettySerializer implements Serializer

   :author: lkroll

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: NettySerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: NettySerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: NettySerializer

