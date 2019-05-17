.. java:import:: com.google.common.collect ArrayListMultimap

.. java:import:: java.lang.management ManagementFactory

.. java:import:: java.lang.management ThreadMXBean

.. java:import:: java.lang.reflect Method

.. java:import:: java.util ArrayList

.. java:import:: java.util Comparator

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util TreeSet

.. java:import:: org.junit.jupiter.api Test

CollectionPerformanceTest
=========================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class CollectionPerformanceTest

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
LOOKUPS
^^^^^^^

.. java:field:: static final long LOOKUPS
   :outertype: CollectionPerformanceTest

test2Handler1
^^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent2> test2Handler1
   :outertype: CollectionPerformanceTest

test3Handler1
^^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent3> test3Handler1
   :outertype: CollectionPerformanceTest

test4Handler1
^^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent4> test4Handler1
   :outertype: CollectionPerformanceTest

test5Handler1
^^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent5> test5Handler1
   :outertype: CollectionPerformanceTest

testHandler1
^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent> testHandler1
   :outertype: CollectionPerformanceTest

testHandler2
^^^^^^^^^^^^

.. java:field:: static final Handler<TestEvent> testHandler2
   :outertype: CollectionPerformanceTest

testHandlers
^^^^^^^^^^^^

.. java:field:: static final List<Handler<? extends KompicsEvent>> testHandlers
   :outertype: CollectionPerformanceTest

Constructors
------------
CollectionPerformanceTest
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public CollectionPerformanceTest()
   :outertype: CollectionPerformanceTest

Methods
-------
guavaArrayListMultimapTest
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void guavaArrayListMultimapTest()
   :outertype: CollectionPerformanceTest

hashMapTest
^^^^^^^^^^^

.. java:method:: @Test public void hashMapTest()
   :outertype: CollectionPerformanceTest

