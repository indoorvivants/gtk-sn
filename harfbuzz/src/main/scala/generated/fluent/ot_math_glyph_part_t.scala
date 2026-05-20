package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_math_glyph_part_t

/** Data type to hold information for a "part" component of a math-variant
  * glyph. Large variants for stretchable math glyphs (such as parentheses) can
  * be constructed on the fly from parts.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_math_glyph_part_t private[gnome] (raw: Ptr[hb_ot_math_glyph_part_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_math_glyph_part_t] = this.raw

  /** The glyph index of the variant part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t)))"
  )
  private def glyph__ = ???

  /** The length of the connector on the starting side of the variant part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field start_connector_length]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def startConnectorLength__ = ???

  /** The length of the connector on the ending side of the variant part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field end_connector_length]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def endConnectorLength__ = ???

  /** The total advance of the part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field full_advance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def fullAdvance__ = ???

  /** #hb_ot_math_glyph_part_flags_t flags for the part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: ot_math_glyph_part_flags_t /* None */ =
    ot_math_glyph_part_flags_t.fromRaw((!raw).flags)

  /** #hb_ot_math_glyph_part_flags_t flags for the part
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: ot_math_glyph_part_flags_t /* None */ ): Unit =
    (!raw).flags_=(value.raw.value)
end ot_math_glyph_part_t
object ot_math_glyph_part_t:
  def fromRaw(ptr: Ptr[hb_ot_math_glyph_part_t]): ot_math_glyph_part_t =
    new ot_math_glyph_part_t(ptr)
end ot_math_glyph_part_t
