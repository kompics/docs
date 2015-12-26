.. java:import:: java.math BigDecimal

.. java:import:: java.math BigInteger

.. java:import:: java.math MathContext

.. java:import:: java.util Random

BigIntegerNormalDistribution
============================

.. java:package:: se.sics.kompics.simulator.adaptor.distributions
   :noindex:

.. java:type:: public class BigIntegerNormalDistribution extends Distribution<BigInteger>

   The \ ``BigIntegerNormalDistribution``\  class.

   :author: Cosmin Arad

Constructors
------------
BigIntegerNormalDistribution
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BigIntegerNormalDistribution(BigInteger mean, BigInteger variance, Random random)
   :outertype: BigIntegerNormalDistribution

Methods
-------
draw
^^^^

.. java:method:: @Override public final BigInteger draw()
   :outertype: BigIntegerNormalDistribution

