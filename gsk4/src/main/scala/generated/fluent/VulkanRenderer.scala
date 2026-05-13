package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskVulkanRenderer

/** A GSK renderer that is using Vulkan.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VulkanRenderer private[gnome] (raw: Ptr[GskVulkanRenderer])
    extends Renderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VulkanRenderer

object VulkanRenderer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskVulkanRenderer])(using Runtime) =
    summon[Runtime].getOrCreate[VulkanRenderer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new VulkanRenderer(ptr)
    )

  def apply()(using Runtime): VulkanRenderer =
    val raw: Ptr[Byte] = gsk_vulkan_renderer_new().asInstanceOf
    summon[Runtime].getOrCreate[VulkanRenderer](
      raw,
      r => VulkanRenderer.applyUnsafe(r.asInstanceOf)
    )
  end apply
end VulkanRenderer
