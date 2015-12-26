.. java:import:: com.google.common.base Optional

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.buffer ByteBufUtil

.. java:import:: io.netty.buffer Unpooled

.. java:import:: java.io Serializable

.. java:import:: java.net InetAddress

.. java:import:: java.net UnknownHostException

.. java:import:: java.util UUID

.. java:import:: junit.framework Assert

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.network.netty DisambiguateConnection

.. java:import:: se.sics.kompics.network.netty NettyAddress

SerializationTest
=================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: @RunWith public class SerializationTest

   :author: Lars Kroll

Methods
-------
addressTest
^^^^^^^^^^^

.. java:method:: @Test public void addressTest()
   :outertype: SerializationTest

avroTest
^^^^^^^^

.. java:method:: @Test public void avroTest() throws AvroSerializer.KeyExistsException, AvroSerializer.InvalidKeyException
   :outertype: SerializationTest

byteBufTest
^^^^^^^^^^^

.. java:method:: @Test public void byteBufTest()
   :outertype: SerializationTest

byteTest
^^^^^^^^

.. java:method:: @Test public void byteTest()
   :outertype: SerializationTest

disambTest
^^^^^^^^^^

.. java:method:: @Test public void disambTest()
   :outertype: SerializationTest

intTest
^^^^^^^

.. java:method:: @Test public void intTest()
   :outertype: SerializationTest

nullTest
^^^^^^^^

.. java:method:: @Test public void nullTest()
   :outertype: SerializationTest

parentSerializableTest
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void parentSerializableTest()
   :outertype: SerializationTest

serializableTest
^^^^^^^^^^^^^^^^

.. java:method:: @Test public void serializableTest()
   :outertype: SerializationTest

uuidTest
^^^^^^^^

.. java:method:: @Test public void uuidTest()
   :outertype: SerializationTest

