.. java:import:: java.util Optional

.. java:import:: java.lang.reflect Constructor

.. java:import:: java.lang.reflect InvocationTargetException

.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util Map

.. java:import:: java.util Objects

.. java:import:: java.util Set

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j MDC

.. java:import:: se.sics.kompics Fault.ResolveAction

.. java:import:: se.sics.kompics HandlerStore.HandlerList

.. java:import:: se.sics.kompics HandlerStore.MatchedHandlerList

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ValueMerger

JavaComponent
=============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @SuppressWarnings public class JavaComponent extends ComponentCore

   The \ ``ComponentCore``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
component
^^^^^^^^^

.. java:field::  ComponentDefinition component
   :outertype: JavaComponent

configHandler
^^^^^^^^^^^^^

.. java:field::  Handler<Update> configHandler
   :outertype: JavaComponent

handleFault
^^^^^^^^^^^

.. java:field::  Handler<Fault> handleFault
   :outertype: JavaComponent

handleKill
^^^^^^^^^^

.. java:field::  Handler<Kill> handleKill
   :outertype: JavaComponent

handleKilled
^^^^^^^^^^^^

.. java:field::  Handler<Killed> handleKilled
   :outertype: JavaComponent

handleStart
^^^^^^^^^^^

.. java:field::  Handler<Start> handleStart
   :outertype: JavaComponent

handleStarted
^^^^^^^^^^^^^

.. java:field::  Handler<Started> handleStarted
   :outertype: JavaComponent

handleStop
^^^^^^^^^^

.. java:field::  Handler<Stop> handleStop
   :outertype: JavaComponent

handleStopped
^^^^^^^^^^^^^

.. java:field::  Handler<Stopped> handleStopped
   :outertype: JavaComponent

Constructors
------------
JavaComponent
^^^^^^^^^^^^^

.. java:constructor:: public JavaComponent(ComponentDefinition componentDefinition)
   :outertype: JavaComponent

   Instantiates a new component core.

   :param componentDefinition: the component definition

Methods
-------
cleanPorts
^^^^^^^^^^

.. java:method:: @Override protected void cleanPorts()
   :outertype: JavaComponent

control
^^^^^^^

.. java:method:: @Override public Positive<ControlPort> control()
   :outertype: JavaComponent

createControlPort
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public Negative<ControlPort> createControlPort()
   :outertype: JavaComponent

createNegativePort
^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public <P extends PortType> Negative<P> createNegativePort(Class<P> portType)
   :outertype: JavaComponent

createPositivePort
^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public <P extends PortType> Positive<P> createPositivePort(Class<P> portType)
   :outertype: JavaComponent

doConfigUpdate
^^^^^^^^^^^^^^

.. java:method:: @Override  void doConfigUpdate(ConfigUpdate update)
   :outertype: JavaComponent

doCreate
^^^^^^^^

.. java:method:: @Override public <T extends ComponentDefinition> Component doCreate(Class<T> definition, Optional<Init<T>> initEvent)
   :outertype: JavaComponent

doCreate
^^^^^^^^

.. java:method:: @Override public <T extends ComponentDefinition> Component doCreate(Class<T> definition, Optional<Init<T>> initEvent, Optional<ConfigUpdate> update)
   :outertype: JavaComponent

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object o)
   :outertype: JavaComponent

escalateFault
^^^^^^^^^^^^^

.. java:method:: @Override public void escalateFault(Fault fault)
   :outertype: JavaComponent

execute
^^^^^^^

.. java:method:: @Override public void execute(int wid)
   :outertype: JavaComponent

getComponent
^^^^^^^^^^^^

.. java:method:: @Override public ComponentDefinition getComponent()
   :outertype: JavaComponent

getControl
^^^^^^^^^^

.. java:method:: @Override public Positive<ControlPort> getControl()
   :outertype: JavaComponent

getNegative
^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <P extends PortType> Negative<P> getNegative(Class<P> portType)
   :outertype: JavaComponent

getNegativePorts
^^^^^^^^^^^^^^^^

.. java:method::  Map<Class<? extends PortType>, JavaPort<? extends PortType>> getNegativePorts()
   :outertype: JavaComponent

getPositive
^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <P extends PortType> Positive<P> getPositive(Class<P> portType)
   :outertype: JavaComponent

getPositivePorts
^^^^^^^^^^^^^^^^

.. java:method::  Map<Class<? extends PortType>, JavaPort<? extends PortType>> getPositivePorts()
   :outertype: JavaComponent

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: JavaComponent

logger
^^^^^^

.. java:method:: @Override protected Logger logger()
   :outertype: JavaComponent

provided
^^^^^^^^

.. java:method:: @Override public <P extends PortType> Positive<P> provided(Class<P> portType)
   :outertype: JavaComponent

required
^^^^^^^^

.. java:method:: @Override public <P extends PortType> Negative<P> required(Class<P> portType)
   :outertype: JavaComponent

setInactive
^^^^^^^^^^^

.. java:method:: @Override protected void setInactive(Component child)
   :outertype: JavaComponent

