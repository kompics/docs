.. java:import:: com.google.common.base Optional

.. java:import:: com.google.common.primitives Ints

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.channel.socket DatagramPacket

.. java:import:: io.netty.handler.codec.serialization ClassResolvers

.. java:import:: java.io Serializable

.. java:import:: java.util Arrays

.. java:import:: java.util HashMap

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics.network.netty AckRequestMsg

.. java:import:: se.sics.kompics.network.netty DirectMessage

.. java:import:: se.sics.kompics.network.netty NettyAddress

.. java:import:: se.sics.kompics.network.netty NettySerializer

Serializers
===========

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public abstract class Serializers

   :author: Lars Kroll

Fields
------
BYTES
^^^^^

.. java:field:: static final int BYTES
   :outertype: Serializers

LOG
^^^

.. java:field:: public static final Logger LOG
   :outertype: Serializers

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: public static Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: Serializers

fromBinary
^^^^^^^^^^

.. java:method:: public static Object fromBinary(ByteBuf buf, DatagramPacket datagram)
   :outertype: Serializers

getSerializer
^^^^^^^^^^^^^

.. java:method:: public static Serializer getSerializer(int serializerId)
   :outertype: Serializers

getSerializer
^^^^^^^^^^^^^

.. java:method:: public static Serializer getSerializer(String name)
   :outertype: Serializers

lookupSerializer
^^^^^^^^^^^^^^^^

.. java:method:: public static Serializer lookupSerializer(Class<? extends Object> aClass)
   :outertype: Serializers

printRules
^^^^^^^^^^

.. java:method:: public static void printRules()
   :outertype: Serializers

register
^^^^^^^^

.. java:method:: public static void register(Serializer s, String name)
   :outertype: Serializers

register
^^^^^^^^

.. java:method:: public static void register(Class<?> type, int serializerId)
   :outertype: Serializers

register
^^^^^^^^

.. java:method:: public static void register(Class<?> type, String serializerName)
   :outertype: Serializers

register
^^^^^^^^

.. java:method:: public static void register(Class<?> type, Serializer s)
   :outertype: Serializers

resize
^^^^^^

.. java:method:: public static void resize(IdBytes idSB)
   :outertype: Serializers

toBinary
^^^^^^^^

.. java:method:: public static void toBinary(Object o, ByteBuf buf)
   :outertype: Serializers

