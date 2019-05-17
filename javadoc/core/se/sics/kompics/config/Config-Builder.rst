.. java:import:: java.util Optional

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent.atomic AtomicLong

Config.Builder
==============

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public static class Builder implements Config
   :outertype: Config

Methods
-------
addValue
^^^^^^^^

.. java:method:: @SuppressWarnings public void addValue(String key, Object o)
   :outertype: Config.Builder

   Adds \ ``o``\  to the collection at \ ``key``\ .

   Starts a new collection if the value doesn't exists or the value isn't currently a collection.

   :param key: The location of the target collection
   :param o: The value to add to the target collection

addValues
^^^^^^^^^

.. java:method:: @SuppressWarnings public void addValues(String key, Collection<Object> os)
   :outertype: Config.Builder

   Adds all values in \ ``o``\  to the collection at \ ``key``\ .

   Starts a new collection if the value doesn't exists or the value isn't currently a collection.

   :param key: The location of the target collection
   :param os: The collection of values to add to the target collection

copy
^^^^

.. java:method:: @Override public Config copy(boolean newVersionLine)
   :outertype: Config.Builder

finalise
^^^^^^^^

.. java:method:: public ConfigUpdate finalise()
   :outertype: Config.Builder

getValue
^^^^^^^^

.. java:method:: @Override public <T> T getValue(String key, Class<T> type) throws ClassCastException
   :outertype: Config.Builder

getValueOrDefault
^^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> T getValueOrDefault(String key, T defaultValue)
   :outertype: Config.Builder

getValues
^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> List<T> getValues(String key)
   :outertype: Config.Builder

getValues
^^^^^^^^^

.. java:method:: @Override public <T> List<T> getValues(String key, Class<T> type)
   :outertype: Config.Builder

modify
^^^^^^

.. java:method:: @Override public Builder modify(UUID author)
   :outertype: Config.Builder

readValue
^^^^^^^^^

.. java:method:: @SuppressWarnings @Override public <T> Optional<T> readValue(String key)
   :outertype: Config.Builder

readValue
^^^^^^^^^

.. java:method:: @Override public <T> Optional<T> readValue(String key, Class<T> type)
   :outertype: Config.Builder

setValue
^^^^^^^^

.. java:method:: public void setValue(String key, Object o)
   :outertype: Config.Builder

   Sets the value at \ ``key``\  to \ ``o``\ .

   Uses \ :java:ref:`ValueOptions.DEFAULT`\ .

   :param key: The location of the target
   :param o: The new value of the target

setValue
^^^^^^^^

.. java:method:: public void setValue(String key, Object o, ValueOptions opts)
   :outertype: Config.Builder

   Sets the value at \ ``key``\  to \ ``o``\ .

   :param key: The location of the target
   :param o: The new value of the target
   :param opts: The options associated with the new value

