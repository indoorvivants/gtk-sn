package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDBusObjectManagerServer = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectManagerServerPrivate]]

object _GDBusObjectManagerServer:
  given _tag: Tag[_GDBusObjectManagerServer] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectManagerServerPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectManagerServer)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDBusObjectManagerServerPrivate] = struct._2
      inline def priv_=(value: Ptr[GDBusObjectManagerServerPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusObjectManagerServer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectManagerServer] = scala.scalanative.unsafe.alloc[_GDBusObjectManagerServer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectManagerServerPrivate])(using Zone): Ptr[_GDBusObjectManagerServer] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr