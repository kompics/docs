.. java:import:: java.util Collection

.. java:import:: java.util Map

Unsafe
======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public abstract class Unsafe

   :author: Lars Kroll <lkroll@kth.se>

Methods
-------
createJavaPort
^^^^^^^^^^^^^^

.. java:method:: public static <P extends PortType> JavaPort<P> createJavaPort(boolean positive, P portType, ComponentCore owner)
   :outertype: Unsafe

getNegativeEvents
^^^^^^^^^^^^^^^^^

.. java:method:: public static Collection<Class<? extends KompicsEvent>> getNegativeEvents(PortType portType)
   :outertype: Unsafe

getNegativePorts
^^^^^^^^^^^^^^^^

.. java:method:: public static Map<Class<? extends PortType>, JavaPort<? extends PortType>> getNegativePorts(Component component)
   :outertype: Unsafe

getOrigin
^^^^^^^^^

.. java:method:: public static Port<?> getOrigin(Direct.Request<? extends Direct.Response> request)
   :outertype: Unsafe

getPositiveEvents
^^^^^^^^^^^^^^^^^

.. java:method:: public static Collection<Class<? extends KompicsEvent>> getPositiveEvents(PortType portType)
   :outertype: Unsafe

getPositivePorts
^^^^^^^^^^^^^^^^

.. java:method:: public static Map<Class<? extends PortType>, JavaPort<? extends PortType>> getPositivePorts(Component component)
   :outertype: Unsafe

setOrigin
^^^^^^^^^

.. java:method:: public static void setOrigin(Direct.Request<? extends Direct.Response> request, Port<?> origin)
   :outertype: Unsafe

