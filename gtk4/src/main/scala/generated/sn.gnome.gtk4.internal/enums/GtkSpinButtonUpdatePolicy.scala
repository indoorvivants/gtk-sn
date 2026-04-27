package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSpinButtonUpdatePolicy: _UPDATE_ALWAYS: When refreshing your `GtkSpinButton`, the value is always displayed _UPDATE_IF_VALID: When refreshing your `GtkSpinButton`, the value is only displayed if it is valid within the bounds of the spin button's adjustment
*/
opaque type GtkSpinButtonUpdatePolicy = CUnsignedInt
object GtkSpinButtonUpdatePolicy extends _BindgenEnumCUnsignedInt[GtkSpinButtonUpdatePolicy]:
  given _tag: Tag[GtkSpinButtonUpdatePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkSpinButtonUpdatePolicy = a.toUInt
  val GTK_UPDATE_ALWAYS = define(0)
  val GTK_UPDATE_IF_VALID = define(1)
  def getName(value: GtkSpinButtonUpdatePolicy): Option[String] =
    value match
      case `GTK_UPDATE_ALWAYS` => Some("GTK_UPDATE_ALWAYS")
      case `GTK_UPDATE_IF_VALID` => Some("GTK_UPDATE_IF_VALID")
      case _ => _root_.scala.None
  extension (a: GtkSpinButtonUpdatePolicy)
    inline def &(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a & b
    inline def |(b: GtkSpinButtonUpdatePolicy): GtkSpinButtonUpdatePolicy = a | b
    inline def is(b: GtkSpinButtonUpdatePolicy): Boolean = (a & b) == b