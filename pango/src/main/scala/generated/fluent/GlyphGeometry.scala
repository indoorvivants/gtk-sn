package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoGlyphGeometry

/** The `PangoGlyphGeometry` structure contains width and positioning
  * information for a single glyph.
  *
  * Note that @width is not guaranteed to be the same as the glyph extents.
  * Kerning and other positioning applied during shaping will affect both the @width
  * and the @x_offset for the glyphs in the glyph string that results from
  * shaping.
  *
  * The information in this struct is intended for rendering the glyphs, as
  * follows:
  *
  *   1. Assume the current point is (x, y)
  *   2. Render the current glyph at (x + x_offset, y + y_offset),
  *   3. Advance the current point to (x + width, y)
  *   4. Render the next glyph
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GlyphGeometry private[gnome] (raw: Ptr[PangoGlyphGeometry]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphGeometry] = this.raw

  /** the logical width to use for the the character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field width]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GlyphUnit), @type -> DataRecord(PangoGlyphUnit)))"
  )
  private def width__ = ???

  /** horizontal offset from nominal character position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field x_offset]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GlyphUnit), @type -> DataRecord(PangoGlyphUnit)))"
  )
  private def xOffset__ = ???

  /** vertical offset from nominal character position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field y_offset]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GlyphUnit), @type -> DataRecord(PangoGlyphUnit)))"
  )
  private def yOffset__ = ???
end GlyphGeometry

object GlyphGeometry:
  def fromRaw(ptr: Ptr[PangoGlyphGeometry]): GlyphGeometry = new GlyphGeometry(
    ptr
  )
end GlyphGeometry
