package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GStaticResource = CStruct5[Ptr[_root_.sn.gnome.glib.internal.guint8], _root_.sn.gnome.glib.internal.gsize, Ptr[GResource], Ptr[Byte], _root_.sn.gnome.glib.internal.gpointer]

object _GStaticResource:
  given _tag: Tag[_GStaticResource] = Tag.materializeCStruct5Tag[Ptr[_root_.sn.gnome.glib.internal.guint8], _root_.sn.gnome.glib.internal.gsize, Ptr[GResource], Ptr[Byte], _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GStaticResource)
      inline def data : Ptr[_root_.sn.gnome.glib.internal.guint8] = struct._1
      inline def data_=(value: Ptr[_root_.sn.gnome.glib.internal.guint8]): Unit = (!struct.at1 = value)
      inline def data_len : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def data_len_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
      inline def resource : Ptr[GResource] = struct._3
      inline def resource_=(value: Ptr[GResource]): Unit = (!struct.at3 = value)
      inline def next : Ptr[GStaticResource] = struct._4.asInstanceOf[Ptr[GStaticResource]]
      inline def next_=(value: Ptr[GStaticResource]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def padding : _root_.sn.gnome.glib.internal.gpointer = struct._5
      inline def padding_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GStaticResource on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GStaticResource] = scala.scalanative.unsafe.alloc[_GStaticResource](1)
  def apply(data : Ptr[_root_.sn.gnome.glib.internal.guint8], data_len : _root_.sn.gnome.glib.internal.gsize, resource : Ptr[GResource], next : Ptr[GStaticResource], padding : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GStaticResource] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).data_len = data_len
    (!____ptr).resource = resource
    (!____ptr).next = next
    (!____ptr).padding = padding
    ____ptr