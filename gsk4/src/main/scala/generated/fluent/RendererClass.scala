package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskRendererClass

class RendererClass private[gnome] (raw: Ptr[GskRendererClass]):

  def getUnsafeRawPointer(): Ptr[GskRendererClass] = this.raw
end RendererClass

object RendererClass:
  def fromRaw(ptr: Ptr[GskRendererClass]): RendererClass = new RendererClass(
    ptr
  )
end RendererClass
