package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_scaled_font_t

class ScaledFont private[gnome] (raw: Ptr[cairo_scaled_font_t]):

  def getUnsafeRawPointer(): Ptr[cairo_scaled_font_t] = this.raw
end ScaledFont

object ScaledFont:
  def fromRaw(ptr: Ptr[cairo_scaled_font_t]): ScaledFont = new ScaledFont(ptr)
end ScaledFont
