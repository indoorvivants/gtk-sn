package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSymbolicColor: _SYMBOLIC_COLOR_FOREGROUND: The default foreground color _SYMBOLIC_COLOR_ERROR: Indication color for errors _SYMBOLIC_COLOR_WARNING: Indication color for warnings _SYMBOLIC_COLOR_SUCCESS: Indication color for success
*/
opaque type GtkSymbolicColor = CUnsignedInt
object GtkSymbolicColor extends _BindgenEnumCUnsignedInt[GtkSymbolicColor]:
  given _tag: Tag[GtkSymbolicColor] = Tag.UInt
  inline def define(inline a: Long): GtkSymbolicColor = a.toUInt
  val GTK_SYMBOLIC_COLOR_FOREGROUND = define(0)
  val GTK_SYMBOLIC_COLOR_ERROR = define(1)
  val GTK_SYMBOLIC_COLOR_WARNING = define(2)
  val GTK_SYMBOLIC_COLOR_SUCCESS = define(3)
  def getName(value: GtkSymbolicColor): Option[String] =
    value match
      case `GTK_SYMBOLIC_COLOR_FOREGROUND` => Some("GTK_SYMBOLIC_COLOR_FOREGROUND")
      case `GTK_SYMBOLIC_COLOR_ERROR` => Some("GTK_SYMBOLIC_COLOR_ERROR")
      case `GTK_SYMBOLIC_COLOR_WARNING` => Some("GTK_SYMBOLIC_COLOR_WARNING")
      case `GTK_SYMBOLIC_COLOR_SUCCESS` => Some("GTK_SYMBOLIC_COLOR_SUCCESS")
      case _ => _root_.scala.None
  extension (a: GtkSymbolicColor)
    inline def &(b: GtkSymbolicColor): GtkSymbolicColor = a & b
    inline def |(b: GtkSymbolicColor): GtkSymbolicColor = a | b
    inline def is(b: GtkSymbolicColor): Boolean = (a & b) == b