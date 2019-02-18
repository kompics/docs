.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics FaultHandler

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.simulator SimulationScenario

.. java:import:: se.sics.kompics.simulator.core SimulatorControlPort

.. java:import:: se.sics.kompics.simulator.core SimulatorPort

.. java:import:: se.sics.kompics.simulator.core.impl P2pSimulator

.. java:import:: se.sics.kompics.simulator.core.impl P2pSimulator.P2pSimulatorInit

.. java:import:: se.sics.kompics.simulator.core.impl SimulatorMngrComp

.. java:import:: se.sics.kompics.simulator.scheduler BasicSimulationScheduler

.. java:import:: se.sics.kompics.timer Timer

LauncherComp
============

.. java:package:: se.sics.kompics.simulator.run
   :noindex:

.. java:type:: public class LauncherComp extends ComponentDefinition

   :author: Alex Ormenisan

Fields
------
NO_CRASH_HANDLER
^^^^^^^^^^^^^^^^

.. java:field:: public static final FaultHandler NO_CRASH_HANDLER
   :outertype: LauncherComp

simulatorScheduler
^^^^^^^^^^^^^^^^^^

.. java:field:: public static BasicSimulationScheduler simulatorScheduler
   :outertype: LauncherComp

Constructors
------------
LauncherComp
^^^^^^^^^^^^

.. java:constructor:: public LauncherComp()
   :outertype: LauncherComp

Methods
-------
main
^^^^

.. java:method:: public static void main(String[] args)
   :outertype: LauncherComp

