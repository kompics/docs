SimpleChannel
=============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class SimpleChannel<PT extends PortType> implements ChannelCore<PT>

   :author: lkroll

Fields
------
destroyed
^^^^^^^^^

.. java:field:: protected volatile boolean destroyed
   :outertype: SimpleChannel

negativePort
^^^^^^^^^^^^

.. java:field:: protected final PortCore<PT> negativePort
   :outertype: SimpleChannel

portType
^^^^^^^^

.. java:field:: protected final PT portType
   :outertype: SimpleChannel

positivePort
^^^^^^^^^^^^

.. java:field:: protected final PortCore<PT> positivePort
   :outertype: SimpleChannel

Constructors
------------
SimpleChannel
^^^^^^^^^^^^^

.. java:constructor:: public SimpleChannel(PortCore<PT> positivePort, PortCore<PT> negativePort)
   :outertype: SimpleChannel

Methods
-------
disconnect
^^^^^^^^^^

.. java:method:: @Override public void disconnect()
   :outertype: SimpleChannel

getPortType
^^^^^^^^^^^

.. java:method:: @Override public PT getPortType()
   :outertype: SimpleChannel

hasNegativePort
^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean hasNegativePort(Port<PT> port)
   :outertype: SimpleChannel

hasPositivePort
^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean hasPositivePort(Port<PT> port)
   :outertype: SimpleChannel

isDestroyed
^^^^^^^^^^^

.. java:method:: @Override public boolean isDestroyed()
   :outertype: SimpleChannel

