.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.network Transport

DropDelayed
===========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class DropDelayed implements KompicsEvent

   :author: lkroll

Fields
------
isa
^^^

.. java:field:: public final InetSocketAddress isa
   :outertype: DropDelayed

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: DropDelayed

Constructors
------------
DropDelayed
^^^^^^^^^^^

.. java:constructor:: public DropDelayed(InetSocketAddress isa, Transport protocol)
   :outertype: DropDelayed

