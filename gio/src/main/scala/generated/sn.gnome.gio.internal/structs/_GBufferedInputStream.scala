package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GBufferedInputStream = CStruct2[GFilterInputStream, Ptr[GBufferedInputStreamPrivate]]

object _GBufferedInputStream:
  given _tag: Tag[_GBufferedInputStream] = Tag.materializeCStruct2Tag[GFilterInputStream, Ptr[GBufferedInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GBufferedInputStream)
      inline def parent_instance : GFilterInputStream = struct._1
      inline def parent_instance_=(value: GFilterInputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GBufferedInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GBufferedInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GBufferedInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GBufferedInputStream] = scala.scalanative.unsafe.alloc[_GBufferedInputStream](1)
  def apply(parent_instance : GFilterInputStream, priv : Ptr[GBufferedInputStreamPrivate])(using Zone): Ptr[_GBufferedInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr