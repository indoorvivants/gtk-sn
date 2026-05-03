package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkGraphicsOffloadEnabled: _GRAPHICS_OFFLOAD_ENABLED: Graphics offloading is enabled. _GRAPHICS_OFFLOAD_DISABLED: Graphics offloading is disabled.
*/
opaque type GtkGraphicsOffloadEnabled = CUnsignedInt
object GtkGraphicsOffloadEnabled extends _BindgenEnumCUnsignedInt[GtkGraphicsOffloadEnabled]:
  given _tag: Tag[GtkGraphicsOffloadEnabled] = Tag.UInt
  inline def define(inline a: Long): GtkGraphicsOffloadEnabled = a.toUInt
  val GTK_GRAPHICS_OFFLOAD_ENABLED = define(0)
  val GTK_GRAPHICS_OFFLOAD_DISABLED = define(1)
  def getName(value: GtkGraphicsOffloadEnabled): Option[String] =
    value match
      case `GTK_GRAPHICS_OFFLOAD_ENABLED` => Some("GTK_GRAPHICS_OFFLOAD_ENABLED")
      case `GTK_GRAPHICS_OFFLOAD_DISABLED` => Some("GTK_GRAPHICS_OFFLOAD_DISABLED")
      case _ => _root_.scala.None
  extension (a: GtkGraphicsOffloadEnabled)
    inline def &(b: GtkGraphicsOffloadEnabled): GtkGraphicsOffloadEnabled = a & b
    inline def |(b: GtkGraphicsOffloadEnabled): GtkGraphicsOffloadEnabled = a | b
    inline def is(b: GtkGraphicsOffloadEnabled): Boolean = (a & b) == b