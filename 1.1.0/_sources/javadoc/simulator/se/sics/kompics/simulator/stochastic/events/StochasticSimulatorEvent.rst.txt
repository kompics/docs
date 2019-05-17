.. java:import:: java.io Serializable

StochasticSimulatorEvent
========================

.. java:package:: se.sics.kompics.simulator.stochastic.events
   :noindex:

.. java:type:: public class StochasticSimulatorEvent implements Comparable<StochasticSimulatorEvent>, Serializable

   The \ ``StochasticSimulatorEvent``\  class.

   :author: Cosmin Arad

Constructors
------------
StochasticSimulatorEvent
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public StochasticSimulatorEvent(long time)
   :outertype: StochasticSimulatorEvent

Methods
-------
compareTo
^^^^^^^^^

.. java:method:: @Override public int compareTo(StochasticSimulatorEvent that)
   :outertype: StochasticSimulatorEvent

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: StochasticSimulatorEvent

getTime
^^^^^^^

.. java:method:: public final long getTime()
   :outertype: StochasticSimulatorEvent

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: StochasticSimulatorEvent

isOnList
^^^^^^^^

.. java:method:: public final boolean isOnList()
   :outertype: StochasticSimulatorEvent

setOnList
^^^^^^^^^

.. java:method:: public final void setOnList(boolean on)
   :outertype: StochasticSimulatorEvent

setTime
^^^^^^^

.. java:method:: protected void setTime(long time)
   :outertype: StochasticSimulatorEvent

