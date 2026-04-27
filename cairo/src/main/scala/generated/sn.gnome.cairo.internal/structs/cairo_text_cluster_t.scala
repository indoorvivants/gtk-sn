package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_text_cluster_t:
*/
opaque type cairo_text_cluster_t = CStruct2[CInt, CInt]

object cairo_text_cluster_t:
  given _tag: Tag[cairo_text_cluster_t] = Tag.materializeCStruct2Tag[CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_text_cluster_t)
      inline def num_bytes : CInt = struct._1
      inline def num_bytes_=(value: CInt): Unit = (!struct.at1 = value)
      inline def num_glyphs : CInt = struct._2
      inline def num_glyphs_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates cairo_text_cluster_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_text_cluster_t] = scala.scalanative.unsafe.alloc[cairo_text_cluster_t](1)
  def apply(num_bytes : CInt, num_glyphs : CInt)(using Zone): Ptr[cairo_text_cluster_t] =
    val ____ptr = apply()
    (!____ptr).num_bytes = num_bytes
    (!____ptr).num_glyphs = num_glyphs
    ____ptr