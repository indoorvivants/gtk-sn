package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkDevicePadFeature: _DEVICE_PAD_FEATURE_BUTTON: a button _DEVICE_PAD_FEATURE_RING: a ring-shaped interactive area _DEVICE_PAD_FEATURE_STRIP: a straight interactive area
*/
opaque type GdkDevicePadFeature = CUnsignedInt
object GdkDevicePadFeature extends _BindgenEnumCUnsignedInt[GdkDevicePadFeature]:
  given _tag: Tag[GdkDevicePadFeature] = Tag.UInt
  inline def define(inline a: Long): GdkDevicePadFeature = a.toUInt
  val GDK_DEVICE_PAD_FEATURE_BUTTON = define(0)
  val GDK_DEVICE_PAD_FEATURE_RING = define(1)
  val GDK_DEVICE_PAD_FEATURE_STRIP = define(2)
  def getName(value: GdkDevicePadFeature): Option[String] =
    value match
      case `GDK_DEVICE_PAD_FEATURE_BUTTON` => Some("GDK_DEVICE_PAD_FEATURE_BUTTON")
      case `GDK_DEVICE_PAD_FEATURE_RING` => Some("GDK_DEVICE_PAD_FEATURE_RING")
      case `GDK_DEVICE_PAD_FEATURE_STRIP` => Some("GDK_DEVICE_PAD_FEATURE_STRIP")
      case _ => _root_.scala.None
  extension (a: GdkDevicePadFeature)
    inline def &(b: GdkDevicePadFeature): GdkDevicePadFeature = a & b
    inline def |(b: GdkDevicePadFeature): GdkDevicePadFeature = a | b
    inline def is(b: GdkDevicePadFeature): Boolean = (a & b) == b