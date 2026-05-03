package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoGlyphItem = CStruct5[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]

object PangoGlyphItem:
  given _tag: Tag[PangoGlyphItem] = Tag.materializeCStruct5Tag[Ptr[Byte], Ptr[PangoGlyphString], CInt, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphItem)
      inline def item : Ptr[PangoItem] = struct._1.asInstanceOf[Ptr[PangoItem]]
      inline def item_=(value: Ptr[PangoItem]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def glyphs : Ptr[PangoGlyphString] = struct._2
      inline def glyphs_=(value: Ptr[PangoGlyphString]): Unit = (!struct.at2 = value)
      inline def y_offset : CInt = struct._3
      inline def y_offset_=(value: CInt): Unit = (!struct.at3 = value)
      inline def start_x_offset : CInt = struct._4
      inline def start_x_offset_=(value: CInt): Unit = (!struct.at4 = value)
      inline def end_x_offset : CInt = struct._5
      inline def end_x_offset_=(value: CInt): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates PangoGlyphItem on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphItem] = scala.scalanative.unsafe.alloc[PangoGlyphItem](1)
  def apply(item : Ptr[PangoItem], glyphs : Ptr[PangoGlyphString], y_offset : CInt, start_x_offset : CInt, end_x_offset : CInt)(using Zone): Ptr[PangoGlyphItem] =
    val ____ptr = apply()
    (!____ptr).item = item
    (!____ptr).glyphs = glyphs
    (!____ptr).y_offset = y_offset
    (!____ptr).start_x_offset = start_x_offset
    (!____ptr).end_x_offset = end_x_offset
    ____ptr