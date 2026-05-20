package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskCairoRendererClass

class CairoRendererClass private[gnome] (raw: Ptr[GskCairoRendererClass]):

  def getUnsafeRawPointer(): Ptr[GskCairoRendererClass] = this.raw
end CairoRendererClass

object CairoRendererClass:
  def fromRaw(ptr: Ptr[GskCairoRendererClass]): CairoRendererClass =
    new CairoRendererClass(ptr)
end CairoRendererClass
