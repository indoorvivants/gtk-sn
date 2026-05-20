package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskBroadwayRendererClass

class BroadwayRendererClass private[gnome] (raw: Ptr[GskBroadwayRendererClass]):

  def getUnsafeRawPointer(): Ptr[GskBroadwayRendererClass] = this.raw

end BroadwayRendererClass
object BroadwayRendererClass:
  def fromRaw(ptr: Ptr[GskBroadwayRendererClass]): BroadwayRendererClass =
    new BroadwayRendererClass(ptr)
end BroadwayRendererClass
