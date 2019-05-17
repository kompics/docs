Fault
=====

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class Fault implements KompicsEvent

   The \ ``Fault``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
source
^^^^^^

.. java:field:: final ComponentCore source
   :outertype: Fault

Constructors
------------
Fault
^^^^^

.. java:constructor:: public Fault(Throwable throwable, ComponentCore source, KompicsEvent event)
   :outertype: Fault

   Instantiates a new fault.

   :param throwable: the throwable

Methods
-------
getCause
^^^^^^^^

.. java:method:: public Throwable getCause()
   :outertype: Fault

getEvent
^^^^^^^^

.. java:method:: public KompicsEvent getEvent()
   :outertype: Fault

getSource
^^^^^^^^^

.. java:method:: public ComponentDefinition getSource()
   :outertype: Fault

getSourceCore
^^^^^^^^^^^^^

.. java:method:: public Component getSourceCore()
   :outertype: Fault

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Fault

