.. java:import:: java.util Optional

.. java:import:: io.netty.buffer ByteBuf

Serializer
==========

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public interface Serializer

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
fromBinary
^^^^^^^^^^

.. java:method:: public Object fromBinary(ByteBuf buf, Optional<Object> hint)
   :outertype: Serializer

   Deserialize from buf. Optionally use hint to decide what to deserialize.

   :param buf:
   :param hint:

identifier
^^^^^^^^^^

.. java:method:: public int identifier()
   :outertype: Serializer

toBinary
^^^^^^^^

.. java:method:: public void toBinary(Object o, ByteBuf buf)
   :outertype: Serializer

   Serialize o into buf.

   :param o:
   :param buf:

