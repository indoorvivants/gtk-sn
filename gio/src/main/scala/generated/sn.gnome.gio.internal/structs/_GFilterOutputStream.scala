package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFilterOutputStream = CStruct2[GOutputStream, Ptr[GOutputStream]]

object _GFilterOutputStream:
  given _tag: Tag[_GFilterOutputStream] = Tag.materializeCStruct2Tag[GOutputStream, Ptr[GOutputStream]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFilterOutputStream)
      inline def parent_instance : GOutputStream = struct._1
      inline def parent_instance_=(value: GOutputStream): Unit = (!struct.at1 = value)
      inline def base_stream : Ptr[GOutputStream] = struct._2
      inline def base_stream_=(value: Ptr[GOutputStream]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFilterOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFilterOutputStream] = scala.scalanative.unsafe.alloc[_GFilterOutputStream](1)
  def apply(parent_instance : GOutputStream, base_stream : Ptr[GOutputStream])(using Zone): Ptr[_GFilterOutputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).base_stream = base_stream
    ____ptr