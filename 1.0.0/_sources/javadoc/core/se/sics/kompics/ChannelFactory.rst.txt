ChannelFactory
==============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface ChannelFactory

   :author: lkroll

Methods
-------
connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort)
   :outertype: ChannelFactory

connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(PortCore<P> positivePort, PortCore<P> negativePort, ChannelSelector selector)
   :outertype: ChannelFactory

