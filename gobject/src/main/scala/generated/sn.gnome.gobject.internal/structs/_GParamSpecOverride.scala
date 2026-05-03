package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecOverride:
*/
opaque type _GParamSpecOverride = CStruct2[GParamSpec, Ptr[GParamSpec]]

object _GParamSpecOverride:
  given _tag: Tag[_GParamSpecOverride] = Tag.materializeCStruct2Tag[GParamSpec, Ptr[GParamSpec]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecOverride)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def overridden : Ptr[GParamSpec] = struct._2
      inline def overridden_=(value: Ptr[GParamSpec]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GParamSpecOverride on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecOverride] = scala.scalanative.unsafe.alloc[_GParamSpecOverride](1)
  def apply(parent_instance : GParamSpec, overridden : Ptr[GParamSpec])(using Zone): Ptr[_GParamSpecOverride] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).overridden = overridden
    ____ptr