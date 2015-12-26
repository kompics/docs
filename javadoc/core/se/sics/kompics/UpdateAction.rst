.. java:import:: com.google.common.base Optional

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ConfigUpdateFactory

.. java:import:: se.sics.kompics.config ValueMerger

UpdateAction
============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class UpdateAction

   :author: lkroll

Fields
------
DEFAULT
^^^^^^^

.. java:field:: public static final UpdateAction DEFAULT
   :outertype: UpdateAction

downMapper
^^^^^^^^^^

.. java:field:: final Mapper downMapper
   :outertype: UpdateAction

downStrategy
^^^^^^^^^^^^

.. java:field:: final Propagation downStrategy
   :outertype: UpdateAction

merger
^^^^^^

.. java:field:: final Optional<ValueMerger> merger
   :outertype: UpdateAction

selfMapper
^^^^^^^^^^

.. java:field:: final Mapper selfMapper
   :outertype: UpdateAction

selfStrategy
^^^^^^^^^^^^

.. java:field:: final Propagation selfStrategy
   :outertype: UpdateAction

upMapper
^^^^^^^^

.. java:field:: final Mapper upMapper
   :outertype: UpdateAction

upStrategy
^^^^^^^^^^

.. java:field:: final Propagation upStrategy
   :outertype: UpdateAction

Methods
-------
create
^^^^^^

.. java:method:: public static Builder create()
   :outertype: UpdateAction

