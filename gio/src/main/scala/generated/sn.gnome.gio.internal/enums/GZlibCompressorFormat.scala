package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GZlibCompressorFormat: _ZLIB_COMPRESSOR_FORMAT_ZLIB: deflate compression with zlib header _ZLIB_COMPRESSOR_FORMAT_GZIP: gzip file format _ZLIB_COMPRESSOR_FORMAT_RAW: deflate compression with no header
*/
opaque type GZlibCompressorFormat = CUnsignedInt
object GZlibCompressorFormat extends _BindgenEnumCUnsignedInt[GZlibCompressorFormat]:
  given _tag: Tag[GZlibCompressorFormat] = Tag.UInt
  inline def define(inline a: Long): GZlibCompressorFormat = a.toUInt
  val G_ZLIB_COMPRESSOR_FORMAT_ZLIB = define(0)
  val G_ZLIB_COMPRESSOR_FORMAT_GZIP = define(1)
  val G_ZLIB_COMPRESSOR_FORMAT_RAW = define(2)
  def getName(value: GZlibCompressorFormat): Option[String] =
    value match
      case `G_ZLIB_COMPRESSOR_FORMAT_ZLIB` => Some("G_ZLIB_COMPRESSOR_FORMAT_ZLIB")
      case `G_ZLIB_COMPRESSOR_FORMAT_GZIP` => Some("G_ZLIB_COMPRESSOR_FORMAT_GZIP")
      case `G_ZLIB_COMPRESSOR_FORMAT_RAW` => Some("G_ZLIB_COMPRESSOR_FORMAT_RAW")
      case _ => _root_.scala.None
  extension (a: GZlibCompressorFormat)
    inline def &(b: GZlibCompressorFormat): GZlibCompressorFormat = a & b
    inline def |(b: GZlibCompressorFormat): GZlibCompressorFormat = a | b
    inline def is(b: GZlibCompressorFormat): Boolean = (a & b) == b