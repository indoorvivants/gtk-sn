package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoTextTransform: _TEXT_TRANSFORM_NONE: Leave text unchanged _TEXT_TRANSFORM_LOWERCASE: Display letters and numbers as lowercase _TEXT_TRANSFORM_UPPERCASE: Display letters and numbers as uppercase _TEXT_TRANSFORM_CAPITALIZE: Display the first character of a word in titlecase
*/
opaque type PangoTextTransform = CUnsignedInt
object PangoTextTransform extends _BindgenEnumCUnsignedInt[PangoTextTransform]:
  given _tag: Tag[PangoTextTransform] = Tag.UInt
  inline def define(inline a: Long): PangoTextTransform = a.toUInt
  val PANGO_TEXT_TRANSFORM_NONE = define(0)
  val PANGO_TEXT_TRANSFORM_LOWERCASE = define(1)
  val PANGO_TEXT_TRANSFORM_UPPERCASE = define(2)
  val PANGO_TEXT_TRANSFORM_CAPITALIZE = define(3)
  def getName(value: PangoTextTransform): Option[String] =
    value match
      case `PANGO_TEXT_TRANSFORM_NONE` => Some("PANGO_TEXT_TRANSFORM_NONE")
      case `PANGO_TEXT_TRANSFORM_LOWERCASE` => Some("PANGO_TEXT_TRANSFORM_LOWERCASE")
      case `PANGO_TEXT_TRANSFORM_UPPERCASE` => Some("PANGO_TEXT_TRANSFORM_UPPERCASE")
      case `PANGO_TEXT_TRANSFORM_CAPITALIZE` => Some("PANGO_TEXT_TRANSFORM_CAPITALIZE")
      case _ => _root_.scala.None
  extension (a: PangoTextTransform)
    inline def &(b: PangoTextTransform): PangoTextTransform = a & b
    inline def |(b: PangoTextTransform): PangoTextTransform = a | b
    inline def is(b: PangoTextTransform): Boolean = (a & b) == b