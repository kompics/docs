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
Kompics Testing
	The Testing DSL and framework is located at `<http://github.com/kompics/kompics-testing>`_

Release Repository
^^^^^^^^^^^^^^^^^^
Kompics released are hosted at `<https://dl.bintray.com/kompics/Maven>`_.

Make sure that you add the repository to the maven repositories in :file:`pom.xml` or your global :file:`settings.xml`:

.. code-block:: xml

    <repositories>
        <repository>
            <snapshots>
                <enabled>false
            </enabled>
            </snapshots>
            <id>bintray-kompics-Maven
          </id>
            <name>bintray
          </name>
            <url>https://dl.bintray.com/kompics/Maven
          </url>
        </repository>
    </repositories>

Or in SBT in your build file with:

.. code-block:: scala

	resolvers += Resolver.bintrayRepo("kompics", "Maven")

.. note:: 

	Kompics snapshots are not published anymore, since moving to bintray.

