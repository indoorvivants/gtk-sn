package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTreeModelFilterClass = CStruct4[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkTreeModelFilterClass:
  given _tag: Tag[_GtkTreeModelFilterClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeModelFilterClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def visible_=(value: CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, Unit] = struct._3
      inline def modify_=(value: CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkTreeModelFilterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeModelFilterClass] = scala.scalanative.unsafe.alloc[_GtkTreeModelFilterClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, visible : CFuncPtr3[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gboolean], modify : CFuncPtr5[Ptr[GtkTreeModelFilter], Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkTreeModelFilterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).visible = visible
    (!____ptr).modify = modify
    (!____ptr).padding = padding
    ____ptr