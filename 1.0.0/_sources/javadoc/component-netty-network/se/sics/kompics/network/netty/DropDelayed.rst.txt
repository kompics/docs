.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

DropDelayed
===========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class DropDelayed implements KompicsEvent

   :author: lkroll

Fields
------
peer
^^^^

.. java:field:: public final Address peer
   :outertype: DropDelayed

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: DropDelayed

Constructors
------------
DropDelayed
^^^^^^^^^^^

.. java:constructor:: public DropDelayed(Address peer, Transport protocol)
   :outertype: DropDelayed

