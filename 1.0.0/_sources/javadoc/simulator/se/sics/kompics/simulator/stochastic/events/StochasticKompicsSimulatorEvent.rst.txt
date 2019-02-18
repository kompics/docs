.. java:import:: se.sics.kompics KompicsEvent

StochasticKompicsSimulatorEvent
===============================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public class StochasticKompicsSimulatorEvent extends StochasticSimulatorEvent

   The \ ``StochasticKompicsSimulatorEvent``\  class.

   :author: Cosmin Arad

Fields
------
event
^^^^^

.. java:field:: protected transient KompicsEvent event
   :outertype: StochasticKompicsSimulatorEvent

Constructors
------------
StochasticKompicsSimulatorEvent
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticKompicsSimulatorEvent(KompicsEvent event, long time)
   :outertype: StochasticKompicsSimulatorEvent

Methods
-------
cancel
^^^^^^

.. java:method:: public void cancel()
   :outertype: StochasticKompicsSimulatorEvent

canceled
^^^^^^^^

.. java:method:: public boolean canceled()
   :outertype: StochasticKompicsSimulatorEvent

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: StochasticKompicsSimulatorEvent

getEvent
^^^^^^^^

.. java:method:: public final KompicsEvent getEvent()
   :outertype: StochasticKompicsSimulatorEvent

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: StochasticKompicsSimulatorEvent

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: StochasticKompicsSimulatorEvent

