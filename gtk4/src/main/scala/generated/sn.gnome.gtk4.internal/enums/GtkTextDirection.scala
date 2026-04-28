package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextDirection: _TEXT_DIR_NONE: No direction. _TEXT_DIR_LTR: Left to right text direction. _TEXT_DIR_RTL: Right to left text direction.
*/
opaque type GtkTextDirection = CUnsignedInt
object GtkTextDirection extends _BindgenEnumCUnsignedInt[GtkTextDirection]:
  given _tag: Tag[GtkTextDirection] = Tag.UInt
  inline def define(inline a: Long): GtkTextDirection = a.toUInt
  val GTK_TEXT_DIR_NONE = define(0)
  val GTK_TEXT_DIR_LTR = define(1)
  val GTK_TEXT_DIR_RTL = define(2)
  def getName(value: GtkTextDirection): Option[String] =
    value match
      case `GTK_TEXT_DIR_NONE` => Some("GTK_TEXT_DIR_NONE")
      case `GTK_TEXT_DIR_LTR` => Some("GTK_TEXT_DIR_LTR")
      case `GTK_TEXT_DIR_RTL` => Some("GTK_TEXT_DIR_RTL")
      case _ => _root_.scala.None
  extension (a: GtkTextDirection)
    inline def &(b: GtkTextDirection): GtkTextDirection = a & b
    inline def |(b: GtkTextDirection): GtkTextDirection = a | b
    inline def is(b: GtkTextDirection): Boolean = (a & b) == b