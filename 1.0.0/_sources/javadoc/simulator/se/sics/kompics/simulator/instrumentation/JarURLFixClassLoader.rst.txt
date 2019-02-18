.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.net URL

.. java:import:: java.util.jar JarEntry

.. java:import:: java.util.jar JarFile

JarURLFixClassLoader
====================

.. java:package:: se.sics.kompics.simulator.instrumentation
   :noindex:

.. java:type:: public class JarURLFixClassLoader extends ClassLoader

   :author: lkroll

Constructors
------------
JarURLFixClassLoader
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public JarURLFixClassLoader(ClassLoader parent)
   :outertype: JarURLFixClassLoader

Methods
-------
getResourceAsStream
^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public InputStream getResourceAsStream(String name)
   :outertype: JarURLFixClassLoader

