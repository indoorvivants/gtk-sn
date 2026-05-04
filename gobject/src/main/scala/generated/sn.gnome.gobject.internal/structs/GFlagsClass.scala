package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFlagsClass: _type_class: the parent class : a mask covering all possible values. _values: the number of possible values. : an array of #GFlagsValue structs describing the individual values.

 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
opaque type GFlagsClass = CStruct4[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]

object GFlagsClass:
  given _tag: Tag[GFlagsClass] = Tag.materializeCStruct4Tag[GTypeClass, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GFlagsValue]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFlagsClass)
      inline def g_type_class : GTypeClass = struct._1
      inline def g_type_class_=(value: GTypeClass): Unit = (!struct.at1 = value)
      inline def mask : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def mask_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def n_values : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def values : Ptr[GFlagsValue] = struct._4
      inline def values_=(value: Ptr[GFlagsValue]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GFlagsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFlagsClass] = scala.scalanative.unsafe.alloc[GFlagsClass](1)
  def apply(g_type_class : GTypeClass, mask : _root_.sn.gnome.glib.internal.guint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GFlagsValue])(using Zone): Ptr[GFlagsClass] =
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).mask = mask
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr