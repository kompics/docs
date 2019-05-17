PatternExtractor
================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface PatternExtractor<P, V> extends KompicsEvent

   This interface must be implemented by classes that act as context for MatchedHandlers.

   :author: Lars Kroll <lkroll@kth.se>
   :param <P>: The type pattern to match against
   :param <V>: The type of the value to extract if the pattern is matched

Methods
-------
extractPattern
^^^^^^^^^^^^^^

.. java:method:: public P extractPattern()
   :outertype: PatternExtractor

extractValue
^^^^^^^^^^^^

.. java:method:: public V extractValue()
   :outertype: PatternExtractor

