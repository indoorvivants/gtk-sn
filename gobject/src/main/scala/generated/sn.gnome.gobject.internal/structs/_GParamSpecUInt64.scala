package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecUInt64: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecUInt64 = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]

object _GParamSpecUInt64:
  given _tag: Tag[_GParamSpecUInt64] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecUInt64)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def minimum : _root_.sn.gnome.glib.internal.guint64 = struct._2
      inline def minimum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = (!struct.at2 = value)
      inline def maximum : _root_.sn.gnome.glib.internal.guint64 = struct._3
      inline def maximum_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = (!struct.at3 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.guint64 = struct._4
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GParamSpecUInt64 on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecUInt64] = scala.scalanative.unsafe.alloc[_GParamSpecUInt64](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint64, maximum : _root_.sn.gnome.glib.internal.guint64, default_value : _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[_GParamSpecUInt64] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr