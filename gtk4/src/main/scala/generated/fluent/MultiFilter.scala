package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkMultiFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMultiFilter` is the base class for filters that combine multiple
  * filters.
  */
class MultiFilter(raw: Ptr[GtkMultiFilter])
    extends Filter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a @filter to @self to use for matching.
    */
  def append(filter: Filter /* Some(Ptr[GtkFilter]) */ ): Unit /* None */ =
    gtk_multi_filter_append(
      this.raw.asInstanceOf[Ptr[GtkMultiFilter]],
      filter.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the filter at the given @position from the list of filters used by @self.
    *
    * If @position is larger than the number of filters, nothing happens and the
    * function returns.
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_multi_filter_remove(
    this.raw.asInstanceOf[Ptr[GtkMultiFilter]],
    guint(position)
  )

end MultiFilter
