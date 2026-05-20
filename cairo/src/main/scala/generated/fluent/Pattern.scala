package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_pattern_t

class Pattern private[gnome] (raw: Ptr[cairo_pattern_t]):

  def getUnsafeRawPointer(): Ptr[cairo_pattern_t] = this.raw
end Pattern

object Pattern:
  def fromRaw(ptr: Ptr[cairo_pattern_t]): Pattern = new Pattern(ptr)
end Pattern
