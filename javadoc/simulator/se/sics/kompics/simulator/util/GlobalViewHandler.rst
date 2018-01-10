.. java:import:: se.sics.kompics ClassMatchedHandler

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics PatternExtractor

.. java:import:: se.sics.kompics.network Msg

GlobalViewHandler
=================

.. java:package:: se.sics.kompics.simulator.util
   :noindex:

.. java:type:: public abstract class GlobalViewHandler<E extends KompicsEvent, M extends Msg & PatternExtractor<Class<Object>, E>> extends ClassMatchedHandler<E, M>

   :author: Alex Ormenisan

Methods
-------
handle
^^^^^^

.. java:method:: @Override public final void handle(E content, M container)
   :outertype: GlobalViewHandler

handle
^^^^^^

.. java:method:: public abstract void handle(E content, M container, GlobalView simContext)
   :outertype: GlobalViewHandler

setSimulationContext
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSimulationContext(GlobalView simContext)
   :outertype: GlobalViewHandler

