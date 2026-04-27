package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPtrArray = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.guint]

object _GPtrArray:
  given _tag: Tag[_GPtrArray] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gpointer], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPtrArray)
      inline def pdata : Ptr[_root_.sn.gnome.glib.internal.gpointer] = struct._1
      inline def pdata_=(value: Ptr[_root_.sn.gnome.glib.internal.gpointer]): Unit = (!struct.at1 = value)
      inline def len : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def len_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GPtrArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPtrArray] = scala.scalanative.unsafe.alloc[_GPtrArray](1)
  def apply(pdata : Ptr[_root_.sn.gnome.glib.internal.gpointer], len : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GPtrArray] =
    val ____ptr = apply()
    (!____ptr).pdata = pdata
    (!____ptr).len = len
    ____ptr