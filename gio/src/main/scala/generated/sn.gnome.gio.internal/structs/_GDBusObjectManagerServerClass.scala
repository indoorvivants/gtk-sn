package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerServerClass: _class: The parent class.
*/
opaque type _GDBusObjectManagerServerClass = CStruct2[_root_.sn.gnome.gobject.internal.GObjectClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusObjectManagerServerClass:
  given _tag: Tag[_GDBusObjectManagerServerClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectManagerServerClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusObjectManagerServerClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectManagerServerClass] = scala.scalanative.unsafe.alloc[_GDBusObjectManagerServerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusObjectManagerServerClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr