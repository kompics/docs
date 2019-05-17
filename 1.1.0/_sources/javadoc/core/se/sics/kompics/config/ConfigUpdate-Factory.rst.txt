.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

ConfigUpdate.Factory
====================

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public class Factory implements ConfigUpdateFactory
   :outertype: ConfigUpdate

Methods
-------
assemble
^^^^^^^^

.. java:method:: @Override public ConfigUpdate assemble()
   :outertype: ConfigUpdate.Factory

include
^^^^^^^

.. java:method:: @Override public void include(String key, ConfigValue original)
   :outertype: ConfigUpdate.Factory

replace
^^^^^^^

.. java:method:: @Override public void replace(String key, ConfigValue original, Object replacement)
   :outertype: ConfigUpdate.Factory

replace
^^^^^^^

.. java:method:: @Override public void replace(String key, ConfigValue original, Object replacement, ValueOptions options)
   :outertype: ConfigUpdate.Factory

