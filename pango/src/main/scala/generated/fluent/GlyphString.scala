package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.GlyphString
import sn.gnome.pango.internal.PangoGlyphString

/** A `PangoGlyphString` is used to store strings of glyphs with geometry and
  * visual attribute information.
  *
  * The storage for the glyph information is owned by the structure which
  * simplifies memory management.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GlyphString private[gnome] (raw: Ptr[PangoGlyphString]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphString] = this.raw

  /** number of glyphs in this glyph string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numGlyphs: Int /* None */ = (!raw).num_glyphs.asInstanceOf[CInt]

  /** number of glyphs in this glyph string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numGlyphs_=(value: Int /* None */ ): Unit =
    (!raw).num_glyphs_=(value.asInstanceOf[CInt])

  /** array of glyph information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field glyphs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GlyphInfo), @type -> DataRecord(PangoGlyphInfo)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(PangoGlyphInfo*)))"
  )
  private def glyphs__ = ???

  /** logical cluster info, indexed by the byte index within the text
    * corresponding to the glyph string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field log_clusters]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int*)))"
  )
  private def logClusters__ = ???

  /** Copy a glyph string and associated storage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.GlyphString /* None */ =
    sn.gnome.pango.GlyphString.fromRaw(
      pango_glyph_string_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphString]]
      )
    )
  end copy

  /** Compute the logical and ink extents of a glyph string.
    *
    * See the documentation for [method@Pango.Font.get_glyph_extents] for
    * details about the interpretation of the rectangles.
    *
    * Examples of logical (red) and ink (green) rects:
    *
    * ![](rects1.png) ![](rects2.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method extents]: Method extents contains an OUT parameter, which is not supported yet"
  )
  private def extents__ = ???

  /** Computes the extents of a sub-portion of a glyph string.
    *
    * The extents are relative to the start of the glyph string range (the
    * origin of their coordinate system is at the start of the range, not at the
    * start of the entire glyph string).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method extents_range]: Method extents_range contains an OUT parameter, which is not supported yet"
  )
  private def extentsRange__ = ???

  /** Free a glyph string and associated storage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_glyph_string_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphString]]
    )
  end free

  /** Given a `PangoGlyphString` and corresponding text, determine the width
    * corresponding to each character.
    *
    * When multiple characters compose a single cluster, the width of the entire
    * cluster is divided equally among the characters.
    *
    * See also [method@Pango.GlyphItem.get_logical_widths].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_logical_widths/<method parameters>/logical_widths]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(int*)))"
  )
  private def getLogicalWidths__ = ???

  /** Computes the logical width of the glyph string.
    *
    * This can also be computed using [method@Pango.GlyphString.extents].
    * However, since this only computes the width, it's much faster. This is in
    * fact only a convenience function that computes the sum of
    * @geometry.width
    *   for each glyph in the @glyphs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    pango_glyph_string_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphString]]
    )
  end getWidth

  /** Converts from character position to x position.
    *
    * The X position is measured from the left edge of the run. Character
    * positions are obtained using font metrics for ligatures where available,
    * and computed by dividing up each cluster into equal portions, otherwise.
    *
    * <picture> <source srcset="glyphstring-positions-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Glyph positions"
    * src="glyphstring-positions-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method index_to_x]: Method index_to_x contains an OUT parameter, which is not supported yet"
  )
  private def indexToX__ = ???

  /** Converts from character position to x position.
    *
    * This variant of [method@Pango.GlyphString.index_to_x] additionally accepts
    * a `PangoLogAttr` array. The grapheme boundary information in it can be
    * used to disambiguate positioning inside some complex clusters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method index_to_x_full]: Method index_to_x_full contains an OUT parameter, which is not supported yet"
  )
  private def indexToXFull__ = ???

  /** Resize a glyph string to the given length.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(new_len: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_glyph_string_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphString]],
      new_len
    )
  end setSize

  /** Convert from x offset to character position.
    *
    * Character positions are computed by dividing up each cluster into equal
    * portions. In scripts where positioning within a cluster is not allowed
    * (such as Thai), the returned value may not be a valid cursor position; the
    * caller must combine the result with the logical attributes for the text to
    * compute the valid cursor position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method x_to_index]: Method x_to_index contains an OUT parameter, which is not supported yet"
  )
  private def xToIndex__ = ???

end GlyphString

object GlyphString:
  def fromRaw(ptr: Ptr[PangoGlyphString]): GlyphString = new GlyphString(ptr)
end GlyphString
