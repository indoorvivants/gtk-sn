package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.{Buildable, MultiFilter}
import sn.gnome.gtk4.internal.GtkAnyFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAnyFilter` matches an item when at least one of its filters matches.
  *
  * To add filters to a `GtkAnyFilter`, use [method@Gtk.MultiFilter.append].
  */
class AnyFilter(raw: Ptr[GtkAnyFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end AnyFilter

object AnyFilter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty "any" filter.
    *
    * Use [method@Gtk.MultiFilter.append] to add filters to it.
    *
    * This filter matches an item if any of the filters added to it matches the
    * item. In particular, this means that if no filter has been added to it,
    * the filter matches no item.
    */
  def apply(): AnyFilter = new AnyFilter(gtk_any_filter_new().asInstanceOf)
end AnyFilter
