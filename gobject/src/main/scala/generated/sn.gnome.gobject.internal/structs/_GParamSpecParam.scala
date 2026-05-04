package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecParam: _instance: private #GParamSpec portion

 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
opaque type _GParamSpecParam = CStruct1[GParamSpec]

object _GParamSpecParam:
  given _tag: Tag[_GParamSpecParam] = Tag.materializeCStruct1Tag[GParamSpec]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecParam)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GParamSpecParam on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecParam] = scala.scalanative.unsafe.alloc[_GParamSpecParam](1)
  def apply(parent_instance : GParamSpec)(using Zone): Ptr[_GParamSpecParam] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr