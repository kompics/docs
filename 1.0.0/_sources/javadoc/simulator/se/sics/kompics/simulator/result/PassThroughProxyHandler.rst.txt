.. java:import:: java.lang.reflect InvocationHandler

.. java:import:: java.lang.reflect Method

PassThroughProxyHandler
=======================

.. java:package:: se.sics.kompics.simulator.result
   :noindex:

.. java:type::  class PassThroughProxyHandler implements InvocationHandler

   Freely adapted from .

   :author: Lars Kroll

Constructors
------------
PassThroughProxyHandler
^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PassThroughProxyHandler(Object delegate)
   :outertype: PassThroughProxyHandler

Methods
-------
invoke
^^^^^^

.. java:method:: @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
   :outertype: PassThroughProxyHandler

