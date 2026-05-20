package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_region_t

class Region private[gnome] (raw: Ptr[cairo_region_t]):

  def getUnsafeRawPointer(): Ptr[cairo_region_t] = this.raw
end Region

object Region:
  def fromRaw(ptr: Ptr[cairo_region_t]): Region = new Region(ptr)
end Region
