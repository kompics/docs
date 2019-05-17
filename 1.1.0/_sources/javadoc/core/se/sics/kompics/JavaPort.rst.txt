.. java:import:: java.lang.reflect Method

.. java:import:: java.util ArrayList

.. java:import:: java.util Comparator

.. java:import:: java.util List

.. java:import:: java.util TreeSet

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

.. java:import:: se.sics.kompics HandlerStore.HandlerList

.. java:import:: se.sics.kompics HandlerStore.MatchedHandlerList

JavaPort
========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @SuppressWarnings public class JavaPort<P extends PortType> extends PortCore<P>

   The \ ``PortCore``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Constructors
------------
JavaPort
^^^^^^^^

.. java:constructor:: public JavaPort(JavaPort<P> other)
   :outertype: JavaPort

JavaPort
^^^^^^^^

.. java:constructor::  JavaPort(boolean positive, P portType, ComponentCore owner)
   :outertype: JavaPort

Methods
-------
addChannel
^^^^^^^^^^

.. java:method:: @Override public void addChannel(ChannelCore<P> channel)
   :outertype: JavaPort

addChannel
^^^^^^^^^^

.. java:method:: @Override public void addChannel(ChannelCore<P> channel, ChannelSelector<?, ?> selector)
   :outertype: JavaPort

cleanChannels
^^^^^^^^^^^^^

.. java:method:: @Override public void cleanChannels()
   :outertype: JavaPort

cleanEvents
^^^^^^^^^^^

.. java:method:: @Override public void cleanEvents()
   :outertype: JavaPort

doInternalSubscribe
^^^^^^^^^^^^^^^^^^^

.. java:method::  <E extends KompicsEvent> void doInternalSubscribe(Handler<E> handler)
   :outertype: JavaPort

doSubscribe
^^^^^^^^^^^

.. java:method:: @Override public <E extends KompicsEvent> void doSubscribe(Handler<E> handler)
   :outertype: JavaPort

doSubscribe
^^^^^^^^^^^

.. java:method:: @Override public void doSubscribe(MatchedHandler<?, ?, ?> handler)
   :outertype: JavaPort

doTrigger
^^^^^^^^^

.. java:method:: @Override public void doTrigger(KompicsEvent event, int wid, ChannelCore<?> channel)
   :outertype: JavaPort

doTrigger
^^^^^^^^^

.. java:method:: @Override public void doTrigger(KompicsEvent event, int wid, ComponentCore component)
   :outertype: JavaPort

doUnsubscribe
^^^^^^^^^^^^^

.. java:method::  <E extends KompicsEvent> void doUnsubscribe(Handler<E> handler)
   :outertype: JavaPort

doUnsubscribe
^^^^^^^^^^^^^

.. java:method::  void doUnsubscribe(MatchedHandler<?, ?, ?> handler)
   :outertype: JavaPort

enqueue
^^^^^^^

.. java:method:: @Override public void enqueue(KompicsEvent event)
   :outertype: JavaPort

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: JavaPort

findChannelsTo
^^^^^^^^^^^^^^

.. java:method:: @Override public List<Channel<P>> findChannelsTo(PortCore<P> port)
   :outertype: JavaPort

getPair
^^^^^^^

.. java:method:: @Override public PortCore<P> getPair()
   :outertype: JavaPort

getSubscribedHandlers
^^^^^^^^^^^^^^^^^^^^^

.. java:method::  HandlerList getSubscribedHandlers(KompicsEvent event)
   :outertype: JavaPort

getSubscribedMatchers
^^^^^^^^^^^^^^^^^^^^^

.. java:method::  MatchedHandlerList getSubscribedMatchers(PatternExtractor event)
   :outertype: JavaPort

hasEvent
^^^^^^^^

.. java:method::  boolean hasEvent()
   :outertype: JavaPort

pickFirstEvent
^^^^^^^^^^^^^^

.. java:method::  KompicsEvent pickFirstEvent()
   :outertype: JavaPort

removeChannel
^^^^^^^^^^^^^

.. java:method:: @Override public void removeChannel(ChannelCore<P> channel)
   :outertype: JavaPort

setPair
^^^^^^^

.. java:method:: @Override public void setPair(PortCore<P> pair)
   :outertype: JavaPort

