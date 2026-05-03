package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPermission = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GPermissionPrivate]]

object _GPermission:
  given _tag: Tag[_GPermission] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GPermissionPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPermission)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GPermissionPrivate] = struct._2
      inline def priv_=(value: Ptr[GPermissionPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GPermission on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPermission] = scala.scalanative.unsafe.alloc[_GPermission](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GPermissionPrivate])(using Zone): Ptr[_GPermission] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr