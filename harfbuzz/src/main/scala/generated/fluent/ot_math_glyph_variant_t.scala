package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_math_glyph_variant_t

/** Data type to hold math-variant information for a glyph.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_math_glyph_variant_t private[gnome] (
    raw: Ptr[hb_ot_math_glyph_variant_t]
):

  def getUnsafeRawPointer(): Ptr[hb_ot_math_glyph_variant_t] = this.raw

  /** The glyph index of the variant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t)))"
  )
  private def glyph__ = ???

  /** The advance width of the variant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field advance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def advance__ = ???
end ot_math_glyph_variant_t
object ot_math_glyph_variant_t:
  def fromRaw(ptr: Ptr[hb_ot_math_glyph_variant_t]): ot_math_glyph_variant_t =
    new ot_math_glyph_variant_t(ptr)
end ot_math_glyph_variant_t
