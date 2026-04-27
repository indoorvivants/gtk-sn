package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GArray = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint]

object _GArray:
  given _tag: Tag[_GArray] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GArray)
      inline def data : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def data_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def len : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def len_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GArray] = scala.scalanative.unsafe.alloc[_GArray](1)
  def apply(data : Ptr[_root_.sn.gnome.glib.internal.gchar], len : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GArray] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr