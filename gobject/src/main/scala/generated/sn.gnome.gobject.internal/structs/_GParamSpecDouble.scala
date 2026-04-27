package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecDouble: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified : values closer than will be considered identical by g_param_values_cmp(); the default value is 1e-90.
*/
opaque type _GParamSpecDouble = CStruct5[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]

object _GParamSpecDouble:
  given _tag: Tag[_GParamSpecDouble] = Tag.materializeCStruct5Tag[GParamSpec, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble, _root_.sn.gnome.glib.internal.gdouble]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecDouble)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def minimum : _root_.sn.gnome.glib.internal.gdouble = struct._2
      inline def minimum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = (!struct.at2 = value)
      inline def maximum : _root_.sn.gnome.glib.internal.gdouble = struct._3
      inline def maximum_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = (!struct.at3 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.gdouble = struct._4
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = (!struct.at4 = value)
      inline def epsilon : _root_.sn.gnome.glib.internal.gdouble = struct._5
      inline def epsilon_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GParamSpecDouble on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecDouble] = scala.scalanative.unsafe.alloc[_GParamSpecDouble](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gdouble, maximum : _root_.sn.gnome.glib.internal.gdouble, default_value : _root_.sn.gnome.glib.internal.gdouble, epsilon : _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[_GParamSpecDouble] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    (!____ptr).epsilon = epsilon
    ____ptr