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

CollectionPerformanceTest.TimedTest
===================================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: static abstract class TimedTest implements PerformanceTest
   :outertype: CollectionPerformanceTest

Methods
-------
fixEventType
^^^^^^^^^^^^

.. java:method:: protected <E extends KompicsEvent> Class<E> fixEventType(Handler<E> h)
   :outertype: CollectionPerformanceTest.TimedTest

reflectEventType
^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings protected <E extends KompicsEvent> Class<E> reflectEventType(Class<?> handlerC)
   :outertype: CollectionPerformanceTest.TimedTest

run
^^^

.. java:method:: @Override public long run()
   :outertype: CollectionPerformanceTest.TimedTest

runMeasurement
^^^^^^^^^^^^^^

.. java:method:: public abstract void runMeasurement()
   :outertype: CollectionPerformanceTest.TimedTest

setUp
^^^^^

.. java:method:: public abstract void setUp()
   :outertype: CollectionPerformanceTest.TimedTest

