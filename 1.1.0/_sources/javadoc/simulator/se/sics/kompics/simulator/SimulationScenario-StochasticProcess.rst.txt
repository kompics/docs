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

SimulationScenario.StochasticProcess
====================================

.. java:package:: se.sics.kompics.simulator
   :noindex:

.. java:type:: protected abstract class StochasticProcess implements Serializable
   :outertype: SimulationScenario

Fields
------
generators
^^^^^^^^^^

.. java:field:: protected final LinkedList<OperationGenerator> generators
   :outertype: SimulationScenario.StochasticProcess

Constructors
------------
StochasticProcess
^^^^^^^^^^^^^^^^^

.. java:constructor:: protected StochasticProcess(String name)
   :outertype: SimulationScenario.StochasticProcess

StochasticProcess
^^^^^^^^^^^^^^^^^

.. java:constructor:: protected StochasticProcess()
   :outertype: SimulationScenario.StochasticProcess

Methods
-------
eventInterArrivalTime
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected final void eventInterArrivalTime(Distribution<Long> interArrivalTime)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent> void raise(int count, Operation<E> op)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent, P1 extends Number> void raise(int count, Operation1<E, P1> op1, Distribution<P1> d1)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent, P1 extends Number, P2 extends Number> void raise(int count, Operation2<E, P1, P2> op2, Distribution<P1> d1, Distribution<P2> d2)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent, P1 extends Number, P2 extends Number, P3 extends Number> void raise(int count, Operation3<E, P1, P2, P3> op3, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent, P1 extends Number, P2 extends Number, P3 extends Number, P4 extends Number, P5 extends Number> void raise(int count, Operation4<E, P1, P2, P3, P4> op4, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3, Distribution<P4> d4)
   :outertype: SimulationScenario.StochasticProcess

raise
^^^^^

.. java:method:: protected final <E extends KompicsEvent, P1 extends Number, P2 extends Number, P3 extends Number, P4 extends Number, P5 extends Number> void raise(int count, Operation5<E, P1, P2, P3, P4, P5> op5, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3, Distribution<P4> d4, Distribution<P5> d5)
   :outertype: SimulationScenario.StochasticProcess

start
^^^^^

.. java:method:: public final void start()
   :outertype: SimulationScenario.StochasticProcess

startAfterStartOf
^^^^^^^^^^^^^^^^^

.. java:method:: public final void startAfterStartOf(long delay, StochasticProcess process)
   :outertype: SimulationScenario.StochasticProcess

startAfterTerminationOf
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public final void startAfterTerminationOf(long delay, StochasticProcess... process)
   :outertype: SimulationScenario.StochasticProcess

startAt
^^^^^^^

.. java:method:: public final void startAt(long time)
   :outertype: SimulationScenario.StochasticProcess

startAtSameTimeWith
^^^^^^^^^^^^^^^^^^^

.. java:method:: public final void startAtSameTimeWith(StochasticProcess process)
   :outertype: SimulationScenario.StochasticProcess

