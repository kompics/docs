.. java:import:: java.io Serializable

.. java:import:: java.math BigInteger

.. java:import:: java.security AccessController

.. java:import:: java.security PrivilegedAction

.. java:import:: java.util Arrays

.. java:import:: java.util HashSet

.. java:import:: java.util LinkedList

.. java:import:: java.util Random

.. java:import:: java.util TimeZone

.. java:import:: javassist ClassPool

.. java:import:: javassist Loader

.. java:import:: javassist LoaderClassPath

.. java:import:: javassist Translator

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.simulator.adaptor ConcreteOperation

.. java:import:: se.sics.kompics.simulator.adaptor Operation

.. java:import:: se.sics.kompics.simulator.adaptor Operation1

.. java:import:: se.sics.kompics.simulator.adaptor Operation2

.. java:import:: se.sics.kompics.simulator.adaptor Operation3

.. java:import:: se.sics.kompics.simulator.adaptor Operation4

.. java:import:: se.sics.kompics.simulator.adaptor Operation5

.. java:import:: se.sics.kompics.simulator.adaptor OperationGenerator

.. java:import:: se.sics.kompics.simulator.adaptor.distributions BigIntegerExponentialDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions BigIntegerNormalDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions BigIntegerUniformDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions ConstantDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions Distribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions DoubleExponentialDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions DoubleNormalDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions DoubleUniformDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions LongExponentialDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions LongNormalDistribution

.. java:import:: se.sics.kompics.simulator.adaptor.distributions LongUniformDistribution

.. java:import:: se.sics.kompics.simulator.events TakeSnapshot

.. java:import:: se.sics.kompics.simulator.instrumentation CodeInterceptor

.. java:import:: se.sics.kompics.simulator.instrumentation InstrumentationHelper

.. java:import:: se.sics.kompics.simulator.instrumentation JarURLFixClassLoader

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessStartEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticProcessTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulationTerminatedEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulatorEvent

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticTakeSnapshotEvent

SimulationScenario.Snapshot
===========================

.. java:package:: se.sics.kompics.simulator
   :noindex:

.. java:type:: protected static final class Snapshot
   :outertype: SimulationScenario

Constructors
------------
Snapshot
^^^^^^^^

.. java:constructor:: public Snapshot(TakeSnapshot takeSnapshotEvent)
   :outertype: SimulationScenario.Snapshot

Methods
-------
takeAfterTerminationOf
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void takeAfterTerminationOf(long delay, StochasticProcess... process)
   :outertype: SimulationScenario.Snapshot

