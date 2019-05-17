ChannelFactory
==============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface ChannelFactory

   Lars Kroll <lkroll@kth.se>

Methods
-------
connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort)
   :outertype: ChannelFactory

connect
^^^^^^^

.. java:method:: public <P extends PortType, E extends KompicsEvent, F> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort, ChannelSelector<E, F> selector)
   :outertype: ChannelFactory

