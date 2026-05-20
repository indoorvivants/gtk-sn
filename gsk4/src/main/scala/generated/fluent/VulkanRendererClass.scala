package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskVulkanRendererClass

class VulkanRendererClass private[gnome] (raw: Ptr[GskVulkanRendererClass]):

  def getUnsafeRawPointer(): Ptr[GskVulkanRendererClass] = this.raw
end VulkanRendererClass

object VulkanRendererClass:
  def fromRaw(ptr: Ptr[GskVulkanRendererClass]): VulkanRendererClass =
    new VulkanRendererClass(ptr)
end VulkanRendererClass
