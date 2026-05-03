package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecBoolean: _instance: private #GParamSpec portion _value: default value for the property specified
*/
opaque type _GParamSpecBoolean = CStruct2[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]

object _GParamSpecBoolean:
  given _tag: Tag[_GParamSpecBoolean] = Tag.materializeCStruct2Tag[GParamSpec, _root_.sn.gnome.glib.internal.gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecBoolean)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def default_value : _root_.sn.gnome.glib.internal.gboolean = struct._2
      inline def default_value_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GParamSpecBoolean on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecBoolean] = scala.scalanative.unsafe.alloc[_GParamSpecBoolean](1)
  def apply(parent_instance : GParamSpec, default_value : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[_GParamSpecBoolean] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    ____ptr