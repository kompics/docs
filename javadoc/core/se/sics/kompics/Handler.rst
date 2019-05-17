Handler
=======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class Handler<E extends KompicsEvent>

   The \ ``Handler``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
eventType
^^^^^^^^^

.. java:field::  Class<E> eventType
   :outertype: Handler

Constructors
------------
Handler
^^^^^^^

.. java:constructor:: public Handler()
   :outertype: Handler

   Instantiates a new handler.

Handler
^^^^^^^

.. java:constructor:: public Handler(Class<E> eventType)
   :outertype: Handler

   Instantiates a new handler.

   :param eventType: the event type

Methods
-------
getEventType
^^^^^^^^^^^^

.. java:method:: public Class<E> getEventType()
   :outertype: Handler

   Gets the event type.

   :return: the event type

handle
^^^^^^

.. java:method:: public abstract void handle(E event)
   :outertype: Handler

   Handle.

   :param event: the event

setEventType
^^^^^^^^^^^^

.. java:method:: public void setEventType(Class<E> eventType)
   :outertype: Handler

   Sets the event type.

   :param eventType: the new event type

