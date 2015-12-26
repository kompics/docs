.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

ChannelSelectorSet
==================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class ChannelSelectorSet implements Iterable<ChannelCore<?>>

Constructors
------------
ChannelSelectorSet
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ChannelSelectorSet()
   :outertype: ChannelSelectorSet

Methods
-------
addChannelFilter
^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public void addChannelFilter(ChannelCore<?> channel, ChannelSelector<?, ?> filter)
   :outertype: ChannelSelectorSet

clear
^^^^^

.. java:method::  void clear()
   :outertype: ChannelSelectorSet

get
^^^

.. java:method:: @SuppressWarnings public ArrayList<ChannelCore<?>> get(KompicsEvent event)
   :outertype: ChannelSelectorSet

isEmpty
^^^^^^^

.. java:method:: public boolean isEmpty()
   :outertype: ChannelSelectorSet

iterator
^^^^^^^^

.. java:method:: @Override public Iterator<ChannelCore<?>> iterator()
   :outertype: ChannelSelectorSet

removeChannel
^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public void removeChannel(ChannelCore<?> channel)
   :outertype: ChannelSelectorSet

