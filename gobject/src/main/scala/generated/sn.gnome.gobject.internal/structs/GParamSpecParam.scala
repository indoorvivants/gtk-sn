package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecParam: _instance: private #GParamSpec portion
*/
opaque type GParamSpecParam = CStruct1[GParamSpec]

object GParamSpecParam:
  given _tag: Tag[GParamSpecParam] = Tag.materializeCStruct1Tag[GParamSpec]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecParam)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GParamSpecParam on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecParam] = scala.scalanative.unsafe.alloc[GParamSpecParam](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecParam] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr