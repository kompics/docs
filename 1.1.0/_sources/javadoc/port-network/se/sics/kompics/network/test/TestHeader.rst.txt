.. java:import:: java.io Serializable

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Transport

TestHeader
==========

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public class TestHeader implements Header<TestAddress>, Serializable

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
dst
^^^

.. java:field:: public final TestAddress dst
   :outertype: TestHeader

proto
^^^^^

.. java:field:: public final Transport proto
   :outertype: TestHeader

src
^^^

.. java:field:: public final TestAddress src
   :outertype: TestHeader

Constructors
------------
TestHeader
^^^^^^^^^^

.. java:constructor:: public TestHeader(TestAddress src, TestAddress dst, Transport proto)
   :outertype: TestHeader

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public TestAddress getDestination()
   :outertype: TestHeader

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: TestHeader

getSource
^^^^^^^^^

.. java:method:: @Override public TestAddress getSource()
   :outertype: TestHeader

