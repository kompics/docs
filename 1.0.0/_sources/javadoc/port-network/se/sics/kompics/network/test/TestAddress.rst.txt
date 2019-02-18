.. java:import:: java.io Serializable

.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

.. java:import:: se.sics.kompics.network Address

TestAddress
===========

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public class TestAddress implements Address, Serializable

   :author: lkroll

Constructors
------------
TestAddress
^^^^^^^^^^^

.. java:constructor:: public TestAddress(InetSocketAddress isa)
   :outertype: TestAddress

TestAddress
^^^^^^^^^^^

.. java:constructor:: public TestAddress(InetAddress addr, int port)
   :outertype: TestAddress

Methods
-------
asSocket
^^^^^^^^

.. java:method:: @Override public InetSocketAddress asSocket()
   :outertype: TestAddress

getIp
^^^^^

.. java:method:: @Override public InetAddress getIp()
   :outertype: TestAddress

getPort
^^^^^^^

.. java:method:: @Override public int getPort()
   :outertype: TestAddress

sameHostAs
^^^^^^^^^^

.. java:method:: @Override public boolean sameHostAs(Address other)
   :outertype: TestAddress

toString
^^^^^^^^

.. java:method:: @Override public final String toString()
   :outertype: TestAddress

