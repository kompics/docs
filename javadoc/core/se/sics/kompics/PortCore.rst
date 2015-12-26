.. java:import:: java.util List

PortCore
========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class PortCore<P extends PortType> implements Negative<P>, Positive<P>

   The \ ``PortCore``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll

Fields
------
isControlPort
^^^^^^^^^^^^^

.. java:field:: protected boolean isControlPort
   :outertype: PortCore

isPositive
^^^^^^^^^^

.. java:field:: protected boolean isPositive
   :outertype: PortCore

owner
^^^^^

.. java:field:: protected ComponentCore owner
   :outertype: PortCore

portType
^^^^^^^^

.. java:field:: protected P portType
   :outertype: PortCore

Methods
-------
cleanChannels
^^^^^^^^^^^^^

.. java:method:: public abstract void cleanChannels()
   :outertype: PortCore

cleanEvents
^^^^^^^^^^^

.. java:method:: public abstract void cleanEvents()
   :outertype: PortCore

findChannelsTo
^^^^^^^^^^^^^^

.. java:method:: public abstract List<Channel<P>> findChannelsTo(PortCore<P> port)
   :outertype: PortCore

getOwner
^^^^^^^^

.. java:method:: @Override public ComponentCore getOwner()
   :outertype: PortCore

getPortType
^^^^^^^^^^^

.. java:method:: @Override public P getPortType()
   :outertype: PortCore

