.. java:import:: com.google.common.base Optional

.. java:import:: com.google.common.io Closer

.. java:import:: io.netty.buffer ByteBuf

.. java:import:: io.netty.buffer ByteBufInputStream

.. java:import:: io.netty.buffer ByteBufOutputStream

.. java:import:: io.netty.handler.codec.serialization ClassResolver

.. java:import:: java.io EOFException

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io ObjectInputStream

.. java:import:: java.io ObjectOutputStream

.. java:import:: java.io ObjectStreamClass

.. java:import:: java.io OutputStream

.. java:import:: java.io StreamCorruptedException

JavaSerializer
==============

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public class JavaSerializer implements Serializer

   :author: Lars Kroll

Constructors
------------
JavaSerializer
^^^^^^^^^^^^^^

.. java:constructor:: public JavaSerializer(ClassResolver resolver)
   :outertype: JavaSerializer

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: @Override public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: JavaSerializer

identifier
^^^^^^^^^^

.. java:method:: @Override public int identifier()
   :outertype: JavaSerializer

toBinary
^^^^^^^^

.. java:method:: @Override public void toBinary(Object o, ByteBuf buf)
   :outertype: JavaSerializer

