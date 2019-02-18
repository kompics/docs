.. java:import:: se.sics.kompics KompicsEvent

Future
======

.. java:package:: se.sics.kompics.testing
   :noindex:

.. java:type:: public abstract class Future<RQ extends KompicsEvent, RS extends KompicsEvent>

Methods
-------
equals
^^^^^^

.. java:method:: @Override public final boolean equals(Object o)
   :outertype: Future

get
^^^

.. java:method:: public abstract RS get()
   :outertype: Future

   Returns a response event if future instance has previously been successfully set via call to \ :java:ref:`set(KompicsEvent)`\ . Otherwise null should be returned.

   :return: response event

hashCode
^^^^^^^^

.. java:method:: @Override public final int hashCode()
   :outertype: Future

set
^^^

.. java:method:: public abstract boolean set(RQ request)
   :outertype: Future

   Sets the future instance if the specified request is matched.

   :param request: request event.
   :return: true iff request was matched.

