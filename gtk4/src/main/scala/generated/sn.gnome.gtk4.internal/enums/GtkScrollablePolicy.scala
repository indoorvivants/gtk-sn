package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkScrollablePolicy: _SCROLL_MINIMUM: Scrollable adjustments are based on the minimum size _SCROLL_NATURAL: Scrollable adjustments are based on the natural size
*/
opaque type GtkScrollablePolicy = CUnsignedInt
object GtkScrollablePolicy extends _BindgenEnumCUnsignedInt[GtkScrollablePolicy]:
  given _tag: Tag[GtkScrollablePolicy] = Tag.UInt
  inline def define(inline a: Long): GtkScrollablePolicy = a.toUInt
  val GTK_SCROLL_MINIMUM = define(0)
  val GTK_SCROLL_NATURAL = define(1)
  def getName(value: GtkScrollablePolicy): Option[String] =
    value match
      case `GTK_SCROLL_MINIMUM` => Some("GTK_SCROLL_MINIMUM")
      case `GTK_SCROLL_NATURAL` => Some("GTK_SCROLL_NATURAL")
      case _ => _root_.scala.None
  extension (a: GtkScrollablePolicy)
    inline def &(b: GtkScrollablePolicy): GtkScrollablePolicy = a & b
    inline def |(b: GtkScrollablePolicy): GtkScrollablePolicy = a | b
    inline def is(b: GtkScrollablePolicy): Boolean = (a & b) == b