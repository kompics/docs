.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util Random

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentMap

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

ReadLockTest.SyncLock
=====================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class SyncLock implements LookupService
   :outertype: ReadLockTest

Constructors
------------
SyncLock
^^^^^^^^

.. java:constructor:: public SyncLock(Map<String, Integer> m)
   :outertype: ReadLockTest.SyncLock

Methods
-------
lookup
^^^^^^

.. java:method:: public synchronized int lookup(String s)
   :outertype: ReadLockTest.SyncLock

