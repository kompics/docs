.. java:import:: com.google.common.collect HashMultimap

.. java:import:: java.net InetAddress

.. java:import:: java.net UnknownHostException

Conversions
===========

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public abstract class Conversions

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
asString
^^^^^^^^

.. java:method:: public static String asString()
   :outertype: Conversions

convert
^^^^^^^

.. java:method:: @SuppressWarnings public static <T> T convert(Object o, Class<T> type)
   :outertype: Conversions

register
^^^^^^^^

.. java:method:: public static void register(Converter<?> c)
   :outertype: Conversions

