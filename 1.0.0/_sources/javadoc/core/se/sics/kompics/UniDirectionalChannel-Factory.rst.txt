UniDirectionalChannel.Factory
=============================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Factory implements ChannelFactory
   :outertype: UniDirectionalChannel

Constructors
------------
Factory
^^^^^^^

.. java:constructor:: public Factory(Direction direction)
   :outertype: UniDirectionalChannel.Factory

Methods
-------
connect
^^^^^^^

.. java:method:: @Override public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort)
   :outertype: UniDirectionalChannel.Factory

connect
^^^^^^^

.. java:method:: @Override public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort, ChannelSelector selector)
   :outertype: UniDirectionalChannel.Factory

