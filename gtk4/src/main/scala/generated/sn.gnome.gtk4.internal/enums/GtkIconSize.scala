package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkIconSize: _ICON_SIZE_INHERIT: Keep the size of the parent element _ICON_SIZE_NORMAL: Size similar to text size _ICON_SIZE_LARGE: Large size, for example in an icon view
*/
opaque type GtkIconSize = CUnsignedInt
object GtkIconSize extends _BindgenEnumCUnsignedInt[GtkIconSize]:
  given _tag: Tag[GtkIconSize] = Tag.UInt
  inline def define(inline a: Long): GtkIconSize = a.toUInt
  val GTK_ICON_SIZE_INHERIT = define(0)
  val GTK_ICON_SIZE_NORMAL = define(1)
  val GTK_ICON_SIZE_LARGE = define(2)
  def getName(value: GtkIconSize): Option[String] =
    value match
      case `GTK_ICON_SIZE_INHERIT` => Some("GTK_ICON_SIZE_INHERIT")
      case `GTK_ICON_SIZE_NORMAL` => Some("GTK_ICON_SIZE_NORMAL")
      case `GTK_ICON_SIZE_LARGE` => Some("GTK_ICON_SIZE_LARGE")
      case _ => _root_.scala.None
  extension (a: GtkIconSize)
    inline def &(b: GtkIconSize): GtkIconSize = a & b
    inline def |(b: GtkIconSize): GtkIconSize = a | b
    inline def is(b: GtkIconSize): Boolean = (a & b) == b