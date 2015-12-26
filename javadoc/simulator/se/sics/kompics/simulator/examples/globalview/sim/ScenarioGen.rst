.. java:import:: java.util HashSet

.. java:import:: java.util Set

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.adaptor Operation

.. java:import:: se.sics.kompics.simulator.adaptor Operation1

.. java:import:: se.sics.kompics.simulator.adaptor.distributions.extra BasicIntSequentialDistribution

.. java:import:: se.sics.kompics.simulator.events SetupEvent

.. java:import:: se.sics.kompics.simulator.events.system StartNodeEvent

.. java:import:: se.sics.kompics.simulator.examples.globalview HostComp

.. java:import:: se.sics.kompics.simulator.examples.globalview PingPongDoneEvent

.. java:import:: se.sics.kompics.simutil.identifiable Identifiable

.. java:import:: se.sics.kompics.simutil.identifiable Identifier

.. java:import:: se.sics.kompics.simutil.msg ContentMsg

.. java:import:: se.sics.kompics.simulator.util GlobalViewHandler

.. java:import:: se.sics.kompics.simulator.util SimulationContext

ScenarioGen
===========

.. java:package:: se.sics.kompics.simulator.examples.globalview.sim
   :noindex:

.. java:type:: public class ScenarioGen

   :author: Alex Ormenisan

Fields
------
setupOp
^^^^^^^

.. java:field:: static Operation setupOp
   :outertype: ScenarioGen

startNodeOp
^^^^^^^^^^^

.. java:field:: static Operation1 startNodeOp
   :outertype: ScenarioGen

Methods
-------
simplePing
^^^^^^^^^^

.. java:method:: public static SimulationScenario simplePing()
   :outertype: ScenarioGen

