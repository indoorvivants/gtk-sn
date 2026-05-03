package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkVulkanContext_autoptr = Ptr[GdkVulkanContext]
object GdkVulkanContext_autoptr:
  given _tag: Tag[GdkVulkanContext_autoptr] = Tag.Ptr[GdkVulkanContext](GdkVulkanContext._tag)
  inline def apply(inline o: Ptr[GdkVulkanContext]): GdkVulkanContext_autoptr = o
  extension (v: GdkVulkanContext_autoptr)
    inline def value: Ptr[GdkVulkanContext] = v