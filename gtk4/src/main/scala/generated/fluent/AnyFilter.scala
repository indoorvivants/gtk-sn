package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Buildable, MultiFilter}
import sn.gnome.gtk4.internal.GtkAnyFilter

/** `GtkAnyFilter` matches an item when at least one of its filters matches.
  *
  * To add filters to a `GtkAnyFilter`, use [method@Gtk.MultiFilter.append].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AnyFilter private[gnome] (raw: Ptr[GtkAnyFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end AnyFilter

object AnyFilter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAnyFilter])(using Runtime) =
    summon[Runtime].getOrCreate[AnyFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AnyFilter(ptr)
    )

  /** Creates a new empty "any" filter.
    *
    * Use [method@Gtk.MultiFilter.append] to add filters to it.
    *
    * This filter matches an item if any of the filters added to it matches the
    * item. In particular, this means that if no filter has been added to it,
    * the filter matches no item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): AnyFilter =
    val raw: Ptr[Byte] = gtk_any_filter_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[AnyFilter](raw, r => AnyFilter.applyUnsafe(r.asInstanceOf))
  end apply
end AnyFilter
