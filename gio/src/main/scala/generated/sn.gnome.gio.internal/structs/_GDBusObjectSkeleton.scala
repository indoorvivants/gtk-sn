package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDBusObjectSkeleton = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectSkeletonPrivate]]

object _GDBusObjectSkeleton:
  given _tag: Tag[_GDBusObjectSkeleton] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GDBusObjectSkeletonPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectSkeleton)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDBusObjectSkeletonPrivate] = struct._2
      inline def priv_=(value: Ptr[GDBusObjectSkeletonPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusObjectSkeleton on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectSkeleton] = scala.scalanative.unsafe.alloc[_GDBusObjectSkeleton](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GDBusObjectSkeletonPrivate])(using Zone): Ptr[_GDBusObjectSkeleton] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr