.. java:import:: java.util UUID

.. java:import:: se.sics.kompics ClassMatchedHandler

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.network Transport

.. java:import:: se.sics.kompics.simulator.examples.util BasicContentMsg

.. java:import:: se.sics.kompics.simulator.examples.util BasicHeader

.. java:import:: se.sics.kompics.timer CancelPeriodicTimeout

.. java:import:: se.sics.kompics.timer SchedulePeriodicTimeout

.. java:import:: se.sics.kompics.timer Timeout

.. java:import:: se.sics.kompics.timer Timer

BasicPingComp
=============

.. java:package:: se.sics.kompics.simulator.examples.networkModel
   :noindex:

.. java:type:: public class BasicPingComp extends ComponentDefinition

   :author: Alex Ormenisan

Fields
------
handlePing
^^^^^^^^^^

.. java:field::  ClassMatchedHandler<Ping, BasicContentMsg<Address, BasicHeader<Address>, Ping>> handlePing
   :outertype: BasicPingComp

handlePong
^^^^^^^^^^

.. java:field::  ClassMatchedHandler<Pong, BasicContentMsg<Address, BasicHeader<Address>, Pong>> handlePong
   :outertype: BasicPingComp

Constructors
------------
BasicPingComp
^^^^^^^^^^^^^

.. java:constructor:: public BasicPingComp(BasicPingInit init)
   :outertype: BasicPingComp

