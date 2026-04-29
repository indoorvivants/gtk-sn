package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GConverterOutputStream = CStruct2[GFilterOutputStream, Ptr[GConverterOutputStreamPrivate]]

object _GConverterOutputStream:
  given _tag: Tag[_GConverterOutputStream] = Tag.materializeCStruct2Tag[GFilterOutputStream, Ptr[GConverterOutputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GConverterOutputStream)
      inline def parent_instance : GFilterOutputStream = struct._1
      inline def parent_instance_=(value: GFilterOutputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GConverterOutputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GConverterOutputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GConverterOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GConverterOutputStream] = scala.scalanative.unsafe.alloc[_GConverterOutputStream](1)
  def apply(parent_instance : GFilterOutputStream, priv : Ptr[GConverterOutputStreamPrivate])(using Zone): Ptr[_GConverterOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr