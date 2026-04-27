package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticResource = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GStaticResource:
  given _tag: Tag[GStaticResource] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticResource)
      inline def data: Ptr[_root_.sn.gnome.glib.internal.guint8] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.guint8]]]
      inline def data_=(value: Ptr[_root_.sn.gnome.glib.internal.guint8]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.guint8]]] = value
      inline def data_len: _root_.sn.gnome.glib.internal.gsize = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
      inline def data_len_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
      inline def resource: Ptr[GResource] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[GResource]]]
      inline def resource_=(value: Ptr[GResource]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[GResource]]] = value
      inline def next: Ptr[GStaticResource] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[GStaticResource]]]
      inline def next_=(value: Ptr[GStaticResource]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[GStaticResource]]] = value
      inline def padding: _root_.sn.gnome.glib.internal.gpointer = !struct.at(offsets(4)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
      inline def padding_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
    end extension
  
  // Allocates GStaticResource on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticResource] = scala.scalanative.unsafe.alloc[GStaticResource](1)
  def apply(data : Ptr[_root_.sn.gnome.glib.internal.guint8], data_len : _root_.sn.gnome.glib.internal.gsize, resource : Ptr[GResource], next : Ptr[GStaticResource], padding : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GStaticResource] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).data_len = data_len
    (!____ptr).resource = resource
    (!____ptr).next = next
    (!____ptr).padding = padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[Ptr[_root_.sn.gnome.glib.internal.guint8]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[_root_.sn.gnome.glib.internal.guint8]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gsize].toInt)
    res(2) = align(res(1) + sizeof[_root_.sn.gnome.glib.internal.gsize].toInt, alignmentof[Ptr[GResource]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[GResource]].toInt, alignmentof[Ptr[GStaticResource]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[GStaticResource]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets