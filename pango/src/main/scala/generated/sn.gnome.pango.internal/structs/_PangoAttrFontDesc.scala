package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFontDesc: : the common portion of the attribute : the font description which is the value of this attribute
*/
opaque type _PangoAttrFontDesc = CStruct2[PangoAttribute, Ptr[PangoFontDescription]]

object _PangoAttrFontDesc:
  given _tag: Tag[_PangoAttrFontDesc] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoFontDescription]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrFontDesc)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def desc : Ptr[PangoFontDescription] = struct._2
      inline def desc_=(value: Ptr[PangoFontDescription]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrFontDesc on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrFontDesc] = scala.scalanative.unsafe.alloc[_PangoAttrFontDesc](1)
  def apply(attr : PangoAttribute, desc : Ptr[PangoFontDescription])(using Zone): Ptr[_PangoAttrFontDesc] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).desc = desc
    ____ptr