.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.adaptor Operation1

.. java:import:: se.sics.kompics.simulator.adaptor.distributions.extra BasicIntSequentialDistribution

.. java:import:: se.sics.kompics.simulator.events.system StartNodeEvent

.. java:import:: se.sics.kompics.simulator.examples.config ConfigReadingComp

ScenarioGen
===========

.. java:package:: se.sics.kompics.simulator.examples.config.sim
   :noindex:

.. java:type:: public class ScenarioGen

   :author: Alex Ormenisan

Fields
------
startNodeOp
^^^^^^^^^^^

.. java:field:: @SuppressWarnings static Operation1<StartNodeEvent, Integer> startNodeOp
   :outertype: ScenarioGen

Methods
-------
simpleBoot
^^^^^^^^^^

.. java:method:: @SuppressWarnings public static SimulationScenario simpleBoot()
   :outertype: ScenarioGen

