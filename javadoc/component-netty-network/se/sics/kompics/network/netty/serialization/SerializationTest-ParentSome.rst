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

SerializationTest.ParentSome
============================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class ParentSome implements Serializable
   :outertype: SerializationTest

Constructors
------------
ParentSome
^^^^^^^^^^

.. java:constructor:: public ParentSome(SomeSerializable ss)
   :outertype: SerializationTest.ParentSome

Methods
-------
getMySer
^^^^^^^^

.. java:method:: public SomeSerializable getMySer()
   :outertype: SerializationTest.ParentSome

setMySer
^^^^^^^^

.. java:method:: public void setMySer(SomeSerializable ss)
   :outertype: SerializationTest.ParentSome

