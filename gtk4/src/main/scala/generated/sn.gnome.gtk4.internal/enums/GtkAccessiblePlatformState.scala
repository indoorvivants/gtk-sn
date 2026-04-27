package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessiblePlatformState: _ACCESSIBLE_PLATFORM_STATE_FOCUSABLE: whether the accessible can be focused _ACCESSIBLE_PLATFORM_STATE_FOCUSED: whether the accessible has focus _ACCESSIBLE_PLATFORM_STATE_ACTIVE: whether the accessible is active
*/
opaque type GtkAccessiblePlatformState = CUnsignedInt
object GtkAccessiblePlatformState extends _BindgenEnumCUnsignedInt[GtkAccessiblePlatformState]:
  given _tag: Tag[GtkAccessiblePlatformState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessiblePlatformState = a.toUInt
  val GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE = define(0)
  val GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED = define(1)
  val GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE = define(2)
  def getName(value: GtkAccessiblePlatformState): Option[String] =
    value match
      case `GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE` => Some("GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE")
      case `GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED` => Some("GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED")
      case `GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE` => Some("GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE")
      case _ => _root_.scala.None
  extension (a: GtkAccessiblePlatformState)
    inline def &(b: GtkAccessiblePlatformState): GtkAccessiblePlatformState = a & b
    inline def |(b: GtkAccessiblePlatformState): GtkAccessiblePlatformState = a | b
    inline def is(b: GtkAccessiblePlatformState): Boolean = (a & b) == b