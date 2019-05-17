.. java:import:: java.util UUID

ComponentProxy
==============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface ComponentProxy

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
answer
^^^^^^

.. java:method:: public <P extends PortType> void answer(Direct.Request<?> event)
   :outertype: ComponentProxy

answer
^^^^^^

.. java:method:: public <P extends PortType> void answer(Direct.Request<?> req, Direct.Response resp)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelSelector<?, ?> filter)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive, ChannelSelector<?, ?> filter)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelFactory factory)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelSelector<?, ?> selector, ChannelFactory factory)
   :outertype: ComponentProxy

create
^^^^^^

.. java:method:: public <T extends ComponentDefinition> Component create(Class<T> definition, Init<T> initEvent)
   :outertype: ComponentProxy

create
^^^^^^

.. java:method:: public <T extends ComponentDefinition> Component create(Class<T> definition, Init.None initEvent)
   :outertype: ComponentProxy

destroy
^^^^^^^

.. java:method:: public void destroy(Component component)
   :outertype: ComponentProxy

disconnect
^^^^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> void disconnect(Negative<P> negative, Positive<P> positive)
   :outertype: ComponentProxy

disconnect
^^^^^^^^^^

.. java:method:: @Deprecated public <P extends PortType> void disconnect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentProxy

disconnect
^^^^^^^^^^

.. java:method:: public <P extends PortType> void disconnect(Channel<P> c)
   :outertype: ComponentProxy

getControlPort
^^^^^^^^^^^^^^

.. java:method:: public Negative<ControlPort> getControlPort()
   :outertype: ComponentProxy

getNegative
^^^^^^^^^^^

.. java:method:: public <P extends PortType> Negative<P> getNegative(Class<P> portType)
   :outertype: ComponentProxy

getPositive
^^^^^^^^^^^

.. java:method:: public <P extends PortType> Positive<P> getPositive(Class<P> portType)
   :outertype: ComponentProxy

id
^^

.. java:method:: public UUID id()
   :outertype: ComponentProxy

provides
^^^^^^^^

.. java:method:: public <P extends PortType> Negative<P> provides(Class<P> portType)
   :outertype: ComponentProxy

requires
^^^^^^^^

.. java:method:: public <P extends PortType> Positive<P> requires(Class<P> portType)
   :outertype: ComponentProxy

subscribe
^^^^^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> void subscribe(Handler<E> handler, Port<P> port)
   :outertype: ComponentProxy

subscribe
^^^^^^^^^

.. java:method:: public void subscribe(MatchedHandler<?, ?, ?> handler, Port<?> port)
   :outertype: ComponentProxy

trigger
^^^^^^^

.. java:method:: public <P extends PortType> void trigger(KompicsEvent e, Port<P> p)
   :outertype: ComponentProxy

unsubscribe
^^^^^^^^^^^

.. java:method:: public void unsubscribe(MatchedHandler<?, ?, ?> handler, Port<?> port)
   :outertype: ComponentProxy

unsubscribe
^^^^^^^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> void unsubscribe(Handler<E> handler, Port<P> port)
   :outertype: ComponentProxy

