.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics ControlPort

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Port

.. java:import:: se.sics.kompics PortType

.. java:import:: se.sics.kompics Positive

ComponentProxy
==============

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public interface ComponentProxy

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentProxy

connect
^^^^^^^

.. java:method:: public <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive)
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

.. java:method:: public <P extends PortType> void disconnect(Negative<P> negative, Positive<P> positive)
   :outertype: ComponentProxy

disconnect
^^^^^^^^^^

.. java:method:: public <P extends PortType> void disconnect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentProxy

getControlPort
^^^^^^^^^^^^^^

.. java:method:: public Negative<ControlPort> getControlPort()
   :outertype: ComponentProxy

trigger
^^^^^^^

.. java:method:: public <P extends PortType> void trigger(KompicsEvent e, Port<P> p)
   :outertype: ComponentProxy

