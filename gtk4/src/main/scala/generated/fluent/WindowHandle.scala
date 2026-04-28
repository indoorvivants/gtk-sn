package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkWindowHandle

class WindowHandle(raw: Ptr[GtkWindowHandle])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_window_handle_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def setChild(child: Widget): Unit = gtk_window_handle_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end WindowHandle

object WindowHandle:
  def apply(): WindowHandle = new WindowHandle(
    gtk_window_handle_new().asInstanceOf
  )
end WindowHandle
