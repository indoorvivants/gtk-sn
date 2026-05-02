package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkSnapshot
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Base type for snapshot operations.
  *
  * The subclass of `GdkSnapshot` used by GTK is [class@Gtk.Snapshot].
  */
class Snapshot(raw: Ptr[GdkSnapshot]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end Snapshot
