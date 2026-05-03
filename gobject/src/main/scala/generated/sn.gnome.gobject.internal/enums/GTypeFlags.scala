package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeFlags: _TYPE_FLAG_NONE: No special flags. Since: 2.74 _TYPE_FLAG_ABSTRACT: Indicates an abstract type. No instances can be created for an abstract type _TYPE_FLAG_VALUE_ABSTRACT: Indicates an abstract value type, i.e. a type that introduces a value table, but can't be used for g_value_init() _TYPE_FLAG_FINAL: Indicates a final type. A final type is a non-derivable leaf node in a deep derivable type hierarchy tree. Since: 2.70 _TYPE_FLAG_DEPRECATED: The type is deprecated and may be removed in a future version. A warning will be emitted if it is instantiated while running with `G_ENABLE_DIAGNOSTIC=1`. Since 2.76
*/
opaque type GTypeFlags = CUnsignedInt
object GTypeFlags extends _BindgenEnumCUnsignedInt[GTypeFlags]:
  given _tag: Tag[GTypeFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeFlags = a.toUInt
  val G_TYPE_FLAG_NONE = define(0)
  val G_TYPE_FLAG_ABSTRACT = define(16)
  val G_TYPE_FLAG_VALUE_ABSTRACT = define(32)
  val G_TYPE_FLAG_FINAL = define(64)
  val G_TYPE_FLAG_DEPRECATED = define(128)
  def getName(value: GTypeFlags): Option[String] =
    value match
      case `G_TYPE_FLAG_NONE` => Some("G_TYPE_FLAG_NONE")
      case `G_TYPE_FLAG_ABSTRACT` => Some("G_TYPE_FLAG_ABSTRACT")
      case `G_TYPE_FLAG_VALUE_ABSTRACT` => Some("G_TYPE_FLAG_VALUE_ABSTRACT")
      case `G_TYPE_FLAG_FINAL` => Some("G_TYPE_FLAG_FINAL")
      case `G_TYPE_FLAG_DEPRECATED` => Some("G_TYPE_FLAG_DEPRECATED")
      case _ => _root_.scala.None
  extension (a: GTypeFlags)
    inline def &(b: GTypeFlags): GTypeFlags = a & b
    inline def |(b: GTypeFlags): GTypeFlags = a | b
    inline def is(b: GTypeFlags): Boolean = (a & b) == b