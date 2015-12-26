.. java:import:: java.lang.reflect Constructor

.. java:import:: java.lang.reflect InvocationTargetException

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Component.State

.. java:import:: se.sics.kompics Fault.ResolveAction

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config TypesafeConfig

.. java:import:: se.sics.kompics.scheduler ThreadPoolScheduler

.. java:import:: se.sics.kompics.scheduler WorkStealingScheduler

Kompics
=======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public final class Kompics

   The \ ``Kompics``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Fields
------
SHUTDOWN_TIMEOUT
^^^^^^^^^^^^^^^^

.. java:field:: public static final long SHUTDOWN_TIMEOUT
   :outertype: Kompics

logger
^^^^^^

.. java:field:: public static Logger logger
   :outertype: Kompics

maxNumOfExecutedEvents
^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static AtomicInteger maxNumOfExecutedEvents
   :outertype: Kompics

Methods
-------
createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static void createAndStart(Class<? extends ComponentDefinition> main)
   :outertype: Kompics

   Creates the and start.

   :param main: the main

createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static void createAndStart(Class<? extends ComponentDefinition> main, Init initEvent)
   :outertype: Kompics

createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static void createAndStart(Class<? extends ComponentDefinition> main, int workers)
   :outertype: Kompics

   Creates the and start.

   :param main: the main
   :param workers: the workers

createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static void createAndStart(Class<? extends ComponentDefinition> main, Init initEvent, int workers)
   :outertype: Kompics

createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static void createAndStart(Class<? extends ComponentDefinition> main, int workers, int maxEventExecuteNumber)
   :outertype: Kompics

createAndStart
^^^^^^^^^^^^^^

.. java:method:: public static <T extends ComponentDefinition> void createAndStart(Class<T> main, Init initEvent, int workers, int maxEventExecuteNumber)
   :outertype: Kompics

   Creates the main component and starts it.

   :param <T>:
   :param main: the main
   :param initEvent:
   :param workers: the workers
   :param maxEventExecuteNumber:

forceShutdown
^^^^^^^^^^^^^

.. java:method:: public static void forceShutdown()
   :outertype: Kompics

getConfig
^^^^^^^^^

.. java:method:: public static Config getConfig()
   :outertype: Kompics

getFaultHandler
^^^^^^^^^^^^^^^

.. java:method:: public static FaultHandler getFaultHandler()
   :outertype: Kompics

getScheduler
^^^^^^^^^^^^

.. java:method:: public static Scheduler getScheduler()
   :outertype: Kompics

handleFault
^^^^^^^^^^^

.. java:method:: static void handleFault(Fault f)
   :outertype: Kompics

isOn
^^^^

.. java:method:: public static boolean isOn()
   :outertype: Kompics

logStats
^^^^^^^^

.. java:method:: public static void logStats()
   :outertype: Kompics

   Log stats.

resetConfig
^^^^^^^^^^^

.. java:method:: public static void resetConfig()
   :outertype: Kompics

resetFaultHandler
^^^^^^^^^^^^^^^^^

.. java:method:: public static void resetFaultHandler()
   :outertype: Kompics

setConfig
^^^^^^^^^

.. java:method:: public static void setConfig(Config conf)
   :outertype: Kompics

setFaultHandler
^^^^^^^^^^^^^^^

.. java:method:: public static void setFaultHandler(FaultHandler fh)
   :outertype: Kompics

setScheduler
^^^^^^^^^^^^

.. java:method:: public static void setScheduler(Scheduler sched)
   :outertype: Kompics

shutdown
^^^^^^^^

.. java:method:: public static void shutdown()
   :outertype: Kompics

waitForTermination
^^^^^^^^^^^^^^^^^^

.. java:method:: public static void waitForTermination() throws InterruptedException
   :outertype: Kompics

