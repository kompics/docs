.. java:import:: java.util LinkedList

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics Scheduler

.. java:import:: se.sics.kompics.simulator.core Simulator

BasicSimulationScheduler
========================

.. java:package:: se.sics.kompics.simulator.scheduler
   :noindex:

.. java:type:: public class BasicSimulationScheduler extends Scheduler implements SimulationScheduler

   The \ ``BasicSimulationScheduler``\  class.

   :author: Cosmin Arad

Methods
-------
asyncShutdown
^^^^^^^^^^^^^

.. java:method:: @Override public void asyncShutdown()
   :outertype: BasicSimulationScheduler

proceed
^^^^^^^

.. java:method:: @Override public void proceed()
   :outertype: BasicSimulationScheduler

schedule
^^^^^^^^

.. java:method:: @Override public void schedule(Component c, int w)
   :outertype: BasicSimulationScheduler

setSimulator
^^^^^^^^^^^^

.. java:method:: @Override public void setSimulator(Simulator simulator)
   :outertype: BasicSimulationScheduler

shutdown
^^^^^^^^

.. java:method:: @Override public void shutdown()
   :outertype: BasicSimulationScheduler

