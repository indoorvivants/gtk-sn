package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.{Buildable, MultiFilter}
import sn.gnome.gtk4.internal.GtkEveryFilter

/** `GtkEveryFilter` matches an item when each of its filters matches.
  *
  * To add filters to a `GtkEveryFilter`, use [method@Gtk.MultiFilter.append].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EveryFilter(raw: Ptr[GtkEveryFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EveryFilter

object EveryFilter:
  /** Creates a new empty "every" filter.
    *
    * Use [method@Gtk.MultiFilter.append] to add filters to it.
    *
    * This filter matches an item if each of the filters added to it matches the
    * item. In particular, this means that if no filter has been added to it,
    * the filter matches every item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EveryFilter = new EveryFilter(
    gtk_every_filter_new().asInstanceOf
  )
end EveryFilter
