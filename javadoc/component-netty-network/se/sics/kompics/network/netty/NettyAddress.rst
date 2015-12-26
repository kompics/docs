.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics.network Address

NettyAddress
============

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NettyAddress implements Address

   :author: lkroll

Constructors
------------
NettyAddress
^^^^^^^^^^^^

.. java:constructor:: public NettyAddress(InetSocketAddress isa)
   :outertype: NettyAddress

NettyAddress
^^^^^^^^^^^^

.. java:constructor:: public NettyAddress(Address other)
   :outertype: NettyAddress

NettyAddress
^^^^^^^^^^^^

.. java:constructor:: public NettyAddress(InetAddress addr, int port)
   :outertype: NettyAddress

Methods
-------
asSocket
^^^^^^^^

.. java:method:: @Override public InetSocketAddress asSocket()
   :outertype: NettyAddress

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: NettyAddress

getIp
^^^^^

.. java:method:: @Override public InetAddress getIp()
   :outertype: NettyAddress

getPort
^^^^^^^

.. java:method:: @Override public int getPort()
   :outertype: NettyAddress

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: NettyAddress

sameHostAs
^^^^^^^^^^

.. java:method:: @Override public boolean sameHostAs(Address other)
   :outertype: NettyAddress

toString
^^^^^^^^

.. java:method:: @Override public final String toString()
   :outertype: NettyAddress

