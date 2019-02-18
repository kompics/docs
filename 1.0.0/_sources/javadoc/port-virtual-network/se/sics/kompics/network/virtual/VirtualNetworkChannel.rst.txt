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

VirtualNetworkChannel
=====================

.. java:package:: se.sics.kompics.network.virtual
   :noindex:

.. java:type:: public class VirtualNetworkChannel implements ChannelCore<Network>

   :author: Lars Kroll

Methods
-------
addConnection
^^^^^^^^^^^^^

.. java:method:: public void addConnection(byte[] id, Negative<Network> destinationPort)
   :outertype: VirtualNetworkChannel

connect
^^^^^^^

.. java:method:: public static VirtualNetworkChannel connect(Positive<Network> sourcePort, ComponentProxy parent)
   :outertype: VirtualNetworkChannel

connect
^^^^^^^

.. java:method:: public static VirtualNetworkChannel connect(Positive<Network> sourcePort, Negative<Network> deadLetterBox)
   :outertype: VirtualNetworkChannel

connect
^^^^^^^

.. java:method:: public static VirtualNetworkChannel connect(Positive<Network> sourcePort, ChannelSelector<?, ?> selector, ComponentProxy parent)
   :outertype: VirtualNetworkChannel

connect
^^^^^^^

.. java:method:: public static VirtualNetworkChannel connect(Positive<Network> sourcePort, Negative<Network> deadLetterBox, ChannelSelector<?, ?> selector)
   :outertype: VirtualNetworkChannel

disconnect
^^^^^^^^^^

.. java:method:: @Override public void disconnect()
   :outertype: VirtualNetworkChannel

forwardToNegative
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void forwardToNegative(KompicsEvent event, int wid)
   :outertype: VirtualNetworkChannel

forwardToPositive
^^^^^^^^^^^^^^^^^

.. java:method:: @Override public void forwardToPositive(KompicsEvent event, int wid)
   :outertype: VirtualNetworkChannel

getPortType
^^^^^^^^^^^

.. java:method:: @Override public Network getPortType()
   :outertype: VirtualNetworkChannel

hasNegativePort
^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean hasNegativePort(Port<Network> port)
   :outertype: VirtualNetworkChannel

hasPositivePort
^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean hasPositivePort(Port<Network> port)
   :outertype: VirtualNetworkChannel

isDestroyed
^^^^^^^^^^^

.. java:method:: @Override public boolean isDestroyed()
   :outertype: VirtualNetworkChannel

removeConnection
^^^^^^^^^^^^^^^^

.. java:method:: public void removeConnection(byte[] id, Negative<Network> destinationPort)
   :outertype: VirtualNetworkChannel

