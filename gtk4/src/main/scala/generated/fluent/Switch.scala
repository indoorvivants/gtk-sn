package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSwitch

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSwitch` is a "light switch" that has two states: on or off.
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
  */
class Switch(raw: Ptr[GtkSwitch])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the `GtkSwitch` is in its “on” or “off” state.
    */
  def getActive(): Boolean =
    gtk_switch_get_active(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the underlying state of the `GtkSwitch`.
    */
  def getState(): Boolean =
    gtk_switch_get_state(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the state of @self to the desired one.
    */
  def setActive(is_active: Boolean): Unit = gtk_switch_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if is_active == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the underlying state of the `GtkSwitch`.
    *
    * This function is typically called from a [signal@Gtk.Switch::state-set]
    * signal handler in order to set up delayed state changes.
    *
    * See [signal@Gtk.Switch::state-set] for details.
    */
  def setState(state: Boolean): Unit = gtk_switch_set_state(
    this.raw.asInstanceOf,
    gboolean(gint((if state == true then 1 else 0)))
  )

end Switch

object Switch:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSwitch` widget.
    */
  def apply(): Switch = new Switch(gtk_switch_new().asInstanceOf)
end Switch
