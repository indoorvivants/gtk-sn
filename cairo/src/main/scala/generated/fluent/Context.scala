package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t

class Context private[gnome] (raw: Ptr[cairo_t]):

  def getUnsafeRawPointer(): Ptr[cairo_t] = this.raw
end Context

object Context:
  def fromRaw(ptr: Ptr[cairo_t]): Context = new Context(ptr)
end Context
