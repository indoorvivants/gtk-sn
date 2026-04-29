package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsFileDatabaseInterface: _iface: The parent interface.
*/
opaque type GTlsFileDatabaseInterface = CArray[CChar, Nat.Digit2[Nat._8, Nat._0]]

object GTlsFileDatabaseInterface:
  given _tag: Tag[GTlsFileDatabaseInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._0]](Tag.Byte, Tag.Digit2[Nat._8, Nat._0](Tag.Nat8, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsFileDatabaseInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(1)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GTlsFileDatabaseInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsFileDatabaseInterface] = scala.scalanative.unsafe.alloc[GTlsFileDatabaseInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GTlsFileDatabaseInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).padding = padding
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets