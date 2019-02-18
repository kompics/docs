ValueOptions
============

.. java:package:: se.sics.kompics.config
   :noindex:

.. java:type:: public class ValueOptions

   :author: lkroll

Fields
------
DEFAULT
^^^^^^^

.. java:field:: public static final ValueOptions DEFAULT
   :outertype: ValueOptions

cloner
^^^^^^

.. java:field:: public final Cloner cloner
   :outertype: ValueOptions

copy
^^^^

.. java:field:: public final Copy copy
   :outertype: ValueOptions

merger
^^^^^^

.. java:field:: public final ValueMerger merger
   :outertype: ValueOptions

Methods
-------
deepCopy
^^^^^^^^

.. java:method:: public static ValueOptions deepCopy(Cloner cloner)
   :outertype: ValueOptions

usingMerger
^^^^^^^^^^^

.. java:method:: public static ValueOptions usingMerger(ValueMerger vm)
   :outertype: ValueOptions

withCloner
^^^^^^^^^^

.. java:method:: public ValueOptions withCloner(Cloner cloner)
   :outertype: ValueOptions

withMerger
^^^^^^^^^^

.. java:method:: public ValueOptions withMerger(ValueMerger vm)
   :outertype: ValueOptions

