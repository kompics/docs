.. java:import:: com.google.common.io BaseEncoding

ByteIdentifier
==============

.. java:package:: se.sics.kompics.util
   :noindex:

.. java:type:: public class ByteIdentifier implements Identifier

   :author: Alex Ormenisan

Fields
------
id
^^

.. java:field:: public final byte id
   :outertype: ByteIdentifier

Constructors
------------
ByteIdentifier
^^^^^^^^^^^^^^

.. java:constructor:: public ByteIdentifier(byte id)
   :outertype: ByteIdentifier

Methods
-------
compareTo
^^^^^^^^^

.. java:method:: @Override public int compareTo(Identifier o)
   :outertype: ByteIdentifier

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: ByteIdentifier

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: ByteIdentifier

partition
^^^^^^^^^

.. java:method:: @Override public int partition(int nrPartitions)
   :outertype: ByteIdentifier

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: ByteIdentifier

