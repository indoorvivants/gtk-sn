package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkMultiFilter

class MultiFilter(raw: Ptr[GtkMultiFilter])
    extends Filter(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(filter: Filter): Unit = gtk_multi_filter_append(
    this.raw.asInstanceOf,
    filter.getUnsafeRawPointer().asInstanceOf
  )

  def remove(position: UInt): Unit =
    gtk_multi_filter_remove(this.raw.asInstanceOf, guint(position))

end MultiFilter
