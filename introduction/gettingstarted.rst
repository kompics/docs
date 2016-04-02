.. _gettingstarted:

Getting Started
===============

Prerequisites
-------------
Kompics requires that you have Java on your machine.

For Kompics versions before :code:`0.8.2` only Java 6 is required. Newer version require Java 7.

There also exists some Java 8 code in Kompics that is currently commented out for backwards compatibility reasons, but will be reintroduced in a different branch in the (near) future.

Including Kompics
-----------------
The best way to include Kompics is to use a build tool like maven and add the required Kompics modules as a dependency.

See :ref:`repos` for information on the maven dependencies.

.. _gs_modules:

Modules
-------
Kompics is very modular and consists of several JAR-files containing different features, ports, and components.

* ``kompics-core`` – Contains the runtime and the basic definitions. This is the minimum requirement.
* ``kompics-port-timer`` and ``kompics-component-java-timer`` – Provide the definition and the implementation for a component that handles scheduled timeouts
* ``kompics-port-network`` and ``kompics-component-netty-network`` – Provide the definition and a Netty based implementation for networking using TCP, UDP, and UDP.
* ``kompics-port-virtual-network`` – Adds a few definitions to the network port to allow for usage of virtual nodes within the same Kompics instance.
* ``kompics-simulator`` – Contains a DSL to describe experiment/test scenarios and a scheduler and base components to run them.

.. note::

	Implementations always depend on the modules defining the port types they implement. Thus it is sufficient to add the implementation as a dependency. The separation is meant to allow different implementations for the same port type.

IDE Support
-----------
Kompics can be used with any IDE that supports Java and preferably maven.

For the brave of heart there is also an experimental Eclipse plugin that adds some shortcuts for components and handlers. However, it is not in active development at the moment. The source can be found at `<https://github.com/Bathtor/KompicsIDE>`_.

Build from Sources
------------------
See :ref:`repos` for information on how to acquire the source code.

To clone the sources you need `Git <http://git-scm.com/>`_ installed on your machine.

For example::

	git clone git://github.com/kompics/kompics.git

If you have already cloned the repository previously then you can update the code with git pull::

	git pull origin master

Change into the :file:`kompics` root directory and execute the following command to build and install a local Kompics version::

	mvn clean install

.. note::

	Some of the tests take a very long time to execute and open a lot of file-descriptors. Depending on the rights on your machine, they might in fact fail for you. Either increase the number of concurrent open file-handles allowed for your user, or simply skip the tests with :code:`-DskipTests`.