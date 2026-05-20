package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_glyph_position_t

/** The #hb_glyph_position_t is the structure that holds the positions of the
  * glyph in both horizontal and vertical directions. All positions in
  * #hb_glyph_position_t are relative to the current point.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class glyph_position_t private[gnome] (raw: Ptr[hb_glyph_position_t]):

  def getUnsafeRawPointer(): Ptr[hb_glyph_position_t] = this.raw

  /** how much the line advances after drawing this glyph when setting text in
    * horizontal direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field x_advance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def xAdvance__ = ???

  /** how much the line advances after drawing this glyph when setting text in
    * vertical direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field y_advance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def yAdvance__ = ???

  /** how much the glyph moves on the X-axis before drawing it, this should not
    * affect how much the line advances.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field x_offset]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def xOffset__ = ???

  /** how much the glyph moves on the Y-axis before drawing it, this should not
    * affect how much the line advances.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field y_offset]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def yOffset__ = ???

end glyph_position_t

object glyph_position_t:
  def fromRaw(ptr: Ptr[hb_glyph_position_t]): glyph_position_t =
    new glyph_position_t(ptr)
end glyph_position_t
