package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.{Font, FontMetrics}
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
class Fontset private[gnome] (raw: Ptr[PangoFontset])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Iterates through all the fonts in a fontset, calling @func for each one.
    *
    * If @func returns %TRUE, that stops the iteration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontsetForeachFunc), @type -> DataRecord(PangoFontsetForeachFunc)))"
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
  )(using Runtime): sn.gnome.pango.Font /* None */ =
    sn.gnome.pango.Font.applyUnsafe(
      pango_fontset_get_font(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontset]],
        guint(wc)
      ).asInstanceOf
    )
  end getFont

  /** Get overall metric information for the fonts in the fontset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMetrics(): sn.gnome.pango.FontMetrics /* None */ =
    sn.gnome.pango.FontMetrics.fromRaw(
      pango_fontset_get_metrics(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontset]]
      )
    )
  end getMetrics

end Fontset

object Fontset:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[PangoFontset])(using Runtime) = summon[Runtime]
    .getOrCreate[Fontset](ptr.asInstanceOf[Ptr[Byte]], p => new Fontset(ptr))

end Fontset
