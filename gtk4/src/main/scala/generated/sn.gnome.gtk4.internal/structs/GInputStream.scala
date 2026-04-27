package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInputStream = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[_root_.sn.gnome.gio.internal.GInputStreamPrivate]]

object GInputStream:
  given _tag: Tag[GInputStream] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[_root_.sn.gnome.gio.internal.GInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInputStream)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[_root_.sn.gnome.gio.internal.GInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[_root_.sn.gnome.gio.internal.GInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInputStream] = scala.scalanative.unsafe.alloc[GInputStream](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[_root_.sn.gnome.gio.internal.GInputStreamPrivate])(using Zone): Ptr[GInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr