package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoItem: : byte offset of the start of this item in text. : length of this item in bytes. _offset: character offset of the start of this item in text. Since 1.50 : analysis results for the item.
*/
opaque type _PangoItem = CStruct4[CInt, CInt, CInt, PangoAnalysis]

object _PangoItem:
  given _tag: Tag[_PangoItem] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, PangoAnalysis]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoItem)
      inline def offset : CInt = struct._1
      inline def offset_=(value: CInt): Unit = (!struct.at1 = value)
      inline def length : CInt = struct._2
      inline def length_=(value: CInt): Unit = (!struct.at2 = value)
      inline def num_chars : CInt = struct._3
      inline def num_chars_=(value: CInt): Unit = (!struct.at3 = value)
      inline def analysis : PangoAnalysis = struct._4
      inline def analysis_=(value: PangoAnalysis): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _PangoItem on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoItem] = scala.scalanative.unsafe.alloc[_PangoItem](1)
  def apply(offset : CInt, length : CInt, num_chars : CInt, analysis : PangoAnalysis)(using Zone): Ptr[_PangoItem] =
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).length = length
    (!____ptr).num_chars = num_chars
    (!____ptr).analysis = analysis
    ____ptr