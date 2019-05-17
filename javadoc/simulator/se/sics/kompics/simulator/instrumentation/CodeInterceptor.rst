.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.util StringTokenizer

.. java:import:: javassist CannotCompileException

.. java:import:: javassist ClassPool

.. java:import:: javassist CtClass

.. java:import:: javassist NotFoundException

.. java:import:: javassist Translator

.. java:import:: se.sics.kompics.simulator.core SimulatorSystem

CodeInterceptor
===============

.. java:package:: se.sics.kompics.simulator.instrumentation
   :noindex:

.. java:type:: public class CodeInterceptor implements Translator

   The \ ``CodeInterceptor``\  class.

   :author: Cosmin Arad

Fields
------
DEFAULT_REDIRECT
^^^^^^^^^^^^^^^^

.. java:field:: public static final String DEFAULT_REDIRECT
   :outertype: CodeInterceptor

Constructors
------------
CodeInterceptor
^^^^^^^^^^^^^^^

.. java:constructor:: public CodeInterceptor(File directory, boolean allowThreads, String redirect)
   :outertype: CodeInterceptor

CodeInterceptor
^^^^^^^^^^^^^^^

.. java:constructor:: public CodeInterceptor(File directory, boolean allowThreads)
   :outertype: CodeInterceptor

Methods
-------
onLoad
^^^^^^

.. java:method:: @Override public void onLoad(ClassPool pool, String classname) throws NotFoundException, CannotCompileException
   :outertype: CodeInterceptor

start
^^^^^

.. java:method:: @Override public void start(ClassPool cp) throws NotFoundException, CannotCompileException
   :outertype: CodeInterceptor

