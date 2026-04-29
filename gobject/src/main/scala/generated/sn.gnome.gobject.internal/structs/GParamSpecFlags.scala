package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecFlags: _instance: private #GParamSpec portion _class: the #GFlagsClass for the flags _value: default value for the property specified
*/
opaque type GParamSpecFlags = CStruct3[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]

object GParamSpecFlags:
  given _tag: Tag[GParamSpecFlags] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GFlagsClass], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecFlags)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def flags_class : Ptr[GFlagsClass] = struct._2
      inline def flags_class_=(value: Ptr[GFlagsClass]): Unit = (!struct.at2 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GParamSpecFlags on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecFlags] = scala.scalanative.unsafe.alloc[GParamSpecFlags](1)
  def apply(parent_instance : GParamSpec, flags_class : Ptr[GFlagsClass], default_value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecFlags] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).flags_class = flags_class
    (!____ptr).default_value = default_value
    ____ptr