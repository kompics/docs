.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: java.util Objects

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.util Identifier

BasicAddress
============

.. java:package:: se.sics.kompics.simulator.examples.util
   :noindex:

.. java:type:: public class BasicAddress implements Address

   :author: Alex Ormenisan

Constructors
------------
BasicAddress
^^^^^^^^^^^^

.. java:constructor:: public BasicAddress(InetAddress adr, int port)
   :outertype: BasicAddress

Methods
-------
asSocket
^^^^^^^^

.. java:method:: @Override public InetSocketAddress asSocket()
   :outertype: BasicAddress

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: BasicAddress

getIp
^^^^^

.. java:method:: @Override public InetAddress getIp()
   :outertype: BasicAddress

getPort
^^^^^^^

.. java:method:: @Override public int getPort()
   :outertype: BasicAddress

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: BasicAddress

sameHostAs
^^^^^^^^^^

.. java:method:: @Override public boolean sameHostAs(Address other)
   :outertype: BasicAddress

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: BasicAddress

withPort
^^^^^^^^

.. java:method:: public BasicAddress withPort(int port)
   :outertype: BasicAddress

