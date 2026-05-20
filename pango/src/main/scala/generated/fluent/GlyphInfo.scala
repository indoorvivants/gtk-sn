package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.{GlyphGeometry, GlyphVisAttr}
import sn.gnome.pango.internal.PangoGlyphInfo

/** A `PangoGlyphInfo` structure represents a single glyph with positioning
  * information and visual attributes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GlyphInfo private[gnome] (raw: Ptr[PangoGlyphInfo]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphInfo] = this.raw

  /** the glyph itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph)))"
  )
  private def glyph__ = ???

  /** the positional information about the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def geometry: sn.gnome.pango.GlyphGeometry /* None */ =
    (!raw).geometry.asInstanceOf[PangoGlyphGeometry]

  /** the positional information about the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def geometry_=(value: sn.gnome.pango.GlyphGeometry /* None */ ): Unit =
    (!raw).geometry_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoGlyphGeometry]
    )

  /** the visual attributes of the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attr: sn.gnome.pango.GlyphVisAttr /* None */ =
    (!raw).attr.asInstanceOf[PangoGlyphVisAttr]

  /** the visual attributes of the glyph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attr_=(value: sn.gnome.pango.GlyphVisAttr /* None */ ): Unit =
    (!raw).attr_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoGlyphVisAttr]
    )
end GlyphInfo

object GlyphInfo:
  def fromRaw(ptr: Ptr[PangoGlyphInfo]): GlyphInfo = new GlyphInfo(ptr)
end GlyphInfo
