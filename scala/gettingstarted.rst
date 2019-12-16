.. _ksgettingstarted:

Getting Started
===============
Kompics Scala has the same prerequisites as the Java version of Kompics (cf. :ref:`gettingstarted`), however it is recommended to build Scala projects with `SBT <http://www.scala-sbt.org/>`_ instead of Maven, if possible. In this document use of SBT will be assumed.

Kompics Scala currently requires Scala :code:`2.13.x` (there are also :code:`2.12.x` and :code:`2.11.x` cross-build available) and after adding the required resolvers (cf. :ref:`repos`) the SBT dependency is (for example for version ``2.0.0``):

.. code-block:: scala

	libraryDependencies += "se.sics.kompics" %% "kompics-scala" % "2.0.0"

The ``kompics-scala`` module only depends on ``kompics-core`` from the Java API, but other Kompics modules (cf. :ref:`gs_modules`) can be included in order to use the Java API from Scala directly. For example, to add networking support, one could add the following to the SBT build file:

.. code-block:: scala

	libraryDependencies += "se.sics.kompics.basic" % "kompics-component-netty-network" % "1.2.1"

.. note::
	Java dependencies do not take the ``%%``, but a single ``%`` after the organisation, since they don't have a Scala version to include.

IDE Support
-----------
There is currently no special IDE support for Kompics Scala. It is recommended to use any IDE that has good Scala and SBT support. Both `ScalaIDE <http://scala-ide.org/>`_ (Eclipse) and `IntelliJ IDEA <http://www.jetbrains.com/idea/>`_ should be well suited. ScalaIDE/Eclipse works best with SBT when the `SBT Ecliplse Plugin <https://github.com/typesafehub/sbteclipse>`_ is used. Alternatively, `Metals <https://scalameta.org/metals/>`_ works well with VSCode, for example.

Build from Sources
------------------
See :ref:`repos` for information on how to acquire the source code.

To clone the sources you need `Git <http://git-scm.com/>`_ installed on your machine.

For example::

	git clone git://github.com/kompics/kompics-scala.git

If you have already cloned the repository previously then you can update the code with git pull::

	git pull origin master

Change into the :file:`kompics-scala` root directory and execute the following commands to build, and test a local Kompics Scala version in SBT::

	sbt
	> test

Followed by other actions you wish to take, e.g. ``publishLocal`` or ``eclipse``.
