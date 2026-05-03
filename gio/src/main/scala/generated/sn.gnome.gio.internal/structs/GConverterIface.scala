package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConverterIface: _iface: The parent interface. : Converts data. : Reverts the internal state of the converter to its initial state.
*/
opaque type GConverterIface = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GConverterIface:
  given _tag: Tag[GConverterIface] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GConverterIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def convert: CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]]]
      inline def convert_=(value: CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]]] = value
      inline def reset: CFuncPtr1[Ptr[GConverter], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GConverter], Unit]]]
      inline def reset_=(value: CFuncPtr1[Ptr[GConverter], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GConverter], Unit]]] = value
    end extension
  
  // Allocates GConverterIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GConverterIface] = scala.scalanative.unsafe.alloc[GConverterIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, convert : CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult], reset : CFuncPtr1[Ptr[GConverter], Unit])(using Zone): Ptr[GConverterIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).convert = convert
    (!____ptr).reset = reset
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](3)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]].toInt, alignmentof[CFuncPtr1[Ptr[GConverter], Unit]].toInt)
    res
  end offsets