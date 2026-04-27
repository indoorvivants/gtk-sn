package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrColor: : the common portion of the attribute : the `PangoColor` which is the value of the attribute
*/
opaque type _PangoAttrColor = CStruct2[PangoAttribute, PangoColor]

object _PangoAttrColor:
  given _tag: Tag[_PangoAttrColor] = Tag.materializeCStruct2Tag[PangoAttribute, PangoColor]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrColor)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def color : PangoColor = struct._2
      inline def color_=(value: PangoColor): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrColor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrColor] = scala.scalanative.unsafe.alloc[_PangoAttrColor](1)
  def apply(attr : PangoAttribute, color : PangoColor)(using Zone): Ptr[_PangoAttrColor] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).color = color
    ____ptr