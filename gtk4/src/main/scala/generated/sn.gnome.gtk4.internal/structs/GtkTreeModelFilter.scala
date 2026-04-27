package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeModelFilter = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelFilterPrivate]]

object GtkTreeModelFilter:
  given _tag: Tag[GtkTreeModelFilter] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkTreeModelFilterPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeModelFilter)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkTreeModelFilterPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkTreeModelFilterPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkTreeModelFilter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeModelFilter] = scala.scalanative.unsafe.alloc[GtkTreeModelFilter](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkTreeModelFilterPrivate])(using Zone): Ptr[GtkTreeModelFilter] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr