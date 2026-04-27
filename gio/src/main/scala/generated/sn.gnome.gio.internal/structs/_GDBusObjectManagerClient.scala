package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDBusObjectManagerClient = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectManagerClientPrivate]]

object _GDBusObjectManagerClient:
  given _tag: Tag[_GDBusObjectManagerClient] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectManagerClientPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectManagerClient)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDBusObjectManagerClientPrivate] = struct._2
      inline def priv_=(value: Ptr[GDBusObjectManagerClientPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusObjectManagerClient on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectManagerClient] = scala.scalanative.unsafe.alloc[_GDBusObjectManagerClient](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectManagerClientPrivate])(using Zone): Ptr[_GDBusObjectManagerClient] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr