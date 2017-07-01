.. java:import:: org.javatuples Pair

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network PartitionMapper

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: java.util HashSet

.. java:import:: java.util Random

.. java:import:: java.util Set

NetworkModels.SelectiveModelBuilder
===================================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: protected static class SelectiveModelBuilder
   :outertype: NetworkModels

Constructors
------------
SelectiveModelBuilder
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SelectiveModelBuilder(NetworkModel baseModel, IdentifierExtractor extr)
   :outertype: NetworkModels.SelectiveModelBuilder

Methods
-------
addNode
^^^^^^^

.. java:method:: public SelectiveModelBuilder addNode(Identifier identifier)
   :outertype: NetworkModels.SelectiveModelBuilder

withSelectiveModel
^^^^^^^^^^^^^^^^^^

.. java:method:: public BinaryNetworkModel withSelectiveModel(NetworkModel model)
   :outertype: NetworkModels.SelectiveModelBuilder

