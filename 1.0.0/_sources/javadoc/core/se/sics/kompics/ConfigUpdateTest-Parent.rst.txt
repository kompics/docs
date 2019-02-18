.. java:import:: java.util UUID

.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: org.junit.runner RunWith

.. java:import:: org.junit.runners JUnit4

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ValueMerger

ConfigUpdateTest.Parent
=======================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Parent extends ComponentDefinition
   :outertype: ConfigUpdateTest

Methods
-------
handleUpdate
^^^^^^^^^^^^

.. java:method:: @Override public UpdateAction handleUpdate(ConfigUpdate update)
   :outertype: ConfigUpdateTest.Parent

postUpdate
^^^^^^^^^^

.. java:method:: @Override public void postUpdate()
   :outertype: ConfigUpdateTest.Parent

