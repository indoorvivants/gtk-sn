package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_font_options_t

class FontOptions private[gnome] (raw: Ptr[cairo_font_options_t]):

  def getUnsafeRawPointer(): Ptr[cairo_font_options_t] = this.raw
end FontOptions

object FontOptions:
  def fromRaw(ptr: Ptr[cairo_font_options_t]): FontOptions = new FontOptions(
    ptr
  )
end FontOptions
