package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.internal.PangoFontFace

/** A `PangoFontFace` is used to represent a group of fonts with the same
  * family, slant, weight, and width, but varying sizes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontFace private[gnome] (raw: Ptr[PangoFontFace])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns a font description that matches the face.
    *
    * The resulting font description will have the family, style, variant,
    * weight and stretch of the face, but its size field will be unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method describe/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(PangoFontDescription*)))"
  )
  private def describe__ = ???

  /** Gets a name representing the style of this face.
    *
    * Note that a font family may contain multiple faces with the same name
    * (e.g. a variable and a non-variable face for the same style).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFaceName()(using Zone): String /* None */ =
    fromCString(
      pango_font_face_get_face_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFace]]
      ).asInstanceOf
    )
  end getFaceName

  /** Gets the `PangoFontFamily` that @face belongs to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily()(using Runtime): sn.gnome.pango.fluent.FontFamily /* None */ =
    sn.gnome.pango.fluent.FontFamily.applyUnsafe(
      pango_font_face_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFace]]
      ).asInstanceOf
    )
  end getFamily

  /** Returns whether a `PangoFontFace` is synthesized.
    *
    * This will be the case if the underlying font rendering engine creates this
    * face from another face, by shearing, emboldening, lightening or modifying
    * it in some other way.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSynthesized(): Boolean /* None */ =
    pango_font_face_is_synthesized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFace]]
    ).value.!=(0)
  end isSynthesized

  /** List the available sizes for a font.
    *
    * This is only applicable to bitmap fonts. For scalable fonts, stores %NULL
    * at the location pointed to by @sizes and 0 at the location pointed to by @n_sizes.
    * The sizes returned are in Pango units and are sorted in ascending order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_sizes]: Method list_sizes contains an OUT parameter, which is not supported yet"
  )
  private def listSizes__ = ???

end FontFace

object FontFace:
  def applyUnsafe(ptr: Ptr[PangoFontFace])(using Runtime) = summon[Runtime]
    .getOrCreate[FontFace](ptr.asInstanceOf[Ptr[Byte]], p => new FontFace(ptr))

end FontFace
