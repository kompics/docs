.. java:import:: java.io Serializable

.. java:import:: se.sics.kompics KompicsEvent

OperationGenerator
==================

.. java:package:: se.sics.kompics.simulator.adaptor
   :noindex:

.. java:type:: public class OperationGenerator implements Serializable

   The \ ``OperationGenerator``\  class.

   :author: Cosmin Arad

Constructors
------------
OperationGenerator
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public OperationGenerator(ConcreteOperation<?, ?, ?, ?, ?, ?> concreteOperation, int count)
   :outertype: OperationGenerator

Methods
-------
generate
^^^^^^^^

.. java:method:: public final KompicsEvent generate()
   :outertype: OperationGenerator

getCount
^^^^^^^^

.. java:method:: public final int getCount()
   :outertype: OperationGenerator

