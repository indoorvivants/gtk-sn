package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontFace

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoFontFace` is used to represent a group of fonts with the same
  * family, slant, weight, and width, but varying sizes.
  */
class FontFace(raw: Ptr[PangoFontFace]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a font description that matches the face.
    *
    * The resulting font description will have the family, style, variant,
    * weight and stretch of the face, but its size field will be unset.
    */
  def describe(): Ptr[PangoFontDescription] /* None */ =
    pango_font_face_describe(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a name representing the style of this face.
    *
    * Note that a font family may contain multiple faces with the same name
    * (e.g. a variable and a non-variable face for the same style).
    */
  def getFaceName()(using Zone): String /* None */ = fromCString(
    pango_font_face_get_face_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoFontFamily` that @face belongs to.
    */
  def getFamily(): FontFamily /* None */ = new FontFamily(
    pango_font_face_get_family(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether a `PangoFontFace` is synthesized.
    *
    * This will be the case if the underlying font rendering engine creates this
    * face from another face, by shearing, emboldening, lightening or modifying
    * it in some other way.
    */
  def isSynthesized(): Boolean /* None */ =
    pango_font_face_is_synthesized(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * List the available sizes for a font.
    *
    * This is only applicable to bitmap fonts. For scalable fonts, stores %NULL
    * at the location pointed to by @sizes and 0 at the location pointed to by @n_sizes.
    * The sizes returned are in Pango units and are sorted in ascending order.
    */
  @annotation.compileTimeOnly(
    "Method list_sizes contains an OUT parameter, which is not supported yet"
  )
  private def listSizes__ = ???

end FontFace
