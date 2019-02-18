.. java:import:: java.util ArrayDeque

Response
========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: @Deprecated public abstract class Response implements KompicsEvent

   The \ ``Response``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Constructors
------------
Response
^^^^^^^^

.. java:constructor:: protected Response(Request request)
   :outertype: Response

   Instantiates a new response.

   :param request: the request

Methods
-------
clone
^^^^^

.. java:method:: @Override public Object clone() throws CloneNotSupportedException
   :outertype: Response

getTopPathElement
^^^^^^^^^^^^^^^^^

.. java:method:: public RequestPathElement getTopPathElement()
   :outertype: Response

