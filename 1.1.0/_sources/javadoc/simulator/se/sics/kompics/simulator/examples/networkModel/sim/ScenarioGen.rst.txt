.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.adaptor Operation

.. java:import:: se.sics.kompics.simulator.adaptor Operation1

.. java:import:: se.sics.kompics.simulator.adaptor.distributions.extra BasicIntSequentialDistribution

.. java:import:: se.sics.kompics.simulator.events.system ChangeNetworkModelEvent

.. java:import:: se.sics.kompics.simulator.events.system StartNodeEvent

.. java:import:: se.sics.kompics.simulator.examples.networkModel BasicPingComp

.. java:import:: se.sics.kompics.simulator.network.impl UniformRandomModel

ScenarioGen
===========

.. java:package:: se.sics.kompics.simulator.examples.networkModel.sim
   :noindex:

.. java:type:: public class ScenarioGen

   :author: Alex Ormenisan

Fields
------
networkSetupOp
^^^^^^^^^^^^^^

.. java:field:: @SuppressWarnings static Operation<ChangeNetworkModelEvent> networkSetupOp
   :outertype: ScenarioGen

startNodeOp
^^^^^^^^^^^

.. java:field:: @SuppressWarnings static Operation1<StartNodeEvent, Integer> startNodeOp
   :outertype: ScenarioGen

Methods
-------
simplePing
^^^^^^^^^^

.. java:method:: @SuppressWarnings public static SimulationScenario simplePing()
   :outertype: ScenarioGen

