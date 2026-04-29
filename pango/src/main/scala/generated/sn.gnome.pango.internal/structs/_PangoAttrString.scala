package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrString: : the common portion of the attribute : the string which is the value of the attribute
*/
opaque type _PangoAttrString = CStruct2[PangoAttribute, CString]

object _PangoAttrString:
  given _tag: Tag[_PangoAttrString] = Tag.materializeCStruct2Tag[PangoAttribute, CString]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrString)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def value : CString = struct._2
      inline def value_=(value: CString): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoAttrString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrString] = scala.scalanative.unsafe.alloc[_PangoAttrString](1)
  def apply(attr : PangoAttribute, value : CString)(using Zone): Ptr[_PangoAttrString] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).value = value
    ____ptr