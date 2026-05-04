package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.internal.PangoFontset

/** A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
  *
  * A `PangoFontset` is the result of resolving a `PangoFontDescription` against
  * a particular `PangoContext`. It has operations for finding the component
  * font for a particular Unicode character, and for finding a composite set of
  * metrics for the entire fontset.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Fontset(raw: Ptr[PangoFontset]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Iterates through all the fonts in a fontset, calling @func for each one.
    *
    * If @func returns %TRUE, that stops the iteration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontsetForeachFunc), @type -> DataRecord(PangoFontsetForeachFunc)))"
  )
  private def foreach__ = ???

  /** Returns the font in the fontset that contains the best glyph for a Unicode
    * character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFont(
      wc: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Font /* None */ = new Font(
    pango_fontset_get_font(
      this.raw.asInstanceOf[Ptr[PangoFontset]],
      guint(wc)
    ).asInstanceOf
  )

  /** Get overall metric information for the fonts in the fontset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_metrics/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontMetrics), @type -> DataRecord(PangoFontMetrics*)))"
  )
  private def getMetrics__ = ???

end Fontset
