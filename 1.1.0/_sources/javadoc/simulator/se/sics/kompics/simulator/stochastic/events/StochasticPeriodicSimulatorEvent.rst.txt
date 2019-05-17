.. java:import:: se.sics.kompics KompicsEvent

StochasticPeriodicSimulatorEvent
================================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public class StochasticPeriodicSimulatorEvent extends StochasticKompicsSimulatorEvent

   The \ ``StochasticPeriodicSimulatorEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticPeriodicSimulatorEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticPeriodicSimulatorEvent(KompicsEvent event, long time, long period)
   :outertype: StochasticPeriodicSimulatorEvent

Methods
-------
getPeriod
^^^^^^^^^

.. java:method:: public final long getPeriod()
   :outertype: StochasticPeriodicSimulatorEvent

setEvent
^^^^^^^^

.. java:method:: public final void setEvent(KompicsEvent event)
   :outertype: StochasticPeriodicSimulatorEvent

setTime
^^^^^^^

.. java:method:: @Override public final void setTime(long time)
   :outertype: StochasticPeriodicSimulatorEvent

