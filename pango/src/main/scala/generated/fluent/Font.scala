package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint, guint32, gunichar}
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.{FontFace, FontMap}
import sn.gnome.pango.internal.PangoFont

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoFont` is used to represent a font in a rendering-system-independent
  * manner.
  */
class Font(raw: Ptr[PangoFont]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a description of the font, with font size set in points.
    *
    * Use [method@Pango.Font.describe_with_absolute_size] if you want the font
    * size in device units.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  def describe__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a description of the font, with absolute font size set in device
    * units.
    *
    * Use [method@Pango.Font.describe] if you want the font size in points.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  def describeWithAbsoluteSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the coverage map for a given font and language tag.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def getCoverage__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoFontFace` to which @font belongs.
    */
  def getFace(): FontFace /* None */ = new FontFace(
    pango_font_get_face(this.raw.asInstanceOf[Ptr[PangoFont]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtain the OpenType features that are provided by the font.
    *
    * These are passed to the rendering system, together with features that have
    * been explicitly set via attributes.
    *
    * Note that this does not include OpenType features which the rendering
    * system enables by default.
    */
  @annotation.compileTimeOnly(
    "Method get_features contains an OUT parameter, which is not supported yet"
  )
  def getFeatures__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the font map for which the font was created.
    *
    * Note that the font maintains a *weak* reference to the font map, so if all
    * references to font map are dropped, the font map will be finalized even if
    * there are fonts created with the font map that are still alive. In that
    * case this function will return %NULL.
    *
    * It is the responsibility of the user to ensure that the font map is kept
    * alive. In most uses this is not an issue as a `PangoContext` holds a
    * reference to the font map.
    */
  def getFontMap(): FontMap /* None */ = new FontMap(
    pango_font_get_font_map(this.raw.asInstanceOf[Ptr[PangoFont]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the logical and ink extents of a glyph within a font.
    *
    * The coordinate system for each rectangle has its origin at the base line
    * and horizontal origin of the character with increasing coordinates
    * extending to the right and down. The macros PANGO_ASCENT(),
    * PANGO_DESCENT(), PANGO_LBEARING(), and PANGO_RBEARING() can be used to
    * convert from the extents rectangle to more traditional font metrics. The
    * units of the rectangles are in 1/PANGO_SCALE of a device unit.
    *
    * If @font is %NULL, this function gracefully sets some sane values in the
    * output variables and returns.
    */
  @annotation.compileTimeOnly(
    "Method get_glyph_extents contains an OUT parameter, which is not supported yet"
  )
  def getGlyphExtents__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get a `hb_font_t` object backing this font.
    *
    * Note that the objects returned by this function are cached and immutable.
    * If you need to make changes to the `hb_font_t`, use
    * [hb_font_create_sub_font()](https://harfbuzz.github.io/harfbuzz-hb-font.html#hb-font-create-sub-font).
    */
  @annotation.compileTimeOnly(
    "Method get_hb_font is weird: refers to HarfBuzz.font_t as gconstpointer"
  )
  def getHbFont__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the languages that are supported by @font.
    *
    * If the font backend does not provide this information, %NULL is returned.
    * For the fontconfig backend, this corresponds to the FC_LANG member of the
    * FcPattern.
    *
    * The returned array is only valid as long as the font and its fontmap are
    * valid.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Language)))),ListMap(@type -> DataRecord(PangoLanguage**)))"
  )
  def getLanguages__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets overall metric information for a font.
    *
    * Since the metrics may be substantially different for different scripts, a
    * language tag can be provided to indicate that the metrics should be
    * retrieved that correspond to the script(s) used by that language.
    *
    * If @font is %NULL, this function gracefully sets some sane values in the
    * output variables and returns.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  def getMetrics__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the font provides a glyph for this character.
    */
  def hasChar(
      wc: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Boolean /* None */ = pango_font_has_char(
    this.raw.asInstanceOf[Ptr[PangoFont]],
    gunichar(guint32(wc))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes the @font in a way that can be uniquely identified.
    *
    * There are no guarantees about the format of the output across different
    * versions of Pango.
    *
    * The intended use of this function is testing, benchmarking and debugging.
    * The format is not meant as a permanent storage format.
    *
    * To recreate a font from its serialized form, use
    * [func@Pango.Font.deserialize].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def serialize__ = ???

end Font

object Font:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Frees an array of font descriptions.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(PangoFontDescription**)))"
  )
  def descriptionsFree() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Loads data previously created via [method@Pango.Font.serialize].
    *
    * For a discussion of the supported format, see that function.
    *
    * Note: to verify that the returned font is identical to the one that was
    * serialized, you can compare @bytes to the result of serializing the font
    * again.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def deserialize() = ???

end Font
