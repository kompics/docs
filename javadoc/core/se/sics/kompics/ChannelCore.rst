ChannelCore
===========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface ChannelCore<P extends PortType> extends Channel<P>

   The \ ``ChannelCore``\  class.

   :author: Lars Kroll

Methods
-------
forwardToNegative
^^^^^^^^^^^^^^^^^

.. java:method:: public void forwardToNegative(KompicsEvent event, int wid)
   :outertype: ChannelCore

forwardToPositive
^^^^^^^^^^^^^^^^^

.. java:method:: public void forwardToPositive(KompicsEvent event, int wid)
   :outertype: ChannelCore

hasNegativePort
^^^^^^^^^^^^^^^

.. java:method:: public boolean hasNegativePort(Port<P> port)
   :outertype: ChannelCore

hasPositivePort
^^^^^^^^^^^^^^^

.. java:method:: public boolean hasPositivePort(Port<P> port)
   :outertype: ChannelCore

isDestroyed
^^^^^^^^^^^

.. java:method:: public boolean isDestroyed()
   :outertype: ChannelCore

