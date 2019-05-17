.. java:import:: java.util Optional

.. java:import:: se.sics.kompics PatternExtractor

PatternExtractorHelper
======================

.. java:package:: se.sics.kompics.util
   :noindex:

.. java:type:: public class PatternExtractorHelper

   :author: Alex Ormenisan <aaor@kth.se>

Methods
-------
peelAllLayers
^^^^^^^^^^^^^

.. java:method:: public static Object peelAllLayers(PatternExtractor<?, ?> obj)
   :outertype: PatternExtractorHelper

peelOneLayer
^^^^^^^^^^^^

.. java:method:: public static Object peelOneLayer(PatternExtractor<?, ?> obj)
   :outertype: PatternExtractorHelper

peelToLayer
^^^^^^^^^^^

.. java:method:: @SuppressWarnings public static Optional<PatternExtractor> peelToLayer(PatternExtractor obj, Object patternType)
   :outertype: PatternExtractorHelper

