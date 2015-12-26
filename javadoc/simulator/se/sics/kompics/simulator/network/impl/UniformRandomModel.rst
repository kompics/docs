.. java:import:: java.util Random

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.simulator.network NetworkModel

UniformRandomModel
==================

.. java:package:: se.sics.kompics.simulator.network.impl
   :noindex:

.. java:type:: public class UniformRandomModel implements NetworkModel

   :author: Lars Kroll

Constructors
------------
UniformRandomModel
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public UniformRandomModel(long min, long max)
   :outertype: UniformRandomModel

UniformRandomModel
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public UniformRandomModel(long min, long max, Random rand)
   :outertype: UniformRandomModel

Methods
-------
getLatencyMs
^^^^^^^^^^^^

.. java:method:: @Override public long getLatencyMs(Msg message)
   :outertype: UniformRandomModel

