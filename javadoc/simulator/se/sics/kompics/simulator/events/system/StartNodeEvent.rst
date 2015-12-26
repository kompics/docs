.. java:import:: java.nio.channels Selector

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics.simulator.events SystemEvent

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

StartNodeEvent
==============

.. java:package:: se.sics.kompics.simulator.events.system
   :noindex:

.. java:type:: public abstract class StartNodeEvent<E extends ComponentDefinition> extends SystemEvent

   :author: Alex Ormenisan

Constructors
------------
StartNodeEvent
^^^^^^^^^^^^^^

.. java:constructor:: public StartNodeEvent()
   :outertype: StartNodeEvent

Methods
-------
getComponentDefinition
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract Class<E> getComponentDefinition()
   :outertype: StartNodeEvent

getComponentInit
^^^^^^^^^^^^^^^^

.. java:method:: public abstract Init<E> getComponentInit()
   :outertype: StartNodeEvent

getHostTrafficSelector
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract Selector getHostTrafficSelector()
   :outertype: StartNodeEvent

getNodeId
^^^^^^^^^

.. java:method:: public abstract Identifier getNodeId()
   :outertype: StartNodeEvent

   :return: an object that can uniquely identify this node instance (bijection object->node). Require equals and hash implementations

initConfigUpdate
^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> initConfigUpdate()
   :outertype: StartNodeEvent

   Override to provide custom implementation. Default implementation provides no per node config

   :return: per node configuration difference <optionName,optionValue>

