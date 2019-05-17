.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit.jupiter.api Test

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

MatcherTest.DataParent
======================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class DataParent extends ComponentDefinition
   :outertype: MatcherTest

Fields
------
dataHandler
^^^^^^^^^^^

.. java:field::  ClassMatchedHandler<CData, DataContainer> dataHandler
   :outertype: MatcherTest.DataParent

dp
^^

.. java:field::  Positive<DataPort> dp
   :outertype: MatcherTest.DataParent

falseDataHandler
^^^^^^^^^^^^^^^^

.. java:field::  ClassMatchedHandler<FData, DataContainer> falseDataHandler
   :outertype: MatcherTest.DataParent

Constructors
------------
DataParent
^^^^^^^^^^

.. java:constructor:: public DataParent()
   :outertype: MatcherTest.DataParent

