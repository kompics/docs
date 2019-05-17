.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

PartitionMapperFactory
======================

.. java:package:: se.sics.kompics.simulator.network
   :noindex:

.. java:type:: public class PartitionMapperFactory

   :author: Alex Ormenisan

Methods
-------
get2EqualPartitions
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static <ID extends Identifier> PartitionMapper<ID> get2EqualPartitions(Class<ID> identifierClass)
   :outertype: PartitionMapperFactory

   :return: if nodeIds have a uniform distribution - the two partitions should be roughly equal

get2WeightedPartitions
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static <ID extends Identifier> PartitionMapper<ID> get2WeightedPartitions(Class<ID> identifierClass, int weight1, int weight2)
   :outertype: PartitionMapperFactory

