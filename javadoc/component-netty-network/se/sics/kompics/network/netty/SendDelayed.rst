.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

SendDelayed
===========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type::  class SendDelayed implements KompicsEvent

   Just a notification event

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
peer
^^^^

.. java:field:: public final Address peer
   :outertype: SendDelayed

protocol
^^^^^^^^

.. java:field:: public final Transport protocol
   :outertype: SendDelayed

Constructors
------------
SendDelayed
^^^^^^^^^^^

.. java:constructor:: public SendDelayed(Address peer, Transport protocol)
   :outertype: SendDelayed

