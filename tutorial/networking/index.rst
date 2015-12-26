.. _networking:

Networking
==========
Since a distributed systems framework is not very useful if it can not communicate with other machines, Kompics provides built-in networking support, of course. There are two kinds of deployment scenarios Kompics' networking middleware is targeted at:

	#. Local network or data centre deployments, where every node can directly communicate with every other node in the system, and
	#. open internet deployments where some nodes can directly connect to certain nodes, but others are behind NATs.

Additionally, for both these scenarios Kompics supports the creation of *virtual networks* within a single JVM instance, which is often required by protocols that rely on probabilistic load distribtion, like distributed hash tables for example.


.. toctree::
   :maxdepth: 3

   basic/basic
   virtual/virtual
   nat/nat