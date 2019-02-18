.. java:import:: com.google.common.collect ImmutableSet

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

NettyInit
=========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettyInit extends Init<NettyNetwork>

   :author: Lars Kroll

Fields
------
protocols
^^^^^^^^^

.. java:field:: public final ImmutableSet<Transport> protocols
   :outertype: NettyInit

self
^^^^

.. java:field:: public final Address self
   :outertype: NettyInit

udtPort
^^^^^^^

.. java:field:: public final int udtPort
   :outertype: NettyInit

Constructors
------------
NettyInit
^^^^^^^^^

.. java:constructor:: public NettyInit(Address self, int udtPort, ImmutableSet<Transport> protocols)
   :outertype: NettyInit

NettyInit
^^^^^^^^^

.. java:constructor:: public NettyInit(Address self)
   :outertype: NettyInit

