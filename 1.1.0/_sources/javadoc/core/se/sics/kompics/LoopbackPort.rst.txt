LoopbackPort
============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class LoopbackPort extends PortType

   The \ ``LoopbackPort``\  class. Components can trigger any type of event in any direction on themselves. This is mostly useful for delaying handling (e.g. batching) of events and for interfacing with external systems with their own threads. (Triggering events on ports is thread-safe.)

   :author: Lars Kroll <lkroll@kth.se>

