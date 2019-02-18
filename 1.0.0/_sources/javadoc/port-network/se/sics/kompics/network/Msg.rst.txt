.. java:import:: se.sics.kompics KompicsEvent

Msg
===

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public interface Msg<Adr extends Address, H extends Header<Adr>> extends KompicsEvent

   :author: lkroll

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: @Deprecated public Adr getDestination()
   :outertype: Msg

getHeader
^^^^^^^^^

.. java:method:: public H getHeader()
   :outertype: Msg

getProtocol
^^^^^^^^^^^

.. java:method:: @Deprecated public Transport getProtocol()
   :outertype: Msg

getSource
^^^^^^^^^

.. java:method:: @Deprecated public Adr getSource()
   :outertype: Msg

   Fields forwarded from Header for backwards compatibility

