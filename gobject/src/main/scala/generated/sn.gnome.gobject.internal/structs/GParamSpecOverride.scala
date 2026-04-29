package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecOverride:
*/
opaque type GParamSpecOverride = CStruct2[GParamSpec, Ptr[GParamSpec]]

object GParamSpecOverride:
  given _tag: Tag[GParamSpecOverride] = Tag.materializeCStruct2Tag[GParamSpec, Ptr[GParamSpec]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecOverride)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def overridden : Ptr[GParamSpec] = struct._2
      inline def overridden_=(value: Ptr[GParamSpec]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GParamSpecOverride on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecOverride] = scala.scalanative.unsafe.alloc[GParamSpecOverride](1)
  def apply(parent_instance : GParamSpec, overridden : Ptr[GParamSpec])(using Zone): Ptr[GParamSpecOverride] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).overridden = overridden
    ____ptr