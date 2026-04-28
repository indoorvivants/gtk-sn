package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLayoutManager
import sn.gnome.gtk4.internal.GtkSizeRequestMode

class LayoutManager(raw: Ptr[GtkLayoutManager])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def allocate(widget: Widget, width: Int, height: Int, baseline: Int): Unit =
    gtk_layout_manager_allocate(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      width,
      height,
      baseline
    )

  def getLayoutChild(child: Widget): LayoutChild = new LayoutChild(
    gtk_layout_manager_get_layout_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getRequestMode(): GtkSizeRequestMode =
    gtk_layout_manager_get_request_mode(this.raw.asInstanceOf)

  def getWidget(): Widget = new Widget(
    gtk_layout_manager_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def layoutChanged(): Unit = gtk_layout_manager_layout_changed(
    this.raw.asInstanceOf
  )

  // Method measure contains an OUT parameter, which is not supported yet

end LayoutManager
