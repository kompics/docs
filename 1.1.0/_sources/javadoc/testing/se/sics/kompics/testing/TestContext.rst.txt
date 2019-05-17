.. java:import:: com.google.common.base Function

.. java:import:: com.google.common.base Preconditions

.. java:import:: com.google.common.base Predicate

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: se.sics.kompics Channel

.. java:import:: se.sics.kompics ChannelFactory

.. java:import:: se.sics.kompics Component

.. java:import:: se.sics.kompics ComponentCore

.. java:import:: se.sics.kompics ComponentDefinition

.. java:import:: se.sics.kompics Init

.. java:import:: se.sics.kompics Kompics

.. java:import:: se.sics.kompics KompicsEvent

.. java:import:: se.sics.kompics Negative

.. java:import:: se.sics.kompics Port

.. java:import:: se.sics.kompics PortCore

.. java:import:: se.sics.kompics PortType

.. java:import:: se.sics.kompics Positive

.. java:import:: se.sics.kompics Scheduler

.. java:import:: se.sics.kompics Start

.. java:import:: se.sics.kompics.scheduler ThreadPoolScheduler

.. java:import:: java.util Comparator

TestContext
===========

.. java:package:: se.sics.kompics.testing
   :noindex:

.. java:type:: public class TestContext<T extends ComponentDefinition>

   :author: Ifeanyi Ubah
   :param <T>: the ComponentDefinition to test

Fields
------
logger
^^^^^^

.. java:field:: static final Logger logger
   :outertype: TestContext

timeout
^^^^^^^

.. java:field:: public static final long timeout
   :outertype: TestContext

   Timeout value in milliseconds - Default 400ms

Methods
-------
allow
^^^^^

.. java:method:: public <P extends PortType> TestContext<T> allow(KompicsEvent event, Port<P> port, Direction direction)
   :outertype: TestContext

   Whitelist the specified event within the current block. This means that if an event matching the specified one occurs at any position within the block then that event is handled normally. However such events are not necessary for a successful testcase.

   Modes - \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param event: event to be matched against.
   :param port: port on which the matched event should occur.
   :param direction: Direction IN or OUT of the event.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\

allow
^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> allow(Class<E> eventType, Predicate<E> predicate, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`allow(KompicsEvent,Port,Direction)`\ . Matches events only if predicate returns true instead.

allow
^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> allow(Class<E> eventType, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`allow(KompicsEvent,Port,Direction)`\ . Matches events by class instead.

answerRequest
^^^^^^^^^^^^^

.. java:method:: public <RQ extends KompicsEvent, RS extends KompicsEvent> TestContext<T> answerRequest(Class<RQ> requestType, Port<? extends PortType> requestPort, Function<RQ, RS> mapper, Port<? extends PortType> responsePort)
   :outertype: TestContext

   Match an outgoing message on the specified requestPort as a request message by calling the provided mapper function with it as an argument. If mapper returns null, then the match fails otherwise the returned message is treated as a response and triggered on responsePort.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`ANSWER_REQUEST <MODE.ANSWER_REQUEST>`\ .

   If used in \ :java:ref:`ANSWER_REQUEST <MODE.ANSWER_REQUEST>`\  mode then the responses are triggered only when all requests have been matched. If in \ :java:ref:`UNORDERED <MODE.UNORDERED>`\  this can be \ :java:ref:`configured <unordered(boolean)>`\ . Otherwise responses are triggered immediately.

   :param requestType: events of this class are treated as requests.
   :param requestPort: port on which to expect request events.
   :param mapper: mapper function from a matched request message to a response message otherwise null.
   :param responsePort: port on which to trigger a response message.
   :param <RQ>: request type.
   :param <RS>: response type.
   :return: current \ :java:ref:`TestContext`\ .

answerRequest
^^^^^^^^^^^^^

.. java:method:: public <RQ extends KompicsEvent, RS extends KompicsEvent> TestContext<T> answerRequest(Class<RQ> requestType, Port<? extends PortType> requestPort, Future<RQ, RS> future)
   :outertype: TestContext

   Match an outgoing message on the specified requestPort as a request message by calling the provided \ :java:ref:`Future.set(KompicsEvent)`\  method of future with an observed event as an argument. If future returns true, then the match succeeded and a response should have been generated such that a subsequent call to \ :java:ref:`Future.get()`\  returns it instead of null. This response can later be used in a call to \ :java:ref:`trigger(Future,Port)`\ .

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`ANSWER_REQUEST <MODE.ANSWER_REQUEST>`\ .

   :param requestType: events of this class are treated as requests.
   :param requestPort: port on which to expect request events.
   :param future: future to match a request and set a response.
   :param <RQ>: request type.
   :param <RS>: response type.
   :return: current \ :java:ref:`TestContext`\ .

answerRequests
^^^^^^^^^^^^^^

.. java:method:: public TestContext<T> answerRequests()
   :outertype: TestContext

   Enters \ :java:ref:`ANSWER_REQUEST <MODE.ANSWER_REQUEST>`\  mode. In this mode, only method \ :java:ref:`answerRequest(Class,Port,Function,Port)`\  can be used. Responses are triggered in their received order, only when all requests have been received.

   Allowed modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :return: current \ :java:ref:`TestContext`\ .

blockExpect
^^^^^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> blockExpect(KompicsEvent event, Port<P> port, Direction direction)
   :outertype: TestContext

   Match the occurrence of the specified event at any position within the sequence of the current block. If the specified event does not occur after executing the last statement of the block, the test case fails on timeout.

   Modes - \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param event: expected event to match
   :param port: port on which event should occur.
   :param direction: Direction IN or OUT.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\

blockExpect
^^^^^^^^^^^

.. java:method:: public <P extends PortType, E extends KompicsEvent> TestContext<T> blockExpect(Class<E> eventType, Predicate<E> pred, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`blockExpect(KompicsEvent,Port,Direction)`\ . Matches the expected event with the specified predicate.

blockExpect
^^^^^^^^^^^

.. java:method:: public <P extends PortType, E extends KompicsEvent> TestContext<T> blockExpect(Class<E> eventType, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`blockExpect(KompicsEvent,Port,Direction)`\ . Event of the specified class is matched.

body
^^^^

.. java:method:: public TestContext<T> body()
   :outertype: TestContext

   Begin the body of a block.

   Modes - \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :return: current \ :java:ref:`TestContext`\ .

check
^^^^^

.. java:method:: public boolean check()
   :outertype: TestContext

   Run the specified testcase

   :return: true if observed event sequence conforms to testcase otherwise false.

   Allowed modes - \ :java:ref:`BODY <MODE.BODY>`\ .

connect
^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> connect(Negative<P> negative, Positive<P> positive)
   :outertype: TestContext

   Equivalent to connect(negative, positive, \ :java:ref:`Channel.TWO_WAY`\ ).

connect
^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> connect(Positive<P> positive, Negative<P> negative)
   :outertype: TestContext

   Equivalent to connect(positive, negative, \ :java:ref:`Channel.TWO_WAY`\ ).

connect
^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> connect(Negative<P> negative, Positive<P> positive, ChannelFactory factory)
   :outertype: TestContext

   Equivalent to connect(positive, negative, factory).

connect
^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> connect(Positive<P> positive, Negative<P> negative, ChannelFactory factory)
   :outertype: TestContext

   Connects two ports with the specified \ :java:ref:`ChannelFactory`\ .

   Modes - setup \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param negative: \ :java:ref:`Negative`\  port.
   :param positive: \ :java:ref:`Positive`\  port.
   :param factory: \ :java:ref:`ChannelFactory`\  to connect ports.
   :param <P>: \ :java:ref:`PortType`\ .
   :return: current \ :java:ref:`TestContext`\ .

create
^^^^^^

.. java:method:: public <T extends ComponentDefinition> Component create(Class<T> componentDefinition, Init<T> init)
   :outertype: TestContext

   Create a new component as a dependency.

   Modes - setup \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param componentDefinition: \ :java:ref:`ComponentDefinition`\  class of dependency.
   :param init: \ :java:ref:`Init`\  to instantiate componentDefinition
   :param <T>: \ :java:ref:`ComponentDefinition`\  type
   :return: created \ :java:ref:`Component`\

create
^^^^^^

.. java:method:: public <T extends ComponentDefinition> Component create(Class<T> componentDefinition)
   :outertype: TestContext

   Equivalent to create(componentDefinition, Init.NONE)

create
^^^^^^

.. java:method:: public <T extends ComponentDefinition> Component create(Class<T> componentDefinition, Init.None init)
   :outertype: TestContext

   Create a new component as a dependency.

   Modes - setup \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param componentDefinition: \ :java:ref:`ComponentDefinition`\  class of dependency.
   :param init: \ :java:ref:`Init`\  to instantiate componentDefinition
   :param <T>: \ :java:ref:`ComponentDefinition`\  type
   :return: created \ :java:ref:`Component`\

disallow
^^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> disallow(KompicsEvent event, Port<P> port, Direction direction)
   :outertype: TestContext

   Blacklist the specified event within the current block. This means that if an event matching the specified one occurs at any position within the block then the test case fails.

   Modes - \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param event: event to be matched against.
   :param port: port on which the matched event should occur.
   :param direction: Direction IN or OUT of the event.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\

disallow
^^^^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> disallow(Class<E> eventType, Predicate<E> predicate, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`disallow(KompicsEvent,Port,Direction)`\ . Matches events only if predicate returns true instead.

disallow
^^^^^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> disallow(Class<E> eventType, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`disallow(KompicsEvent,Port,Direction)`\ . Matches event by class instead.

drop
^^^^

.. java:method:: public <P extends PortType> TestContext<T> drop(KompicsEvent event, Port<P> port, Direction direction)
   :outertype: TestContext

   Drops the specified event within the current block. This means that if an event matching the specified one occurs at any position within the block then that message of that event is not forwarded to the recipient(s).

   Modes - \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param event: event to be matched against.
   :param port: port on which the matched event should occur.
   :param direction: Direction IN or OUT of the event.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\

drop
^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> drop(Class<E> eventType, Predicate<E> predicate, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`drop(KompicsEvent,Port,Direction)`\ . Matches events only if predicate returns true instead.

drop
^^^^

.. java:method:: public <E extends KompicsEvent, P extends PortType> TestContext<T> drop(Class<E> eventType, Port<P> port, Direction direction)
   :outertype: TestContext

   Similar to \ :java:ref:`drop(KompicsEvent,Port,Direction)`\ . Matches events by class instead.

either
^^^^^^

.. java:method:: public TestContext<T> either()
   :outertype: TestContext

   Enters a \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\  mode, and begins creating a new conditional. A conditional consists of \ ``either() A or() B end()``\  of which only one of sequences of statements A or B is executed at runtime depending on the observed events. Conditionals can be nested. e.g \ ``either() A either() C or() D end() or() B end()``\  is similar to the regular expression A(C|D)|B while \ ``either() A or either() C or() D end () B end()``\  is similar to A | (C|D)B.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :return: current \ :java:ref:`TestContext`\ .

end
^^^

.. java:method:: public TestContext<T> end()
   :outertype: TestContext

   Mark the end of a a \ :java:ref:`repeat()`\ , \ :java:ref:`either()`\ , \ :java:ref:`unordered()`\ , \ :java:ref:`answerRequests()`\ . Exits the current mode and restores the previous one.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`ANSWER_REQUEST <MODE.ANSWER_REQUEST>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :return: current \ :java:ref:`TestContext`\ .

expect
^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> expect(KompicsEvent event, Port<P> port, Direction direction)
   :outertype: TestContext

   Match the occurrence of a single event going in or out of the component under test. Event equivalence is determined using a comparator provided via method \ :java:ref:`setComparator(Class,Comparator)`\ , otherwise it defaults to the \ :java:ref:`Object.equals(Object)`\  method of event.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param event: Event message to be matched.
   :param port: Port on which event should occur.
   :param direction: Direction IN or OUT of expected event.
   :param <P>: Port type
   :return: current \ :java:ref:`TestContext`\

expect
^^^^^^

.. java:method:: public <P extends PortType, E extends KompicsEvent> TestContext<T> expect(Class<E> eventType, Predicate<E> predicate, Port<P> port, Direction direction)
   :outertype: TestContext

   Match the occurrence of a single event going in or out of the component under test. The predicate returns true iff a specified event argument is expected.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param eventType: Class of expected event.
   :param predicate: predicate that determines a matched event message.
   :param port: port on which event should occur.
   :param direction: Direction IN or OUT of expected event.
   :param <P>: port type
   :param <E>: Event type
   :return: current \ :java:ref:`TestContext`\

expect
^^^^^^

.. java:method:: public <P extends PortType, E extends KompicsEvent> TestContext<T> expect(Class<E> eventType, Port<P> port, Direction direction)
   :outertype: TestContext

   Match the occurrence of a single event of the specified class, going in or out of the component under test.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`UNORDERED <MODE.UNORDERED>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param eventType: Class of expected event.
   :param port: port on which event should occur.
   :param direction: Direction IN or OUT of expected event.
   :param <P>: port type.
   :param <E>: event type.
   :return: current \ :java:ref:`TestContext`\ .

expectFault
^^^^^^^^^^^

.. java:method:: public TestContext<T> expectFault(Class<? extends Throwable> exceptionType)
   :outertype: TestContext

   Verifies that an exception is thrown at the current position in execution. If no exception is thrown the test case fails.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param exceptionType: class (or superclass) of expected exception
   :return: current \ :java:ref:`TestContext`\ .

expectFault
^^^^^^^^^^^

.. java:method:: public TestContext<T> expectFault(Predicate<Throwable> exceptionPredicate)
   :outertype: TestContext

   Similar to \ :java:ref:`expectFault(Class)`\ . Matches thrown exception by specified predicate.

getComponentUnderTest
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Component getComponentUnderTest()
   :outertype: TestContext

   Returns the created component under test.

   Modes - All.

   :return: component under test.

inspect
^^^^^^^

.. java:method:: public TestContext<T> inspect(Predicate<T> predicate)
   :outertype: TestContext

   Inspect the internal state of a component. predicate is called by the framework with the \ :java:ref:`ComponentDefinition`\  as an argument. If the predicate returns false, the test case fails immediately.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param predicate: inspect predicate
   :return: current \ :java:ref:`TestContext`\ .

newInstance
^^^^^^^^^^^

.. java:method:: public static <T extends ComponentDefinition> TestContext<T> newInstance(Class<T> componentDefinition, Init<T> init)
   :outertype: TestContext

   Creates a new \ :java:ref:`TestContext`\  for the specified \ :java:ref:`ComponentDefinition`\ . The init is used to instantiate \ ``componentDefinition``\ .

   :param componentDefinition: \ :java:ref:`ComponentDefinition`\  class
   :param init: \ :java:ref:`Init`\  to instantiate componentDefinition
   :param <T>: \ ``componentDefinition``\  type
   :return: a new \ :java:ref:`TestContext`\  for the specified \ :java:ref:`ComponentDefinition`\ .

newInstance
^^^^^^^^^^^

.. java:method:: public static <T extends ComponentDefinition> TestContext<T> newInstance(Class<T> componentDefinition)
   :outertype: TestContext

   Equivalent to newInstance(componentDefinition, Init.NONE).

newInstance
^^^^^^^^^^^

.. java:method:: public static <T extends ComponentDefinition> TestContext<T> newInstance(Class<T> componentDefinition, Init.None init)
   :outertype: TestContext

   Creates a new \ :java:ref:`TestContext`\  for the specified \ :java:ref:`ComponentDefinition`\ . The init is used to instantiate \ ``componentDefinition``\ .

   :param componentDefinition: \ :java:ref:`ComponentDefinition`\  class
   :param init: \ :java:ref:`se.sics.kompics.Init.None`\  to instantiate componentDefinition
   :param <T>: \ ``componentDefinition``\  type
   :return: a new \ :java:ref:`TestContext`\  for the specified \ :java:ref:`ComponentDefinition`\ .

or
^^

.. java:method:: public TestContext<T> or()
   :outertype: TestContext

   Begins the 'or' sequence of a \ :java:ref:`conditional statment <either()>`\ . Must be called exactly once for the current conditional statement.

   Modes - \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :return: current \ :java:ref:`TestContext`\ .

repeat
^^^^^^

.. java:method:: public TestContext<T> repeat(int times)
   :outertype: TestContext

   Enters \ :java:ref:`HEADER <MODE.HEADER>`\  mode and begins creating a block. The block matches a sequence the specified number of times.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param times: number of times to match a sequence.
   :return: current \ :java:ref:`TestContext`\ .

repeat
^^^^^^

.. java:method:: public TestContext<T> repeat()
   :outertype: TestContext

   Enters \ :java:ref:`HEADER <MODE.HEADER>`\  mode and begins creating a block. The block matches a sequence zero or more times.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :return: current \ :java:ref:`TestContext`\ .

repeat
^^^^^^

.. java:method:: public TestContext<T> repeat(int times, EntryFunction entryFunction)
   :outertype: TestContext

   Enters \ :java:ref:`HEADER <MODE.HEADER>`\  mode and begins creating a block. The block matches a sequence the specified number of times. The entryFunction is executed at the beginning of every iteration of the block.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param times: number of times to match a sequence.
   :param entryFunction: \ :java:ref:`EntryFunction`\  implementation to be called at the beginning of each iteration of the created block.
   :return: current \ :java:ref:`TestContext`\ .

repeat
^^^^^^

.. java:method:: public TestContext<T> repeat(EntryFunction entryFunction)
   :outertype: TestContext

   Enters \ :java:ref:`HEADER <MODE.HEADER>`\  mode and begins creating a block. The block matches a sequence zero or more times. The entryFunction is executed at the beginning of every iteration of the block -

   Allowed modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param entryFunction: \ :java:ref:`EntryFunction`\  instance
   :return: current \ :java:ref:`TestContext`\ .

setComparator
^^^^^^^^^^^^^

.. java:method:: public <E extends KompicsEvent> TestContext<T> setComparator(Class<E> eventType, Comparator<E> comparator)
   :outertype: TestContext

   Set a comparator for comparing events of the specified class. The comparator is used for determining the equivalence of two messages of the same class. If no comparator is provided for that class, then the \ :java:ref:`Object.equals(Object)`\  of that class is used.

   Modes - setup \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param eventType: class of event.
   :param comparator: comparator for eventType.
   :param <E>: eventType.
   :return: current \ :java:ref:`TestContext`\

setDefaultAction
^^^^^^^^^^^^^^^^

.. java:method:: public <E extends KompicsEvent> TestContext<T> setDefaultAction(Class<E> eventType, Function<E, Action> function)
   :outertype: TestContext

   Set policy for handling unmatched/unexpected/unspecified events. If such an event of class eventType is observed, then function is called with it as an argument. If the return value of function is \ ``null``\  then the test case fails. Otherwise, an \ :java:ref:`Action`\  is returned determining whether to drop, whitelist or blacklist M.

   Modes - setup \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param eventType: classes (and subclasses) of events to handle with function.
   :param function: function to specify the taken action for an event.
   :param <E>: eventType.
   :return: current \ :java:ref:`TestContext`\ .

setTimeout
^^^^^^^^^^

.. java:method:: public TestContext<T> setTimeout(long timeoutMS)
   :outertype: TestContext

   Specify timeout value to wait for an event to occur.

   Modes - first (initial) \ :java:ref:`HEADER <MODE.HEADER>`\ .

   :param timeoutMS: timeout in milliseconds
   :return: current \ :java:ref:`TestContext`\ .

trigger
^^^^^^^

.. java:method:: public <P extends PortType> TestContext<T> trigger(KompicsEvent event, Port<P> port)
   :outertype: TestContext

   Trigger an event on the specified port.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param event: event to be triggered.
   :param port: port on which to trigger event.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\ .

trigger
^^^^^^^

.. java:method:: public <RQ extends KompicsEvent, RS extends KompicsEvent, P extends PortType> TestContext<T> trigger(Future<RQ, RS> future, Port<P> responsePort)
   :outertype: TestContext

   Trigger the event provided by future as a response on specified port. The future must have been \ :java:ref:`set <Future.set(KompicsEvent)>`\ in a previous call to \ :java:ref:`answerRequest(Class,Port,Future)`\ . The \ :java:ref:`Future.get()`\  method is called to retrieve the triggered event.

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param responsePort: port on which event is triggered.
   :param future: future providing event to be triggered.
   :param <RQ>: request event type.
   :param <RS>: response event type.
   :param <P>: port type.
   :return: current \ :java:ref:`TestContext`\ .

unordered
^^^^^^^^^

.. java:method:: public TestContext<T> unordered()
   :outertype: TestContext

   Equivalent to unordered(true).

   :return: current \ :java:ref:`TestContext`\ .

unordered
^^^^^^^^^

.. java:method:: public TestContext<T> unordered(boolean immediateResponse)
   :outertype: TestContext

   Enters \ :java:ref:`MODE.UNORDERED`\ . Allowed method calls in this mode are:

   \ :java:ref:`expect(KompicsEvent,Port,Direction)`\ \ :java:ref:`expect(Class,Port,Direction)`\ \ :java:ref:`expect(Class,Predicate,Port,Direction)`\ \ :java:ref:`answerRequest(Class,Port,Future)`\ \ :java:ref:`answerRequest(Class,Port,Function,Port)`\

   Match events in the order that they occur at runtime as opposed to their sequential specified order. When answering requests in this mode, setting immediateResponse to true causes each response event to be triggered as soon the request is matched, otherwise it is triggered when all requests have been matched. The immediateResponse flag has no effect when using \ :java:ref:`answerRequest(Class,Port,Future)`\ .

   Modes - \ :java:ref:`BODY <MODE.BODY>`\ , \ :java:ref:`CONDITIONAL <MODE.CONDITIONAL>`\ .

   :param immediateResponse: - where applicable, respond to requests immediately(true) or when all events have been received(false).
   :return: current \ :java:ref:`TestContext`\ .

