.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit.jupiter.api Test

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

MatcherTest.DataContainer
=========================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class DataContainer implements PatternExtractor<Class<Object>, Data>
   :outertype: MatcherTest

Constructors
------------
DataContainer
^^^^^^^^^^^^^

.. java:constructor:: public DataContainer(Data data)
   :outertype: MatcherTest.DataContainer

Methods
-------
extractPattern
^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public Class<Object> extractPattern()
   :outertype: MatcherTest.DataContainer

extractValue
^^^^^^^^^^^^

.. java:method:: @Override public Data extractValue()
   :outertype: MatcherTest.DataContainer

