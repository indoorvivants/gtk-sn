package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListHeader

class ListHeader(raw: Ptr[GtkListHeader]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_list_header_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getEnd(): UInt = gtk_list_header_get_end(this.raw.asInstanceOf).value

  def getItem(): Object = new Object(
    gtk_list_header_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  def getNItems(): UInt = gtk_list_header_get_n_items(
    this.raw.asInstanceOf
  ).value

  def getStart(): UInt = gtk_list_header_get_start(this.raw.asInstanceOf).value

  def setChild(child: Widget): Unit = gtk_list_header_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end ListHeader
