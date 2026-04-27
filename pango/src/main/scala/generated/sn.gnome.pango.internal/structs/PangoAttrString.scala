package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute
*/
opaque type PangoAttrString = CStruct2[PangoAttribute, CString]

object PangoAttrString:
  given _tag: Tag[PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, CString]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrString)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : CString = struct._2
      inline def value_=(value: CString): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrString] = scala.scalanative.unsafe.alloc[PangoAttrString](1)
  def apply(attr : PangoAttribute, value : CString)(using Zone): Ptr[PangoAttrString] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr