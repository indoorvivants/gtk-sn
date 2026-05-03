package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResourceFlags: _RESOURCE_FLAGS_NONE: No flags set. _RESOURCE_FLAGS_COMPRESSED: The file is compressed.
*/
opaque type GResourceFlags = CUnsignedInt
object GResourceFlags extends _BindgenEnumCUnsignedInt[GResourceFlags]:
  given _tag: Tag[GResourceFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceFlags = a.toUInt
  val G_RESOURCE_FLAGS_NONE = define(0)
  val G_RESOURCE_FLAGS_COMPRESSED = define(1)
  def getName(value: GResourceFlags): Option[String] =
    value match
      case `G_RESOURCE_FLAGS_NONE` => Some("G_RESOURCE_FLAGS_NONE")
      case `G_RESOURCE_FLAGS_COMPRESSED` => Some("G_RESOURCE_FLAGS_COMPRESSED")
      case _ => _root_.scala.None
  extension (a: GResourceFlags)
    inline def &(b: GResourceFlags): GResourceFlags = a & b
    inline def |(b: GResourceFlags): GResourceFlags = a | b
    inline def is(b: GResourceFlags): Boolean = (a & b) == b