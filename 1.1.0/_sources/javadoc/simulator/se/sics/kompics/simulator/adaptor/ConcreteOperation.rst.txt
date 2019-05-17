.. java:import:: java.io Serializable

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics.simulator.adaptor.distributions Distribution

ConcreteOperation
=================

.. java:package:: se.sics.kompics.simulator.adaptor
   :noindex:

.. java:type:: public class ConcreteOperation<E extends KompicsEvent, P1 extends Number, P2 extends Number, P3 extends Number, P4 extends Number, P5 extends Number> implements Serializable

   The \ ``ConcreteOperation``\  class.

   :author: Cosmin Arad

Constructors
------------
ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation<E> op)
   :outertype: ConcreteOperation

ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation1<E, P1> op1, Distribution<P1> d1)
   :outertype: ConcreteOperation

ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation2<E, P1, P2> op2, Distribution<P1> d1, Distribution<P2> d2)
   :outertype: ConcreteOperation

ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation3<E, P1, P2, P3> op3, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3)
   :outertype: ConcreteOperation

ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation4<E, P1, P2, P3, P4> op4, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3, Distribution<P4> d4)
   :outertype: ConcreteOperation

ConcreteOperation
^^^^^^^^^^^^^^^^^

.. java:constructor:: public ConcreteOperation(Operation5<E, P1, P2, P3, P4, P5> op5, Distribution<P1> d1, Distribution<P2> d2, Distribution<P3> d3, Distribution<P4> d4, Distribution<P5> d5)
   :outertype: ConcreteOperation

Methods
-------
generate
^^^^^^^^

.. java:method:: public E generate()
   :outertype: ConcreteOperation

