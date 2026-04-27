package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBaselinePosition: _BASELINE_POSITION_TOP: Align the baseline at the top _BASELINE_POSITION_CENTER: Center the baseline _BASELINE_POSITION_BOTTOM: Align the baseline at the bottom
*/
opaque type GtkBaselinePosition = CUnsignedInt
object GtkBaselinePosition extends _BindgenEnumCUnsignedInt[GtkBaselinePosition]:
  given _tag: Tag[GtkBaselinePosition] = Tag.UInt
  inline def define(inline a: Long): GtkBaselinePosition = a.toUInt
  val GTK_BASELINE_POSITION_TOP = define(0)
  val GTK_BASELINE_POSITION_CENTER = define(1)
  val GTK_BASELINE_POSITION_BOTTOM = define(2)
  def getName(value: GtkBaselinePosition): Option[String] =
    value match
      case `GTK_BASELINE_POSITION_TOP` => Some("GTK_BASELINE_POSITION_TOP")
      case `GTK_BASELINE_POSITION_CENTER` => Some("GTK_BASELINE_POSITION_CENTER")
      case `GTK_BASELINE_POSITION_BOTTOM` => Some("GTK_BASELINE_POSITION_BOTTOM")
      case _ => _root_.scala.None
  extension (a: GtkBaselinePosition)
    inline def &(b: GtkBaselinePosition): GtkBaselinePosition = a & b
    inline def |(b: GtkBaselinePosition): GtkBaselinePosition = a | b
    inline def is(b: GtkBaselinePosition): Boolean = (a & b) == b