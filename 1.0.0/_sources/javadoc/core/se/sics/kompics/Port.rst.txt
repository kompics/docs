Port
====

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface Port<P extends PortType>

   The \ ``Port``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Methods
-------
addChannel
^^^^^^^^^^

.. java:method:: public void addChannel(ChannelCore<P> channel)
   :outertype: Port

addChannel
^^^^^^^^^^

.. java:method:: public void addChannel(ChannelCore<P> channel, ChannelSelector<?, ?> filter)
   :outertype: Port

doSubscribe
^^^^^^^^^^^

.. java:method:: public <E extends KompicsEvent> void doSubscribe(Handler<E> handler)
   :outertype: Port

doSubscribe
^^^^^^^^^^^

.. java:method:: public void doSubscribe(MatchedHandler handler)
   :outertype: Port

doTrigger
^^^^^^^^^

.. java:method:: public void doTrigger(KompicsEvent event, int wid, ChannelCore<?> channel)
   :outertype: Port

   trigger event on this port

   :param event: to be triggered
   :param wid: ?
   :param channel: that triggered the event

doTrigger
^^^^^^^^^

.. java:method:: public void doTrigger(KompicsEvent event, int wid, ComponentCore component)
   :outertype: Port

   trigger event on this port

   :param event: to be triggered
   :param wid: ?
   :param component: that triggered the event

enqueue
^^^^^^^

.. java:method:: public void enqueue(KompicsEvent event)
   :outertype: Port

getOwner
^^^^^^^^

.. java:method:: public ComponentCore getOwner()
   :outertype: Port

   :return: the component the port is part of

getPair
^^^^^^^

.. java:method:: public PortCore<P> getPair()
   :outertype: Port

   :return: complement port this one is connected to (if any)

getPortType
^^^^^^^^^^^

.. java:method:: public P getPortType()
   :outertype: Port

   Gets the port type.

   :return: the port type

removeChannel
^^^^^^^^^^^^^

.. java:method:: public void removeChannel(ChannelCore<P> remotePort)
   :outertype: Port

setPair
^^^^^^^

.. java:method:: public void setPair(PortCore<P> port)
   :outertype: Port

   :param port: complement port

