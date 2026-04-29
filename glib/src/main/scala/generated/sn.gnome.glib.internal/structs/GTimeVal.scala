package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTimeVal = CStruct2[glong, glong]

object GTimeVal:
  given _tag: Tag[GTimeVal] = Tag.materializeCStruct2Tag[glong, glong]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTimeVal)
      inline def tv_sec : glong = struct._1
      inline def tv_sec_=(value: glong): Unit = (!struct.at1 = value)
      inline def tv_usec : glong = struct._2
      inline def tv_usec_=(value: glong): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GTimeVal on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTimeVal] = scala.scalanative.unsafe.alloc[GTimeVal](1)
  def apply(tv_sec : glong, tv_usec : glong)(using Zone): Ptr[GTimeVal] =
    val ____ptr = apply()
    (!____ptr).tv_sec = tv_sec
    (!____ptr).tv_usec = tv_usec
    ____ptr