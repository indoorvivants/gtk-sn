package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GConverterInputStream = CStruct2[GFilterInputStream, Ptr[GConverterInputStreamPrivate]]

object _GConverterInputStream:
  given _tag: Tag[_GConverterInputStream] = Tag.materializeCStruct2Tag[GFilterInputStream, Ptr[GConverterInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GConverterInputStream)
      inline def parent_instance : GFilterInputStream = struct._1
      inline def parent_instance_=(value: GFilterInputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GConverterInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GConverterInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GConverterInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GConverterInputStream] = scala.scalanative.unsafe.alloc[_GConverterInputStream](1)
  def apply(parent_instance : GFilterInputStream, priv : Ptr[GConverterInputStreamPrivate])(using Zone): Ptr[_GConverterInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr