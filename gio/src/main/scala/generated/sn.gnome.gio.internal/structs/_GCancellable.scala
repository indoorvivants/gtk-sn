package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GCancellable = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GCancellablePrivate]]

object _GCancellable:
  given _tag: Tag[_GCancellable] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GCancellablePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GCancellable)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GCancellablePrivate] = struct._2
      inline def priv_=(value: Ptr[GCancellablePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GCancellable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GCancellable] = scala.scalanative.unsafe.alloc[_GCancellable](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GCancellablePrivate])(using Zone): Ptr[_GCancellable] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr