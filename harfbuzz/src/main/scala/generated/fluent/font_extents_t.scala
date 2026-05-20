package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_font_extents_t

/** Font-wide extent values, measured in font units.
  *
  * Note that typically @ascender is positive and @descender negative, in
  * coordinate systems that grow up.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class font_extents_t private[gnome] (raw: Ptr[hb_font_extents_t]):

  def getUnsafeRawPointer(): Ptr[hb_font_extents_t] = this.raw

  /** The height of typographic ascenders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field ascender]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def ascender__ = ???

  /** The depth of typographic descenders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field descender]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def descender__ = ???

  /** The suggested line-spacing gap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field line_gap]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def lineGap__ = ???

end font_extents_t

object font_extents_t:
  def fromRaw(ptr: Ptr[hb_font_extents_t]): font_extents_t = new font_extents_t(
    ptr
  )
end font_extents_t
