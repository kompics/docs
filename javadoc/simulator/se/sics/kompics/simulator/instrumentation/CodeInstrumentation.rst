.. java:import:: com.typesafe.config Config

.. java:import:: com.typesafe.config ConfigException

.. java:import:: com.typesafe.config ConfigFactory

.. java:import:: java.util HashSet

.. java:import:: java.util Set

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics.simulator.core.impl P2pSimulator

CodeInstrumentation
===================

.. java:package:: se.sics.kompics.simulator.instrumentation
   :noindex:

.. java:type:: public class CodeInstrumentation

   :author: Alex Ormenisan

Fields
------
INSTRUMENTATION_LOG
^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final Logger INSTRUMENTATION_LOG
   :outertype: CodeInstrumentation

INTERCEPTOR_EXCEPTIONS
^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String INTERCEPTOR_EXCEPTIONS
   :outertype: CodeInstrumentation

instrumentationExceptedClass
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final Set<String> instrumentationExceptedClass
   :outertype: CodeInstrumentation

Methods
-------
knownInterceptorExceptions
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static Set<String> knownInterceptorExceptions()
   :outertype: CodeInstrumentation

readInterceptorExceptionsFromTypesafeConfig
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static Set<String> readInterceptorExceptionsFromTypesafeConfig()
   :outertype: CodeInstrumentation

