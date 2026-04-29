package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMemoryOutputStream = CStruct2[GOutputStream, Ptr[GMemoryOutputStreamPrivate]]

object _GMemoryOutputStream:
  given _tag: Tag[_GMemoryOutputStream] = Tag.materializeCStruct2Tag[GOutputStream, Ptr[GMemoryOutputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMemoryOutputStream)
      inline def parent_instance : GOutputStream = struct._1
      inline def parent_instance_=(value: GOutputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GMemoryOutputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GMemoryOutputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMemoryOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMemoryOutputStream] = scala.scalanative.unsafe.alloc[_GMemoryOutputStream](1)
  def apply(parent_instance : GOutputStream, priv : Ptr[GMemoryOutputStreamPrivate])(using Zone): Ptr[_GMemoryOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr