package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkUnit: _UNIT_NONE: No units. _UNIT_POINTS: Dimensions in points. _UNIT_INCH: Dimensions in inches. _UNIT_MM: Dimensions in millimeters
*/
opaque type GtkUnit = CUnsignedInt
object GtkUnit extends _BindgenEnumCUnsignedInt[GtkUnit]:
  given _tag: Tag[GtkUnit] = Tag.UInt
  inline def define(inline a: Long): GtkUnit = a.toUInt
  val GTK_UNIT_NONE = define(0)
  val GTK_UNIT_POINTS = define(1)
  val GTK_UNIT_INCH = define(2)
  val GTK_UNIT_MM = define(3)
  def getName(value: GtkUnit): Option[String] =
    value match
      case `GTK_UNIT_NONE` => Some("GTK_UNIT_NONE")
      case `GTK_UNIT_POINTS` => Some("GTK_UNIT_POINTS")
      case `GTK_UNIT_INCH` => Some("GTK_UNIT_INCH")
      case `GTK_UNIT_MM` => Some("GTK_UNIT_MM")
      case _ => _root_.scala.None
  extension (a: GtkUnit)
    inline def &(b: GtkUnit): GtkUnit = a & b
    inline def |(b: GtkUnit): GtkUnit = a | b
    inline def is(b: GtkUnit): Boolean = (a & b) == b