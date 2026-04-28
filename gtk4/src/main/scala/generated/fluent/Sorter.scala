package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkOrdering
import sn.gnome.gtk4.internal.GtkSorter
import sn.gnome.gtk4.internal.GtkSorterChange
import sn.gnome.gtk4.internal.GtkSorterOrder

class Sorter(raw: Ptr[GtkSorter]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(change: GtkSorterChange): Unit =
    gtk_sorter_changed(this.raw.asInstanceOf, change)

  def compare(item1: Object, item2: Object): GtkOrdering = gtk_sorter_compare(
    this.raw.asInstanceOf,
    gpointer(item1.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    gpointer(item2.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  def getOrder(): GtkSorterOrder = gtk_sorter_get_order(this.raw.asInstanceOf)

end Sorter
