package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_glyph_extents_t

/** Glyph extent values, measured in font units.
  *
  * Note that @height is negative, in coordinate systems that grow up.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class glyph_extents_t private[gnome] (raw: Ptr[hb_glyph_extents_t]):

  def getUnsafeRawPointer(): Ptr[hb_glyph_extents_t] = this.raw

  /** Distance from the x-origin to the left extremum of the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field x_bearing]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def xBearing__ = ???

  /** Distance from the top extremum of the glyph to the y-origin.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field y_bearing]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def yBearing__ = ???

  /** Distance from the left extremum of the glyph to the right extremum.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field width]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def width__ = ???

  /** Distance from the top extremum of the glyph to the bottom extremum.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field height]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def height__ = ???
end glyph_extents_t

object glyph_extents_t:
  def fromRaw(ptr: Ptr[hb_glyph_extents_t]): glyph_extents_t =
    new glyph_extents_t(ptr)
end glyph_extents_t
