.. java:import:: com.google.common.base Optional

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ConfigUpdateFactory

.. java:import:: se.sics.kompics.config ValueMerger

UpdateAction.Builder
====================

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public static class Builder
   :outertype: UpdateAction

Methods
-------
customMergeWith
^^^^^^^^^^^^^^^

.. java:method:: public void customMergeWith(ValueMerger merger)
   :outertype: UpdateAction.Builder

finalise
^^^^^^^^

.. java:method:: public UpdateAction finalise()
   :outertype: UpdateAction.Builder

mapDown
^^^^^^^

.. java:method:: public void mapDown(Mapper mapper)
   :outertype: UpdateAction.Builder

mapSelf
^^^^^^^

.. java:method:: public void mapSelf(Mapper mapper)
   :outertype: UpdateAction.Builder

mapUp
^^^^^

.. java:method:: public void mapUp(Mapper mapper)
   :outertype: UpdateAction.Builder

originalDown
^^^^^^^^^^^^

.. java:method:: public void originalDown()
   :outertype: UpdateAction.Builder

originalSelf
^^^^^^^^^^^^

.. java:method:: public void originalSelf()
   :outertype: UpdateAction.Builder

originalUp
^^^^^^^^^^

.. java:method:: public void originalUp()
   :outertype: UpdateAction.Builder

swallowDown
^^^^^^^^^^^

.. java:method:: public void swallowDown()
   :outertype: UpdateAction.Builder

swallowSelf
^^^^^^^^^^^

.. java:method:: public void swallowSelf()
   :outertype: UpdateAction.Builder

swallowUp
^^^^^^^^^

.. java:method:: public void swallowUp()
   :outertype: UpdateAction.Builder

