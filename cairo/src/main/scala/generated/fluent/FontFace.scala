package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_font_face_t

class FontFace private[gnome] (raw: Ptr[cairo_font_face_t]):

  def getUnsafeRawPointer(): Ptr[cairo_font_face_t] = this.raw
end FontFace

object FontFace:
  def fromRaw(ptr: Ptr[cairo_font_face_t]): FontFace = new FontFace(ptr)
end FontFace
