package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileOutputStream = CStruct2[GOutputStream, Ptr[GFileOutputStreamPrivate]]

object _GFileOutputStream:
  given _tag: Tag[_GFileOutputStream] = Tag.materializeCStruct2Tag[GOutputStream, Ptr[GFileOutputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileOutputStream)
      inline def parent_instance : GOutputStream = struct._1
      inline def parent_instance_=(value: GOutputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GFileOutputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GFileOutputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFileOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileOutputStream] = scala.scalanative.unsafe.alloc[_GFileOutputStream](1)
  def apply(parent_instance : GOutputStream, priv : Ptr[GFileOutputStreamPrivate])(using Zone): Ptr[_GFileOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr