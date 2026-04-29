package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketAddressClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]]

object GSocketAddressClass:
  given _tag: Tag[GSocketAddressClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]](Tag.Byte, Tag.Digit3[Nat._1, Nat._6, Nat._0](Tag.Nat1, Tag.Nat6, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketAddressClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_family: CFuncPtr1[Ptr[GSocketAddress], GSocketFamily] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]]]
      inline def get_family_=(value: CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]]] = value
      inline def get_native_size: CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]]]
      inline def get_native_size_=(value: CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]]] = value
      inline def to_native: CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def to_native_=(value: CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GSocketAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketAddressClass] = scala.scalanative.unsafe.alloc[GSocketAddressClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_family : CFuncPtr1[Ptr[GSocketAddress], GSocketFamily], get_native_size : CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize], to_native : CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GSocketAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_family = get_family
    (!____ptr).get_native_size = get_native_size
    (!____ptr).to_native = to_native
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GSocketAddress], GSocketFamily]].toInt, alignmentof[CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gssize]].toInt, alignmentof[CFuncPtr4[Ptr[GSocketAddress], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets