package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkLayoutChild

class LayoutChild(raw: Ptr[GtkLayoutChild]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChildWidget(): Widget = new Widget(
    gtk_layout_child_get_child_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getLayoutManager(): LayoutManager = new LayoutManager(
    gtk_layout_child_get_layout_manager(this.raw.asInstanceOf).asInstanceOf
  )

end LayoutChild
