.. java:import:: java.util Random

IntegerUniformDistribution
==========================

.. java:package:: se.sics.kompics.simulator.adaptor.distributions
   :noindex:

.. java:type:: @SuppressWarnings public class IntegerUniformDistribution extends Distribution<Integer>

   :author: Alex Ormenisan

Constructors
------------
IntegerUniformDistribution
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public IntegerUniformDistribution(int min, int max, Random rand)
   :outertype: IntegerUniformDistribution

   :param min: closed interval - included
   :param max: open interval - excluded

Methods
-------
draw
^^^^

.. java:method:: @Override public Integer draw()
   :outertype: IntegerUniformDistribution

