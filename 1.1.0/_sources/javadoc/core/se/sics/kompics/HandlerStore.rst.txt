.. java:import:: java.util HashMap

HandlerStore
============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @SuppressWarnings  class HandlerStore

   :author: Lars Kroll

Methods
-------
getMatchers
^^^^^^^^^^^

.. java:method::  MatchedHandlerList getMatchers(PatternExtractor event)
   :outertype: HandlerStore

getSubscriptions
^^^^^^^^^^^^^^^^

.. java:method::  HandlerList getSubscriptions(KompicsEvent event)
   :outertype: HandlerStore

hasSubscription
^^^^^^^^^^^^^^^

.. java:method::  boolean hasSubscription(KompicsEvent event)
   :outertype: HandlerStore

subscribe
^^^^^^^^^

.. java:method::  void subscribe(Handler h)
   :outertype: HandlerStore

subscribe
^^^^^^^^^

.. java:method::  void subscribe(MatchedHandler h)
   :outertype: HandlerStore

unsubscribe
^^^^^^^^^^^

.. java:method::  boolean unsubscribe(Handler h)
   :outertype: HandlerStore

unsubscribe
^^^^^^^^^^^

.. java:method::  boolean unsubscribe(MatchedHandler h)
   :outertype: HandlerStore

