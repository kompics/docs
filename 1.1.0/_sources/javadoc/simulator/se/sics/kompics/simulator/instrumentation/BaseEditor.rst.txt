.. java:import:: java.security SecureRandom

.. java:import:: java.util Random

.. java:import:: java.util UUID

.. java:import:: javassist CannotCompileException

.. java:import:: javassist CtClass

.. java:import:: javassist NotFoundException

.. java:import:: javassist.expr ExprEditor

.. java:import:: javassist.expr MethodCall

.. java:import:: javassist.expr NewExpr

.. java:import:: org.slf4j Logger

.. java:import:: se.sics.kompics.simulator SimulationScenario

BaseEditor
==========

.. java:package:: se.sics.kompics.simulator.instrumentation
   :noindex:

.. java:type:: public class BaseEditor extends ExprEditor

   The \ ``BaseEditor``\  class.

   :author: Cosmin Arad

Constructors
------------
BaseEditor
^^^^^^^^^^

.. java:constructor:: public BaseEditor(String redirect, boolean allowThreads)
   :outertype: BaseEditor

Methods
-------
edit
^^^^

.. java:method:: @Override public void edit(NewExpr newExpr)
   :outertype: BaseEditor

edit
^^^^

.. java:method:: @Override public void edit(MethodCall m) throws CannotCompileException
   :outertype: BaseEditor

