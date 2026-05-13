package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkSwitch
import sn.gnome.runtime.*

/** `GtkSwitch` is a "light switch" that has two states: on or off.
  *
  * ![An example GtkSwitch](switch.png)
  *
  * The user can control which state should be active by clicking the empty
  * area, or by dragging the handle.
  *
  * `GtkSwitch` can also handle situations where the underlying state changes
  * with a delay. In this case, the slider position indicates the user's recent
  * change (as indicated by the [property@Gtk.Switch:active] property), and the
  * color indicates whether the underlying state (represented by the
  * [property@Gtk.Switch:state] property) has been updated yet.
  *
  * ![GtkSwitch with delayed state change](switch-state.png)
  *
  * See [signal@Gtk.Switch::state-set] for details.
  *
  * # CSS nodes
  *
  * ```
  * switch
  * ├── image
  * ├── image
  * ╰── slider
  * ```
  *
  * `GtkSwitch` has four css nodes, the main node with the name switch and
  * subnodes for the slider and the on and off images. Neither of them is using
  * any style classes.
  *
  * # Accessibility
  *
  * `GtkSwitch` uses the %GTK_ACCESSIBLE_ROLE_SWITCH role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Switch private[gnome] (raw: Ptr[GtkSwitch])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets whether the `GtkSwitch` is in its “on” or “off” state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ =
    gtk_switch_get_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSwitch]]
    ).value.!=(0)
  end getActive

  /** Gets the underlying state of the `GtkSwitch`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getState(): Boolean /* None */ =
    gtk_switch_get_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSwitch]]
    ).value.!=(0)
  end getState

  /** Changes the state of @self to the desired one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(
      is_active: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_switch_set_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSwitch]],
      gboolean(gint((if is_active == true then 1 else 0)))
    )
  end setActive

  /** Sets the underlying state of the `GtkSwitch`.
    *
    * This function is typically called from a [signal@Gtk.Switch::state-set]
    * signal handler in order to set up delayed state changes.
    *
    * See [signal@Gtk.Switch::state-set] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setState(
      state: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_switch_set_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSwitch]],
      gboolean(gint((if state == true then 1 else 0)))
    )
  end setState

  /** Emitted to animate the switch.
    *
    * Applications should never connect to this signal, but use the
    * [property@Gtk.Switch:active] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkSwitch],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivate

  /** Emitted to change the underlying state.
    *
    * The ::state-set signal is emitted when the user changes the switch
    * position. The default handler keeps the state in sync with the
    * [property@Gtk.Switch:active] property.
    *
    * To implement delayed state change, applications can connect to this
    * signal, initiate the change of the underlying state, and call
    * [method@Gtk.Switch.set_state] when the underlying state change is
    * complete. The signal handler should return %TRUE to prevent the default
    * handler from running.
    *
    * Visually, the underlying state is represented by the trough color of the
    * switch, while the [property@Gtk.Switch:active] property is represented by
    * the position of the switch.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStateSet(handler: ((state: Boolean)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (state: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkSwitch],
          state: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((state = state))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"state-set"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onStateSet
end Switch

object Switch:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSwitch])(using Runtime) = summon[Runtime]
    .getOrCreate[Switch](ptr.asInstanceOf[Ptr[Byte]], p => new Switch(ptr))

  /** Creates a new `GtkSwitch` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Switch =
    val raw: Ptr[Byte] = gtk_switch_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Switch](raw, r => Switch.applyUnsafe(r.asInstanceOf))
  end apply
end Switch
