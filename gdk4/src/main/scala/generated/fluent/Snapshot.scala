package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkSnapshot
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** Base type for snapshot operations.
  *
  * The subclass of `GdkSnapshot` used by GTK is [class@Gtk.Snapshot].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Snapshot private[gnome] (raw: Ptr[GdkSnapshot])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end Snapshot

object Snapshot:
  def applyUnsafe(ptr: Ptr[GdkSnapshot])(using Runtime) = summon[Runtime]
    .getOrCreate[Snapshot](ptr.asInstanceOf[Ptr[Byte]], p => new Snapshot(ptr))

end Snapshot
