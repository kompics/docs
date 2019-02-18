ChannelSelector
===============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class ChannelSelector<E extends KompicsEvent, F>

   The \ ``ChannelSelector``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Constructors
------------
ChannelSelector
^^^^^^^^^^^^^^^

.. java:constructor:: protected ChannelSelector(Class<E> eventType, F value, boolean positive)
   :outertype: ChannelSelector

Methods
-------
getEventType
^^^^^^^^^^^^

.. java:method:: public final Class<E> getEventType()
   :outertype: ChannelSelector

getValue
^^^^^^^^

.. java:method:: public abstract F getValue(E event)
   :outertype: ChannelSelector

getValue
^^^^^^^^

.. java:method:: public final F getValue()
   :outertype: ChannelSelector

isPositive
^^^^^^^^^^

.. java:method:: public final boolean isPositive()
   :outertype: ChannelSelector

