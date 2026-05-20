package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_glyph_info_t

/** The #hb_glyph_info_t is the structure that holds information about the
  * glyphs and their relation to input text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class glyph_info_t private[gnome] (raw: Ptr[hb_glyph_info_t]):

  def getUnsafeRawPointer(): Ptr[hb_glyph_info_t] = this.raw

  /** either a Unicode code point (before shaping) or a glyph index (after
    * shaping).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field codepoint]: Cannot render type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t)))"
  )
  private def codepoint__ = ???

  /** the index of the character in the original text that corresponds to this
    * #hb_glyph_info_t, or whatever the client passes to hb_buffer_add(). More
    * than one #hb_glyph_info_t can have the same
    * @cluster
    *   value, if they resulted from the same character (e.g. one to many glyph
    *   substitution), and when more than one character gets merged in the same
    *   glyph (e.g. many to one glyph substitution) the #hb_glyph_info_t will
    *   have the smallest cluster value of them. By default some characters are
    *   merged into the same cluster (e.g. combining marks have the same cluster
    *   as their bases) even if they are separate glyphs,
    *   hb_buffer_set_cluster_level() allow selecting more fine-grained cluster
    *   handling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field cluster]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint32), @type -> DataRecord(uint32_t)))"
  )
  private def cluster__ = ???

end glyph_info_t

object glyph_info_t:
  def fromRaw(ptr: Ptr[hb_glyph_info_t]): glyph_info_t = new glyph_info_t(ptr)
end glyph_info_t
