package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrLanguage: : the common portion of the attribute : the `PangoLanguage` which is the value of the attribute
*/
opaque type PangoAttrLanguage = CStruct2[PangoAttribute, Ptr[PangoLanguage]]

object PangoAttrLanguage:
  given _tag: Tag[PangoAttrLanguage] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[PangoLanguage]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrLanguage)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : Ptr[PangoLanguage] = struct._2
      inline def value_=(value: Ptr[PangoLanguage]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrLanguage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrLanguage] = scala.scalanative.unsafe.alloc[PangoAttrLanguage](1)
  def apply(attr : PangoAttribute, value : Ptr[PangoLanguage])(using Zone): Ptr[PangoAttrLanguage] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr