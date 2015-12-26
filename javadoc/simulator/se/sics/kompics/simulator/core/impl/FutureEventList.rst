.. java:import:: java.util Collections

.. java:import:: java.util LinkedList

.. java:import:: java.util PriorityQueue

.. java:import:: se.sics.kompics.simulator.stochastic.events StochasticSimulatorEvent

FutureEventList
===============

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public class FutureEventList

   The \ ``FutureEventList``\  class.

   :author: Cosmin Arad

Constructors
------------
FutureEventList
^^^^^^^^^^^^^^^

.. java:constructor:: public FutureEventList()
   :outertype: FutureEventList

Methods
-------
cancelFutureEvent
^^^^^^^^^^^^^^^^^

.. java:method::  boolean cancelFutureEvent(long now, StochasticSimulatorEvent event)
   :outertype: FutureEventList

dumpFEL
^^^^^^^

.. java:method::  void dumpFEL()
   :outertype: FutureEventList

getAndRemoveFirstEvent
^^^^^^^^^^^^^^^^^^^^^^

.. java:method::  StochasticSimulatorEvent getAndRemoveFirstEvent(long now)
   :outertype: FutureEventList

getFirstEventTime
^^^^^^^^^^^^^^^^^

.. java:method::  long getFirstEventTime()
   :outertype: FutureEventList

hasMoreEventsAtTime
^^^^^^^^^^^^^^^^^^^

.. java:method::  boolean hasMoreEventsAtTime(long now)
   :outertype: FutureEventList

scheduleFutureEvent
^^^^^^^^^^^^^^^^^^^

.. java:method::  void scheduleFutureEvent(long now, StochasticSimulatorEvent event)
   :outertype: FutureEventList

