.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator.events SystemEvent

StartNodeEvent
==============

.. java:package:: se.sics.kompics.simulator.events.system
   :noindex:

.. java:type:: public abstract class StartNodeEvent extends SystemEvent

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

.. java:method:: public abstract Class<? extends ComponentDefinition> getComponentDefinition()
   :outertype: StartNodeEvent

getComponentInit
^^^^^^^^^^^^^^^^

.. java:method:: public abstract Init getComponentInit()
   :outertype: StartNodeEvent

getNodeAddress
^^^^^^^^^^^^^^

.. java:method:: public abstract Address getNodeAddress()
   :outertype: StartNodeEvent

initConfigUpdate
^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> initConfigUpdate()
   :outertype: StartNodeEvent

   Override to provide custom implementation. Default implementation provides no per node config

   :return: per node configuration difference <optionName,optionValue>

