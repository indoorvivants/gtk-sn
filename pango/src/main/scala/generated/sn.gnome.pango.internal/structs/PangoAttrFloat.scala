package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFloat: : the common portion of the attribute : the value of the attribute
*/
opaque type PangoAttrFloat = CStruct2[PangoAttribute, Double]

object PangoAttrFloat:
  given _tag: Tag[PangoAttrFloat] = Tag.materializeCStruct2Tag[PangoAttribute, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrFloat)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : Double = struct._2
      inline def value_=(value: Double): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrFloat on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrFloat] = scala.scalanative.unsafe.alloc[PangoAttrFloat](1)
  def apply(attr : PangoAttribute, value : Double)(using Zone): Ptr[PangoAttrFloat] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr