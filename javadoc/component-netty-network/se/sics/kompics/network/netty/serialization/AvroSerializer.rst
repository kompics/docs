.. java:import:: com.google.common.base Optional

.. java:import:: com.google.common.io Closer

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.buffer ByteBufInputStream

.. java:import:: io.netty.buffer ByteBufOutputStream

.. java:import:: java.io IOException

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentMap

.. java:import:: java.util.concurrent ConcurrentSkipListMap

.. java:import:: org.apache.avro Schema

.. java:import:: org.apache.avro.file DataFileStream

.. java:import:: org.apache.avro.file DataFileWriter

.. java:import:: org.apache.avro.generic GenericContainer

.. java:import:: org.apache.avro.io BinaryDecoder

.. java:import:: org.apache.avro.io BinaryEncoder

.. java:import:: org.apache.avro.io DatumReader

.. java:import:: org.apache.avro.io DatumWriter

.. java:import:: org.apache.avro.io DecoderFactory

.. java:import:: org.apache.avro.io EncoderFactory

.. java:import:: org.apache.avro.reflect ReflectData

.. java:import:: org.apache.avro.reflect ReflectDatumReader

.. java:import:: org.apache.avro.reflect ReflectDatumWriter

.. java:import:: org.apache.avro.specific SpecificDatumReader

.. java:import:: org.apache.avro.specific SpecificDatumWriter

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics.network.netty.serialization SpecialSerializers.BitBuffer

AvroSerializer
==============

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public class AvroSerializer implements Serializer

   :author: lkroll

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: AvroSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: AvroSerializer

register
^^^^^^^^

.. java:method:: public static synchronized void register(int id, Class type) throws KeyExistsException, InvalidKeyException
   :outertype: AvroSerializer

register
^^^^^^^^

.. java:method:: public static synchronized void register(int id, Class type, boolean force) throws KeyExistsException, InvalidKeyException
   :outertype: AvroSerializer

register
^^^^^^^^

.. java:method:: public static synchronized void register(int id, Class type, Schema schema) throws KeyExistsException, InvalidKeyException
   :outertype: AvroSerializer

register
^^^^^^^^

.. java:method:: public static synchronized void register(int id, Class type, Schema schema, boolean force) throws KeyExistsException, InvalidKeyException
   :outertype: AvroSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: AvroSerializer

