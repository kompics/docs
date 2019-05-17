.. java:import:: java.util Optional

.. java:import:: se.sics.kompics.config ConfigUpdate

.. java:import:: se.sics.kompics.config ConfigUpdateFactory

.. java:import:: se.sics.kompics.config ValueMerger

UpdateAction
============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public class UpdateAction

   :author: Lars Kroll <lkroll@kth.se>

Fields
------
DEFAULT
^^^^^^^

.. java:field:: public static final UpdateAction DEFAULT
   :outertype: UpdateAction

downMapper
^^^^^^^^^^

.. java:field:: public final Mapper downMapper
   :outertype: UpdateAction

downStrategy
^^^^^^^^^^^^

.. java:field:: public final Propagation downStrategy
   :outertype: UpdateAction

merger
^^^^^^

.. java:field:: public final Optional<ValueMerger> merger
   :outertype: UpdateAction

selfMapper
^^^^^^^^^^

.. java:field:: public final Mapper selfMapper
   :outertype: UpdateAction

selfStrategy
^^^^^^^^^^^^

.. java:field:: public final Propagation selfStrategy
   :outertype: UpdateAction

upMapper
^^^^^^^^

.. java:field:: public final Mapper upMapper
   :outertype: UpdateAction

upStrategy
^^^^^^^^^^

.. java:field:: public final Propagation upStrategy
   :outertype: UpdateAction

Methods
-------
create
^^^^^^

.. java:method:: public static Builder create()
   :outertype: UpdateAction

