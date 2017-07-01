.. java:import:: java.util Map

.. java:import:: java.util Set

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

GlobalView
==========

.. java:package:: se.sics.kompics.simulator.util
   :noindex:

.. java:type:: public interface GlobalView

   :author: Alex Ormenisan

Methods
-------
getAliveNodes
^^^^^^^^^^^^^

.. java:method:: public Map<Identifier, Address> getAliveNodes()
   :outertype: GlobalView

getDeadNodes
^^^^^^^^^^^^

.. java:method:: public Map<Identifier, Address> getDeadNodes()
   :outertype: GlobalView

getValue
^^^^^^^^

.. java:method:: public <T> T getValue(String key, Class<T> type) throws ClassCastException
   :outertype: GlobalView

setValue
^^^^^^^^

.. java:method:: public boolean setValue(String key, Object value)
   :outertype: GlobalView

terminate
^^^^^^^^^

.. java:method:: public void terminate()
   :outertype: GlobalView

