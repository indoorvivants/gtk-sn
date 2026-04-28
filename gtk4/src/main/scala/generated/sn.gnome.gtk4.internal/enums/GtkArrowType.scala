package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkArrowType: _ARROW_UP: Represents an upward pointing arrow. _ARROW_DOWN: Represents a downward pointing arrow. _ARROW_LEFT: Represents a left pointing arrow. _ARROW_RIGHT: Represents a right pointing arrow. _ARROW_NONE: No arrow.
*/
opaque type GtkArrowType = CUnsignedInt
object GtkArrowType extends _BindgenEnumCUnsignedInt[GtkArrowType]:
  given _tag: Tag[GtkArrowType] = Tag.UInt
  inline def define(inline a: Long): GtkArrowType = a.toUInt
  val GTK_ARROW_UP = define(0)
  val GTK_ARROW_DOWN = define(1)
  val GTK_ARROW_LEFT = define(2)
  val GTK_ARROW_RIGHT = define(3)
  val GTK_ARROW_NONE = define(4)
  def getName(value: GtkArrowType): Option[String] =
    value match
      case `GTK_ARROW_UP` => Some("GTK_ARROW_UP")
      case `GTK_ARROW_DOWN` => Some("GTK_ARROW_DOWN")
      case `GTK_ARROW_LEFT` => Some("GTK_ARROW_LEFT")
      case `GTK_ARROW_RIGHT` => Some("GTK_ARROW_RIGHT")
      case `GTK_ARROW_NONE` => Some("GTK_ARROW_NONE")
      case _ => _root_.scala.None
  extension (a: GtkArrowType)
    inline def &(b: GtkArrowType): GtkArrowType = a & b
    inline def |(b: GtkArrowType): GtkArrowType = a | b
    inline def is(b: GtkArrowType): Boolean = (a & b) == b