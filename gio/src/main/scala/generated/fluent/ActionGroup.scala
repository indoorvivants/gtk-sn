package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint}

trait ActionGroup:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Emits the #GActionGroup::action-added signal on @action_group.
    *
    * This function should only be called by #GActionGroup implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionAdded(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_action_group_action_added(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionGroup]],
      toCString(action_name).asInstanceOf[Ptr[gchar]]
    )
  end actionAdded

  /** Emits the #GActionGroup::action-enabled-changed signal on @action_group.
    *
    * This function should only be called by #GActionGroup implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionEnabledChanged(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ =
    g_action_group_action_enabled_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionGroup]],
      toCString(action_name).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if enabled == true then 1 else 0)))
    )
  end actionEnabledChanged

  /** Emits the #GActionGroup::action-removed signal on @action_group.
    *
    * This function should only be called by #GActionGroup implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def actionRemoved(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_action_group_action_removed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionGroup]],
      toCString(action_name).asInstanceOf[Ptr[gchar]]
    )
  end actionRemoved

  /** Emits the #GActionGroup::action-state-changed signal on @action_group.
    *
    * This function should only be called by #GActionGroup implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method action_state_changed/<method parameters>/state]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def actionStateChanged__ = ???

  /**  Activate the named action within @action_group.
    *
    *  If the action is expecting a parameter, then the correct type of
    *  parameter must be given as @parameter.  If the action is expecting no
    *  parameters then @parameter must be %NULL.  See
    *  g_action_group_get_action_parameter_type().
    *
    *  If the #GActionGroup implementation supports asynchronous remote
    *  activation over D-Bus, this call may return before the relevant
    *  D-Bus traffic has been sent, or any replies have been received. In
    *  order to block on such asynchronous activation calls,
    *  g_dbus_connection_flush() should be called prior to the code, which
    *  depends on the result of the action activation. Without flushing
    *  the D-Bus connection, there is no guarantee that the action would
    *  have been activated.
    *
    *  The following code which runs in a remote app instance, shows an
    *  example of a "quit" action being activated on the primary app
    *  instance over D-Bus. Here g_dbus_connection_flush() is called
    *  before `exit()`. Without g_dbus_connection_flush(), the "quit" action
    *  may fail to be activated on the primary instance.
    *
    *  |[<!-- language="C" -->
    *  // call "quit" action on primary instance
    *  g_action_group_activate_action (G_ACTION_GROUP (app), "quit", NULL);
    *
    *  // make sure the action is activated now
    *  g_dbus_connection_flush (...);
    *
    *  g_debug ("application has been terminated. exiting.");
    *
    *  exit (0);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method activate_action/<method parameters>/parameter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def activateAction__ = ???

  /** Request for the state of the named action within @action_group to be
    * changed to @value.
    *
    * The action must be stateful and @value must be of the correct type. See
    * g_action_group_get_action_state_type().
    *
    * This call merely requests a change. The action may refuse to change its
    * state or may change its state to something other than @value. See
    * g_action_group_get_action_state_hint().
    *
    * If the @value GVariant is floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method change_action_state/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def changeActionState__ = ???

  /** Checks if the named action within @action_group is currently enabled.
    *
    * An action must be enabled in order to be activated or in order to have its
    * state changed from outside callers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionEnabled(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    g_action_group_get_action_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionGroup]],
      toCString(action_name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end getActionEnabled

  /** Queries the type of the parameter that must be given when activating the
    * named action within @action_group.
    *
    * When activating the action using g_action_group_activate_action(), the
    * #GVariant given to that function must be of the type returned by this
    * function.
    *
    * In the case that this function returns %NULL, you must not give any
    * #GVariant, but %NULL instead.
    *
    * The parameter type of a particular action will never change but it is
    * possible for an action to be removed and for a new action to be added with
    * the same name but a different parameter type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_action_parameter_type/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def getActionParameterType__ = ???

  /** Queries the current state of the named action within @action_group.
    *
    * If the action is not stateful then %NULL will be returned. If the action
    * is stateful then the type of the return value is the type given by
    * g_action_group_get_action_state_type().
    *
    * The return value (if non-%NULL) should be freed with g_variant_unref()
    * when it is no longer required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_action_state/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getActionState__ = ???

  /** Requests a hint about the valid range of values for the state of the named
    * action within @action_group.
    *
    * If %NULL is returned it either means that the action is not stateful or
    * that there is no hint about the valid range of values for the state of the
    * action.
    *
    * If a #GVariant array is returned then each item in the array is a possible
    * value for the state. If a #GVariant pair (ie: two-tuple) is returned then
    * the tuple specifies the inclusive lower and upper bound of valid values
    * for the state.
    *
    * In any case, the information is merely a hint. It may be possible to have
    * a state value outside of the hinted range and setting a value within the
    * range may fail.
    *
    * The return value (if non-%NULL) should be freed with g_variant_unref()
    * when it is no longer required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_action_state_hint/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getActionStateHint__ = ???

  /** Queries the type of the state of the named action within
    * @action_group.
    *
    * If the action is stateful then this function returns the #GVariantType of
    * the state. All calls to g_action_group_change_action_state() must give a
    * #GVariant of this type and g_action_group_get_action_state() will return a
    * #GVariant of the same type.
    *
    * If the action is not stateful then this function will return %NULL. In
    * that case, g_action_group_get_action_state() will return %NULL and you
    * must not call g_action_group_change_action_state().
    *
    * The state type of a particular action will never change but it is possible
    * for an action to be removed and for a new action to be added with the same
    * name but a different state type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_action_state_type/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def getActionStateType__ = ???

  /** Checks if the named action exists within @action_group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasAction(
      action_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    g_action_group_has_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GActionGroup]],
      toCString(action_name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end hasAction

  /** Lists the actions contained within @action_group.
    *
    * The caller is responsible for freeing the list with g_strfreev() when it
    * is no longer required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_actions/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def listActions__ = ???

  /** Queries all aspects of the named action within an @action_group.
    *
    * This function acquires the information available from
    * g_action_group_has_action(), g_action_group_get_action_enabled(),
    * g_action_group_get_action_parameter_type(),
    * g_action_group_get_action_state_type(),
    * g_action_group_get_action_state_hint() and
    * g_action_group_get_action_state() with a single function call.
    *
    * This provides two main benefits.
    *
    * The first is the improvement in efficiency that comes with not having to
    * perform repeated lookups of the action in order to discover different
    * things about it. The second is that implementing #GActionGroup can now be
    * done by only overriding this one virtual function.
    *
    * The interface provides a default implementation of this function that
    * calls the individual functions, as required, to fetch the information. The
    * interface also provides default implementations of those functions that
    * call this function. All implementations, therefore, must override either
    * this function or all of the others.
    *
    * If the action exists, %TRUE is returned and any of the requested fields
    * (as indicated by having a non-%NULL reference passed in) are filled. If
    * the action doesn't exist, %FALSE is returned and the fields may or may not
    * have been modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query_action]: Method query_action contains an OUT parameter, which is not supported yet"
  )
  private def queryAction__ = ???

end ActionGroup

object ActionGroup:
  class Abstract(raw: Ptr[Byte]) extends ActionGroup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ActionGroup
