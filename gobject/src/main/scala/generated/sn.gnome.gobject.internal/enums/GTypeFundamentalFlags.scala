package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeFundamentalFlags: _TYPE_FLAG_CLASSED: Indicates a classed type _TYPE_FLAG_INSTANTIATABLE: Indicates an instantiatable type (implies classed) _TYPE_FLAG_DERIVABLE: Indicates a flat derivable type _TYPE_FLAG_DEEP_DERIVABLE: Indicates a deep derivable type (implies derivable)
*/
opaque type GTypeFundamentalFlags = CUnsignedInt
object GTypeFundamentalFlags extends _BindgenEnumCUnsignedInt[GTypeFundamentalFlags]:
  given _tag: Tag[GTypeFundamentalFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFundamentalFlags = a.toUInt
  val G_TYPE_FLAG_CLASSED = define(1)
  val G_TYPE_FLAG_INSTANTIATABLE = define(2)
  val G_TYPE_FLAG_DERIVABLE = define(4)
  val G_TYPE_FLAG_DEEP_DERIVABLE = define(8)
  def getName(value: GTypeFundamentalFlags): Option[String] =
    value match
      case `G_TYPE_FLAG_CLASSED` => Some("G_TYPE_FLAG_CLASSED")
      case `G_TYPE_FLAG_INSTANTIATABLE` => Some("G_TYPE_FLAG_INSTANTIATABLE")
      case `G_TYPE_FLAG_DERIVABLE` => Some("G_TYPE_FLAG_DERIVABLE")
      case `G_TYPE_FLAG_DEEP_DERIVABLE` => Some("G_TYPE_FLAG_DEEP_DERIVABLE")
      case _ => _root_.scala.None
  extension (a: GTypeFundamentalFlags)
    inline def &(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a & b
    inline def |(b: GTypeFundamentalFlags): GTypeFundamentalFlags = a | b
    inline def is(b: GTypeFundamentalFlags): Boolean = (a & b) == b