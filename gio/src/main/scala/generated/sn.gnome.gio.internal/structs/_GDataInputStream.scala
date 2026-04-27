package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDataInputStream = CStruct2[GBufferedInputStream, Ptr[GDataInputStreamPrivate]]

object _GDataInputStream:
  given _tag: Tag[_GDataInputStream] = Tag.materializeCStruct2Tag[GBufferedInputStream, Ptr[GDataInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDataInputStream)
      inline def parent_instance : GBufferedInputStream = struct._1
      inline def parent_instance_=(value: GBufferedInputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDataInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GDataInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDataInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDataInputStream] = scala.scalanative.unsafe.alloc[_GDataInputStream](1)
  def apply(parent_instance : GBufferedInputStream, priv : Ptr[GDataInputStreamPrivate])(using Zone): Ptr[_GDataInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr