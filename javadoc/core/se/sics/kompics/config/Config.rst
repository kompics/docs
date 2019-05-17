.. java:import:: java.util Optional

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

.. java:import:: java.util HashMap

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map.Entry

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent.atomic AtomicLong

Config
======

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public interface Config

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
copy
^^^^

.. java:method:: public Config copy(boolean newVersionLine)
   :outertype: Config

getValue
^^^^^^^^

.. java:method:: public <T> T getValue(String key, Class<T> type) throws ClassCastException
   :outertype: Config

   Return the value at \ ``key``\  as \ ``T``\  or \ ``null``\  if none.

   Performs checked casting against \ ``type``\ .

   :param <T>: The requested type of the value
   :param key: The location of the value
   :param type: The type to cast the value to
   :throws ClassCastException: if the value can not be cast to \ ``type``\
   :return: The value as \ ``T``\  if present or \ ``null``\  otherwise

getValueOrDefault
^^^^^^^^^^^^^^^^^

.. java:method:: public <T extends Object> T getValueOrDefault(String key, T defaultValue)
   :outertype: Config

   Return the value at \ ``key``\  as \ ``T``\  or \ ``defaultValue``\  if none.

   Performs checked casting against the type of \ ``defaultValue``\ .

   :param <T>: The requested type of the value
   :param key: The location of the value
   :param defaultValue: Returned if there is not value of the right type at \ ``key``\
   :return: The value as \ ``T``\  if present or \ ``defaultValue``\  otherwise

getValues
^^^^^^^^^

.. java:method:: public <T> List<T> getValues(String key)
   :outertype: Config

   Returns a list of values at @{code key}.

   The casts to \ ``T``\  are unchecked in this method. Use \ :java:ref:`getValues(java.lang.String,java.lang.Class)`\  if you don't want this behaviour.

   :param <T>: The list value type
   :param key: The location of the values
   :return: A list of values at @{code key}

getValues
^^^^^^^^^

.. java:method:: public <T> List<T> getValues(String key, Class<T> type)
   :outertype: Config

   Returns a list of values at @{code key}.

   Value casts are checked against \ ``type``\ . May throw a @{link se.sics.kompics.config.ConfigValueException } if a value can't be cast.

   :param <T>: The list value type
   :param key: The location of the values
   :param type: The type to cast the values to
   :return: A list of values at @{code key}

modify
^^^^^^

.. java:method:: public Builder modify(UUID author)
   :outertype: Config

readValue
^^^^^^^^^

.. java:method:: public <T> Optional<T> readValue(String key)
   :outertype: Config

   Returns an \ ``Optional``\  of the value at \ ``key``\  as \ ``T``\  or \ ``Absent<T>``\  if none.

   Does not perform checked casting!

   :param <T>: The requested type of the value
   :param key: The location of the value
   :return: \ ``Optional.of(T)``\  if present or \ ``Absent<T>``\  otherwise

readValue
^^^^^^^^^

.. java:method:: public <T> Optional<T> readValue(String key, Class<T> type)
   :outertype: Config

   Returns an \ ``Optional``\  of the value at \ ``key``\  as \ ``T``\  or \ ``Absent<T>``\  if none.

   Performs checked casting against \ ``type``\ .

   :param <T>: The requested type of the value
   :param key: The location of the value
   :param type: The type to cast the value to
   :return: \ ``Optional.of(T)``\  if present or \ ``Absent<T>``\  otherwise

