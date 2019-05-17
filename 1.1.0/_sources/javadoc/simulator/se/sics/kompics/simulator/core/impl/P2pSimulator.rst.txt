.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util Random

.. java:import:: java.util UUID

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Fault.ResolveAction

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.core Simulator

.. java:import:: se.sics.kompics.simulator.core SimulatorComp

.. java:import:: se.sics.kompics.simulator.core SimulatorControlPort

.. java:import:: se.sics.kompics.simulator.core SimulatorPort

.. java:import:: se.sics.kompics.simulator.core SimulatorSystem

.. java:import:: se.sics.kompics.simulator.events TerminateExperiment

.. java:import:: se.sics.kompics.simulator.events.system ChangeNetworkModelEvent

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.scheduler SimulationScheduler

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticKompicsSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticPeriodicSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessStartEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulationTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticTakeSnapshotEvent

.. java:import:: se.sics.kompics.timer CancelPeriodicTimeout

.. java:import:: se.sics.kompics.timer CancelTimeout

.. java:import:: se.sics.kompics.timer SchedulePeriodicTimeout

.. java:import:: se.sics.kompics.timer ScheduleTimeout

.. java:import:: se.sics.kompics.timer Timeout

.. java:import:: se.sics.kompics.timer Timer

P2pSimulator
============

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public final class P2pSimulator extends ComponentDefinition implements Simulator, SimulatorComp

   The \ ``P2pSimulator``\  class.

   :author: Cosmin Arad

Fields
------
handleCPT
^^^^^^^^^

.. java:field::  Handler<CancelPeriodicTimeout> handleCPT
   :outertype: P2pSimulator

handleCT
^^^^^^^^

.. java:field::  Handler<CancelTimeout> handleCT
   :outertype: P2pSimulator

handleMsg
^^^^^^^^^

.. java:field::  Handler<Msg<?, ?>> handleMsg
   :outertype: P2pSimulator

handleSPT
^^^^^^^^^

.. java:field::  Handler<SchedulePeriodicTimeout> handleSPT
   :outertype: P2pSimulator

handleST
^^^^^^^^

.. java:field::  Handler<ScheduleTimeout> handleST
   :outertype: P2pSimulator

handleStart
^^^^^^^^^^^

.. java:field::  Handler<Start> handleStart
   :outertype: P2pSimulator

handleTerminate
^^^^^^^^^^^^^^^

.. java:field::  Handler<TerminateExperiment> handleTerminate
   :outertype: P2pSimulator

network
^^^^^^^

.. java:field::  Negative<Network> network
   :outertype: P2pSimulator

simControlPort
^^^^^^^^^^^^^^

.. java:field::  Negative<SimulatorControlPort> simControlPort
   :outertype: P2pSimulator

simPort
^^^^^^^

.. java:field::  Negative<SimulatorPort> simPort
   :outertype: P2pSimulator

timer
^^^^^

.. java:field::  Negative<Timer> timer
   :outertype: P2pSimulator

Constructors
------------
P2pSimulator
^^^^^^^^^^^^

.. java:constructor:: public P2pSimulator(P2pSimulatorInit init)
   :outertype: P2pSimulator

Methods
-------
advanceSimulation
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean advanceSimulation()
   :outertype: P2pSimulator

durationToString
^^^^^^^^^^^^^^^^

.. java:method:: public static final String durationToString(long duration)
   :outertype: P2pSimulator

handleFault
^^^^^^^^^^^

.. java:method:: @Override public ResolveAction handleFault(Fault fault)
   :outertype: P2pSimulator

java_lang_System_currentTimeMillis
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public long java_lang_System_currentTimeMillis()
   :outertype: P2pSimulator

java_lang_System_nanoTime
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public long java_lang_System_nanoTime()
   :outertype: P2pSimulator

java_lang_Thread_sleep
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void java_lang_Thread_sleep(long millis)
   :outertype: P2pSimulator

java_lang_Thread_sleep
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void java_lang_Thread_sleep(long millis, int nanos)
   :outertype: P2pSimulator

java_lang_Thread_start
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void java_lang_Thread_start()
   :outertype: P2pSimulator

