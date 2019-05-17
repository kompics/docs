.. java:import:: java.math BigDecimal

.. java:import:: java.math BigInteger

.. java:import:: java.math MathContext

.. java:import:: java.util Random

BigIntegerUniformDistribution
=============================

.. java:package:: se.sics.kompics.simulator.adaptor.distributions
   :noindex:

.. java:type:: public class BigIntegerUniformDistribution extends Distribution<BigInteger>

   The \ ``BigIntegerUniformDistribution``\  class.

   :author: Cosmin Arad

Constructors
------------
BigIntegerUniformDistribution
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BigIntegerUniformDistribution(BigInteger min, BigInteger max, Random random)
   :outertype: BigIntegerUniformDistribution

BigIntegerUniformDistribution
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BigIntegerUniformDistribution(int numBits, Random random)
   :outertype: BigIntegerUniformDistribution

Methods
-------
draw
^^^^

.. java:method:: @Override public final BigInteger draw()
   :outertype: BigIntegerUniformDistribution

