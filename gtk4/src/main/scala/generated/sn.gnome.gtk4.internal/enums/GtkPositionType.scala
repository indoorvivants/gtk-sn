package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPositionType: _POS_LEFT: The feature is at the left edge. _POS_RIGHT: The feature is at the right edge. _POS_TOP: The feature is at the top edge. _POS_BOTTOM: The feature is at the bottom edge.
*/
opaque type GtkPositionType = CUnsignedInt
object GtkPositionType extends _BindgenEnumCUnsignedInt[GtkPositionType]:
  given _tag: Tag[GtkPositionType] = Tag.UInt
  inline def define(inline a: Long): GtkPositionType = a.toUInt
  val GTK_POS_LEFT = define(0)
  val GTK_POS_RIGHT = define(1)
  val GTK_POS_TOP = define(2)
  val GTK_POS_BOTTOM = define(3)
  def getName(value: GtkPositionType): Option[String] =
    value match
      case `GTK_POS_LEFT` => Some("GTK_POS_LEFT")
      case `GTK_POS_RIGHT` => Some("GTK_POS_RIGHT")
      case `GTK_POS_TOP` => Some("GTK_POS_TOP")
      case `GTK_POS_BOTTOM` => Some("GTK_POS_BOTTOM")
      case _ => _root_.scala.None
  extension (a: GtkPositionType)
    inline def &(b: GtkPositionType): GtkPositionType = a & b
    inline def |(b: GtkPositionType): GtkPositionType = a | b
    inline def is(b: GtkPositionType): Boolean = (a & b) == b