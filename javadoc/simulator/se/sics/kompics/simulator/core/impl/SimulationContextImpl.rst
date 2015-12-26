.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util Map

.. java:import:: java.util Random

.. java:import:: java.util Set

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.util SimulationContext

SimulationContextImpl
=====================

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public class SimulationContextImpl implements SimulationContext

   :author: Alex Ormenisan

Constructors
------------
SimulationContextImpl
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimulationContextImpl(SimulatorMngrComp simMngr, Random rand)
   :outertype: SimulationContextImpl

Methods
-------
get
^^^

.. java:method:: @Override public Object get(String identifier)
   :outertype: SimulationContextImpl

getAliveNodes
^^^^^^^^^^^^^

.. java:method:: @Override public Set<Identifier> getAliveNodes()
   :outertype: SimulationContextImpl

getDeadNodes
^^^^^^^^^^^^

.. java:method:: @Override public Set<Identifier> getDeadNodes()
   :outertype: SimulationContextImpl

getRand
^^^^^^^

.. java:method:: public Random getRand()
   :outertype: SimulationContextImpl

killNode
^^^^^^^^

.. java:method:: public void killNode(Identifier id)
   :outertype: SimulationContextImpl

register
^^^^^^^^

.. java:method:: @Override public boolean register(String identifier, Object obj)
   :outertype: SimulationContextImpl

   :param identifier:
   :param obj:
   :return: false if registration could not happen. Possible causes: 1. there is already an object registered with that identifier

startNode
^^^^^^^^^

.. java:method:: public void startNode(Identifier id)
   :outertype: SimulationContextImpl

terminate
^^^^^^^^^

.. java:method:: @Override public void terminate()
   :outertype: SimulationContextImpl

terminated
^^^^^^^^^^

.. java:method:: public boolean terminated()
   :outertype: SimulationContextImpl

