.. java:import:: java.util Set

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

DisconnectedNodesNetworkModel
=============================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class DisconnectedNodesNetworkModel extends BinaryNetworkModel

   :author: Alex Ormenisan

Constructors
------------
DisconnectedNodesNetworkModel
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public DisconnectedNodesNetworkModel(IdentifierExtractor idE, NetworkModel baseNM, Set<Identifier> disconnectedNodes)
   :outertype: DisconnectedNodesNetworkModel

Methods
-------
toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: DisconnectedNodesNetworkModel

