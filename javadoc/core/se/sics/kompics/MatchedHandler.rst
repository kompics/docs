MatchedHandler
==============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class MatchedHandler<P, V, E extends KompicsEvent & PatternExtractor<P, V>>

   :author: lkroll
   :param <Matched>:
   :param <E>:

Fields
------
cxtType
^^^^^^^

.. java:field::  Class<E> cxtType
   :outertype: MatchedHandler

Methods
-------
getCxtType
^^^^^^^^^^

.. java:method:: public Class<E> getCxtType()
   :outertype: MatchedHandler

   Gets the event type.

   :return: the event type

handle
^^^^^^

.. java:method:: public abstract void handle(V content, E context)
   :outertype: MatchedHandler

pattern
^^^^^^^

.. java:method:: public abstract P pattern()
   :outertype: MatchedHandler

setCxtType
^^^^^^^^^^

.. java:method:: public void setCxtType(Class<E> cxtType)
   :outertype: MatchedHandler

   Sets the event type.

   :param eventType: the new event type

