.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network PartitionMapper

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

PartitionedNetworkModel
=======================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class PartitionedNetworkModel implements NetworkModel

   :author: Alex Ormenisan

Constructors
------------
PartitionedNetworkModel
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PartitionedNetworkModel(IdentifierExtractor idE, NetworkModel netModel, PartitionMapper<Identifier> mapper)
   :outertype: PartitionedNetworkModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public long getLatencyMs(Msg message)
   :outertype: PartitionedNetworkModel

