package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.FontFamily
import sn.gnome.pango.internal.PangoFontDescription
import sn.gnome.pango.internal.PangoFontFace

class FontFace(raw: Ptr[PangoFontFace]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def describe(): Ptr[PangoFontDescription] = pango_font_face_describe(
    this.raw.asInstanceOf
  )

  def getFaceName()(using Zone): String = fromCString(
    pango_font_face_get_face_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getFamily(): FontFamily = new FontFamily(
    pango_font_face_get_family(this.raw.asInstanceOf).asInstanceOf
  )

  def isSynthesized(): Boolean =
    pango_font_face_is_synthesized(this.raw.asInstanceOf).value.!=(0)

  // Method list_sizes contains an array parameter, which is not supported yet

end FontFace
