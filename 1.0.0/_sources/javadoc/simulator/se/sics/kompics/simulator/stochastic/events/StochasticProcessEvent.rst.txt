.. java:import:: java.util List

.. java:import:: java.util Random

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.simulator.adaptor OperationGenerator

.. java:import:: se.sics.kompics.simulator.adaptor.distributions Distribution

StochasticProcessEvent
======================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public final class StochasticProcessEvent extends StochasticSimulatorEvent

   The \ ``StochasticProcessEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticProcessEvent
^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticProcessEvent(long time, Distribution<Long> interArrivalTimeDistribution, StochasticProcessTerminatedEvent terminatedEvent, List<OperationGenerator> operations, String name)
   :outertype: StochasticProcessEvent

Methods
-------
generateOperation
^^^^^^^^^^^^^^^^^

.. java:method:: public KompicsEvent generateOperation(Random random)
   :outertype: StochasticProcessEvent

getCurrentCount
^^^^^^^^^^^^^^^

.. java:method:: public int getCurrentCount()
   :outertype: StochasticProcessEvent

getNextTime
^^^^^^^^^^^

.. java:method:: public final long getNextTime()
   :outertype: StochasticProcessEvent

getProcessName
^^^^^^^^^^^^^^

.. java:method:: public String getProcessName()
   :outertype: StochasticProcessEvent

getTerminatedEvent
^^^^^^^^^^^^^^^^^^

.. java:method:: public StochasticProcessTerminatedEvent getTerminatedEvent()
   :outertype: StochasticProcessEvent

setNextTime
^^^^^^^^^^^

.. java:method:: public final void setNextTime()
   :outertype: StochasticProcessEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticProcessEvent

