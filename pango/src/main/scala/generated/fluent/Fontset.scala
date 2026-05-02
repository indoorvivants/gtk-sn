package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoFontset
import sn.gnome.pango.internal.PangoFontsetForeachFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoFontset` represents a set of `PangoFont` to use when rendering text.
  *
  * A `PangoFontset` is the result of resolving a `PangoFontDescription` against
  * a particular `PangoContext`. It has operations for finding the component
  * font for a particular Unicode character, and for finding a composite set of
  * metrics for the entire fontset.
  */
class Fontset(raw: Ptr[PangoFontset]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Iterates through all the fonts in a fontset, calling @func for each one.
    *
    * If @func returns %TRUE, that stops the iteration.
    */
  def foreach(
      func: PangoFontsetForeachFunc /* Some(PangoFontsetForeachFunc) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = pango_fontset_foreach(
    this.raw.asInstanceOf[Ptr[PangoFontset]],
    func,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the font in the fontset that contains the best glyph for a Unicode
    * character.
    */
  def getFont(
      wc: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Font /* None */ = new Font(
    pango_fontset_get_font(
      this.raw.asInstanceOf[Ptr[PangoFontset]],
      guint(wc)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get overall metric information for the fonts in the fontset.
    */
  def getMetrics(): Ptr[PangoFontMetrics] /* None */ =
    pango_fontset_get_metrics(this.raw.asInstanceOf[Ptr[PangoFontset]])

end Fontset
