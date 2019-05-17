.. java:import:: java.io IOException

.. java:import:: java.io ObjectInputStream

.. java:import:: java.util Random

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.network.identifier IdentifierExtractor

KingLatencyModel
================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public final class KingLatencyModel implements NetworkModel

   The \ ``KingLatencyMap``\  class.

   :author: Cosmin Arad , Tallat Shafaat

Constructors
------------
KingLatencyModel
^^^^^^^^^^^^^^^^

.. java:constructor:: public KingLatencyModel(IdentifierExtractor idE)
   :outertype: KingLatencyModel

KingLatencyModel
^^^^^^^^^^^^^^^^

.. java:constructor:: public KingLatencyModel(IdentifierExtractor idE, long seed)
   :outertype: KingLatencyModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public long getLatencyMs(Msg message)
   :outertype: KingLatencyModel

