ConfigUpdateFactory
===================

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public interface ConfigUpdateFactory

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
assemble
^^^^^^^^

.. java:method:: public ConfigUpdate assemble()
   :outertype: ConfigUpdateFactory

include
^^^^^^^

.. java:method:: public void include(String key, ConfigValue original)
   :outertype: ConfigUpdateFactory

replace
^^^^^^^

.. java:method:: public void replace(String key, ConfigValue original, Object replacement)
   :outertype: ConfigUpdateFactory

replace
^^^^^^^

.. java:method:: public void replace(String key, ConfigValue original, Object replacement, ValueOptions options)
   :outertype: ConfigUpdateFactory

