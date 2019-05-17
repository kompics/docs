.. java:import:: java.util UUID

.. java:import:: java.util.concurrent BlockingQueue

.. java:import:: java.util.concurrent LinkedBlockingQueue

.. java:import:: java.util.concurrent TimeUnit

.. java:import:: org.junit.jupiter.api Test

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ValueMerger

ConfigUpdateTest.Child
======================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Child extends ComponentDefinition
   :outertype: ConfigUpdateTest

Methods
-------
handleUpdate
^^^^^^^^^^^^

.. java:method:: @Override public UpdateAction handleUpdate(ConfigUpdate update)
   :outertype: ConfigUpdateTest.Child

postUpdate
^^^^^^^^^^

.. java:method:: @Override public void postUpdate()
   :outertype: ConfigUpdateTest.Child

