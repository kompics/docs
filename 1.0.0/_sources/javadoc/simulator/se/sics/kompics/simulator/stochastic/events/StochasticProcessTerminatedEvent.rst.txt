.. java:import:: java.util LinkedList

StochasticProcessTerminatedEvent
================================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public final class StochasticProcessTerminatedEvent extends StochasticSimulatorEvent

   The \ ``StochasticProcessTerminatedEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticProcessTerminatedEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticProcessTerminatedEvent(long time, LinkedList<StochasticProcessStartEvent> startEvents, String name)
   :outertype: StochasticProcessTerminatedEvent

Methods
-------
getProcessName
^^^^^^^^^^^^^^

.. java:method:: public String getProcessName()
   :outertype: StochasticProcessTerminatedEvent

getSnapshotEvent
^^^^^^^^^^^^^^^^

.. java:method:: public StochasticTakeSnapshotEvent getSnapshotEvent()
   :outertype: StochasticProcessTerminatedEvent

getStartEvents
^^^^^^^^^^^^^^

.. java:method:: public final LinkedList<StochasticProcessStartEvent> getStartEvents()
   :outertype: StochasticProcessTerminatedEvent

getTerminationEvent
^^^^^^^^^^^^^^^^^^^

.. java:method:: public StochasticSimulationTerminatedEvent getTerminationEvent()
   :outertype: StochasticProcessTerminatedEvent

setSnapshotEvent
^^^^^^^^^^^^^^^^

.. java:method:: public void setSnapshotEvent(StochasticTakeSnapshotEvent snapshotEvent)
   :outertype: StochasticProcessTerminatedEvent

setTerminationEvent
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setTerminationEvent(StochasticSimulationTerminatedEvent terminationEvent)
   :outertype: StochasticProcessTerminatedEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticProcessTerminatedEvent

