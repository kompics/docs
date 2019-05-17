BiDirectionalChannel.Factory
============================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Factory implements ChannelFactory
   :outertype: BiDirectionalChannel

Methods
-------
connect
^^^^^^^

.. java:method:: @Override public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort)
   :outertype: BiDirectionalChannel.Factory

connect
^^^^^^^

.. java:method:: @Override public <P extends PortType, E extends KompicsEvent, F> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort, ChannelSelector<E, F> selector)
   :outertype: BiDirectionalChannel.Factory

