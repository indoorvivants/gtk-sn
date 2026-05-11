package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Buildable, Filter}
import sn.gnome.gtk4.internal.GtkMultiFilter

/** `GtkMultiFilter` is the base class for filters that combine multiple
  * filters.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MultiFilter private[gnome] (raw: Ptr[GtkMultiFilter])
    extends Filter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a @filter to @self to use for matching.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      filter: sn.gnome.gtk4.fluent.Filter /* Some(Ptr[GtkFilter]) */
  )(using Runtime): Unit /* None */ =
    gtk_multi_filter_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMultiFilter]],
      filter.getUnsafeRawPointer().asInstanceOf
    )
  end append

  /** Removes the filter at the given @position from the list of filters used by @self.
    *
    * If @position is larger than the number of filters, nothing happens and the
    * function returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_multi_filter_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMultiFilter]],
      guint(position)
    )
  end remove

end MultiFilter

object MultiFilter:
  def applyUnsafe(ptr: Ptr[GtkMultiFilter])(using Runtime) =
    summon[Runtime].getOrCreate[MultiFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MultiFilter(ptr)
    )

end MultiFilter
