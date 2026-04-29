package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineLang:
*/
opaque type _PangoEngineLang = CStruct1[PangoEngine]

object _PangoEngineLang:
  given _tag: Tag[_PangoEngineLang] = Tag.materializeCStruct1Tag[PangoEngine]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoEngineLang)
      inline def parent_instance : PangoEngine = struct._1
      inline def parent_instance_=(value: PangoEngine): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _PangoEngineLang on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoEngineLang] = scala.scalanative.unsafe.alloc[_PangoEngineLang](1)
  def apply(parent_instance : PangoEngine)(using Zone): Ptr[_PangoEngineLang] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr