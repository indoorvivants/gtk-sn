package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Coverage
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.internal.PangoFont
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoLanguage

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
  def describe(): Ptr[PangoFontDescription] = pango_font_describe(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a description of the font, with absolute font size set in device
    * units.
    *
    * Use [method@Pango.Font.describe] if you want the font size in points.
    */
  def describeWithAbsoluteSize(): Ptr[PangoFontDescription] =
    pango_font_describe_with_absolute_size(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the coverage map for a given font and language tag.
    */
  def getCoverage(language: Ptr[PangoLanguage]): Coverage = new Coverage(
    pango_font_get_coverage(this.raw.asInstanceOf, language).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoFontFace` to which @font belongs.
    */
  def getFace(): FontFace = new FontFace(
    pango_font_get_face(this.raw.asInstanceOf).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_features contains an OUT parameter, which is not supported yet"
  )
  def getFeatures() = ???

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
  def getFontMap(): FontMap = new FontMap(
    pango_font_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_glyph_extents contains an OUT parameter, which is not supported yet"
  )
  def getGlyphExtents() = ???

  @annotation.compileTimeOnly(
    "Method get_hb_font is weird: refers to HarfBuzz.font_t as gconstpointer"
  )
  def getHbFont() = ???

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
  def getMetrics(language: Ptr[PangoLanguage]): Ptr[PangoFontMetrics] =
    pango_font_get_metrics(this.raw.asInstanceOf, language)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the font provides a glyph for this character.
    */
  def hasChar(wc: CUnsignedInt): Boolean =
    pango_font_has_char(this.raw.asInstanceOf, gunichar(guint32(wc))).value
      .!=(0)

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
  def serialize(): Ptr[GBytes] = pango_font_serialize(this.raw.asInstanceOf)

end Font
