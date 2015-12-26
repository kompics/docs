.. java:import:: java.util Set

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

DisconnectedNodesNetworkModel
=============================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class DisconnectedNodesNetworkModel implements NetworkModel

   :author: Alex Ormenisan

Constructors
------------
DisconnectedNodesNetworkModel
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public DisconnectedNodesNetworkModel(IdentifierExtractor idE, NetworkModel baseNM, Set<Identifier> disconnectedNodes)
   :outertype: DisconnectedNodesNetworkModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @Override public long getLatencyMs(Msg message)
   :outertype: DisconnectedNodesNetworkModel

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: DisconnectedNodesNetworkModel

