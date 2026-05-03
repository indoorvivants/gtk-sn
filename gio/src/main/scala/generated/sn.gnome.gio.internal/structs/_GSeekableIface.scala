package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSeekableIface: _iface: The parent interface. : Tells the current location within a stream. _seek: Checks if seeking is supported by the stream.
*/
opaque type _GSeekableIface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset], CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GSeekableIface:
  given _tag: Tag[_GSeekableIface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset], CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSeekableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def tell : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset] = struct._2
      inline def tell_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]): Unit = (!struct.at2 = value)
      inline def can_seek : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def can_seek_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def seek : CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def seek_=(value: CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def can_truncate : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def can_truncate_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def truncate_fn : CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def truncate_fn_=(value: CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GSeekableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSeekableIface] = scala.scalanative.unsafe.alloc[_GSeekableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, tell : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset], can_seek : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], seek : CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_truncate : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], truncate_fn : CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GSeekableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).tell = tell
    (!____ptr).can_seek = can_seek
    (!____ptr).seek = seek
    (!____ptr).can_truncate = can_truncate
    (!____ptr).truncate_fn = truncate_fn
    ____ptr