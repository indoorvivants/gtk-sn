package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeStore = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeStorePrivate]]

object GtkTreeStore:
  given _tag: Tag[GtkTreeStore] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeStorePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeStore)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTreeStorePrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTreeStorePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkTreeStore on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeStore] = scala.scalanative.unsafe.alloc[GtkTreeStore](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTreeStorePrivate])(using Zone): Ptr[GtkTreeStore] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr