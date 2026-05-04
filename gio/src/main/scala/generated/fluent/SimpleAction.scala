package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.internal.GSimpleAction
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** A #GSimpleAction is the obvious simple implementation of the #GAction
  * interface. This is the easiest way to create an action for purposes of
  * adding it to a #GSimpleActionGroup.
  *
  * See also #GtkAction.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SimpleAction(raw: Ptr[GSimpleAction])
    extends Object(raw.asInstanceOf),
      Action:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Sets the action as enabled or not.
    *
    * An action must be enabled in order to be activated or in order to have its
    * state changed from outside callers.
    *
    * This should only be called by the implementor of the action. Users of the
    * action should not attempt to modify its enabled flag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnabled(
      enabled: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_simple_action_set_enabled(
    this.raw.asInstanceOf[Ptr[GSimpleAction]],
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** Sets the state of the action.
    *
    * This directly updates the 'state' property to the given value.
    *
    * This should only be called by the implementor of the action. Users of the
    * action should not attempt to directly modify the 'state' property.
    * Instead, they should call g_action_change_state() to request the change.
    *
    * If the @value GVariant is floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_state/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setState__ = ???

  /** Sets the state hint for the action.
    *
    * See g_action_get_state_hint() for more information about action state
    * hints.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_state_hint/<method parameters>/state_hint]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setStateHint__ = ???

end SimpleAction

object SimpleAction:
  /** Creates a new action.
    *
    * The created action is stateless. See g_simple_action_new_stateful() to
    * create an action that has state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parameter_type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def `new`() = ???

  /** Creates a new stateful action.
    *
    * All future state values must have the same #GVariantType as the initial
    * @state.
    *
    * If the @state #GVariant is floating, it is consumed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parameter_type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def new_stateful() = ???

end SimpleAction
