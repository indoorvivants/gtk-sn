package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.fluent.{Font, Fontset}
import sn.gnome.pango.internal.PangoFontsetSimple

/** `PangoFontsetSimple` is a implementation of the abstract `PangoFontset` base
  * class as an array of fonts.
  *
  * When creating a `PangoFontsetSimple`, you have to provide the array of fonts
  * that make up the fontset.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontsetSimple(raw: Ptr[PangoFontsetSimple])
    extends Fontset(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a font to the fontset.
    *
    * The fontset takes ownership of @font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(font: Font /* Some(Ptr[PangoFont]) */ ): Unit /* None */ =
    pango_fontset_simple_append(
      this.raw.asInstanceOf[Ptr[PangoFontsetSimple]],
      font.getUnsafeRawPointer().asInstanceOf
    )

  /** Returns the number of fonts in the fontset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size(): Int /* None */ = pango_fontset_simple_size(
    this.raw.asInstanceOf[Ptr[PangoFontsetSimple]]
  )

end FontsetSimple

object FontsetSimple:
  /** Creates a new `PangoFontsetSimple` for the given language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[language]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Language), @type -> DataRecord(PangoLanguage*)))"
  )
  private def `new`() = ???

end FontsetSimple
