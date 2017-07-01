.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util Map

.. java:import:: java.util Random

.. java:import:: java.util Set

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.simulator.network.identifier Identifier

.. java:import:: se.sics.kompics.simulator.util GlobalView

GlobalViewImpl
==============

.. java:package:: se.sics.kompics.simulator.core.impl
   :noindex:

.. java:type:: public class GlobalViewImpl implements GlobalView

   :author: Alex Ormenisan

Constructors
------------
GlobalViewImpl
^^^^^^^^^^^^^^

.. java:constructor:: public GlobalViewImpl(SimulatorMngrComp simMngr, Random rand)
   :outertype: GlobalViewImpl

Methods
-------
getAliveNodes
^^^^^^^^^^^^^

.. java:method:: @Override public Map<Identifier, Address> getAliveNodes()
   :outertype: GlobalViewImpl

getDeadNodes
^^^^^^^^^^^^

.. java:method:: @Override public Map<Identifier, Address> getDeadNodes()
   :outertype: GlobalViewImpl

getRand
^^^^^^^

.. java:method:: public Random getRand()
   :outertype: GlobalViewImpl

getValue
^^^^^^^^

.. java:method:: @Override public <T> T getValue(String key, Class<T> type) throws ClassCastException
   :outertype: GlobalViewImpl

killNode
^^^^^^^^

.. java:method:: public void killNode(Identifier id)
   :outertype: GlobalViewImpl

setValue
^^^^^^^^

.. java:method:: @Override public boolean setValue(String key, Object value)
   :outertype: GlobalViewImpl

startNode
^^^^^^^^^

.. java:method:: public void startNode(Identifier id, Address adr)
   :outertype: GlobalViewImpl

terminate
^^^^^^^^^

.. java:method:: @Override public void terminate()
   :outertype: GlobalViewImpl

terminated
^^^^^^^^^^

.. java:method:: public boolean terminated()
   :outertype: GlobalViewImpl

