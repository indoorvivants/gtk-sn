package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBorderStyle: _BORDER_STYLE_NONE: No visible border _BORDER_STYLE_HIDDEN: Same as %GTK_BORDER_STYLE_NONE _BORDER_STYLE_SOLID: A single line segment _BORDER_STYLE_INSET: Looks as if the content is sunken into the canvas _BORDER_STYLE_OUTSET: Looks as if the content is coming out of the canvas _BORDER_STYLE_DOTTED: A series of round dots _BORDER_STYLE_DASHED: A series of square-ended dashes _BORDER_STYLE_DOUBLE: Two parallel lines with some space between them _BORDER_STYLE_GROOVE: Looks as if it were carved in the canvas _BORDER_STYLE_RIDGE: Looks as if it were coming out of the canvas
*/
opaque type GtkBorderStyle = CUnsignedInt
object GtkBorderStyle extends _BindgenEnumCUnsignedInt[GtkBorderStyle]:
  given _tag: Tag[GtkBorderStyle] = Tag.UInt
  inline def define(inline a: Long): GtkBorderStyle = a.toUInt
  val GTK_BORDER_STYLE_NONE = define(0)
  val GTK_BORDER_STYLE_HIDDEN = define(1)
  val GTK_BORDER_STYLE_SOLID = define(2)
  val GTK_BORDER_STYLE_INSET = define(3)
  val GTK_BORDER_STYLE_OUTSET = define(4)
  val GTK_BORDER_STYLE_DOTTED = define(5)
  val GTK_BORDER_STYLE_DASHED = define(6)
  val GTK_BORDER_STYLE_DOUBLE = define(7)
  val GTK_BORDER_STYLE_GROOVE = define(8)
  val GTK_BORDER_STYLE_RIDGE = define(9)
  def getName(value: GtkBorderStyle): Option[String] =
    value match
      case `GTK_BORDER_STYLE_NONE` => Some("GTK_BORDER_STYLE_NONE")
      case `GTK_BORDER_STYLE_HIDDEN` => Some("GTK_BORDER_STYLE_HIDDEN")
      case `GTK_BORDER_STYLE_SOLID` => Some("GTK_BORDER_STYLE_SOLID")
      case `GTK_BORDER_STYLE_INSET` => Some("GTK_BORDER_STYLE_INSET")
      case `GTK_BORDER_STYLE_OUTSET` => Some("GTK_BORDER_STYLE_OUTSET")
      case `GTK_BORDER_STYLE_DOTTED` => Some("GTK_BORDER_STYLE_DOTTED")
      case `GTK_BORDER_STYLE_DASHED` => Some("GTK_BORDER_STYLE_DASHED")
      case `GTK_BORDER_STYLE_DOUBLE` => Some("GTK_BORDER_STYLE_DOUBLE")
      case `GTK_BORDER_STYLE_GROOVE` => Some("GTK_BORDER_STYLE_GROOVE")
      case `GTK_BORDER_STYLE_RIDGE` => Some("GTK_BORDER_STYLE_RIDGE")
      case _ => _root_.scala.None
  extension (a: GtkBorderStyle)
    inline def &(b: GtkBorderStyle): GtkBorderStyle = a & b
    inline def |(b: GtkBorderStyle): GtkBorderStyle = a | b
    inline def is(b: GtkBorderStyle): Boolean = (a & b) == b