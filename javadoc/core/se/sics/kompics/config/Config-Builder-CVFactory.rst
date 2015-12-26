.. java:import:: com.google.common.base Optional

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent.atomic AtomicLong

Config.Builder.CVFactory
========================

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: static class CVFactory implements ConfigValueFactory
   :outertype: Config.Builder

Fields
------
INSTANCE
^^^^^^^^

.. java:field:: public static final ConfigValueFactory INSTANCE
   :outertype: Config.Builder.CVFactory

Methods
-------
create
^^^^^^

.. java:method:: @Override public ConfigValue create(Object o, long versionId, ValueOptions opts)
   :outertype: Config.Builder.CVFactory

