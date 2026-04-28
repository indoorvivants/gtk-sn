package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkMountOperation
import sn.gnome.gio.fluent.MountOperation as _MountOperation

class MountOperation(raw: Ptr[GtkMountOperation])
    extends _MountOperation(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDisplay(): Display = new Display(
    gtk_mount_operation_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getParent(): Window = new Window(
    gtk_mount_operation_get_parent(this.raw.asInstanceOf).asInstanceOf
  )

  def isShowing(): Boolean =
    gtk_mount_operation_is_showing(this.raw.asInstanceOf).value.!=(0)

  def setDisplay(display: Display): Unit = gtk_mount_operation_set_display(
    this.raw.asInstanceOf,
    display.getUnsafeRawPointer().asInstanceOf
  )

  def setParent(parent: Window): Unit = gtk_mount_operation_set_parent(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf
  )

end MountOperation

object MountOperation:
  def apply(parent: Window): MountOperation = new MountOperation(
    gtk_mount_operation_new(
      parent.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end MountOperation
