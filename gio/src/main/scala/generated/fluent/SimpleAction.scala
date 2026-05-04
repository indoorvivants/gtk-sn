package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.internal.GSimpleAction
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GSimpleAction is the obvious simple implementation of the #GAction
  * interface. This is the easiest way to create an action for purposes of
  * adding it to a #GSimpleActionGroup.
  *
  * See also #GtkAction.
  */
class SimpleAction(raw: Ptr[GSimpleAction])
    extends Object(raw.asInstanceOf),
      Action:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the action as enabled or not.
    *
    * An action must be enabled in order to be activated or in order to have its
    * state changed from outside callers.
    *
    * This should only be called by the implementor of the action. Users of the
    * action should not attempt to modify its enabled flag.
    */
  def setEnabled(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_simple_action_set_enabled(
    this.raw.asInstanceOf[Ptr[GSimpleAction]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state of the action.
    *
    * This directly updates the 'state' property to the given value.
    *
    * This should only be called by the implementor of the action. Users of the
    * action should not attempt to directly modify the 'state' property.
    * Instead, they should call g_action_change_state() to request the change.
    *
    * If the @value GVariant is floating, it is consumed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  def setState__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state hint for the action.
    *
    * See g_action_get_state_hint() for more information about action state
    * hints.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  def setStateHint__ = ???

end SimpleAction

object SimpleAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new action.
    *
    * The created action is stateless. See g_simple_action_new_stateful() to
    * create an action that has state.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  def `new`() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new stateful action.
    *
    * All future state values must have the same #GVariantType as the initial
    * @state.
    *
    * If the @state #GVariant is floating, it is consumed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  def new_stateful() = ???

end SimpleAction
