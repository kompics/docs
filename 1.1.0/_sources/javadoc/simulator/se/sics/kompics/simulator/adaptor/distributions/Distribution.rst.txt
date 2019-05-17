.. java:import:: java.io Serializable

Distribution
============

.. java:package:: se.sics.kompics.simulator.adaptor.distributions
   :noindex:

.. java:type:: public abstract class Distribution<E extends Number> implements Serializable

   The \ ``Distribution``\  class.

   :author: Cosmin Arad

Constructors
------------
Distribution
^^^^^^^^^^^^

.. java:constructor:: protected Distribution(Type type, Class<E> numberType)
   :outertype: Distribution

Methods
-------
draw
^^^^

.. java:method:: public abstract E draw()
   :outertype: Distribution

getNumberType
^^^^^^^^^^^^^

.. java:method:: public final Class<E> getNumberType()
   :outertype: Distribution

getType
^^^^^^^

.. java:method:: public final Type getType()
   :outertype: Distribution

