package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkListStore = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkListStorePrivate]]

object _GtkListStore:
  given _tag: Tag[_GtkListStore] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkListStorePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkListStore)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkListStorePrivate] = struct._2
      inline def priv_=(value: Ptr[GtkListStorePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkListStore on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkListStore] = scala.scalanative.unsafe.alloc[_GtkListStore](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkListStorePrivate])(using Zone): Ptr[_GtkListStore] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr