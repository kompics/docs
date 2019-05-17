.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util Random

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentMap

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

ReadLockTest.Worker
===================

.. java:package:: se.sics.kompics.network.netty.serialization
   :noindex:

.. java:type:: public static class Worker implements Runnable
   :outertype: ReadLockTest

Constructors
------------
Worker
^^^^^^

.. java:constructor:: public Worker(int id, LookupService service, String word, long executions)
   :outertype: ReadLockTest.Worker

Methods
-------
run
^^^

.. java:method:: @Override public void run()
   :outertype: ReadLockTest.Worker

