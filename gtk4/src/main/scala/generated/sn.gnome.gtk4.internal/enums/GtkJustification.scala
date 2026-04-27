package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkJustification: _JUSTIFY_LEFT: The text is placed at the left edge of the label. _JUSTIFY_RIGHT: The text is placed at the right edge of the label. _JUSTIFY_CENTER: The text is placed in the center of the label. _JUSTIFY_FILL: The text is placed is distributed across the label.
*/
opaque type GtkJustification = CUnsignedInt
object GtkJustification extends _BindgenEnumCUnsignedInt[GtkJustification]:
  given _tag: Tag[GtkJustification] = Tag.UInt
  inline def define(inline a: Long): GtkJustification = a.toUInt
  val GTK_JUSTIFY_LEFT = define(0)
  val GTK_JUSTIFY_RIGHT = define(1)
  val GTK_JUSTIFY_CENTER = define(2)
  val GTK_JUSTIFY_FILL = define(3)
  def getName(value: GtkJustification): Option[String] =
    value match
      case `GTK_JUSTIFY_LEFT` => Some("GTK_JUSTIFY_LEFT")
      case `GTK_JUSTIFY_RIGHT` => Some("GTK_JUSTIFY_RIGHT")
      case `GTK_JUSTIFY_CENTER` => Some("GTK_JUSTIFY_CENTER")
      case `GTK_JUSTIFY_FILL` => Some("GTK_JUSTIFY_FILL")
      case _ => _root_.scala.None
  extension (a: GtkJustification)
    inline def &(b: GtkJustification): GtkJustification = a & b
    inline def |(b: GtkJustification): GtkJustification = a | b
    inline def is(b: GtkJustification): Boolean = (a & b) == b