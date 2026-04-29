package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecObject: _instance: private #GParamSpec portion
*/
opaque type GParamSpecObject = CStruct1[GParamSpec]

object GParamSpecObject:
  given _tag: Tag[GParamSpecObject] = Tag.materializeCStruct1Tag[GParamSpec]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecObject)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GParamSpecObject on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecObject] = scala.scalanative.unsafe.alloc[GParamSpecObject](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[GParamSpecObject] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr