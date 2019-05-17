.. java:import:: se.sics.kompics.simulator.events SimulationEvent

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: se.sics.kompics.simulator.network.identifier.impl SocketIdExtractor

.. java:import:: se.sics.kompics.simulator.util GlobalView

SetupEvent
==========

.. java:package:: se.sics.kompics.simulator.events.system
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
getIdentifierExtractor
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public IdentifierExtractor getIdentifierExtractor()
   :outertype: SetupEvent

setupGlobalView
^^^^^^^^^^^^^^^

.. java:method:: public void setupGlobalView(GlobalView gv)
   :outertype: SetupEvent

setupSystemContext
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setupSystemContext()
   :outertype: SetupEvent

