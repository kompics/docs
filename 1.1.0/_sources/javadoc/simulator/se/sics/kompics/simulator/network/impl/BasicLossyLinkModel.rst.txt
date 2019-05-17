.. java:import:: java.util Random

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

BasicLossyLinkModel
===================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class BasicLossyLinkModel implements NetworkModel

   :author: Alex Ormenisan

Constructors
------------
BasicLossyLinkModel
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BasicLossyLinkModel(NetworkModel baseNM, int lossRatePercentage, Random rand)
   :outertype: BasicLossyLinkModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public long getLatencyMs(Msg message)
   :outertype: BasicLossyLinkModel

