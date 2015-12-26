StochasticSimulationTerminatedEvent
===================================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public final class StochasticSimulationTerminatedEvent extends StochasticSimulatorEvent

   The \ ``StochasticSimulationTerminatedEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticSimulationTerminatedEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticSimulationTerminatedEvent(long time, int waitFor, boolean relativeTime)
   :outertype: StochasticSimulationTerminatedEvent

Methods
-------
getDelay
^^^^^^^^

.. java:method:: public long getDelay()
   :outertype: StochasticSimulationTerminatedEvent

isRelativeTime
^^^^^^^^^^^^^^

.. java:method:: public boolean isRelativeTime()
   :outertype: StochasticSimulationTerminatedEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticSimulationTerminatedEvent

shouldTerminateNow
^^^^^^^^^^^^^^^^^^

.. java:method:: public final boolean shouldTerminateNow()
   :outertype: StochasticSimulationTerminatedEvent

