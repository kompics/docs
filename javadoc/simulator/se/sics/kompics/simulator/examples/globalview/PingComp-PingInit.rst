.. java:import:: java.util UUID

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ClassMatchedHandler

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.simutil.msg ContentMsg

.. java:import:: se.sics.kompics.simutil.msg.impl BasicContentMsg

.. java:import:: se.sics.kompics.simutil.msg.impl BasicHeader

.. java:import:: se.sics.kompics.simutil.identifiable Identifiable

.. java:import:: se.sics.kompics.timer CancelPeriodicTimeout

.. java:import:: se.sics.kompics.timer SchedulePeriodicTimeout

.. java:import:: se.sics.kompics.timer Timeout

.. java:import:: se.sics.kompics.timer Timer

PingComp.PingInit
=================

.. java:package:: se.sics.kompics.simulator.examples.globalview
   :noindex:

.. java:type:: public static class PingInit extends Init<PingComp>
   :outertype: PingComp

Fields
------
pingAdr
^^^^^^^

.. java:field:: public final Address pingAdr
   :outertype: PingComp.PingInit

selfAdr
^^^^^^^

.. java:field:: public final Address selfAdr
   :outertype: PingComp.PingInit

Constructors
------------
PingInit
^^^^^^^^

.. java:constructor:: public PingInit(Address selfAdr, Address pingAdr)
   :outertype: PingComp.PingInit

