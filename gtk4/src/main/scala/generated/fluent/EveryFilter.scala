package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Buildable, MultiFilter}
import sn.gnome.gtk4.internal.GtkEveryFilter

/** `GtkEveryFilter` matches an item when each of its filters matches.
  *
  * To add filters to a `GtkEveryFilter`, use [method@Gtk.MultiFilter.append].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EveryFilter private[gnome] (raw: Ptr[GtkEveryFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EveryFilter

object EveryFilter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEveryFilter])(using Runtime) =
    summon[Runtime].getOrCreate[EveryFilter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EveryFilter(ptr)
    )

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
  def apply()(using Runtime): EveryFilter =
    val raw: Ptr[Byte] = gtk_every_filter_new().asInstanceOf
    summon[Runtime].getOrCreate[EveryFilter](
      raw,
      r => EveryFilter.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EveryFilter
