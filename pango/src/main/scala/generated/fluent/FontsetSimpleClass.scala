package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoFontsetSimpleClass

class FontsetSimpleClass private[gnome] (raw: Ptr[PangoFontsetSimpleClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontsetSimpleClass] = this.raw
end FontsetSimpleClass

object FontsetSimpleClass:
  def fromRaw(ptr: Ptr[PangoFontsetSimpleClass]): FontsetSimpleClass =
    new FontsetSimpleClass(ptr)
end FontsetSimpleClass
