.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

ConfigUpdate
============

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public class ConfigUpdate implements Iterable<Entry<String, ConfigValue>>

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
creator
^^^^^^^

.. java:field:: final UUID creator
   :outertype: ConfigUpdate

updates
^^^^^^^

.. java:field:: final HashMap<String, ConfigValue> updates
   :outertype: ConfigUpdate

versionId
^^^^^^^^^

.. java:field:: final long versionId
   :outertype: ConfigUpdate

Constructors
------------
ConfigUpdate
^^^^^^^^^^^^

.. java:constructor::  ConfigUpdate(HashMap<String, ConfigValue> updates, long versionId, UUID creator)
   :outertype: ConfigUpdate

Methods
-------
iterator
^^^^^^^^

.. java:method:: @Override public Iterator<Entry<String, ConfigValue>> iterator()
   :outertype: ConfigUpdate

modify
^^^^^^

.. java:method:: public ConfigUpdateFactory modify(UUID creator)
   :outertype: ConfigUpdate

