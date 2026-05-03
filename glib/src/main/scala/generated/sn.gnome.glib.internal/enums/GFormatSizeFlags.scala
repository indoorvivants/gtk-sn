package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFormatSizeFlags = CUnsignedInt
object GFormatSizeFlags extends _BindgenEnumCUnsignedInt[GFormatSizeFlags]:
  given _tag: Tag[GFormatSizeFlags] = Tag.UInt
  inline def define(inline a: Long): GFormatSizeFlags = a.toUInt
  val G_FORMAT_SIZE_DEFAULT = define(0)
  val G_FORMAT_SIZE_LONG_FORMAT = define(1)
  val G_FORMAT_SIZE_IEC_UNITS = define(2)
  val G_FORMAT_SIZE_BITS = define(4)
  val G_FORMAT_SIZE_ONLY_VALUE = define(8)
  val G_FORMAT_SIZE_ONLY_UNIT = define(16)
  def getName(value: GFormatSizeFlags): Option[String] =
    value match
      case `G_FORMAT_SIZE_DEFAULT` => Some("G_FORMAT_SIZE_DEFAULT")
      case `G_FORMAT_SIZE_LONG_FORMAT` => Some("G_FORMAT_SIZE_LONG_FORMAT")
      case `G_FORMAT_SIZE_IEC_UNITS` => Some("G_FORMAT_SIZE_IEC_UNITS")
      case `G_FORMAT_SIZE_BITS` => Some("G_FORMAT_SIZE_BITS")
      case `G_FORMAT_SIZE_ONLY_VALUE` => Some("G_FORMAT_SIZE_ONLY_VALUE")
      case `G_FORMAT_SIZE_ONLY_UNIT` => Some("G_FORMAT_SIZE_ONLY_UNIT")
      case _ => _root_.scala.None
  extension (a: GFormatSizeFlags)
    inline def &(b: GFormatSizeFlags): GFormatSizeFlags = a & b
    inline def |(b: GFormatSizeFlags): GFormatSizeFlags = a | b
    inline def is(b: GFormatSizeFlags): Boolean = (a & b) == b