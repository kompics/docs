.. java:import:: se.sics.kompics ChannelSelector

.. java:import:: se.sics.kompics.network Msg

DestinationHostSelector
=======================

.. java:package:: se.sics.kompics.simulator.network.identifier
   :noindex:

.. java:type:: public class DestinationHostSelector extends ChannelSelector<Msg, Identifier>

   :author: Alex Ormenisan

Constructors
------------
DestinationHostSelector
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public DestinationHostSelector(Identifier hostId, IdentifierExtractor sIdE, boolean positive)
   :outertype: DestinationHostSelector

Methods
-------
getValue
^^^^^^^^

.. java:method:: @Override public Identifier getValue(Msg msg)
   :outertype: DestinationHostSelector

