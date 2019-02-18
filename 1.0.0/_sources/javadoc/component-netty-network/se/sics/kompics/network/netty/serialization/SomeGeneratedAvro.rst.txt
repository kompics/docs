SomeGeneratedAvro
=================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: @SuppressWarnings @org.apache.avro.specific.AvroGenerated public class SomeGeneratedAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord

Fields
------
SCHEMA$
^^^^^^^

.. java:field:: public static final org.apache.avro.Schema SCHEMA$
   :outertype: SomeGeneratedAvro

someNumber
^^^^^^^^^^

.. java:field:: @Deprecated public int someNumber
   :outertype: SomeGeneratedAvro

Constructors
------------
SomeGeneratedAvro
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SomeGeneratedAvro()
   :outertype: SomeGeneratedAvro

   Default constructor. Note that this does not initialize fields to their default values from the schema. If that is desired then one should use \ ``newBuilder()``\ .

SomeGeneratedAvro
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SomeGeneratedAvro(java.lang.Integer someNumber)
   :outertype: SomeGeneratedAvro

   All-args constructor.

Methods
-------
get
^^^

.. java:method:: public java.lang.Object get(int field$)
   :outertype: SomeGeneratedAvro

getClassSchema
^^^^^^^^^^^^^^

.. java:method:: public static org.apache.avro.Schema getClassSchema()
   :outertype: SomeGeneratedAvro

getSchema
^^^^^^^^^

.. java:method:: public org.apache.avro.Schema getSchema()
   :outertype: SomeGeneratedAvro

getSomeNumber
^^^^^^^^^^^^^

.. java:method:: public java.lang.Integer getSomeNumber()
   :outertype: SomeGeneratedAvro

   Gets the value of the 'someNumber' field.

newBuilder
^^^^^^^^^^

.. java:method:: public static se.sics.kompics.network.netty.serialization.SomeGeneratedAvro.Builder newBuilder()
   :outertype: SomeGeneratedAvro

   Creates a new SomeGeneratedAvro RecordBuilder

newBuilder
^^^^^^^^^^

.. java:method:: public static se.sics.kompics.network.netty.serialization.SomeGeneratedAvro.Builder newBuilder(se.sics.kompics.network.netty.serialization.SomeGeneratedAvro.Builder other)
   :outertype: SomeGeneratedAvro

   Creates a new SomeGeneratedAvro RecordBuilder by copying an existing Builder

newBuilder
^^^^^^^^^^

.. java:method:: public static se.sics.kompics.network.netty.serialization.SomeGeneratedAvro.Builder newBuilder(se.sics.kompics.network.netty.serialization.SomeGeneratedAvro other)
   :outertype: SomeGeneratedAvro

   Creates a new SomeGeneratedAvro RecordBuilder by copying an existing SomeGeneratedAvro instance

put
^^^

.. java:method:: @SuppressWarnings public void put(int field$, java.lang.Object value$)
   :outertype: SomeGeneratedAvro

setSomeNumber
^^^^^^^^^^^^^

.. java:method:: public void setSomeNumber(java.lang.Integer value)
   :outertype: SomeGeneratedAvro

   Sets the value of the 'someNumber' field.

   :param value: the value to set.

