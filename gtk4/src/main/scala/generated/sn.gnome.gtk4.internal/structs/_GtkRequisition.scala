package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkRequisition: : the widget’s desired width : the widget’s desired height
*/
opaque type _GtkRequisition = CStruct2[CInt, CInt]

object _GtkRequisition:
  given _tag: Tag[_GtkRequisition] = Tag.materializeCStruct2Tag[CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRequisition)
      inline def width : CInt = struct._1
      inline def width_=(value: CInt): Unit = (!struct.at1 = value)
      inline def height : CInt = struct._2
      inline def height_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkRequisition on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRequisition] = scala.scalanative.unsafe.alloc[_GtkRequisition](1)
  def apply(width : CInt, height : CInt)(using Zone): Ptr[_GtkRequisition] =
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr