package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSeekableIface: _iface: The parent interface. : Tells the current location within a stream. _seek: Checks if seeking is supported by the stream.
*/
opaque type GSeekableIface = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GSeekableIface:
  given _tag: Tag[GSeekableIface] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSeekableIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def tell: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]]]
      inline def tell_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]]] = value
      inline def can_seek: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_seek_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def seek: CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def seek_=(value: CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_truncate: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_truncate_=(value: CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def truncate_fn: CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def truncate_fn_=(value: CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GSeekableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSeekableIface] = scala.scalanative.unsafe.alloc[GSeekableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, tell : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset], can_seek : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], seek : CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_truncate : CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean], truncate_fn : CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GSeekableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).tell = tell
    (!____ptr).can_seek = can_seek
    (!____ptr).seek = seek
    (!____ptr).can_truncate = can_truncate
    (!____ptr).truncate_fn = truncate_fn
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset]].toInt, alignmentof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GSeekable], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GSeekable], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets