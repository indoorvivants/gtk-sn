package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketClient = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GSocketClientPrivate]]

object _GSocketClient:
  given _tag: Tag[_GSocketClient] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GSocketClientPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketClient)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GSocketClientPrivate] = struct._2
      inline def priv_=(value: Ptr[GSocketClientPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GSocketClient on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketClient] = scala.scalanative.unsafe.alloc[_GSocketClient](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GSocketClientPrivate])(using Zone): Ptr[_GSocketClient] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr