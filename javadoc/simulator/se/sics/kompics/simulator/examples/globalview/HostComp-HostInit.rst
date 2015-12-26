.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.simutil.identifiable Identifiable

.. java:import:: se.sics.kompics.timer Timer

HostComp.HostInit
=================

.. java:package:: se.sics.kompics.simulator.examples.globalview
   :noindex:

.. java:type:: public static class HostInit extends Init<HostComp>
   :outertype: HostComp

Fields
------
pingAdr
^^^^^^^

.. java:field:: public final Address pingAdr
   :outertype: HostComp.HostInit

selfAdr
^^^^^^^

.. java:field:: public final Address selfAdr
   :outertype: HostComp.HostInit

Constructors
------------
HostInit
^^^^^^^^

.. java:constructor:: public HostInit(Address selfAdr, Address pingAdr)
   :outertype: HostComp.HostInit

