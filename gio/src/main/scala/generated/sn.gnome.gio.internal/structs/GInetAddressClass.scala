package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInetAddressClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._5, Nat._2]]

object GInetAddressClass:
  given _tag: Tag[GInetAddressClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._5, Nat._2]](Tag.Byte, Tag.Digit3[Nat._1, Nat._5, Nat._2](Tag.Nat1, Tag.Nat5, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInetAddressClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def to_string: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def to_string_=(value: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def to_bytes: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]]]
      inline def to_bytes_=(value: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]]] = value
    end extension
  
  // Allocates GInetAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInetAddressClass] = scala.scalanative.unsafe.alloc[GInetAddressClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, to_string : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]], to_bytes : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]])(using Zone): Ptr[GInetAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).to_string = to_string
    (!____ptr).to_bytes = to_bytes
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]].toInt)
    res
  end offsets