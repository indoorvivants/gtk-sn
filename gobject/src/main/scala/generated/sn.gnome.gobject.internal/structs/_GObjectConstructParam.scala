package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GObjectConstructParam: : the #GParamSpec of the construct parameter : the value to set the parameter to
*/
opaque type _GObjectConstructParam = CStruct2[Ptr[GParamSpec], Ptr[GValue]]

object _GObjectConstructParam:
  given _tag: Tag[_GObjectConstructParam] = Tag.materializeCStruct2Tag[Ptr[GParamSpec], Ptr[GValue]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GObjectConstructParam)
      inline def pspec : Ptr[GParamSpec] = struct._1
      inline def pspec_=(value: Ptr[GParamSpec]): Unit = (!struct.at1 = value)
      inline def value : Ptr[GValue] = struct._2
      inline def value_=(value: Ptr[GValue]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GObjectConstructParam on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GObjectConstructParam] = scala.scalanative.unsafe.alloc[_GObjectConstructParam](1)
  def apply(pspec : Ptr[GParamSpec], value : Ptr[GValue])(using Zone): Ptr[_GObjectConstructParam] =
    val ____ptr = apply()
    (!____ptr).pspec = pspec
    (!____ptr).value = value
    ____ptr