.. java:import:: java.util LinkedList

StochasticProcessStartEvent
===========================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public final class StochasticProcessStartEvent extends StochasticSimulatorEvent

   The \ ``StochasticProcessStartEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticProcessStartEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticProcessStartEvent(long time, LinkedList<StochasticProcessStartEvent> startEvents, StochasticProcessEvent stochasticEvent, int waitFor, String name)
   :outertype: StochasticProcessStartEvent

Methods
-------
getDelay
^^^^^^^^

.. java:method:: public final long getDelay()
   :outertype: StochasticProcessStartEvent

getProcessName
^^^^^^^^^^^^^^

.. java:method:: public String getProcessName()
   :outertype: StochasticProcessStartEvent

getStartEvents
^^^^^^^^^^^^^^

.. java:method:: public final LinkedList<StochasticProcessStartEvent> getStartEvents()
   :outertype: StochasticProcessStartEvent

getStochasticEvent
^^^^^^^^^^^^^^^^^^

.. java:method:: public final StochasticProcessEvent getStochasticEvent()
   :outertype: StochasticProcessStartEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticProcessStartEvent

shouldHandleNow
^^^^^^^^^^^^^^^

.. java:method:: public final boolean shouldHandleNow()
   :outertype: StochasticProcessStartEvent

