package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkVulkanError

/** Error enumeration for `GdkVulkanContext`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum VulkanError(val raw: GdkVulkanError):
  /** Vulkan is not supported on this backend or has not been compiled in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED
      extends VulkanError(GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED)

  /** Vulkan support is not available on this Surface
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
