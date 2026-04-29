package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoGlyphItemIter = CStruct8[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]

object PangoGlyphItemIter:
  given _tag: Tag[PangoGlyphItemIter] = Tag.materializeCStruct8Tag[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar], CInt, CInt, CInt, CInt, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphItemIter)
      inline def glyph_item : Ptr[PangoGlyphItem] = struct._1.asInstanceOf[Ptr[PangoGlyphItem]]
      inline def glyph_item_=(value: Ptr[PangoGlyphItem]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def text : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def text_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def start_glyph : CInt = struct._3
      inline def start_glyph_=(value: CInt): Unit = (!struct.at3 = value)
      inline def start_index : CInt = struct._4
      inline def start_index_=(value: CInt): Unit = (!struct.at4 = value)
      inline def start_char : CInt = struct._5
      inline def start_char_=(value: CInt): Unit = (!struct.at5 = value)
      inline def end_glyph : CInt = struct._6
      inline def end_glyph_=(value: CInt): Unit = (!struct.at6 = value)
      inline def end_index : CInt = struct._7
      inline def end_index_=(value: CInt): Unit = (!struct.at7 = value)
      inline def end_char : CInt = struct._8
      inline def end_char_=(value: CInt): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates PangoGlyphItemIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphItemIter] = scala.scalanative.unsafe.alloc[PangoGlyphItemIter](1)
  def apply(glyph_item : Ptr[PangoGlyphItem], text : Ptr[_root_.sn.gnome.glib.internal.gchar], start_glyph : CInt, start_index : CInt, start_char : CInt, end_glyph : CInt, end_index : CInt, end_char : CInt)(using Zone): Ptr[PangoGlyphItemIter] =
    val ____ptr = apply()
    (!____ptr).glyph_item = glyph_item
    (!____ptr).text = text
    (!____ptr).start_glyph = start_glyph
    (!____ptr).start_index = start_index
    (!____ptr).start_char = start_char
    (!____ptr).end_glyph = end_glyph
    (!____ptr).end_index = end_index
    (!____ptr).end_char = end_char
    ____ptr