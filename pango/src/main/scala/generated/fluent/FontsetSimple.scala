package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoFontsetSimple
import sn.gnome.pango.internal.PangoLanguage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoFontsetSimple` is a implementation of the abstract `PangoFontset` base
  * class as an array of fonts.
  *
  * When creating a `PangoFontsetSimple`, you have to provide the array of fonts
  * that make up the fontset.
  */
class FontsetSimple(raw: Ptr[PangoFontsetSimple])
    extends Fontset(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a font to the fontset.
    *
    * The fontset takes ownership of @font.
    */
  def append(font: Font /* Some(Ptr[PangoFont]) */ ): Unit /* None */ =
    pango_fontset_simple_append(
      this.raw.asInstanceOf,
      font.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of fonts in the fontset.
    */
  def size(): Int /* None */ = pango_fontset_simple_size(this.raw.asInstanceOf)

end FontsetSimple

object FontsetSimple:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `PangoFontsetSimple` for the given language.
    */
  def apply(
      language: Ptr[PangoLanguage] /* Some(Ptr[PangoLanguage]) */
  ): FontsetSimple = new FontsetSimple(
    pango_fontset_simple_new(language).asInstanceOf
  )
end FontsetSimple
