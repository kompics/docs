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

SimulationScenario
==================

.. java:package:: se.sics.kompics.simulator
   :noindex:

.. java:type:: public abstract class SimulationScenario implements Serializable

   The \ ``SimulationScenario``\  class.

   :author: Cosmin Arad

Constructors
------------
SimulationScenario
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimulationScenario()
   :outertype: SimulationScenario

Methods
-------
constant
^^^^^^^^

.. java:method:: protected final Distribution<Double> constant(double value)
   :outertype: SimulationScenario

constant
^^^^^^^^

.. java:method:: protected final Distribution<Long> constant(long value)
   :outertype: SimulationScenario

constant
^^^^^^^^

.. java:method:: protected final Distribution<BigInteger> constant(BigInteger value)
   :outertype: SimulationScenario

exponential
^^^^^^^^^^^

.. java:method:: protected final Distribution<Double> exponential(double mean)
   :outertype: SimulationScenario

exponential
^^^^^^^^^^^

.. java:method:: protected final Distribution<Long> exponential(long mean)
   :outertype: SimulationScenario

exponential
^^^^^^^^^^^

.. java:method:: protected final Distribution<BigInteger> exponential(BigInteger mean)
   :outertype: SimulationScenario

generateEventList
^^^^^^^^^^^^^^^^^

.. java:method:: public final LinkedList<StochasticSimulatorEvent> generateEventList()
   :outertype: SimulationScenario

getRandom
^^^^^^^^^

.. java:method:: public static Random getRandom()
   :outertype: SimulationScenario

load
^^^^

.. java:method:: public static SimulationScenario load(String scenarioFile)
   :outertype: SimulationScenario

normal
^^^^^^

.. java:method:: protected final Distribution<Double> normal(double mean, double variance)
   :outertype: SimulationScenario

normal
^^^^^^

.. java:method:: protected final Distribution<Long> normal(long mean, long variance)
   :outertype: SimulationScenario

normal
^^^^^^

.. java:method:: protected final Distribution<BigInteger> normal(BigInteger mean, BigInteger variance)
   :outertype: SimulationScenario

setSeed
^^^^^^^

.. java:method:: public static void setSeed(long seed)
   :outertype: SimulationScenario

simulate
^^^^^^^^

.. java:method:: public final void simulate(Class<? extends ComponentDefinition> main)
   :outertype: SimulationScenario

simulate
^^^^^^^^

.. java:method:: public final void simulate(Class<? extends ComponentDefinition> main, boolean allowThreads)
   :outertype: SimulationScenario

simulate
^^^^^^^^

.. java:method:: public final void simulate(Class<? extends ComponentDefinition> main, Translator t)
   :outertype: SimulationScenario

snapshot
^^^^^^^^

.. java:method:: protected final Snapshot snapshot(TakeSnapshot takeSnapshotEvent)
   :outertype: SimulationScenario

terminateAfterTerminationOf
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected final void terminateAfterTerminationOf(long delay, StochasticProcess... process)
   :outertype: SimulationScenario

terminateAt
^^^^^^^^^^^

.. java:method:: protected final void terminateAt(long time)
   :outertype: SimulationScenario

uniform
^^^^^^^

.. java:method:: protected final Distribution<Double> uniform(double min, double max)
   :outertype: SimulationScenario

uniform
^^^^^^^

.. java:method:: protected final Distribution<Long> uniform(long min, long max)
   :outertype: SimulationScenario

uniform
^^^^^^^

.. java:method:: protected final Distribution<BigInteger> uniform(BigInteger min, BigInteger max)
   :outertype: SimulationScenario

uniform
^^^^^^^

.. java:method:: protected final Distribution<BigInteger> uniform(int numBits)
   :outertype: SimulationScenario

