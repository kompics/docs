.. java:import:: java.util HashMap

.. java:import:: java.util UUID

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Handler

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics.timer CancelPeriodicTimeout

.. java:import:: se.sics.kompics.timer CancelTimeout

.. java:import:: se.sics.kompics.timer SchedulePeriodicTimeout

.. java:import:: se.sics.kompics.timer ScheduleTimeout

.. java:import:: se.sics.kompics.timer Timeout

.. java:import:: se.sics.kompics.timer Timer

JavaTimer
=========

.. java:package:: se.sics.kompics.timer.java
   :noindex:

.. java:type:: public final class JavaTimer extends ComponentDefinition

   The \ ``JavaTimer``\  class.

   :author: Cosmin Arad , Jim Dowling

Fields
------
handleCPT
^^^^^^^^^

.. java:field::  Handler<CancelPeriodicTimeout> handleCPT
   :outertype: JavaTimer

handleCT
^^^^^^^^

.. java:field::  Handler<CancelTimeout> handleCT
   :outertype: JavaTimer

handleSPT
^^^^^^^^^

.. java:field::  Handler<SchedulePeriodicTimeout> handleSPT
   :outertype: JavaTimer

handleST
^^^^^^^^

.. java:field::  Handler<ScheduleTimeout> handleST
   :outertype: JavaTimer

logger
^^^^^^

.. java:field:: static final Logger logger
   :outertype: JavaTimer

timer
^^^^^

.. java:field::  Negative<Timer> timer
   :outertype: JavaTimer

Constructors
------------
JavaTimer
^^^^^^^^^

.. java:constructor:: public JavaTimer()
   :outertype: JavaTimer

   Instantiates a new java timer.

Methods
-------
periodicTimeout
^^^^^^^^^^^^^^^

.. java:method:: final void periodicTimeout(Timeout timeout)
   :outertype: JavaTimer

   Periodic timeout.

   :param timeout: the timeout

timeout
^^^^^^^

.. java:method:: final void timeout(UUID timerId, Timeout timeout)
   :outertype: JavaTimer

   Timeout.

   :param timerId: the timer id
   :param timeout: the timeout

