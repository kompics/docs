.. java:import:: java.io IOException

.. java:import:: java.io Serializable

.. java:import:: java.net InetAddress

.. java:import:: java.net ServerSocket

.. java:import:: java.net UnknownHostException

.. java:import:: java.util Arrays

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util Map.Entry

.. java:import:: java.util Random

.. java:import:: java.util Set

.. java:import:: java.util TreeMap

.. java:import:: java.util TreeSet

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent ConcurrentSkipListMap

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics ControlPort

.. java:import:: se.sics.kompics Event

.. java:import:: se.sics.kompics Fault

.. java:import:: se.sics.kompics Fault.ResolveAction

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Init.None

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Port

.. java:import:: se.sics.kompics PortType

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network MessageNotify

.. java:import:: se.sics.kompics.network Network

.. java:import:: se.sics.kompics.network Transport

NetworkTest.TestMessage
=======================

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public static class TestMessage extends Message implements Serializable
   :outertype: NetworkTest

Fields
------
msgId
^^^^^

.. java:field:: public final int msgId
   :outertype: NetworkTest.TestMessage

Constructors
------------
TestMessage
^^^^^^^^^^^

.. java:constructor:: public TestMessage(TestAddress src, TestAddress dst, int id, Transport p)
   :outertype: NetworkTest.TestMessage

Methods
-------
ack
^^^

.. java:method:: public Ack ack()
   :outertype: NetworkTest.TestMessage

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: NetworkTest.TestMessage

