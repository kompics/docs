.. _kspingpong:

A Full Example -- PingPong
==========================
As a proper example of the usage of Kompics Scala we are going to rewrite the Distributed Ping Pong example from section :ref:`netcleanup`.

SBT Setup
---------
Set up your SBT project as follows, or simply download the whole project :download:`here <pingpong.zip>`.

.. code-block:: console

	$ ls -ohn
	total 6
	drwxr-xr-x  6 501   204B Apr  1 16:39 distPinger
	drwxr-xr-x  6 501   204B Apr  1 16:39 distPonger
	-rw-r--r--  1 501   861B Apr  1 16:40 pingpong.sbt
	drwxr-xr-x  5 501   170B Apr  1 16:16 project
	drwxr-xr-x  3 501   102B Mar 30 13:14 src

The two :file:`distPinger` and :file:`distPinger` folders will be used later for running the application with different config files.

You need a SBT file :file:`pingpong.sbt` and a :file:`project/plugins.sbt` similar to below:

.. literalinclude:: pingpong/pingpong.sbt
	:language: scala
	:caption: pingpong.sbt

.. literalinclude:: pingpong/project/plugins.sbt
	:language: scala
	:caption: plugins.sbt


Messages
--------
As before we'll have to implement our own ``Address``, ``Header`` and ``Msg`` types, as well as the ``Ping`` and ``Pong`` events. To allow for convenient pattern matching in our handlers later, we are going to use only case classes and case objects for these types. We are also going to make significant use of the fact that Scala allows us to define multiple types in the same file. While this makes types sometimes difficult to locate in a code base, it provides convenient grouping and locality while working and reduces the number of times one has to write the same set of imports. For convenience we also define the ``Ping`` and ``Pong`` events in the package object.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/TestNetTypes.scala
	:language: scala
	:caption: TestNetTypes.scala

Note that we limited our ``TMessage`` class to subtypes of ``KompicsEvent``, but we could just as well have allowed any kind of type that can be serialized as a payload.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/package.scala
	:language: scala
	:caption: package.scala

Components
----------
Now that we have messages, we can write the components that use them.

The ``Ponger`` is rather short, and as before it simply keeps a counter, which it increments every time it received a ``TMessage`` with the payload ``Ping``. The underscore in the pattern means that we don't care about the ``THeader`` which is the first argument of ``TMessage``.

We also define the setup component ``PongerParent`` in the same file. There is no DSL call for ``create``, yet, but note the new Scala signature for ``connect``. The arrow here always goes from *positive* to *negative*, or from "service provider" to "service consumer", if you like. The arrow is also used in the DSL ``trigger`` method, where it simply goes from event to port.

.. seealso::

	There's also a new public version for the APIs that are thread-safe, which is not bound to the ``ComponentDefinition`` context. These are defined in the ``se.sics.kompics.sl`` package object and imitate the `Kola <https://github.com/kompics/kola>`_ syntax somewhat: ```!trigger` (event -> port)`` and ```!connect`[PortType](positive -> negative)``

.. literalinclude:: pingpong/src/main/scala/se/sics/test/Ponger.scala
	:language: scala
	:caption: Ponger.scala

.. note::
	The method ``cfg`` returns a memoized Scala wrapper for Kompics' ``config()``. You can also access the Java API as before by using the latter method. The Scala API is more condensed, as it avoids the annoying ``{type}.class``/``classOf[{type}]`` calls. Note that there are no *unchecked* methods in the Scala API.

The ``Pinger`` is slightly more involved, but most of that really comes from the use of the ``Timer``. As with the message types, the ``Timeout`` is defined as a case class to allow pattern matching in the handler. New in this section is the use of Scala DSL ``Init`` which allows any sequence of parameters, which can then be matched into internal fields in the component. The idea is simply to avoid the creation of a large number of init classes which act as nothing but reference carriers and are then discarded. Classes with such minimal reusability are in some way an abuse of the object-oriented paradigm and should be avoided in general.

The custom ``tearDown`` method, is very similar to the Java version, just using an ``Option`` instead of checking for ``null``, which is better style.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/Pinger.scala
	:language: scala
	:caption: Pinger.scala

Before we can get to the ``Main`` object, we are still missing two important things, that we had to take care of in Java as well: *Serialization* and *Config Converters*.

Serialization
-------------
In order to be able to send things over the network, we need to be able to serialize all our classes. In the Java version we used custom serializers for all our classes. In Scala, on the other hand, we have a very good library called `Scala Pickling <https://github.com/scala/pickling>`_ which can take care of all the case classes/objects and Scala primitives, leaving us only to deal with Java's enums and ``InetSocketAddress``.

The two custom "picklers" in the following code might seem a bit arcane, but this is a tutorial on Kompics Scala and not on Scala Pickling, so feel free to gloss over the details.

Note the use an object instead of a class for the ``PickleSerializer``. We anyway only want a single instance of our serializers to be registered, so unless there is custom state that needs to be passed in, there is no reason to ever have more than one instance and thus use a class.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/PickleSerializer.scala
	:language: scala
	:caption: PickleSerializer.scala

Config Converters
-----------------
The Kompics Scala package already adds a number of new ``Converter``\s for Scala primitives, but we require one more, to deal with our ``TAddress`` properly.

There is no new Scala API for ``Converter`` so some of the code looks a bit Java:y. Notice especially the awkward ```type``` method, which is a workaround for the fact that ``type`` is a reserved keyword in Scala, but not in Java.

The ``@unchecked`` pattern simply surpresses a compiler warning that the generics of the pattern would be unchecked by the pattern matcher, as they are removed by erasure. The same thing happens in Java, just Scala is nice and tells you about it by default, and you can explicitly ignore the problem if you choose to.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/TAddressConverter.scala
	:language: scala
	:caption: TAddressConverter.scala

Main Object and Running the Code
--------------------------------
Now we are finally in a position to write the ``Main`` object. The code is nothing fancy, and is pretty much a one-to-one translation of the Java version, just with one serializer less.

.. literalinclude:: pingpong/src/main/scala/se/sics/test/Main.scala
	:language: scala
	:caption: Main.scala

Also include the following :file:`reference.conf` in :file:`src/main/resources` and a :file:`logback.xml` of your choosing (for example the one from the :ref:`kshelloworld` example) in the same folder.

.. literalinclude:: pingpong/src/main/resources/reference.conf
	:language: JSON

Now that we have all of that we can finally compile and assemble the project:

.. code-block:: console

	sbt
	> compile
	> assembly

The move the resulting assembled jar from the :file:`target/scala_2.11` folder both to :file:`distPinger` and :file:`distPonger` (or symlink it, whichever you prefer).

All we need now is some quick configuration files and maybe a nice script to run each version.

.. literalinclude:: pingpong/distPonger/application.conf
	:language: JSON
	:caption: distPonger/application.conf

The ``Ponger`` simply uses the default port 34567.

.. literalinclude:: pingpong/distPinger/application.conf
	:language: JSON
	:caption: distPinger/application.conf

.. literalinclude:: pingpong/distPonger/ponger.sh
	:language: bash
	:caption: distPonger/ponger.sh

.. literalinclude:: pingpong/distPinger/pinger.sh
	:language: bash
	:caption: distPinger/pinger.sh


Then simply run the ``ponger.sh`` first, and then the ``pinger.sh``.

You can download the whole project :download:`here <pingpong.zip>`.


