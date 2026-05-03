package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListStore = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkListStorePrivate]]

object GtkListStore:
  given _tag: Tag[GtkListStore] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkListStorePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkListStore)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkListStorePrivate] = struct._2
      inline def priv_=(value: Ptr[GtkListStorePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkListStore on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkListStore] = scala.scalanative.unsafe.alloc[GtkListStore](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkListStorePrivate])(using Zone): Ptr[GtkListStore] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr