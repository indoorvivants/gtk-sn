package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConverterFlags: _CONVERTER_NO_FLAGS: No flags. _CONVERTER_INPUT_AT_END: At end of input data _CONVERTER_FLUSH: Flush data
*/
opaque type GConverterFlags = CUnsignedInt
object GConverterFlags extends _BindgenEnumCUnsignedInt[GConverterFlags]:
  given _tag: Tag[GConverterFlags] = Tag.UInt
  inline def define(inline a: Long): GConverterFlags = a.toUInt
  val G_CONVERTER_NO_FLAGS = define(0)
  val G_CONVERTER_INPUT_AT_END = define(1)
  val G_CONVERTER_FLUSH = define(2)
  def getName(value: GConverterFlags): Option[String] =
    value match
      case `G_CONVERTER_NO_FLAGS` => Some("G_CONVERTER_NO_FLAGS")
      case `G_CONVERTER_INPUT_AT_END` => Some("G_CONVERTER_INPUT_AT_END")
      case `G_CONVERTER_FLUSH` => Some("G_CONVERTER_FLUSH")
      case _ => _root_.scala.None
  extension (a: GConverterFlags)
    inline def &(b: GConverterFlags): GConverterFlags = a & b
    inline def |(b: GConverterFlags): GConverterFlags = a | b
    inline def is(b: GConverterFlags): Boolean = (a & b) == b