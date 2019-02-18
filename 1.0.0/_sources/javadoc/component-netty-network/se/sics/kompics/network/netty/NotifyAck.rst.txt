.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

NotifyAck
=========

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class NotifyAck extends DirectMessage

   :author: lkroll

Fields
------
id
^^

.. java:field:: public final UUID id
   :outertype: NotifyAck

Constructors
------------
NotifyAck
^^^^^^^^^

.. java:constructor:: public NotifyAck(Address src, Address dst, Transport protocol, UUID id)
   :outertype: NotifyAck

Methods
-------
equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: NotifyAck

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: NotifyAck

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: NotifyAck

