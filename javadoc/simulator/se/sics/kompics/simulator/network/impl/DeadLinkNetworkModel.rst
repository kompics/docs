.. java:import:: java.util Set

.. java:import:: org.javatuples Pair

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

DeadLinkNetworkModel
====================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class DeadLinkNetworkModel implements NetworkModel

   :author: Alex Ormenisan

Constructors
------------
DeadLinkNetworkModel
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public DeadLinkNetworkModel(IdentifierExtractor idE, NetworkModel baseNM, Set<Pair<Identifier, Identifier>> deadLinks)
   :outertype: DeadLinkNetworkModel

   :param baseNM:
   :param deadLinks: <hostId, hostId>

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public long getLatencyMs(Msg message)
   :outertype: DeadLinkNetworkModel

