.. java:import:: com.google.common.base Optional

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

ValueMerger
===========

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public interface ValueMerger

   :author: lkroll

Fields
------
APPEND
^^^^^^

.. java:field:: public static final ValueMerger APPEND
   :outertype: ValueMerger

HIGHEST_ID
^^^^^^^^^^

.. java:field:: public static final ValueMerger HIGHEST_ID
   :outertype: ValueMerger

NEWEST
^^^^^^

.. java:field:: public static final ValueMerger NEWEST
   :outertype: ValueMerger

NONE
^^^^

.. java:field:: public static final Optional<ValueMerger> NONE
   :outertype: ValueMerger

Methods
-------
merge
^^^^^

.. java:method:: public ConfigValue merge(String key, ConfigValue oldValue, ConfigValue newValue, ConfigValueFactory cvFactory)
   :outertype: ValueMerger

