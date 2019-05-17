.. java:import:: java.util Optional

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent.atomic AtomicLong

Config.Impl
===========

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public static class Impl implements Config
   :outertype: Config

Fields
------
version
^^^^^^^

.. java:field::  long version
   :outertype: Config.Impl

Methods
-------
apply
^^^^^

.. java:method:: public void apply(ConfigUpdate update, Optional<ValueMerger> customMergeLogic)
   :outertype: Config.Impl

copy
^^^^

.. java:method:: @Override public Config copy(boolean newVersionLine)
   :outertype: Config.Impl

getValue
^^^^^^^^

.. java:method:: @Override public <T> T getValue(String key, Class<T> type) throws ClassCastException
   :outertype: Config.Impl

getValueOrDefault
^^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T extends Object> T getValueOrDefault(String key, T defaultValue)
   :outertype: Config.Impl

getValues
^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> List<T> getValues(String key)
   :outertype: Config.Impl

getValues
^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> List<T> getValues(String key, Class<T> type)
   :outertype: Config.Impl

modify
^^^^^^

.. java:method:: @Override public Builder modify(UUID author)
   :outertype: Config.Impl

readValue
^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> Optional<T> readValue(String key)
   :outertype: Config.Impl

readValue
^^^^^^^^^

.. java:method:: @Override public <T> Optional<T> readValue(String key, Class<T> type)
   :outertype: Config.Impl

