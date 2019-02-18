.. java:import:: java.util ArrayDeque

Request
=======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @Deprecated public abstract class Request implements KompicsEvent

   The \ ``Request``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
requestPath
^^^^^^^^^^^

.. java:field::  ArrayDeque<RequestPathElement> requestPath
   :outertype: Request

Methods
-------
clone
^^^^^

.. java:method:: @Override public Object clone() throws CloneNotSupportedException
   :outertype: Request

pushPathElement
^^^^^^^^^^^^^^^

.. java:method:: public void pushPathElement(ChannelCore<?> channel)
   :outertype: Request

pushPathElement
^^^^^^^^^^^^^^^

.. java:method:: public void pushPathElement(ComponentCore component)
   :outertype: Request

