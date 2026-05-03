package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTreeModelFilter = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelFilterPrivate]]

object _GtkTreeModelFilter:
  given _tag: Tag[_GtkTreeModelFilter] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelFilterPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeModelFilter)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTreeModelFilterPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTreeModelFilterPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkTreeModelFilter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeModelFilter] = scala.scalanative.unsafe.alloc[_GtkTreeModelFilter](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTreeModelFilterPrivate])(using Zone): Ptr[_GtkTreeModelFilter] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr