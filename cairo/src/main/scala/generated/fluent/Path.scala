package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_path_t

class Path private[gnome] (raw: Ptr[cairo_path_t]):

  def getUnsafeRawPointer(): Ptr[cairo_path_t] = this.raw
end Path

object Path:
  def fromRaw(ptr: Ptr[cairo_path_t]): Path = new Path(ptr)
end Path
