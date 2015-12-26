.. java:import:: com.typesafe.config ConfigException

.. java:import:: com.typesafe.config ConfigFactory

.. java:import:: com.typesafe.config ConfigList

.. java:import:: java.util LinkedList

.. java:import:: java.util List

TypesafeConfig
==============

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public class TypesafeConfig implements BaselineConfig

   :author: lkroll

Methods
-------
getValue
^^^^^^^^

.. java:method:: @Override public ConfigValue getValue(String key)
   :outertype: TypesafeConfig

getValues
^^^^^^^^^

.. java:method:: @Override public List<? extends ConfigValue> getValues(String path)
   :outertype: TypesafeConfig

load
^^^^

.. java:method:: public static Config load()
   :outertype: TypesafeConfig

load
^^^^

.. java:method:: public static Config load(com.typesafe.config.Config conf)
   :outertype: TypesafeConfig

