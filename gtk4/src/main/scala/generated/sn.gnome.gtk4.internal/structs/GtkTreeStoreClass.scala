package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeStoreClass = CStruct2[_root_.sn.gnome.gobject.internal.GObjectClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkTreeStoreClass:
  given _tag: Tag[GtkTreeStoreClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeStoreClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkTreeStoreClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeStoreClass] = scala.scalanative.unsafe.alloc[GtkTreeStoreClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkTreeStoreClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr