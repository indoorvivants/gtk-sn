package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GBufferedOutputStream = CStruct2[GFilterOutputStream, Ptr[GBufferedOutputStreamPrivate]]

object _GBufferedOutputStream:
  given _tag: Tag[_GBufferedOutputStream] = Tag.materializeCStruct2Tag[GFilterOutputStream, Ptr[GBufferedOutputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GBufferedOutputStream)
      inline def parent_instance : GFilterOutputStream = struct._1
      inline def parent_instance_=(value: GFilterOutputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GBufferedOutputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GBufferedOutputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GBufferedOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GBufferedOutputStream] = scala.scalanative.unsafe.alloc[_GBufferedOutputStream](1)
  def apply(parent_instance : GFilterOutputStream, priv : Ptr[GBufferedOutputStreamPrivate])(using Zone): Ptr[_GBufferedOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr