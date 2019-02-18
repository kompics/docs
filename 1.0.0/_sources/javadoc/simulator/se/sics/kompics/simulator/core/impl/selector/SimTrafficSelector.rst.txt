.. java:import:: se.sics.kompics ChannelSelector

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Msg

SimTrafficSelector
==================

.. java:package:: se.sics.kompics.simulator.core.impl.selector
   :noindex:

.. java:type:: public class SimTrafficSelector extends ChannelSelector<Msg, Boolean>

   :author: Alex Ormenisan

Constructors
------------
SimTrafficSelector
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimTrafficSelector(Address globalView, boolean positive)
   :outertype: SimTrafficSelector

Methods
-------
getValue
^^^^^^^^

.. java:method:: @Override public Boolean getValue(Msg msg)
   :outertype: SimTrafficSelector

