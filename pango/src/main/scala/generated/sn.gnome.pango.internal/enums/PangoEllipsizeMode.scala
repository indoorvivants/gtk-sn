package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEllipsizeMode: _ELLIPSIZE_NONE: No ellipsization _ELLIPSIZE_START: Omit characters at the start of the text _ELLIPSIZE_MIDDLE: Omit characters in the middle of the text _ELLIPSIZE_END: Omit characters at the end of the text
*/
opaque type PangoEllipsizeMode = CUnsignedInt
object PangoEllipsizeMode extends _BindgenEnumCUnsignedInt[PangoEllipsizeMode]:
  given _tag: Tag[PangoEllipsizeMode] = Tag.UInt
  inline def define(inline a: Long): PangoEllipsizeMode = a.toUInt
  val PANGO_ELLIPSIZE_NONE = define(0)
  val PANGO_ELLIPSIZE_START = define(1)
  val PANGO_ELLIPSIZE_MIDDLE = define(2)
  val PANGO_ELLIPSIZE_END = define(3)
  def getName(value: PangoEllipsizeMode): Option[String] =
    value match
      case `PANGO_ELLIPSIZE_NONE` => Some("PANGO_ELLIPSIZE_NONE")
      case `PANGO_ELLIPSIZE_START` => Some("PANGO_ELLIPSIZE_START")
      case `PANGO_ELLIPSIZE_MIDDLE` => Some("PANGO_ELLIPSIZE_MIDDLE")
      case `PANGO_ELLIPSIZE_END` => Some("PANGO_ELLIPSIZE_END")
      case _ => _root_.scala.None
  extension (a: PangoEllipsizeMode)
    inline def &(b: PangoEllipsizeMode): PangoEllipsizeMode = a & b
    inline def |(b: PangoEllipsizeMode): PangoEllipsizeMode = a | b
    inline def is(b: PangoEllipsizeMode): Boolean = (a & b) == b