package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFloat: : the common portion of the attribute : the value of the attribute
*/
opaque type _PangoAttrFloat = CStruct2[PangoAttribute, Double]

object _PangoAttrFloat:
  given _tag: Tag[_PangoAttrFloat] = Tag.materializeCStruct2Tag[PangoAttribute, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrFloat)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : Double = struct._2
      inline def value_=(value: Double): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrFloat on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrFloat] = scala.scalanative.unsafe.alloc[_PangoAttrFloat](1)
  def apply(attr : PangoAttribute, value : Double)(using Zone): Ptr[_PangoAttrFloat] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr