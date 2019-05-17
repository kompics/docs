.. java:import:: java.util Set

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

SimulationContext
=================

.. java:package:: se.sics.kompics.simulator.util
   :noindex:

.. java:type:: public interface SimulationContext

   :author: Alex Ormenisan

Methods
-------
get
^^^

.. java:method:: public Object get(String identifier)
   :outertype: SimulationContext

getAliveNodes
^^^^^^^^^^^^^

.. java:method:: public Set<Identifier> getAliveNodes()
   :outertype: SimulationContext

getDeadNodes
^^^^^^^^^^^^

.. java:method:: public Set<Identifier> getDeadNodes()
   :outertype: SimulationContext

register
^^^^^^^^

.. java:method:: public boolean register(String identifier, Object obj)
   :outertype: SimulationContext

   :param identifier:
   :param obj:
   :return: false if registration could not happen. Possible causes: 1. there is already an object registered with that identifier

terminate
^^^^^^^^^

.. java:method:: public void terminate()
   :outertype: SimulationContext

