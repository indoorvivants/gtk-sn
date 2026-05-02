package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.internal.GdkVulkanContext
import sn.gnome.gio.fluent.Initable

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkVulkanContext` is an object representing the platform-specific Vulkan
  * draw context.
  *
  * `GdkVulkanContext`s are created for a surface using
  * [method@Gdk.Surface.create_vulkan_context], and the context will match the
  * characteristics of the surface.
  *
  * Support for `GdkVulkanContext` is platform-specific and context creation can
  * fail, returning %NULL context.
  */
class VulkanContext(raw: Ptr[GdkVulkanContext])
    extends DrawContext(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VulkanContext
