package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecUnichar: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecUnichar = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]

object _GParamSpecUnichar:
  given _tag: Tag[_GParamSpecUnichar] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gunichar]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecUnichar)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.gunichar = struct._2
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.gunichar): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GParamSpecUnichar on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecUnichar] = scala.scalanative.unsafe.alloc[_GParamSpecUnichar](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gunichar)(using Zone): Ptr[_GParamSpecUnichar] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr