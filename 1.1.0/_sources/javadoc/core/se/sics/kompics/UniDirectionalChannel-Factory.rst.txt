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

.. java:method:: @Override public <P extends PortType, E extends KompicsEvent, F> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort, ChannelSelector<E, F> selector)
   :outertype: UniDirectionalChannel.Factory

