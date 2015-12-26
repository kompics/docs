Channel
=======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface Channel<P extends PortType>

   The \ ``Channel``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
ONE_WAY_NEG
^^^^^^^^^^^

.. java:field:: public static ChannelFactory ONE_WAY_NEG
   :outertype: Channel

ONE_WAY_POS
^^^^^^^^^^^

.. java:field:: public static ChannelFactory ONE_WAY_POS
   :outertype: Channel

TWO_WAY
^^^^^^^

.. java:field:: public static ChannelFactory TWO_WAY
   :outertype: Channel

Methods
-------
disconnect
^^^^^^^^^^

.. java:method:: public void disconnect()
   :outertype: Channel

getPortType
^^^^^^^^^^^

.. java:method:: public P getPortType()
   :outertype: Channel

   Gets the port type.

   :return: the port type

