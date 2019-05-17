.. java:import:: java.net InetAddress

.. java:import:: java.net InetSocketAddress

Address
=======

.. java:package:: se.sics.kompics.network
   :noindex:

.. java:type:: public interface Address

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
asSocket
^^^^^^^^

.. java:method:: public InetSocketAddress asSocket()
   :outertype: Address

   Get this address as InetSocketAddress. This is used for lookups within network implementation, so it better be fast. Preferably no new object creation should happen as part of this call.

   :return: ip+port of this address.

getIp
^^^^^

.. java:method:: public InetAddress getIp()
   :outertype: Address

   :return: the IP address part of this object

getPort
^^^^^^^

.. java:method:: public int getPort()
   :outertype: Address

   :return: the port part of this object

sameHostAs
^^^^^^^^^^

.. java:method:: public boolean sameHostAs(Address other)
   :outertype: Address

   Compares only the ip+port part of the address for equality. This is used to decide whether or not to reflect messages back up without serialising. Most likely the same as "this.asSocket().equals(other.asSocket())".

   :param other:

