package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskVulkanRenderer

/** A GSK renderer that is using Vulkan.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VulkanRenderer(raw: Ptr[GskVulkanRenderer])
    extends Renderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VulkanRenderer

object VulkanRenderer:
  def apply(): VulkanRenderer = new VulkanRenderer(
    gsk_vulkan_renderer_new().asInstanceOf
  )
end VulkanRenderer
