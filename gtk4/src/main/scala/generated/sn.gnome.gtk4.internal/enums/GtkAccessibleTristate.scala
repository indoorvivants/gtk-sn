package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleTristate: _ACCESSIBLE_TRISTATE_FALSE: The state is `false` _ACCESSIBLE_TRISTATE_TRUE: The state is `true` _ACCESSIBLE_TRISTATE_MIXED: The state is `mixed`
*/
opaque type GtkAccessibleTristate = CUnsignedInt
object GtkAccessibleTristate extends _BindgenEnumCUnsignedInt[GtkAccessibleTristate]:
  given _tag: Tag[GtkAccessibleTristate] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleTristate = a.toUInt
  val GTK_ACCESSIBLE_TRISTATE_FALSE = define(0)
  val GTK_ACCESSIBLE_TRISTATE_TRUE = define(1)
  val GTK_ACCESSIBLE_TRISTATE_MIXED = define(2)
  def getName(value: GtkAccessibleTristate): Option[String] =
    value match
      case `GTK_ACCESSIBLE_TRISTATE_FALSE` => Some("GTK_ACCESSIBLE_TRISTATE_FALSE")
      case `GTK_ACCESSIBLE_TRISTATE_TRUE` => Some("GTK_ACCESSIBLE_TRISTATE_TRUE")
      case `GTK_ACCESSIBLE_TRISTATE_MIXED` => Some("GTK_ACCESSIBLE_TRISTATE_MIXED")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleTristate)
    inline def &(b: GtkAccessibleTristate): GtkAccessibleTristate = a & b
    inline def |(b: GtkAccessibleTristate): GtkAccessibleTristate = a | b
    inline def is(b: GtkAccessibleTristate): Boolean = (a & b) == b