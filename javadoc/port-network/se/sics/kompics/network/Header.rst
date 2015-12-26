Header
======

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public interface Header<Adr extends Address>

   :author: lkroll

Methods
-------
getDestination
^^^^^^^^^^^^^^

.. java:method:: public Adr getDestination()
   :outertype: Header

   Where is the message supposed to go.

getProtocol
^^^^^^^^^^^

.. java:method:: public Transport getProtocol()
   :outertype: Header

   What protocol should be used to send the message. Note that not all network implementations have to implement all the available protocols.

getSource
^^^^^^^^^

.. java:method:: public Adr getSource()
   :outertype: Header

   Where does the message come from.

