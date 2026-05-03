package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSliceConfig = CUnsignedInt
object GSliceConfig extends _BindgenEnumCUnsignedInt[GSliceConfig]:
  given _tag: Tag[GSliceConfig] = Tag.UInt
  inline def define(inline a: Long): GSliceConfig = a.toUInt
  val G_SLICE_CONFIG_ALWAYS_MALLOC = define(1)
  val G_SLICE_CONFIG_BYPASS_MAGAZINES = define(2)
  val G_SLICE_CONFIG_WORKING_SET_MSECS = define(3)
  val G_SLICE_CONFIG_COLOR_INCREMENT = define(4)
  val G_SLICE_CONFIG_CHUNK_SIZES = define(5)
  val G_SLICE_CONFIG_CONTENTION_COUNTER = define(6)
  def getName(value: GSliceConfig): Option[String] =
    value match
      case `G_SLICE_CONFIG_ALWAYS_MALLOC` => Some("G_SLICE_CONFIG_ALWAYS_MALLOC")
      case `G_SLICE_CONFIG_BYPASS_MAGAZINES` => Some("G_SLICE_CONFIG_BYPASS_MAGAZINES")
      case `G_SLICE_CONFIG_WORKING_SET_MSECS` => Some("G_SLICE_CONFIG_WORKING_SET_MSECS")
      case `G_SLICE_CONFIG_COLOR_INCREMENT` => Some("G_SLICE_CONFIG_COLOR_INCREMENT")
      case `G_SLICE_CONFIG_CHUNK_SIZES` => Some("G_SLICE_CONFIG_CHUNK_SIZES")
      case `G_SLICE_CONFIG_CONTENTION_COUNTER` => Some("G_SLICE_CONFIG_CONTENTION_COUNTER")
      case _ => _root_.scala.None
  extension (a: GSliceConfig)
    inline def &(b: GSliceConfig): GSliceConfig = a & b
    inline def |(b: GSliceConfig): GSliceConfig = a | b
    inline def is(b: GSliceConfig): Boolean = (a & b) == b