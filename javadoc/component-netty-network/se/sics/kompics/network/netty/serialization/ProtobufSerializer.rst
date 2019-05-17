.. java:import:: java.util Optional

.. java:import:: com.google.protobuf ExtensionRegistry

.. java:import:: com.google.protobuf InvalidProtocolBufferException

.. java:import:: com.google.protobuf MessageLite

.. java:import:: io.netty.buffer ByteBuf

ProtobufSerializer
==================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public class ProtobufSerializer implements Serializer

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
ProtobufSerializer
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ProtobufSerializer(MessageLite prototype)
   :outertype: ProtobufSerializer

ProtobufSerializer
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ProtobufSerializer(MessageLite prototype, ExtensionRegistry extensionRegistry)
   :outertype: ProtobufSerializer

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf msg, Optional<Object> hint)
   :outertype: ProtobufSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: ProtobufSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object msg, ByteBuf buf)
   :outertype: ProtobufSerializer

