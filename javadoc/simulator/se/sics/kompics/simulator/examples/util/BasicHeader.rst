.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Header

.. java:import:: se.sics.kompics.network Transport

BasicHeader
===========

.. java:package:: se.sics.kompics.simulator.examples.util
   :noindex:

.. java:type:: public class BasicHeader<Adr extends Address> implements Header<Adr>

   :author: Alex Ormenisan

Constructors
------------
BasicHeader
^^^^^^^^^^^

.. java:constructor:: public BasicHeader(Adr src, Adr dst, Transport protocol)
   :outertype: BasicHeader

Methods
-------
answer
^^^^^^

.. java:method:: public BasicHeader<Adr> answer()
   :outertype: BasicHeader

getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public Adr getDestination()
   :outertype: BasicHeader

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: BasicHeader

getSource
^^^^^^^^^

.. java:method:: @Override public Adr getSource()
   :outertype: BasicHeader

withDestination
^^^^^^^^^^^^^^^

.. java:method:: public BasicHeader<Adr> withDestination(Adr destination)
   :outertype: BasicHeader

withSource
^^^^^^^^^^

.. java:method:: public BasicHeader<Adr> withSource(Adr source)
   :outertype: BasicHeader

