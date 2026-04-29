package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphString: : (array length=num_glyphs): array of glyph information _clusters: logical cluster info, indexed by the byte index within the text corresponding to the glyph string
*/
opaque type PangoGlyphString = CStruct4[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]

object PangoGlyphString:
  given _tag: Tag[PangoGlyphString] = Tag.materializeCStruct4Tag[CInt, Ptr[PangoGlyphInfo], Ptr[CInt], CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphString)
      inline def num_glyphs : CInt = struct._1
      inline def num_glyphs_=(value: CInt): Unit = (!struct.at1 = value)
      inline def glyphs : Ptr[PangoGlyphInfo] = struct._2
      inline def glyphs_=(value: Ptr[PangoGlyphInfo]): Unit = (!struct.at2 = value)
      inline def log_clusters : Ptr[CInt] = struct._3
      inline def log_clusters_=(value: Ptr[CInt]): Unit = (!struct.at3 = value)
      inline def space : CInt = struct._4
      inline def space_=(value: CInt): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates PangoGlyphString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphString] = scala.scalanative.unsafe.alloc[PangoGlyphString](1)
  def apply(num_glyphs : CInt, glyphs : Ptr[PangoGlyphInfo], log_clusters : Ptr[CInt], space : CInt)(using Zone): Ptr[PangoGlyphString] =
    val ____ptr = apply()
    (!____ptr).num_glyphs = num_glyphs
    (!____ptr).glyphs = glyphs
    (!____ptr).log_clusters = log_clusters
    (!____ptr).space = space
    ____ptr