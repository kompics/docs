.. java:import:: java.util Set

.. java:import:: org.javatuples Pair

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: se.sics.kompics.simulator.network.identifier.impl SocketIdExtractor

.. java:import:: se.sics.kompics.simulator.util GlobalViewHandler

.. java:import:: se.sics.kompics.simulator.util SimulationContext

SetupEvent
==========

.. java:package:: se.sics.kompics.simulator.events
   :noindex:

.. java:type:: public abstract class SetupEvent extends SimulationEvent

   :author: Alex Ormenisan

Constructors
------------
SetupEvent
^^^^^^^^^^

.. java:constructor:: public SetupEvent()
   :outertype: SetupEvent

Methods
-------
getGlobalViewSetup
^^^^^^^^^^^^^^^^^^

.. java:method:: public Pair<Address, Set<GlobalViewHandler>> getGlobalViewSetup()
   :outertype: SetupEvent

getIdentifierExtractor
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public IdentifierExtractor getIdentifierExtractor()
   :outertype: SetupEvent

setupSimulationContext
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setupSimulationContext(SimulationContext sim)
   :outertype: SetupEvent

setupSystemContext
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setupSystemContext()
   :outertype: SetupEvent

