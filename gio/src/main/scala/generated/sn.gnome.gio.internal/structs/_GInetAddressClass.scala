package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GInetAddressClass = CStruct3[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]]

object _GInetAddressClass:
  given _tag: Tag[_GInetAddressClass] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInetAddressClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def to_string : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._2
      inline def to_string_=(value: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at2 = value)
      inline def to_bytes : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]] = struct._3
      inline def to_bytes_=(value: CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GInetAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInetAddressClass] = scala.scalanative.unsafe.alloc[_GInetAddressClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, to_string : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.gchar]], to_bytes : CFuncPtr1[Ptr[GInetAddress], Ptr[_root_.sn.gnome.glib.internal.guint8]])(using Zone): Ptr[_GInetAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).to_string = to_string
    (!____ptr).to_bytes = to_bytes
    ____ptr