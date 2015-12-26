.. java:import:: java.util UUID

.. java:import:: se.sics.kompics.config ConfigUpdate

Update
======

.. java:package:: se.sics.kompics
   :noindex:

.. java:type::  class Update implements KompicsEvent

   :author: lkroll

Fields
------
forwarder
^^^^^^^^^

.. java:field:: public final UUID forwarder
   :outertype: Update

update
^^^^^^

.. java:field:: public final ConfigUpdate update
   :outertype: Update

Constructors
------------
Update
^^^^^^

.. java:constructor::  Update(ConfigUpdate update, UUID forwarder)
   :outertype: Update

