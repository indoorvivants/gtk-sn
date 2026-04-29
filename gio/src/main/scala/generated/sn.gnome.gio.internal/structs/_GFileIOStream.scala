package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileIOStream = CStruct2[GIOStream, Ptr[GFileIOStreamPrivate]]

object _GFileIOStream:
  given _tag: Tag[_GFileIOStream] = Tag.materializeCStruct2Tag[GIOStream, Ptr[GFileIOStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileIOStream)
      inline def parent_instance : GIOStream = struct._1
      inline def parent_instance_=(value: GIOStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GFileIOStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GFileIOStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFileIOStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileIOStream] = scala.scalanative.unsafe.alloc[_GFileIOStream](1)
  def apply(parent_instance : GIOStream, priv : Ptr[GFileIOStreamPrivate])(using Zone): Ptr[_GFileIOStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr