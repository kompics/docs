.. java:import:: java.lang.reflect Constructor

.. java:import:: java.util List

.. java:import:: java.util UUID

.. java:import:: se.sics.kompics Fault.ResolveAction

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

ComponentDefinition
===================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class ComponentDefinition

   The \ ``ComponentDefinition``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
control
^^^^^^^

.. java:field:: protected Negative<ControlPort> control
   :outertype: ComponentDefinition

loopback
^^^^^^^^

.. java:field:: protected Negative<LoopbackPort> loopback
   :outertype: ComponentDefinition

onSelf
^^^^^^

.. java:field:: protected Positive<LoopbackPort> onSelf
   :outertype: ComponentDefinition

proxy
^^^^^

.. java:field:: public final ComponentProxy proxy
   :outertype: ComponentDefinition

Constructors
------------
ComponentDefinition
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: protected ComponentDefinition()
   :outertype: ComponentDefinition

   Instantiates a new component definition.

ComponentDefinition
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: protected ComponentDefinition(Class<? extends ComponentCore> coreClass)
   :outertype: ComponentDefinition

Methods
-------
answer
^^^^^^

.. java:method:: protected final <P extends PortType> void answer(Direct.Request event)
   :outertype: ComponentDefinition

answer
^^^^^^

.. java:method:: protected final <P extends PortType> void answer(Direct.Request req, Direct.Response resp)
   :outertype: ComponentDefinition

config
^^^^^^

.. java:method:: public final Config config()
   :outertype: ComponentDefinition

connect
^^^^^^^

.. java:method:: @Deprecated protected final <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

connect
^^^^^^^

.. java:method:: @Deprecated protected final <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

connect
^^^^^^^

.. java:method:: @Deprecated protected <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelSelector<?, ?> selector)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

connect
^^^^^^^

.. java:method:: @Deprecated protected <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive, ChannelSelector<?, ?> selector)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

connect
^^^^^^^

.. java:method:: protected <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive, ChannelSelector<?, ?> selector, ChannelFactory factory)
   :outertype: ComponentDefinition

connect
^^^^^^^

.. java:method:: protected <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelSelector<?, ?> selector, ChannelFactory factory)
   :outertype: ComponentDefinition

connect
^^^^^^^

.. java:method:: protected <P extends PortType> Channel<P> connect(Negative<P> negative, Positive<P> positive, ChannelFactory factory)
   :outertype: ComponentDefinition

connect
^^^^^^^

.. java:method:: protected <P extends PortType> Channel<P> connect(Positive<P> positive, Negative<P> negative, ChannelFactory factory)
   :outertype: ComponentDefinition

create
^^^^^^

.. java:method:: protected final <T extends ComponentDefinition> Component create(Class<T> definition, Init<T> initEvent)
   :outertype: ComponentDefinition

   Creates the.

   :param definition: the definition
   :param initEvent: init event to be passed to constructor
   :return: the component

create
^^^^^^

.. java:method:: protected final <T extends ComponentDefinition> Component create(Class<T> definition, Init.None initEvent)
   :outertype: ComponentDefinition

   Creates the.

   :param definition: the definition
   :param initEvent: none
   :return: the component

create
^^^^^^

.. java:method:: protected final <T extends ComponentDefinition> Component create(Class<T> definition, Init<T> initEvent, ConfigUpdate update)
   :outertype: ComponentDefinition

   Creates the.

   :param definition: the definition
   :param initEvent: init event to be passed to constructor
   :return: the component

create
^^^^^^

.. java:method:: protected final <T extends ComponentDefinition> Component create(Class<T> definition, Init.None initEvent, ConfigUpdate update)
   :outertype: ComponentDefinition

   Creates the.

   :param definition: the definition
   :param initEvent: none
   :return: the component

destroy
^^^^^^^

.. java:method:: protected final void destroy(Component component)
   :outertype: ComponentDefinition

disconnect
^^^^^^^^^^

.. java:method:: @Deprecated protected final <P extends PortType> void disconnect(Negative<P> negative, Positive<P> positive)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

disconnect
^^^^^^^^^^

.. java:method:: @Deprecated protected final <P extends PortType> void disconnect(Positive<P> positive, Negative<P> negative)
   :outertype: ComponentDefinition

   :param <P>:
   :param negative:
   :param positive:

disconnect
^^^^^^^^^^

.. java:method:: protected final <P extends PortType> void disconnect(Channel<P> c)
   :outertype: ComponentDefinition

getComponentCore
^^^^^^^^^^^^^^^^

.. java:method:: public final ComponentCore getComponentCore()
   :outertype: ComponentDefinition

getControlPort
^^^^^^^^^^^^^^

.. java:method:: public final Negative<ControlPort> getControlPort()
   :outertype: ComponentDefinition

handleFault
^^^^^^^^^^^

.. java:method:: public ResolveAction handleFault(Fault fault)
   :outertype: ComponentDefinition

   Override for custom error handling.

   Default action is ESCALATE.

   ESCALATE -> Forward fault to parent. IGNORE -> Drop fault. Resume component as if nothing happened. RESOLVED -> Fault has been handled by user. Don't do anything else.

   :param fault:

handleUpdate
^^^^^^^^^^^^

.. java:method:: public UpdateAction handleUpdate(ConfigUpdate update)
   :outertype: ComponentDefinition

   Override for custom update handling.

   Default action is to propagate the original everywhere and apply to self.

   :param update:

id
^^

.. java:method:: public final UUID id()
   :outertype: ComponentDefinition

negative
^^^^^^^^

.. java:method:: protected final <P extends PortType> Negative<P> negative(Class<P> portType)
   :outertype: ComponentDefinition

   Negative.

   :param portType: the port type
   :return: the negative < p>

positive
^^^^^^^^

.. java:method:: protected final <P extends PortType> Positive<P> positive(Class<P> portType)
   :outertype: ComponentDefinition

   Positive.

   :param portType: the port type
   :return: the positive < p>

postUpdate
^^^^^^^^^^

.. java:method:: public void postUpdate()
   :outertype: ComponentDefinition

   Override to perform actions after a ConfigUpdate was applied and forwarded.

provides
^^^^^^^^

.. java:method:: protected final <P extends PortType> Negative<P> provides(Class<P> portType)
   :outertype: ComponentDefinition

requires
^^^^^^^^

.. java:method:: protected final <P extends PortType> Positive<P> requires(Class<P> portType)
   :outertype: ComponentDefinition

   specifies that this component requires a port of type \ ``portType``\ .

   :param <P>:
   :param portType:

separateConfigId
^^^^^^^^^^^^^^^^

.. java:method:: public boolean separateConfigId()
   :outertype: ComponentDefinition

   Override to allow components of this type to start their own independent \ :java:ref:`se.sics.kompics.config.Config`\  id lines.

   This is helpful in simulation, when simulating multiple independent nodes. Make sure that no \ ``ConfigUpdate``\ s are passed to siblings or parents of such nodes! (Override \ :java:ref:`handleUpdate(se.sics.kompics.config.ConfigUpdate)`\ )

   :return: Whether to create a new config id line for this component (default: \ ``true``\ )

subscribe
^^^^^^^^^

.. java:method:: protected final <E extends KompicsEvent, P extends PortType> void subscribe(Handler<E> handler, Port<P> port)
   :outertype: ComponentDefinition

   Subscribe.

   :param handler: the handler
   :param port: the port
   :throws ConfigurationException:

subscribe
^^^^^^^^^

.. java:method:: protected final void subscribe(MatchedHandler handler, Port port)
   :outertype: ComponentDefinition

suicide
^^^^^^^

.. java:method:: public final void suicide()
   :outertype: ComponentDefinition

tearDown
^^^^^^^^

.. java:method:: public void tearDown()
   :outertype: ComponentDefinition

   Use for custom cleanup. Will be called after all child components have stopped, but before sending a Stopped message to the parent.

trigger
^^^^^^^

.. java:method:: protected final <P extends PortType> void trigger(KompicsEvent event, Port<P> port)
   :outertype: ComponentDefinition

   Trigger.

   :param event: the event
   :param port: the port

unsubscribe
^^^^^^^^^^^

.. java:method:: protected final void unsubscribe(MatchedHandler handler, Port port)
   :outertype: ComponentDefinition

unsubscribe
^^^^^^^^^^^

.. java:method:: protected final <E extends KompicsEvent, P extends PortType> void unsubscribe(Handler<E> handler, Port<P> port) throws ConfigurationException
   :outertype: ComponentDefinition

   Unsubscribe.

   :param handler: the handler
   :param port: the port
   :throws ConfigurationException:

updateConfig
^^^^^^^^^^^^

.. java:method:: public final void updateConfig(ConfigUpdate update)
   :outertype: ComponentDefinition

