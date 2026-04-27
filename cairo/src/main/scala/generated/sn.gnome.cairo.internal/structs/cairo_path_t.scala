package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_path_t: : the current error status
*/
opaque type cairo_path_t = CStruct3[cairo_status_t, Ptr[cairo_path_data_t], CInt]

object cairo_path_t:
  given _tag: Tag[cairo_path_t] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_path_data_t], CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_path_t)
      inline def status : cairo_status_t = struct._1
      inline def status_=(value: cairo_status_t): Unit = (!struct.at1 = value)
      inline def data : Ptr[cairo_path_data_t] = struct._2
      inline def data_=(value: Ptr[cairo_path_data_t]): Unit = (!struct.at2 = value)
      inline def num_data : CInt = struct._3
      inline def num_data_=(value: CInt): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates cairo_path_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_path_t] = scala.scalanative.unsafe.alloc[cairo_path_t](1)
  def apply(status : cairo_status_t, data : Ptr[cairo_path_data_t], num_data : CInt)(using Zone): Ptr[cairo_path_t] =
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).data = data
    (!____ptr).num_data = num_data
    ____ptr