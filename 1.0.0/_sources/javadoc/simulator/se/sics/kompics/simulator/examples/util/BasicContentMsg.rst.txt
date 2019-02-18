.. java:import:: se.sics.kompics PatternExtractor

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Msg

.. java:import:: se.sics.kompics.network Transport

BasicContentMsg
===============

.. java:package:: se.sics.kompics.simulator.examples.util
   :noindex:

.. java:type:: public class BasicContentMsg<A extends Address, H extends BasicHeader<A>, C extends Object> implements Msg<A, BasicHeader<A>>, PatternExtractor<Class<Object>, C>

   :author: Alex Ormenisan

Constructors
------------
BasicContentMsg
^^^^^^^^^^^^^^^

.. java:constructor:: public BasicContentMsg(H header, C content)
   :outertype: BasicContentMsg

Methods
-------
answer
^^^^^^

.. java:method:: public <C2 extends Object> BasicContentMsg<A, H, C2> answer(C2 newContent)
   :outertype: BasicContentMsg

extractPattern
^^^^^^^^^^^^^^

.. java:method:: @Override public Class<Object> extractPattern()
   :outertype: BasicContentMsg

extractValue
^^^^^^^^^^^^

.. java:method:: @Override public C extractValue()
   :outertype: BasicContentMsg

getContent
^^^^^^^^^^

.. java:method:: public C getContent()
   :outertype: BasicContentMsg

getDestination
^^^^^^^^^^^^^^

.. java:method:: @Override public A getDestination()
   :outertype: BasicContentMsg

getHeader
^^^^^^^^^

.. java:method:: @Override public H getHeader()
   :outertype: BasicContentMsg

getProtocol
^^^^^^^^^^^

.. java:method:: @Override public Transport getProtocol()
   :outertype: BasicContentMsg

getSource
^^^^^^^^^

.. java:method:: @Override public A getSource()
   :outertype: BasicContentMsg

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: BasicContentMsg

withHeader
^^^^^^^^^^

.. java:method:: public BasicContentMsg<A, H, C> withHeader(H newHeader)
   :outertype: BasicContentMsg

