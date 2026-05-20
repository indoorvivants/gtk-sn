package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.FontFace
import sn.gnome.pango.internal.PangoFontFamily

/** A `PangoFontFamily` is used to represent a family of related font faces.
  *
  * The font faces in a family share a common design, but differ in slant,
  * weight, width or other aspects.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontFamily private[gnome] (raw: Ptr[PangoFontFamily])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `PangoFontFace` of @family with the given name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFace(
      name: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): sn.gnome.pango.FontFace /* None */ =
    sn.gnome.pango.FontFace.applyUnsafe(
      pango_font_family_get_face(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFamily]],
        name
          .map[CString](o => summon[Runtime].inZone(toCString(o)))
          .getOrElse(null.asInstanceOf[CString])
      ).asInstanceOf
    )
  end getFace

  /** Gets the name of the family.
    *
    * The name is unique among all fonts for the font backend and can be used in
    * a `PangoFontDescription` to specify that a face from this family is
    * desired.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      pango_font_family_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFamily]]
      ).asInstanceOf
    )
  end getName

  /** A monospace font is a font designed for text display where the the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMonospace(): Boolean /* None */ =
    pango_font_family_is_monospace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFamily]]
    ).value.!=(0)
  end isMonospace

  /** A variable font is a font which has axes that can be modified to produce
    * different faces.
    *
    * Such axes are also known as _variations_; see
    * [method@Pango.FontDescription.set_variations] for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isVariable(): Boolean /* None */ =
    pango_font_family_is_variable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontFamily]]
    ).value.!=(0)
  end isVariable

  /** Lists the different font faces that make up @family.
    *
    * The faces in a family share a common design, but differ in slant, weight,
    * width and other aspects.
    *
    * Note that the returned faces are not in any particular order, and multiple
    * faces may have the same name or characteristics.
    *
    * `PangoFontFamily` also implemented the [iface@Gio.ListModel] interface for
    * enumerating faces.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_faces]: Method list_faces contains an OUT parameter, which is not supported yet"
  )
  private def listFaces__ = ???

end FontFamily

object FontFamily:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[PangoFontFamily])(using Runtime) =
    summon[Runtime].getOrCreate[FontFamily](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FontFamily(ptr)
    )

end FontFamily
