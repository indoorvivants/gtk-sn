package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoContext
import sn.gnome.pango.internal.PangoDirection
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoGravity
import sn.gnome.pango.internal.PangoGravityHint
import sn.gnome.pango.internal.PangoLanguage
import sn.gnome.pango.internal.PangoMatrix

class Context(raw: Ptr[PangoContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(): Unit = pango_context_changed(this.raw.asInstanceOf)

  def getBaseDir(): PangoDirection = pango_context_get_base_dir(
    this.raw.asInstanceOf
  )

  def getBaseGravity(): PangoGravity = pango_context_get_base_gravity(
    this.raw.asInstanceOf
  )

  def getFontDescription(): Ptr[PangoFontDescription] =
    pango_context_get_font_description(this.raw.asInstanceOf)

  def getFontMap(): FontMap = new FontMap(
    pango_context_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  def getGravity(): PangoGravity = pango_context_get_gravity(
    this.raw.asInstanceOf
  )

  def getGravityHint(): PangoGravityHint = pango_context_get_gravity_hint(
    this.raw.asInstanceOf
  )

  def getLanguage(): Ptr[PangoLanguage] = pango_context_get_language(
    this.raw.asInstanceOf
  )

  def getMatrix(): Ptr[PangoMatrix] = pango_context_get_matrix(
    this.raw.asInstanceOf
  )

  def getMetrics(
      desc: Ptr[PangoFontDescription],
      language: Ptr[PangoLanguage]
  ): Ptr[PangoFontMetrics] =
    pango_context_get_metrics(this.raw.asInstanceOf, desc, language)

  def getRoundGlyphPositions(): Boolean =
    pango_context_get_round_glyph_positions(this.raw.asInstanceOf).value.!=(0)

  def getSerial(): UInt = pango_context_get_serial(this.raw.asInstanceOf).value

  // Method list_families contains an array parameter, which is not supported yet

  def loadFont(desc: Ptr[PangoFontDescription]): Font = new Font(
    pango_context_load_font(this.raw.asInstanceOf, desc).asInstanceOf
  )

  def loadFontset(
      desc: Ptr[PangoFontDescription],
      language: Ptr[PangoLanguage]
  ): Fontset = new Fontset(
    pango_context_load_fontset(
      this.raw.asInstanceOf,
      desc,
      language
    ).asInstanceOf
  )

  def setBaseDir(direction: PangoDirection): Unit =
    pango_context_set_base_dir(this.raw.asInstanceOf, direction)

  def setBaseGravity(gravity: PangoGravity): Unit =
    pango_context_set_base_gravity(this.raw.asInstanceOf, gravity)

  def setFontDescription(desc: Ptr[PangoFontDescription]): Unit =
    pango_context_set_font_description(this.raw.asInstanceOf, desc)

  def setFontMap(font_map: FontMap): Unit = pango_context_set_font_map(
    this.raw.asInstanceOf,
    font_map.getUnsafeRawPointer().asInstanceOf
  )

  def setGravityHint(hint: PangoGravityHint): Unit =
    pango_context_set_gravity_hint(this.raw.asInstanceOf, hint)

  def setLanguage(language: Ptr[PangoLanguage]): Unit =
    pango_context_set_language(this.raw.asInstanceOf, language)

  def setMatrix(matrix: Ptr[PangoMatrix]): Unit =
    pango_context_set_matrix(this.raw.asInstanceOf, matrix)

  def setRoundGlyphPositions(round_positions: Boolean): Unit =
    pango_context_set_round_glyph_positions(
      this.raw.asInstanceOf,
      gboolean(gint((if round_positions == true then 1 else 0)))
    )

end Context

object Context:
  def apply(): Context = new Context(pango_context_new().asInstanceOf)
end Context
