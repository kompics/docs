.. _repos:

Repositories
------------

Source Code
^^^^^^^^^^^
Kompics uses Git and is hosted at `Github <http://github.com>`_.

Kompics
	The main Kompics repository can be found at `<http://github.com/kompics/kompics>`_
Kompics Simulator
	The Kompics simulator repository can be found at `<http://github.com/kompics/kompics-simulator>`_
Kompics Scala
	The Scala DSL repoistory is located at `<http://github.com/kompics/kompics-scala>`_

Release Repository
^^^^^^^^^^^^^^^^^^
Kompics released are hosted at `<http://kompics.sics.se/maven/repository/se/sics/kompics/>`_.

Make sure that you add the repository to the maven repositories in :file:`pom.xml`:

.. code-block:: xml

	<repository>
	 	<id>sics-release</id>
	 	<name>SICS Release Repository</name>
	 	<url>http://kompics.sics.se/maven/repository</url>
	 	<releases>
	  		<enabled>true</enabled>
	 	</releases>
	 	<snapshots>
	  		<enabled>false</enabled>
	 	</snapshots>
	</repository>

Or in SBT in your build file with:

.. code-block:: scala

	resolvers += "Kompics Releases" at "http://kompics.sics.se/maven/repository/"

.. note:: 

	Since Kompics is research software, releases are extremely rare. It is common to simply work with snapshot releases. 

Snapshot Repository
^^^^^^^^^^^^^^^^^^^
Kompics snapshots are hosted at `<http://kompics.sics.se/maven/snapshotrepository/se/sics/kompics/>`_.
These :code:`SNAPSHOT` releases are not nightly builds, but manually deployed artifacts, that are tested to work with the maintainer's code at least, before release. They should be the default to include as dependencies for projects using Kompics.

Maven/SBT Definition of the Snapshot Repository
"""""""""""""""""""""""""""""""""""""""""""
Make sure that you add the repository to the maven repositories in :file:`pom.xml`:

.. code-block:: xml

	<repository>
		<id>sics-snapshot</id>
		<name>SICS Snapshot Repository</name>
		<url>http://kompics.sics.se/maven/snapshotrepository</url>
		<releases>
			<enabled>false</enabled>
		</releases>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>

Or in SBT in your build file with:

.. code-block:: scala

	resolvers += "Kompics Snapshots" at "http://kompics.sics.se/maven/snapshotrepository/"

Define the library dependencies with the timestamp or :code:`SNAPSHOT` as version. For example:

.. code-block:: xml

	<dependency>
		<groupId>se.sics.kompics</groupId>
		<artifactId>kompics-core</artifactId>
		<version>0.9.1-SNAPSHOT</version>
		<scope>compile</scope>
	</dependency>
