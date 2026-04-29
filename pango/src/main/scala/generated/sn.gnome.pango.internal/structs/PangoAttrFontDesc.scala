package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFontDesc: : the common portion of the attribute : the font description which is the value of this attribute
*/
opaque type PangoAttrFontDesc = CStruct2[PangoAttribute, Ptr[PangoFontDescription]]

object PangoAttrFontDesc:
  given _tag: Tag[PangoAttrFontDesc] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoFontDescription]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrFontDesc)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def desc : Ptr[PangoFontDescription] = struct._2
      inline def desc_=(value: Ptr[PangoFontDescription]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrFontDesc on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrFontDesc] = scala.scalanative.unsafe.alloc[PangoAttrFontDesc](1)
  def apply(attr : PangoAttribute, desc : Ptr[PangoFontDescription])(using Zone): Ptr[PangoAttrFontDesc] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).desc = desc
    ____ptr