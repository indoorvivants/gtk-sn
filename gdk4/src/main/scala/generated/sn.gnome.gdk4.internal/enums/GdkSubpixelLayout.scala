package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkSubpixelLayout: _SUBPIXEL_LAYOUT_UNKNOWN: The layout is not known _SUBPIXEL_LAYOUT_NONE: Not organized in this way _SUBPIXEL_LAYOUT_HORIZONTAL_RGB: The layout is horizontal, the order is RGB _SUBPIXEL_LAYOUT_HORIZONTAL_BGR: The layout is horizontal, the order is BGR _SUBPIXEL_LAYOUT_VERTICAL_RGB: The layout is vertical, the order is RGB _SUBPIXEL_LAYOUT_VERTICAL_BGR: The layout is vertical, the order is BGR
*/
opaque type GdkSubpixelLayout = CUnsignedInt
object GdkSubpixelLayout extends _BindgenEnumCUnsignedInt[GdkSubpixelLayout]:
  given _tag: Tag[GdkSubpixelLayout] = Tag.UInt
  inline def define(inline a: Long): GdkSubpixelLayout = a.toUInt
  val GDK_SUBPIXEL_LAYOUT_UNKNOWN = define(0)
  val GDK_SUBPIXEL_LAYOUT_NONE = define(1)
  val GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB = define(2)
  val GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR = define(3)
  val GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB = define(4)
  val GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR = define(5)
  def getName(value: GdkSubpixelLayout): Option[String] =
    value match
      case `GDK_SUBPIXEL_LAYOUT_UNKNOWN` => Some("GDK_SUBPIXEL_LAYOUT_UNKNOWN")
      case `GDK_SUBPIXEL_LAYOUT_NONE` => Some("GDK_SUBPIXEL_LAYOUT_NONE")
      case `GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB` => Some("GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB")
      case `GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR` => Some("GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR")
      case `GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB` => Some("GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB")
      case `GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR` => Some("GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR")
      case _ => _root_.scala.None
  extension (a: GdkSubpixelLayout)
    inline def &(b: GdkSubpixelLayout): GdkSubpixelLayout = a & b
    inline def |(b: GdkSubpixelLayout): GdkSubpixelLayout = a | b
    inline def is(b: GdkSubpixelLayout): Boolean = (a & b) == b