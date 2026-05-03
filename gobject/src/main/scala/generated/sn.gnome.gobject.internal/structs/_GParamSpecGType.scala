package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecGType: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecGType = CStruct2[GParamSpec, GType]

object _GParamSpecGType:
  given _tag: Tag[_GParamSpecGType] = Tag.materializeCStruct2Tag[GParamSpec, GType]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecGType)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def is_a_type : GType = struct._2
      inline def is_a_type_=(value: GType): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GParamSpecGType on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecGType] = scala.scalanative.unsafe.alloc[_GParamSpecGType](1)
  def apply(parent_instance : GParamSpec, is_a_type : GType)(using Zone): Ptr[_GParamSpecGType] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).is_a_type = is_a_type
    ____ptr