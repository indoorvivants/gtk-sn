package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTreeModelSort = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelSortPrivate]]

object _GtkTreeModelSort:
  given _tag: Tag[_GtkTreeModelSort] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelSortPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeModelSort)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTreeModelSortPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTreeModelSortPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkTreeModelSort on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeModelSort] = scala.scalanative.unsafe.alloc[_GtkTreeModelSort](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTreeModelSortPrivate])(using Zone): Ptr[_GtkTreeModelSort] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr