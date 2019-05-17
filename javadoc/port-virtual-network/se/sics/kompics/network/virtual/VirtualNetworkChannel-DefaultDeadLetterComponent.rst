.. java:import:: java.nio ByteBuffer

.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util Map

.. java:import:: java.util Set

.. java:import:: java.util.concurrent.locks ReadWriteLock

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ChannelCore

.. java:import:: se.sics.kompics ChannelSelector

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics ComponentProxy

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Port

.. java:import:: se.sics.kompics PortCore

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Network

VirtualNetworkChannel.DefaultDeadLetterComponent
================================================

.. java:package:: se.sics.kompics.network.virtual
   :noindex:

.. java:type:: public static class DefaultDeadLetterComponent extends ComponentDefinition
   :outertype: VirtualNetworkChannel

Fields
------
msgHandler
^^^^^^^^^^

.. java:field::  Handler<Msg<?, ?>> msgHandler
   :outertype: VirtualNetworkChannel.DefaultDeadLetterComponent

net
^^^

.. java:field::  Positive<Network> net
   :outertype: VirtualNetworkChannel.DefaultDeadLetterComponent

