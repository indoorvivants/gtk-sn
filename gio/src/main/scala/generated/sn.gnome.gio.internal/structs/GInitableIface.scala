package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GInitableIface: _iface: The parent interface. : Initializes the object.
*/
opaque type GInitableIface = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]

object GInitableIface:
  given _tag: Tag[GInitableIface] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInitableIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def init: CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def init_=(value: CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GInitableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInitableIface] = scala.scalanative.unsafe.alloc[GInitableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, init : CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GInitableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).init = init
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](2)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets