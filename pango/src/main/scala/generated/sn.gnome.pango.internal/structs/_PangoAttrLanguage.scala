package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute
*/
opaque type _PangoAttrLanguage = CStruct2[PangoAttribute, Ptr[PangoLanguage]]

object _PangoAttrLanguage:
  given _tag: Tag[_PangoAttrLanguage] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoLanguage]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrLanguage)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : Ptr[PangoLanguage] = struct._2
      inline def value_=(value: Ptr[PangoLanguage]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrLanguage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrLanguage] = scala.scalanative.unsafe.alloc[_PangoAttrLanguage](1)
  def apply(attr : PangoAttribute, value : Ptr[PangoLanguage])(using Zone): Ptr[_PangoAttrLanguage] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr