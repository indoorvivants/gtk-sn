package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecEnum: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecEnum = CStruct3[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]

object _GParamSpecEnum:
  given _tag: Tag[_GParamSpecEnum] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GEnumClass], _root_.sn.gnome.glib.internal.gint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecEnum)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def enum_class : Ptr[GEnumClass] = struct._2
      inline def enum_class_=(value: Ptr[GEnumClass]): Unit = (!struct.at2 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.gint = struct._3
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GParamSpecEnum on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecEnum] = scala.scalanative.unsafe.alloc[_GParamSpecEnum](1)
  def apply(parent_instance : GParamSpec, enum_class : Ptr[GEnumClass], default_value : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_GParamSpecEnum] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).enum_class = enum_class
    (!____ptr).default_value = default_value
    ____ptr