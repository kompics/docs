.. java:import:: se.sics.kompics.network Address

.. java:import:: se.sics.kompics.network Transport

DisambiguateConnection
======================

.. java:package:: se.sics.kompics.network.netty
   :noindex:

.. java:type:: public class DisambiguateConnection extends DirectMessage

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
reply
^^^^^

.. java:field:: public final boolean reply
   :outertype: DisambiguateConnection

udtPort
^^^^^^^

.. java:field:: public final int udtPort
   :outertype: DisambiguateConnection

Constructors
------------
DisambiguateConnection
^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public DisambiguateConnection(Address src, Address dst, Transport protocol, int udtPort, boolean reply)
   :outertype: DisambiguateConnection

Methods
-------
equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: DisambiguateConnection

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: DisambiguateConnection

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: DisambiguateConnection

