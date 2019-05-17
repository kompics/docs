.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

.. java:import:: java.util Set

BinaryNetworkModel
==================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class BinaryNetworkModel implements NetworkModel

   :author: Paris Carbone

Constructors
------------
BinaryNetworkModel
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BinaryNetworkModel(IdentifierExtractor idE, NetworkModel firstNM, NetworkModel secondNM, Set<Identifier> selectedNodes)
   :outertype: BinaryNetworkModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public long getLatencyMs(Msg message)
   :outertype: BinaryNetworkModel

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: BinaryNetworkModel

