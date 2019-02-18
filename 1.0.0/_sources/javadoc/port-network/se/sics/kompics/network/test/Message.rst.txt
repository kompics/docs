.. java:import:: java.io Serializable

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

Message
=======

.. java:package:: se.sics.kompics.network.test
   :noindex:

.. java:type:: public class Message implements Msg<TestAddress, TestHeader>, Serializable

   :author: lkroll

Fields
------
header
^^^^^^

.. java:field:: public final TestHeader header
   :outertype: Message

Constructors
------------
Message
^^^^^^^

.. java:constructor:: public Message(TestAddress src, TestAddress dst, Transport proto)
   :outertype: Message

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public TestAddress getDestination()
   :outertype: Message

getHeader
^^^^^^^^^

.. java:method:: @Override public TestHeader getHeader()
   :outertype: Message

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: Message

getSource
^^^^^^^^^

.. java:method:: @Override public TestAddress getSource()
   :outertype: Message

