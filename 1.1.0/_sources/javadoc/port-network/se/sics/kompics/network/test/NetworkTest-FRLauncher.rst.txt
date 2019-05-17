.. java:import:: java.io IOException

.. java:import:: java.io Serializable

.. java:import:: java.net InetAddress

.. java:import:: java.net ServerSocket

.. java:import:: java.net UnknownHostException

.. java:import:: java.util Map.Entry

.. java:import:: java.util.concurrent ConcurrentHashMap

.. java:import:: java.util.concurrent ConcurrentSkipListMap

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics ControlPort

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

NetworkTest.FRLauncher
======================

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public static class FRLauncher extends ComponentDefinition
   :outertype: NetworkTest

Fields
------
recoverHandler
^^^^^^^^^^^^^^

.. java:field::  Handler<Recover> recoverHandler
   :outertype: NetworkTest.FRLauncher

Constructors
------------
FRLauncher
^^^^^^^^^^

.. java:constructor:: public FRLauncher()
   :outertype: NetworkTest.FRLauncher

Methods
-------
handleFault
^^^^^^^^^^^

.. java:method:: @Override public ResolveAction handleFault(Fault fault)
   :outertype: NetworkTest.FRLauncher

