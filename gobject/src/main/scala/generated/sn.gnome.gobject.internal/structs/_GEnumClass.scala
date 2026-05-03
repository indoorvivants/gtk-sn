package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GEnumClass: _type_class: the parent class : the smallest possible value. : the largest possible value. _values: the number of possible values. : an array of #GEnumValue structs describing the individual values.
*/
opaque type _GEnumClass = CStruct5[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]

object _GEnumClass:
  given _tag: Tag[_GEnumClass] = Tag.materializeCStruct5Tag[GTypeClass, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, Ptr[GEnumValue]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GEnumClass)
      inline def g_type_class : GTypeClass = struct._1
      inline def g_type_class_=(value: GTypeClass): Unit = (!struct.at1 = value)
      inline def minimum : _root_.sn.gnome.glib.internal.gint = struct._2
      inline def minimum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at2 = value)
      inline def maximum : _root_.sn.gnome.glib.internal.gint = struct._3
      inline def maximum_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at3 = value)
      inline def n_values : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def n_values_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def values : Ptr[GEnumValue] = struct._5
      inline def values_=(value: Ptr[GEnumValue]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GEnumClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GEnumClass] = scala.scalanative.unsafe.alloc[_GEnumClass](1)
  def apply(g_type_class : GTypeClass, minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, n_values : _root_.sn.gnome.glib.internal.guint, values : Ptr[GEnumValue])(using Zone): Ptr[_GEnumClass] =
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).n_values = n_values
    (!____ptr).values = values
    ____ptr