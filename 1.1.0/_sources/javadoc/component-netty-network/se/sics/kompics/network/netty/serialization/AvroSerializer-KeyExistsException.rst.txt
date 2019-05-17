.. java:import:: java.util Optional

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

AvroSerializer.KeyExistsException
=================================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: @SuppressWarnings public static class KeyExistsException extends Exception
   :outertype: AvroSerializer

Constructors
------------
KeyExistsException
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public KeyExistsException(Object key)
   :outertype: AvroSerializer.KeyExistsException

Methods
-------
getMessage
^^^^^^^^^^

.. java:method:: @Override public String getMessage()
   :outertype: AvroSerializer.KeyExistsException

