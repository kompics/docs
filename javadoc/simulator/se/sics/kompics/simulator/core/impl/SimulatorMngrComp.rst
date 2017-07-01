.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: java.util Set

.. java:import:: org.javatuples Pair

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Kill

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.core SimulatorComp

.. java:import:: se.sics.kompics.simulator.core SimulatorControlPort

.. java:import:: se.sics.kompics.simulator.core SimulatorPort

.. java:import:: se.sics.kompics.simulator.events.system SetupEvent

.. java:import:: se.sics.kompics.simulator.events TerminateExperiment

.. java:import:: se.sics.kompics.simulator.events.system KillNodeEvent

.. java:import:: se.sics.kompics.simulator.events.system StartNodeEvent

.. java:import:: se.sics.kompics.simulator.network.identifier DestinationHostSelector

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: se.sics.kompics.simulator.network.identifier.impl SocketIdExtractor

.. java:import:: se.sics.kompics.timer Timer

SimulatorMngrComp
=================

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public class SimulatorMngrComp extends ComponentDefinition implements SimulatorComp

   :author: Alex Ormenisan

Constructors
------------
SimulatorMngrComp
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimulatorMngrComp(SimulatorMngrInit init)
   :outertype: SimulatorMngrComp

Methods
-------
handleFault
^^^^^^^^^^^

.. java:method:: @Override public Fault.ResolveAction handleFault(Fault fault)
   :outertype: SimulatorMngrComp

terminate
^^^^^^^^^

.. java:method:: public void terminate()
   :outertype: SimulatorMngrComp

