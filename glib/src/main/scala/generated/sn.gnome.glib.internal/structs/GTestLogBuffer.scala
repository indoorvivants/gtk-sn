package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestLogBuffer = CStruct2[Ptr[GString], Ptr[Byte]]

object GTestLogBuffer:
  given _tag: Tag[GTestLogBuffer] = Tag.materializeCStruct2Tag[Ptr[GString], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTestLogBuffer)
      inline def data : Ptr[GString] = struct._1
      inline def data_=(value: Ptr[GString]): Unit = (!struct.at1 = value)
      inline def msgs : Ptr[GSList] = struct._2.asInstanceOf[Ptr[GSList]]
      inline def msgs_=(value: Ptr[GSList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GTestLogBuffer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTestLogBuffer] = scala.scalanative.unsafe.alloc[GTestLogBuffer](1)
  def apply(data : Ptr[GString], msgs : Ptr[GSList])(using Zone): Ptr[GTestLogBuffer] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).msgs = msgs
    ____ptr