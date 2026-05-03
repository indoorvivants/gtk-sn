package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDataOutputStream = CStruct2[GFilterOutputStream, Ptr[GDataOutputStreamPrivate]]

object _GDataOutputStream:
  given _tag: Tag[_GDataOutputStream] = Tag.materializeCStruct2Tag[GFilterOutputStream, Ptr[GDataOutputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDataOutputStream)
      inline def parent_instance : GFilterOutputStream = struct._1
      inline def parent_instance_=(value: GFilterOutputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GDataOutputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GDataOutputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDataOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDataOutputStream] = scala.scalanative.unsafe.alloc[_GDataOutputStream](1)
  def apply(parent_instance : GFilterOutputStream, priv : Ptr[GDataOutputStreamPrivate])(using Zone): Ptr[_GDataOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr