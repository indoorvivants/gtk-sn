package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResourceLookupFlags: _RESOURCE_LOOKUP_FLAGS_NONE: No flags set.
*/
opaque type GResourceLookupFlags = CUnsignedInt
object GResourceLookupFlags extends _BindgenEnumCUnsignedInt[GResourceLookupFlags]:
  given _tag: Tag[GResourceLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResourceLookupFlags = a.toUInt
  val G_RESOURCE_LOOKUP_FLAGS_NONE = define(0)
  def getName(value: GResourceLookupFlags): Option[String] =
    value match
      case `G_RESOURCE_LOOKUP_FLAGS_NONE` => Some("G_RESOURCE_LOOKUP_FLAGS_NONE")
      case _ => _root_.scala.None
  extension (a: GResourceLookupFlags)
    inline def &(b: GResourceLookupFlags): GResourceLookupFlags = a & b
    inline def |(b: GResourceLookupFlags): GResourceLookupFlags = a | b
    inline def is(b: GResourceLookupFlags): Boolean = (a & b) == b