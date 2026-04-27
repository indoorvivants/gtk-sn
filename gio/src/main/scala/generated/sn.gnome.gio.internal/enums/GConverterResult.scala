package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConverterResult: _CONVERTER_ERROR: There was an error during conversion. _CONVERTER_CONVERTED: Some data was consumed or produced _CONVERTER_FINISHED: The conversion is finished _CONVERTER_FLUSHED: Flushing is finished
*/
opaque type GConverterResult = CUnsignedInt
object GConverterResult extends _BindgenEnumCUnsignedInt[GConverterResult]:
  given _tag: Tag[GConverterResult] = Tag.UInt
  inline def define(inline a: Long): GConverterResult = a.toUInt
  val G_CONVERTER_ERROR = define(0)
  val G_CONVERTER_CONVERTED = define(1)
  val G_CONVERTER_FINISHED = define(2)
  val G_CONVERTER_FLUSHED = define(3)
  def getName(value: GConverterResult): Option[String] =
    value match
      case `G_CONVERTER_ERROR` => Some("G_CONVERTER_ERROR")
      case `G_CONVERTER_CONVERTED` => Some("G_CONVERTER_CONVERTED")
      case `G_CONVERTER_FINISHED` => Some("G_CONVERTER_FINISHED")
      case `G_CONVERTER_FLUSHED` => Some("G_CONVERTER_FLUSHED")
      case _ => _root_.scala.None
  extension (a: GConverterResult)
    inline def &(b: GConverterResult): GConverterResult = a & b
    inline def |(b: GConverterResult): GConverterResult = a | b
    inline def is(b: GConverterResult): Boolean = (a & b) == b