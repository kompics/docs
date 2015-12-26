.. java:import:: java.util UUID

Component
=========

.. java:package:: se.sics.kompics
   :noindex:

.. java:type:: public interface Component

   The \ ``Component``\  class.

   :author: Cosmin Arad <cosmin@sics.se>, Jim Dowling <jdowling@sics.se>

Methods
-------
control
^^^^^^^

.. java:method:: public Positive<ControlPort> control()
   :outertype: Component

   :return: the component's control port.

escalateFault
^^^^^^^^^^^^^

.. java:method:: public void escalateFault(Fault fault)
   :outertype: Component

getComponent
^^^^^^^^^^^^

.. java:method:: public ComponentDefinition getComponent()
   :outertype: Component

getControl
^^^^^^^^^^

.. java:method:: public Positive<ControlPort> getControl()
   :outertype: Component

   Gets the control.

   :return: the control port

getNegative
^^^^^^^^^^^

.. java:method:: public <P extends PortType> Negative<P> getNegative(Class<P> portType)
   :outertype: Component

   Gets the negative.

   :param portType: the port type
   :return: the negative

getPositive
^^^^^^^^^^^

.. java:method:: public <P extends PortType> Positive<P> getPositive(Class<P> portType)
   :outertype: Component

   Gets the positive.

   :param portType: the port type
   :return: the positive

id
^^

.. java:method:: public UUID id()
   :outertype: Component

provided
^^^^^^^^

.. java:method:: public <P extends PortType> Positive<P> provided(Class<P> portType)
   :outertype: Component

   returns the \ ``portType``\  port provided by the component.

   :param <P>:
   :param portType:

required
^^^^^^^^

.. java:method:: public <P extends PortType> Negative<P> required(Class<P> portType)
   :outertype: Component

   returns the \ ``portType``\  port required by the component.

   :param <P>:
   :param portType:

state
^^^^^

.. java:method:: public State state()
   :outertype: Component

