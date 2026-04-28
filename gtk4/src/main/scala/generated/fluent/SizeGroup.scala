package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GSList
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSizeGroup
import sn.gnome.gtk4.internal.GtkSizeGroupMode

class SizeGroup(raw: Ptr[GtkSizeGroup])
    extends Object(raw.asInstanceOf),
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addWidget(widget: Widget): Unit = gtk_size_group_add_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def getMode(): GtkSizeGroupMode = gtk_size_group_get_mode(
    this.raw.asInstanceOf
  )

  def getWidgets(): Ptr[GSList] = gtk_size_group_get_widgets(
    this.raw.asInstanceOf
  )

  def removeWidget(widget: Widget): Unit = gtk_size_group_remove_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setMode(mode: GtkSizeGroupMode): Unit =
    gtk_size_group_set_mode(this.raw.asInstanceOf, mode)

end SizeGroup

object SizeGroup:
  def apply(mode: GtkSizeGroupMode): SizeGroup = new SizeGroup(
    gtk_size_group_new(mode).asInstanceOf
  )
end SizeGroup
