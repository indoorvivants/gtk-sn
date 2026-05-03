package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecUChar: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type _GParamSpecUChar = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]

object _GParamSpecUChar:
  given _tag: Tag[_GParamSpecUChar] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecUChar)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def minimum : _root_.sn.gnome.glib.internal.guint8 = struct._2
      inline def minimum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at2 = value)
      inline def maximum : _root_.sn.gnome.glib.internal.guint8 = struct._3
      inline def maximum_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at3 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.guint8 = struct._4
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GParamSpecUChar on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecUChar] = scala.scalanative.unsafe.alloc[_GParamSpecUChar](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.guint8, maximum : _root_.sn.gnome.glib.internal.guint8, default_value : _root_.sn.gnome.glib.internal.guint8)(using Zone): Ptr[_GParamSpecUChar] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr