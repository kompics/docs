.. java:import:: java.util ArrayList

.. java:import:: java.util Iterator

.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics KompicsEvent

TestUtil
========

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public abstract class TestUtil

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
reset
^^^^^

.. java:method:: public static void reset(String testDescription)
   :outertype: TestUtil

reset
^^^^^

.. java:method:: public static void reset(String testDescription, long timeout)
   :outertype: TestUtil

submit
^^^^^^

.. java:method:: public static void submit(String s)
   :outertype: TestUtil

submit
^^^^^^

.. java:method:: public static void submit(KompicsEvent e)
   :outertype: TestUtil

waitFor
^^^^^^^

.. java:method:: public static void waitFor(KompicsEvent e)
   :outertype: TestUtil

waitFor
^^^^^^^

.. java:method:: public static void waitFor(Class<? extends KompicsEvent> eventType)
   :outertype: TestUtil

waitFor
^^^^^^^

.. java:method:: public static void waitFor(String s)
   :outertype: TestUtil

waitForAll
^^^^^^^^^^

.. java:method:: public static void waitForAll(KompicsEvent... events)
   :outertype: TestUtil

waitForAll
^^^^^^^^^^

.. java:method:: @SafeVarargs public static void waitForAll(Class<? extends KompicsEvent>... eventTypes)
   :outertype: TestUtil

waitForAll
^^^^^^^^^^

.. java:method:: public static void waitForAll(String... strings)
   :outertype: TestUtil

