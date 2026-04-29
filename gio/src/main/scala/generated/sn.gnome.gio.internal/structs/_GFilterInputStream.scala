package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFilterInputStream = CStruct2[GInputStream, Ptr[GInputStream]]

object _GFilterInputStream:
  given _tag: Tag[_GFilterInputStream] = Tag.materializeCStruct2Tag[GInputStream, Ptr[GInputStream]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFilterInputStream)
      inline def parent_instance : GInputStream = struct._1
      inline def parent_instance_=(value: GInputStream): Unit = (!struct.at1 = value)
      inline def base_stream : Ptr[GInputStream] = struct._2
      inline def base_stream_=(value: Ptr[GInputStream]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFilterInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFilterInputStream] = scala.scalanative.unsafe.alloc[_GFilterInputStream](1)
  def apply(parent_instance : GInputStream, base_stream : Ptr[GInputStream])(using Zone): Ptr[_GFilterInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).base_stream = base_stream
    ____ptr