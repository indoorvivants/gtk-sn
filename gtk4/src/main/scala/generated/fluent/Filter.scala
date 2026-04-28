package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkFilter
import sn.gnome.gtk4.internal.GtkFilterChange
import sn.gnome.gtk4.internal.GtkFilterMatch

class Filter(raw: Ptr[GtkFilter]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(change: GtkFilterChange): Unit =
    gtk_filter_changed(this.raw.asInstanceOf, change)

  def getStrictness(): GtkFilterMatch = gtk_filter_get_strictness(
    this.raw.asInstanceOf
  )

  def `match`(item: Object): Boolean = gtk_filter_match(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  ).value.!=(0)

end Filter
