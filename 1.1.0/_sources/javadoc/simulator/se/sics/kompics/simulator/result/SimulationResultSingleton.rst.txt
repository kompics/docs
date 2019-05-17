.. java:import:: java.lang.reflect Method

.. java:import:: java.lang.reflect Proxy

.. java:import:: java.util.concurrent ConcurrentHashMap

SimulationResultSingleton
=========================

.. java:package:: se.sics.kompics.simulator.result
   :noindex:

.. java:type:: public class SimulationResultSingleton implements SimulationResultMap

   Freely adapted from .

   :author: Lars Kroll

Fields
------
instance
^^^^^^^^

.. java:field:: static SimulationResultMap instance
   :outertype: SimulationResultSingleton

Methods
-------
get
^^^

.. java:method:: @SuppressWarnings @Override public <T> T get(String key, Class<T> tpe)
   :outertype: SimulationResultSingleton

getInstance
^^^^^^^^^^^

.. java:method:: public static synchronized SimulationResultMap getInstance()
   :outertype: SimulationResultSingleton

put
^^^

.. java:method:: @Override public void put(String key, Object o)
   :outertype: SimulationResultSingleton

