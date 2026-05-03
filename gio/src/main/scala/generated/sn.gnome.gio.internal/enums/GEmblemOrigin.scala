package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GEmblemOrigin: _EMBLEM_ORIGIN_UNKNOWN: Emblem of unknown origin _EMBLEM_ORIGIN_DEVICE: Emblem adds device-specific information _EMBLEM_ORIGIN_LIVEMETADATA: Emblem depicts live metadata, such as "readonly" _EMBLEM_ORIGIN_TAG: Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
*/
opaque type GEmblemOrigin = CUnsignedInt
object GEmblemOrigin extends _BindgenEnumCUnsignedInt[GEmblemOrigin]:
  given _tag: Tag[GEmblemOrigin] = Tag.UInt
  inline def define(inline a: Long): GEmblemOrigin = a.toUInt
  val G_EMBLEM_ORIGIN_UNKNOWN = define(0)
  val G_EMBLEM_ORIGIN_DEVICE = define(1)
  val G_EMBLEM_ORIGIN_LIVEMETADATA = define(2)
  val G_EMBLEM_ORIGIN_TAG = define(3)
  def getName(value: GEmblemOrigin): Option[String] =
    value match
      case `G_EMBLEM_ORIGIN_UNKNOWN` => Some("G_EMBLEM_ORIGIN_UNKNOWN")
      case `G_EMBLEM_ORIGIN_DEVICE` => Some("G_EMBLEM_ORIGIN_DEVICE")
      case `G_EMBLEM_ORIGIN_LIVEMETADATA` => Some("G_EMBLEM_ORIGIN_LIVEMETADATA")
      case `G_EMBLEM_ORIGIN_TAG` => Some("G_EMBLEM_ORIGIN_TAG")
      case _ => _root_.scala.None
  extension (a: GEmblemOrigin)
    inline def &(b: GEmblemOrigin): GEmblemOrigin = a & b
    inline def |(b: GEmblemOrigin): GEmblemOrigin = a | b
    inline def is(b: GEmblemOrigin): Boolean = (a & b) == b