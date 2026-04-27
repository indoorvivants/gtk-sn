package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecBoxed: _instance: private #GParamSpec portion
*/
opaque type _GParamSpecBoxed = CStruct1[GParamSpec]

object _GParamSpecBoxed:
  given _tag: Tag[_GParamSpecBoxed] = Tag.materializeCStruct1Tag[GParamSpec]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecBoxed)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GParamSpecBoxed on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecBoxed] = scala.scalanative.unsafe.alloc[_GParamSpecBoxed](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecBoxed] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr