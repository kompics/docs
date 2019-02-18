.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util Random

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentMap

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

ReadLockTest.NoLocks
====================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class NoLocks implements LookupService
   :outertype: ReadLockTest

Constructors
------------
NoLocks
^^^^^^^

.. java:constructor:: public NoLocks(Map<String, Integer> m)
   :outertype: ReadLockTest.NoLocks

Methods
-------
lookup
^^^^^^

.. java:method:: public int lookup(String s)
   :outertype: ReadLockTest.NoLocks

