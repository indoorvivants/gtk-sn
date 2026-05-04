package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
opaque type _GValueArray = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]

object _GValueArray:
  given _tag: Tag[_GValueArray] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GValueArray)
      inline def n_values : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def values : Ptr[GValue] = struct._2
      inline def values_=(value: Ptr[GValue]): Unit = (!struct.at2 = value)
      inline def n_prealloced : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def n_prealloced_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GValueArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GValueArray] = scala.scalanative.unsafe.alloc[_GValueArray](1)
  def apply(n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GValue], n_prealloced : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GValueArray] =
    val ____ptr = apply()
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    (!____ptr).n_prealloced = n_prealloced
    ____ptr