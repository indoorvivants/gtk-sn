package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Coverage
import sn.gnome.pango.fluent.FontFace
import sn.gnome.pango.fluent.FontMap
import sn.gnome.pango.internal.PangoFont
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontMetrics
import sn.gnome.pango.internal.PangoLanguage

class Font(raw: Ptr[PangoFont]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def describe(): Ptr[PangoFontDescription] = pango_font_describe(
    this.raw.asInstanceOf
  )

  def describeWithAbsoluteSize(): Ptr[PangoFontDescription] =
    pango_font_describe_with_absolute_size(this.raw.asInstanceOf)

  def getCoverage(language: Ptr[PangoLanguage]): Coverage = new Coverage(
    pango_font_get_coverage(this.raw.asInstanceOf, language).asInstanceOf
  )

  def getFace(): FontFace = new FontFace(
    pango_font_get_face(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_features contains an OUT parameter, which is not supported yet

  def getFontMap(): FontMap = new FontMap(
    pango_font_get_font_map(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_glyph_extents contains an OUT parameter, which is not supported yet

  // Method get_hb_font is weird: refers to HarfBuzz.font_t as gconstpointer

  def getMetrics(language: Ptr[PangoLanguage]): Ptr[PangoFontMetrics] =
    pango_font_get_metrics(this.raw.asInstanceOf, language)

  def hasChar(wc: CUnsignedInt): Boolean =
    pango_font_has_char(this.raw.asInstanceOf, gunichar(guint32(wc))).value
      .!=(0)

  def serialize(): Ptr[GBytes] = pango_font_serialize(this.raw.asInstanceOf)

end Font
