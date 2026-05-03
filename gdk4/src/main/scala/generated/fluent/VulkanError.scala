package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkVulkanError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error enumeration for `GdkVulkanContext`.
  */
enum VulkanError(val raw: GdkVulkanError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vulkan is not supported on this backend or has not been compiled in.
    */
  case UNSUPPORTED
      extends VulkanError(GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vulkan support is not available on this Surface
    */
  case NOT_AVAILABLE
      extends VulkanError(GdkVulkanError.GDK_VULKAN_ERROR_NOT_AVAILABLE)
end VulkanError

object VulkanError:
  def fromRaw(raw: GdkVulkanError): VulkanError =
    raw match
      case GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED =>
        VulkanError.UNSUPPORTED
      case GdkVulkanError.GDK_VULKAN_ERROR_NOT_AVAILABLE =>
        VulkanError.NOT_AVAILABLE
  end fromRaw
end VulkanError
