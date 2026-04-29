package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.internal.PangoFontFamily

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoFontFamily` is used to represent a family of related font faces.
  *
  * The font faces in a family share a common design, but differ in slant,
  * weight, width or other aspects.
  */
class FontFamily(raw: Ptr[PangoFontFamily])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoFontFace` of @family with the given name.
    */
  def getFace(name: String | CString)(using Zone): FontFace = new FontFace(
    pango_font_family_get_face(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the family.
    *
    * The name is unique among all fonts for the font backend and can be used in
    * a `PangoFontDescription` to specify that a face from this family is
    * desired.
    */
  def getName()(using Zone): String = fromCString(
    pango_font_family_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A monospace font is a font designed for text display where the the
    * characters form a regular grid.
    *
    * For Western languages this would mean that the advance width of all
    * characters are the same, but this categorization also includes Asian fonts
    * which include double-width characters: characters that occupy two grid
    * cells. g_unichar_iswide() returns a result that indicates whether a
    * character is typically double-width in a monospace font.
    *
    * The best way to find out the grid-cell size is to call
    * [method@Pango.FontMetrics.get_approximate_digit_width], since the results
    * of [method@Pango.FontMetrics.get_approximate_char_width] may be affected
    * by double-width characters.
    */
  def isMonospace(): Boolean =
    pango_font_family_is_monospace(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variable font is a font which has axes that can be modified to produce
    * different faces.
    *
    * Such axes are also known as _variations_; see
    * [method@Pango.FontDescription.set_variations] for more information.
    */
  def isVariable(): Boolean =
    pango_font_family_is_variable(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method list_faces contains an OUT parameter, which is not supported yet"
  )
  def listFaces() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FontFamily
