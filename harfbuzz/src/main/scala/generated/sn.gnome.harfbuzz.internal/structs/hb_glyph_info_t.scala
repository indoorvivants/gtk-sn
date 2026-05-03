package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_glyph_info_t: : either a Unicode code point (before shaping) or a glyph index (after shaping). : the index of the character in the original text that corresponds to this #hb_glyph_info_t, or whatever the client passes to hb_buffer_add(). More than one #hb_glyph_info_t can have the same value, if they resulted from the same character (e.g. one to many glyph substitution), and when more than one character gets merged in the same glyph (e.g. many to one glyph substitution) the #hb_glyph_info_t will have the smallest cluster value of them. By default some characters are merged into the same cluster (e.g. combining marks have the same cluster as their bases) even if they are separate glyphs, hb_buffer_set_cluster_level() allow selecting more fine-grained cluster handling.
*/
opaque type hb_glyph_info_t = CStruct5[hb_codepoint_t, hb_mask_t, uint32_t, hb_var_int_t, hb_var_int_t]

object hb_glyph_info_t:
  given _tag: Tag[hb_glyph_info_t] = Tag.materializeCStruct5Tag[hb_codepoint_t, hb_mask_t, uint32_t, hb_var_int_t, hb_var_int_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_glyph_info_t)
      inline def codepoint : hb_codepoint_t = struct._1
      inline def codepoint_=(value: hb_codepoint_t): Unit = (!struct.at1 = value)
      inline def mask : hb_mask_t = struct._2
      inline def mask_=(value: hb_mask_t): Unit = (!struct.at2 = value)
      inline def cluster : uint32_t = struct._3
      inline def cluster_=(value: uint32_t): Unit = (!struct.at3 = value)
      inline def var1 : hb_var_int_t = struct._4
      inline def var1_=(value: hb_var_int_t): Unit = (!struct.at4 = value)
      inline def var2 : hb_var_int_t = struct._5
      inline def var2_=(value: hb_var_int_t): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates hb_glyph_info_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_glyph_info_t] = scala.scalanative.unsafe.alloc[hb_glyph_info_t](1)
  def apply(codepoint : hb_codepoint_t, mask : hb_mask_t, cluster : uint32_t, var1 : hb_var_int_t, var2 : hb_var_int_t)(using Zone): Ptr[hb_glyph_info_t] =
    val ____ptr = apply()
    (!____ptr).codepoint = codepoint
    (!____ptr).mask = mask
    (!____ptr).cluster = cluster
    (!____ptr).var1 = var1
    (!____ptr).var2 = var2
    ____ptr