.. java:import:: java.lang.ref WeakReference

RequestPathElement
==================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public final class RequestPathElement implements Comparable<RequestPathElement>

Constructors
------------
RequestPathElement
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public RequestPathElement(ChannelCore<?> channel)
   :outertype: RequestPathElement

RequestPathElement
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public RequestPathElement(ComponentCore component)
   :outertype: RequestPathElement

Methods
-------
compareTo
^^^^^^^^^

.. java:method:: @Override public int compareTo(RequestPathElement o)
   :outertype: RequestPathElement

getChannel
^^^^^^^^^^

.. java:method:: public ChannelCore<?> getChannel()
   :outertype: RequestPathElement

getComponent
^^^^^^^^^^^^

.. java:method:: public ComponentCore getComponent()
   :outertype: RequestPathElement

isChannel
^^^^^^^^^

.. java:method:: public boolean isChannel()
   :outertype: RequestPathElement

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: RequestPathElement

