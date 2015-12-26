.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util Set

PortType
========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class PortType

   The \ ``PortType``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
portTypeClass
^^^^^^^^^^^^^

.. java:field::  Class<? extends PortType> portTypeClass
   :outertype: PortType

Methods
-------
getPortType
^^^^^^^^^^^

.. java:method:: @SuppressWarnings public static <P extends PortType> P getPortType(Class<P> portTypeClass)
   :outertype: PortType

   Gets the port type.

   :param portTypeClass: the port type class
   :return: the port type

hasEvent
^^^^^^^^

.. java:method:: public final boolean hasEvent(boolean positive, Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   Checks for event.

   :param positive: the positive
   :param eventType: the event type
   :return: true, if successful

hasNegative
^^^^^^^^^^^

.. java:method:: public final boolean hasNegative(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   Checks for negative.

   :param eventType: the event type
   :return: true, if successful

hasPositive
^^^^^^^^^^^

.. java:method:: public final boolean hasPositive(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   Checks for positive.

   :param eventType: the event type
   :return: true, if successful

indication
^^^^^^^^^^

.. java:method:: protected final void indication(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   specifies an indication, response, or confirmation event type

   :param eventType:

negative
^^^^^^^^

.. java:method:: protected final void negative(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   specifies a request event type

   :param eventType: the event type

positive
^^^^^^^^

.. java:method:: protected final void positive(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   specifies an indication, response, or confirmation event type

   :param eventType: the event type

preloadInstance
^^^^^^^^^^^^^^^

.. java:method:: public static void preloadInstance(PortType p)
   :outertype: PortType

request
^^^^^^^

.. java:method:: protected final void request(Class<? extends KompicsEvent> eventType)
   :outertype: PortType

   specifies a request event type

   :param eventType:

toString
^^^^^^^^

.. java:method:: @Override public final String toString()
   :outertype: PortType

