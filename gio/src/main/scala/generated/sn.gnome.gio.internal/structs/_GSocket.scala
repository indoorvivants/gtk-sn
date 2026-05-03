package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocket = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GSocketPrivate]]

object _GSocket:
  given _tag: Tag[_GSocket] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GSocketPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocket)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GSocketPrivate] = struct._2
      inline def priv_=(value: Ptr[GSocketPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GSocket on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocket] = scala.scalanative.unsafe.alloc[_GSocket](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GSocketPrivate])(using Zone): Ptr[_GSocket] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr