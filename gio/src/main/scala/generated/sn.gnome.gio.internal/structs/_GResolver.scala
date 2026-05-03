package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GResolver = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GResolverPrivate]]

object _GResolver:
  given _tag: Tag[_GResolver] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GResolverPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GResolver)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GResolverPrivate] = struct._2
      inline def priv_=(value: Ptr[GResolverPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GResolver on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GResolver] = scala.scalanative.unsafe.alloc[_GResolver](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GResolverPrivate])(using Zone): Ptr[_GResolver] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr