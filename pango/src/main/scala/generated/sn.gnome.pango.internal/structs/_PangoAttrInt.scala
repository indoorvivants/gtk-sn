package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrInt: : the common portion of the attribute : the value of the attribute
*/
opaque type _PangoAttrInt = CStruct2[PangoAttribute, CInt]

object _PangoAttrInt:
  given _tag: Tag[_PangoAttrInt] = Tag.materializeCStruct2Tag[PangoAttribute, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrInt)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : CInt = struct._2
      inline def value_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrInt on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrInt] = scala.scalanative.unsafe.alloc[_PangoAttrInt](1)
  def apply(attr : PangoAttribute, value : CInt)(using Zone): Ptr[_PangoAttrInt] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr