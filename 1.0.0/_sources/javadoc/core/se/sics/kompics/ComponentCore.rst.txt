.. java:import:: com.google.common.base Optional

.. java:import:: java.util LinkedList

.. java:import:: java.util List

.. java:import:: java.util UUID

.. java:import:: java.util.concurrent ForkJoinTask

.. java:import:: java.util.concurrent.atomic AtomicInteger

.. java:import:: java.util.concurrent.locks ReentrantReadWriteLock

.. java:import:: org.slf4j Logger

.. java:import:: se.sics.kompics.config Config

.. java:import:: se.sics.kompics.config ConfigUpdate

ComponentCore
=============

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class ComponentCore extends ForkJoinTask<Void> implements Component

   The \ ``ComponentCore``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>, Lars Kroll <lkroll@kth.se>

Fields
------
childUpdate
^^^^^^^^^^^

.. java:field:: public static final ThreadLocal<Optional<ConfigUpdate>> childUpdate
   :outertype: ComponentCore

children
^^^^^^^^

.. java:field:: protected List<ComponentCore> children
   :outertype: ComponentCore

childrenLock
^^^^^^^^^^^^

.. java:field:: protected final ReentrantReadWriteLock childrenLock
   :outertype: ComponentCore

conf
^^^^

.. java:field:: protected Config conf
   :outertype: ComponentCore

parent
^^^^^^

.. java:field:: protected ComponentCore parent
   :outertype: ComponentCore

parentThreadLocal
^^^^^^^^^^^^^^^^^

.. java:field:: public static final ThreadLocal<ComponentCore> parentThreadLocal
   :outertype: ComponentCore

readyPorts
^^^^^^^^^^

.. java:field:: protected SpinlockQueue<PortCore<?>> readyPorts
   :outertype: ComponentCore

scheduler
^^^^^^^^^

.. java:field:: protected Scheduler scheduler
   :outertype: ComponentCore

state
^^^^^

.. java:field:: protected volatile Component.State state
   :outertype: ComponentCore

wid
^^^

.. java:field:: protected int wid
   :outertype: ComponentCore

workCount
^^^^^^^^^

.. java:field:: public AtomicInteger workCount
   :outertype: ComponentCore

Methods
-------
cleanPorts
^^^^^^^^^^

.. java:method:: protected abstract void cleanPorts()
   :outertype: ComponentCore

config
^^^^^^

.. java:method:: public Config config()
   :outertype: ComponentCore

createControlPort
^^^^^^^^^^^^^^^^^

.. java:method:: public abstract Negative<ControlPort> createControlPort()
   :outertype: ComponentCore

createNegativePort
^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract <P extends PortType> Negative<P> createNegativePort(Class<P> portType)
   :outertype: ComponentCore

createPositivePort
^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract <P extends PortType> Positive<P> createPositivePort(Class<P> portType)
   :outertype: ComponentCore

destroyTree
^^^^^^^^^^^

.. java:method:: protected void destroyTree(ComponentCore child)
   :outertype: ComponentCore

destroyTreeAtParentOf
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected void destroyTreeAtParentOf(ComponentCore source)
   :outertype: ComponentCore

doConfigUpdate
^^^^^^^^^^^^^^

.. java:method:: abstract void doConfigUpdate(ConfigUpdate update)
   :outertype: ComponentCore

doCreate
^^^^^^^^

.. java:method:: public abstract <T extends ComponentDefinition> Component doCreate(Class<T> definition, Optional<Init<T>> initEvent)
   :outertype: ComponentCore

doCreate
^^^^^^^^

.. java:method:: public abstract <T extends ComponentDefinition> Component doCreate(Class<T> definition, Optional<Init<T>> initEvent, Optional<ConfigUpdate> update)
   :outertype: ComponentCore

doDestroy
^^^^^^^^^

.. java:method:: protected void doDestroy(Component component)
   :outertype: ComponentCore

equals
^^^^^^

.. java:method:: @Override public boolean equals(Object obj)
   :outertype: ComponentCore

escalateFaultToKompics
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected void escalateFaultToKompics(Fault fault)
   :outertype: ComponentCore

eventReceived
^^^^^^^^^^^^^

.. java:method:: public void eventReceived(PortCore<?> port, KompicsEvent event, int wid)
   :outertype: ComponentCore

exec
^^^^

.. java:method:: @Override protected boolean exec()
   :outertype: ComponentCore

execute
^^^^^^^

.. java:method:: public abstract void execute(int wid)
   :outertype: ComponentCore

getParent
^^^^^^^^^

.. java:method:: public ComponentCore getParent()
   :outertype: ComponentCore

getRawResult
^^^^^^^^^^^^

.. java:method:: @Override public Void getRawResult()
   :outertype: ComponentCore

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: ComponentCore

id
^^

.. java:method:: @Override public UUID id()
   :outertype: ComponentCore

logger
^^^^^^

.. java:method:: protected abstract Logger logger()
   :outertype: ComponentCore

markSubtreeAs
^^^^^^^^^^^^^

.. java:method:: protected void markSubtreeAs(State s)
   :outertype: ComponentCore

markSubtreeAtAs
^^^^^^^^^^^^^^^

.. java:method:: protected void markSubtreeAtAs(ComponentCore source, State s)
   :outertype: ComponentCore

run
^^^

.. java:method:: @Override public void run()
   :outertype: ComponentCore

schedule
^^^^^^^^

.. java:method:: protected void schedule(int wid)
   :outertype: ComponentCore

setInactive
^^^^^^^^^^^

.. java:method:: protected abstract void setInactive(Component child)
   :outertype: ComponentCore

setRawResult
^^^^^^^^^^^^

.. java:method:: @Override protected void setRawResult(Void value)
   :outertype: ComponentCore

setScheduler
^^^^^^^^^^^^

.. java:method:: public void setScheduler(Scheduler scheduler)
   :outertype: ComponentCore

   Sets the scheduler.

   :param scheduler: the new scheduler

state
^^^^^

.. java:method:: @Override public Component.State state()
   :outertype: ComponentCore

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: ComponentCore

