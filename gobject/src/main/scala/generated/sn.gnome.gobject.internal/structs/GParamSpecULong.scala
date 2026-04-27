package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecULong: _instance: private #GParamSpec portion : minimum value for the property specified : maximum value for the property specified _value: default value for the property specified
*/
opaque type GParamSpecULong = CStruct4[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]

object GParamSpecULong:
  given _tag: Tag[GParamSpecULong] = Tag.materializeCStruct4Tag[GParamSpec, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.gulong]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecULong)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def minimum : _root_.sn.gnome.glib.internal.gulong = struct._2
      inline def minimum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = (!struct.at2 = value)
      inline def maximum : _root_.sn.gnome.glib.internal.gulong = struct._3
      inline def maximum_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = (!struct.at3 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.gulong = struct._4
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GParamSpecULong on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecULong] = scala.scalanative.unsafe.alloc[GParamSpecULong](1)
  def apply(parent_instance : GParamSpec, minimum : _root_.sn.gnome.glib.internal.gulong, maximum : _root_.sn.gnome.glib.internal.gulong, default_value : _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GParamSpecULong] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).minimum = minimum
    (!____ptr).maximum = maximum
    (!____ptr).default_value = default_value
    ____ptr