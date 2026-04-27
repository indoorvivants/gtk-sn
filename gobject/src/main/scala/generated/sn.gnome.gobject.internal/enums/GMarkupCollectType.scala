package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMarkupCollectType = CUnsignedInt
object GMarkupCollectType extends _BindgenEnumCUnsignedInt[GMarkupCollectType]:
  given _tag: Tag[GMarkupCollectType] = Tag.UInt
  inline def define(inline a: Long): GMarkupCollectType = a.toUInt
  val G_MARKUP_COLLECT_INVALID = define(0)
  val G_MARKUP_COLLECT_STRING = define(1)
  val G_MARKUP_COLLECT_STRDUP = define(2)
  val G_MARKUP_COLLECT_BOOLEAN = define(3)
  val G_MARKUP_COLLECT_TRISTATE = define(4)
  val G_MARKUP_COLLECT_OPTIONAL = define(65536)
  def getName(value: GMarkupCollectType): Option[String] =
    value match
      case `G_MARKUP_COLLECT_INVALID` => Some("G_MARKUP_COLLECT_INVALID")
      case `G_MARKUP_COLLECT_STRING` => Some("G_MARKUP_COLLECT_STRING")
      case `G_MARKUP_COLLECT_STRDUP` => Some("G_MARKUP_COLLECT_STRDUP")
      case `G_MARKUP_COLLECT_BOOLEAN` => Some("G_MARKUP_COLLECT_BOOLEAN")
      case `G_MARKUP_COLLECT_TRISTATE` => Some("G_MARKUP_COLLECT_TRISTATE")
      case `G_MARKUP_COLLECT_OPTIONAL` => Some("G_MARKUP_COLLECT_OPTIONAL")
      case _ => _root_.scala.None
  extension (a: GMarkupCollectType)
    inline def &(b: GMarkupCollectType): GMarkupCollectType = a & b
    inline def |(b: GMarkupCollectType): GMarkupCollectType = a | b
    inline def is(b: GMarkupCollectType): Boolean = (a & b) == b