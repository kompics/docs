ClassMatchedHandler
===================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class ClassMatchedHandler<V, E extends KompicsEvent & PatternExtractor<Class<Object>, ? super V>> extends MatchedHandler<Class<Object>, V, E>

   :author: Lars Kroll <lkroll@kth.se>

Constructors
------------
ClassMatchedHandler
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: protected ClassMatchedHandler()
   :outertype: ClassMatchedHandler

ClassMatchedHandler
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: @SuppressWarnings protected ClassMatchedHandler(Class<?> matchType)
   :outertype: ClassMatchedHandler

ClassMatchedHandler
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: @SuppressWarnings protected ClassMatchedHandler(Class<E> cxtType, Class<?> matchType)
   :outertype: ClassMatchedHandler

Methods
-------
pattern
^^^^^^^

.. java:method:: @Override public Class<Object> pattern()
   :outertype: ClassMatchedHandler

setPattern
^^^^^^^^^^

.. java:method::  void setPattern(Class<Object> matchType)
   :outertype: ClassMatchedHandler

