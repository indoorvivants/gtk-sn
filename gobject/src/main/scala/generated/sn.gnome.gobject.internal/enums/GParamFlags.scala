package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamFlags: _PARAM_READABLE: the parameter is readable _PARAM_WRITABLE: the parameter is writable _PARAM_READWRITE: alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE _PARAM_CONSTRUCT: the parameter will be set upon object construction _PARAM_CONSTRUCT_ONLY: the parameter can only be set upon object construction _PARAM_LAX_VALIDATION: upon parameter conversion (see g_param_value_convert()) strict validation is not required _PARAM_STATIC_NAME: the string used as name when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_NICK: the string used as nick when constructing the parameter is guaranteed to remain valid and unmmodified for the lifetime of the parameter. Since 2.8 _PARAM_STATIC_BLURB: the string used as blurb when constructing the parameter is guaranteed to remain valid and unmodified for the lifetime of the parameter. Since 2.8 _PARAM_EXPLICIT_NOTIFY: calls to g_object_set_property() for this property will not automatically result in a "notify" signal being emitted: the implementation must call g_object_notify() themselves in case the property actually changes. Since: 2.42. _PARAM_PRIVATE: internal _PARAM_DEPRECATED: the parameter is deprecated and will be removed in a future version. A warning will be generated if it is used while running with G_ENABLE_DIAGNOSTIC=1. Since 2.26
*/
opaque type GParamFlags = CInt
object GParamFlags extends _BindgenEnumCInt[GParamFlags]:
  given _tag: Tag[GParamFlags] = Tag.Int
  inline def define(inline a: CInt): GParamFlags = a
  val G_PARAM_READABLE = define(1)
  val G_PARAM_WRITABLE = define(2)
  val G_PARAM_READWRITE = define(3)
  val G_PARAM_CONSTRUCT = define(4)
  val G_PARAM_CONSTRUCT_ONLY = define(8)
  val G_PARAM_LAX_VALIDATION = define(16)
  val G_PARAM_STATIC_NAME = define(32)
  val G_PARAM_PRIVATE = define(32)
  val G_PARAM_STATIC_NICK = define(64)
  val G_PARAM_STATIC_BLURB = define(128)
  val G_PARAM_EXPLICIT_NOTIFY = define(1073741824)
  val G_PARAM_DEPRECATED = define(-2147483648)
  def getName(value: GParamFlags): Option[String] =
    value match
      case `G_PARAM_READABLE` => Some("G_PARAM_READABLE")
      case `G_PARAM_WRITABLE` => Some("G_PARAM_WRITABLE")
      case `G_PARAM_READWRITE` => Some("G_PARAM_READWRITE")
      case `G_PARAM_CONSTRUCT` => Some("G_PARAM_CONSTRUCT")
      case `G_PARAM_CONSTRUCT_ONLY` => Some("G_PARAM_CONSTRUCT_ONLY")
      case `G_PARAM_LAX_VALIDATION` => Some("G_PARAM_LAX_VALIDATION")
      case `G_PARAM_STATIC_NAME` => Some("G_PARAM_STATIC_NAME")
      case `G_PARAM_PRIVATE` => Some("G_PARAM_PRIVATE")
      case `G_PARAM_STATIC_NICK` => Some("G_PARAM_STATIC_NICK")
      case `G_PARAM_STATIC_BLURB` => Some("G_PARAM_STATIC_BLURB")
      case `G_PARAM_EXPLICIT_NOTIFY` => Some("G_PARAM_EXPLICIT_NOTIFY")
      case `G_PARAM_DEPRECATED` => Some("G_PARAM_DEPRECATED")
      case _ => _root_.scala.None
  extension (a: GParamFlags)
    inline def &(b: GParamFlags): GParamFlags = a & b
    inline def |(b: GParamFlags): GParamFlags = a | b
    inline def is(b: GParamFlags): Boolean = (a & b) == b