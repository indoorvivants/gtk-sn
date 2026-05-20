package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_surface_t

class Surface private[gnome] (raw: Ptr[cairo_surface_t]):

  def getUnsafeRawPointer(): Ptr[cairo_surface_t] = this.raw
end Surface

object Surface:
  def fromRaw(ptr: Ptr[cairo_surface_t]): Surface = new Surface(ptr)
end Surface
