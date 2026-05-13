package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Action
import sn.gnome.gio.internal.GSimpleAction
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** A #GSimpleAction is the obvious simple implementation of the #GAction
  * interface. This is the easiest way to create an action for purposes of
  * adding it to a #GSimpleActionGroup.
  *
  * See also #GtkAction.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SimpleAction private[gnome] (raw: Ptr[GSimpleAction])
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
  ): Unit /* None */ =
    g_simple_action_set_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSimpleAction]],
      gboolean(gint((if enabled == true then 1 else 0)))
    )
  end setEnabled

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
    "[method set_state/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
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
    "[method set_state_hint/<method parameters>/state_hint]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setStateHint__ = ???

  /** Indicates that the action was just activated.
    *
    * @parameter
    *   will always be of the expected type, i.e. the parameter type specified
    *   when the action was created. If an incorrect type is given when
    *   activating the action, this signal is not emitted.
    *
    * Since GLib 2.40, if no handler is connected to this signal then the
    * default behaviour for boolean-stated actions with a %NULL parameter type
    * is to toggle them via the #GSimpleAction::change-state signal. For
    * stateful actions where the state type is equal to the parameter type, the
    * default is to forward them directly to #GSimpleAction::change-state. This
    * should allow almost all users of #GSimpleAction to connect only one
    * handler or the other.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal activate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))"
  )
  private def onActivate = ???

  /**  Indicates that the action just received a request to change its
    *  state.
    *
    *  @value will always be of the correct state type, i.e. the type of the
    *  initial state passed to g_simple_action_new_stateful(). If an incorrect
    *  type is given when requesting to change the state, this signal is not
    *  emitted.
    *
    *  If no handler is connected to this signal then the default
    *  behaviour is to call g_simple_action_set_state() to set the state
    *  to the requested value. If you connect a signal handler then no
    *  default action is taken. If the state should change then you must
    *  call g_simple_action_set_state() from the handler.
    *
    *  An example of a 'change-state' handler:
    *  |[<!-- language="C" -->
    *  static void
    *  change_volume_state (GSimpleAction *action,
    *                       GVariant      *value,
    *                       gpointer       user_data)
    *  {
    *    gint requested;
    *
    *    requested = g_variant_get_int32 (value);
    *
    *    // Volume only goes from 0 to 10
    *    if (0 <= requested && requested <= 10)
    *      g_simple_action_set_state (action, value);
    *  }
    *  ]|
    *
    *  The handler need not set the state to the requested value.
    *  It could set it to any value at all, or take some other action.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal change-state]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GLib.Variant)))"
  )
  private def onChangeState = ???

end SimpleAction

object SimpleAction:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSimpleAction])(using Runtime) =
    summon[Runtime].getOrCreate[SimpleAction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SimpleAction(ptr)
    )

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
  private def apply() = ???

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
  private def stateful() = ???

end SimpleAction
