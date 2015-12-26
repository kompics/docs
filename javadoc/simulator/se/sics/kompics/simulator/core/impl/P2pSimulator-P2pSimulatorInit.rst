.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util Random

.. java:import:: java.util UUID

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.timer CancelPeriodicTimeout

.. java:import:: se.sics.kompics.timer CancelTimeout

.. java:import:: se.sics.kompics.timer SchedulePeriodicTimeout

.. java:import:: se.sics.kompics.timer ScheduleTimeout

.. java:import:: se.sics.kompics.timer Timeout

.. java:import:: se.sics.kompics.timer Timer

.. java:import:: se.sics.kompics.simulator.scheduler SimulationScheduler

.. java:import:: se.sics.kompics.simulator.core Simulator

.. java:import:: se.sics.kompics.simulator.core SimulatorComp

.. java:import:: se.sics.kompics.simulator.core SimulatorControlPort

.. java:import:: se.sics.kompics.simulator.core SimulatorPort

.. java:import:: se.sics.kompics.simulator.core SimulatorSystem

.. java:import:: se.sics.kompics.simulator.events ChangeNetworkModelEvent

.. java:import:: se.sics.kompics.simulator.events TerminateExperiment

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticKompicsSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticPeriodicSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulationTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessStartEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticTakeSnapshotEvent

P2pSimulator.P2pSimulatorInit
=============================

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public static final class P2pSimulatorInit extends Init<P2pSimulator>
   :outertype: P2pSimulator

Fields
------
networkModel
^^^^^^^^^^^^

.. java:field:: public final NetworkModel networkModel
   :outertype: P2pSimulator.P2pSimulatorInit

scenario
^^^^^^^^

.. java:field:: public final SimulationScenario scenario
   :outertype: P2pSimulator.P2pSimulatorInit

scheduler
^^^^^^^^^

.. java:field:: public final SimulationScheduler scheduler
   :outertype: P2pSimulator.P2pSimulatorInit

Constructors
------------
P2pSimulatorInit
^^^^^^^^^^^^^^^^

.. java:constructor:: public P2pSimulatorInit(SimulationScheduler scheduler, SimulationScenario scenario, NetworkModel networkModel)
   :outertype: P2pSimulator.P2pSimulatorInit

