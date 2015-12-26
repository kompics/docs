.. java:import:: se.sics.kompics.simulator.events TakeSnapshot

StochasticTakeSnapshotEvent
===========================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public final class StochasticTakeSnapshotEvent extends StochasticSimulatorEvent

   The \ ``StochasticTakeSnapshotEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticTakeSnapshotEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticTakeSnapshotEvent(long time, TakeSnapshot takeSnapshotEvent, int waitFor)
   :outertype: StochasticTakeSnapshotEvent

Methods
-------
getDelay
^^^^^^^^

.. java:method:: public long getDelay()
   :outertype: StochasticTakeSnapshotEvent

getTakeSnapshotEvent
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public TakeSnapshot getTakeSnapshotEvent()
   :outertype: StochasticTakeSnapshotEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticTakeSnapshotEvent

shouldHandleNow
^^^^^^^^^^^^^^^

.. java:method:: public final boolean shouldHandleNow()
   :outertype: StochasticTakeSnapshotEvent

