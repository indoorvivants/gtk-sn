package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.Fontset
import sn.gnome.pango.internal.PangoFontsetSimple
import sn.gnome.pango.internal.PangoLanguage

class FontsetSimple(raw: Ptr[PangoFontsetSimple])
    extends Fontset(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(font: Font): Unit = pango_fontset_simple_append(
    this.raw.asInstanceOf,
    font.getUnsafeRawPointer().asInstanceOf
  )

  def size(): Int = pango_fontset_simple_size(this.raw.asInstanceOf)

end FontsetSimple

object FontsetSimple:
  def apply(language: Ptr[PangoLanguage]): FontsetSimple = new FontsetSimple(
    pango_fontset_simple_new(language).asInstanceOf
  )
end FontsetSimple
