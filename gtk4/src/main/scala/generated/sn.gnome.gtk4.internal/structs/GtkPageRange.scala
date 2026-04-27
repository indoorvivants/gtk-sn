package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPageRange: : start of page range. : end of page range.
*/
opaque type GtkPageRange = CStruct2[CInt, CInt]

object GtkPageRange:
  given _tag: Tag[GtkPageRange] = Tag.materializeCStruct2Tag[CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkPageRange)
      inline def start : CInt = struct._1
      inline def start_=(value: CInt): Unit = (!struct.at1 = value)
      inline def end : CInt = struct._2
      inline def end_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkPageRange on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkPageRange] = scala.scalanative.unsafe.alloc[GtkPageRange](1)
  def apply(start : CInt, end : CInt)(using Zone): Ptr[GtkPageRange] =
    val ____ptr = apply()
    (!____ptr).start = start
    (!____ptr).end = end
    ____ptr