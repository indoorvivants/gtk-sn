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

class Switch(raw: Ptr[GtkSwitch])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Boolean =
    gtk_switch_get_active(this.raw.asInstanceOf).value.!=(0)

  def getState(): Boolean =
    gtk_switch_get_state(this.raw.asInstanceOf).value.!=(0)

  def setActive(is_active: Boolean): Unit = gtk_switch_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if is_active == true then 1 else 0)))
  )

  def setState(state: Boolean): Unit = gtk_switch_set_state(
    this.raw.asInstanceOf,
    gboolean(gint((if state == true then 1 else 0)))
  )

end Switch

object Switch:
  def apply(): Switch = new Switch(gtk_switch_new().asInstanceOf)
end Switch
