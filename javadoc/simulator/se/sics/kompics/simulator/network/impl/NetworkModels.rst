.. java:import:: org.javatuples Pair

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network PartitionMapper

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: java.util HashSet

.. java:import:: java.util Random

.. java:import:: java.util Set

NetworkModels
=============

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class NetworkModels

   :author: Paris Carbone

Methods
-------
withBinaryModel
^^^^^^^^^^^^^^^

.. java:method:: public static BinaryNetworkModel withBinaryModel(IdentifierExtractor extr, NetworkModel firstNM, NetworkModel secondNM, Set<Identifier> secondModelIDs)
   :outertype: NetworkModels

withConstantDelay
^^^^^^^^^^^^^^^^^

.. java:method:: public static NetworkModel withConstantDelay(long delay)
   :outertype: NetworkModels

withDeadLinks
^^^^^^^^^^^^^

.. java:method:: public static DeadLinkNetworkModel withDeadLinks(IdentifierExtractor idE, NetworkModel baseNM, Set<Pair<Identifier, Identifier>> deadLinks)
   :outertype: NetworkModels

withDisconnectedModel
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static DisconnectedNodesNetworkModel withDisconnectedModel(IdentifierExtractor extr, NetworkModel firstNM, Set<Identifier> disconnected)
   :outertype: NetworkModels

withKingLatency
^^^^^^^^^^^^^^^

.. java:method:: public static KingLatencyModel withKingLatency(IdentifierExtractor extractor)
   :outertype: NetworkModels

withKingLatency
^^^^^^^^^^^^^^^

.. java:method:: public static KingLatencyModel withKingLatency(IdentifierExtractor extractor, int seed)
   :outertype: NetworkModels

withLoss
^^^^^^^^

.. java:method:: public static BasicLossyLinkModel withLoss(NetworkModel baseModel, int lossRate, Random rand)
   :outertype: NetworkModels

withLoss
^^^^^^^^

.. java:method:: public static BasicLossyLinkModel withLoss(NetworkModel baseModel, int lossRate)
   :outertype: NetworkModels

withPartitionedModel
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static PartitionedNetworkModel withPartitionedModel(IdentifierExtractor extractor, NetworkModel model, PartitionMapper<Identifier> mapper)
   :outertype: NetworkModels

withSelectiveModel
^^^^^^^^^^^^^^^^^^

.. java:method:: public static SelectiveModelBuilder withSelectiveModel(IdentifierExtractor extractor, NetworkModel firstNM)
   :outertype: NetworkModels

withTotalLoss
^^^^^^^^^^^^^

.. java:method:: public static NetworkModel withTotalLoss()
   :outertype: NetworkModels

withUniformRandomDelay
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static UniformRandomModel withUniformRandomDelay(long min, long max)
   :outertype: NetworkModels

withUniformRandomDelay
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static UniformRandomModel withUniformRandomDelay(long min, long max, Random rand)
   :outertype: NetworkModels

