package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute
*/
opaque type PangoAttrColor = CStruct2[PangoAttribute, PangoColor]

object PangoAttrColor:
  given _tag: Tag[PangoAttrColor] = Tag.materializeCStruct2Tag[PangoAttribute, PangoColor]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrColor)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def color : PangoColor = struct._2
      inline def color_=(value: PangoColor): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrColor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrColor] = scala.scalanative.unsafe.alloc[PangoAttrColor](1)
  def apply(attr : PangoAttribute, color : PangoColor)(using Zone): Ptr[PangoAttrColor] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).color = color
    ____ptr