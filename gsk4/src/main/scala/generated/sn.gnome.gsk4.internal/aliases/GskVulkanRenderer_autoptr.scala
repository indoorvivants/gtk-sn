package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskVulkanRenderer_autoptr = Ptr[GskVulkanRenderer]
object GskVulkanRenderer_autoptr:
  given _tag: Tag[GskVulkanRenderer_autoptr] = Tag.Ptr[GskVulkanRenderer](GskVulkanRenderer._tag)
  inline def apply(inline o: Ptr[GskVulkanRenderer]): GskVulkanRenderer_autoptr = o
  extension (v: GskVulkanRenderer_autoptr)
    inline def value: Ptr[GskVulkanRenderer] = v