package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkVulkanError: _VULKAN_ERROR_UNSUPPORTED: Vulkan is not supported on this backend or has not been compiled in. _VULKAN_ERROR_NOT_AVAILABLE: Vulkan support is not available on this Surface
*/
opaque type GdkVulkanError = CUnsignedInt
object GdkVulkanError extends _BindgenEnumCUnsignedInt[GdkVulkanError]:
  given _tag: Tag[GdkVulkanError] = Tag.UInt
  inline def define(inline a: Long): GdkVulkanError = a.toUInt
  val GDK_VULKAN_ERROR_UNSUPPORTED = define(0)
  val GDK_VULKAN_ERROR_NOT_AVAILABLE = define(1)
  def getName(value: GdkVulkanError): Option[String] =
    value match
      case `GDK_VULKAN_ERROR_UNSUPPORTED` => Some("GDK_VULKAN_ERROR_UNSUPPORTED")
      case `GDK_VULKAN_ERROR_NOT_AVAILABLE` => Some("GDK_VULKAN_ERROR_NOT_AVAILABLE")
      case _ => _root_.scala.None
  extension (a: GdkVulkanError)
    inline def &(b: GdkVulkanError): GdkVulkanError = a & b
    inline def |(b: GdkVulkanError): GdkVulkanError = a | b
    inline def is(b: GdkVulkanError): Boolean = (a & b) == b