package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropControllerMotion

class DropControllerMotion(raw: Ptr[GtkDropControllerMotion])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def containsPointer(): Boolean = gtk_drop_controller_motion_contains_pointer(
    this.raw.asInstanceOf
  ).value.!=(0)

  def getDrop(): Drop = new Drop(
    gtk_drop_controller_motion_get_drop(this.raw.asInstanceOf).asInstanceOf
  )

  def isPointer(): Boolean =
    gtk_drop_controller_motion_is_pointer(this.raw.asInstanceOf).value.!=(0)

end DropControllerMotion

object DropControllerMotion:
  def apply(): DropControllerMotion = new DropControllerMotion(
    gtk_drop_controller_motion_new().asInstanceOf
  )
end DropControllerMotion
