package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUriParamsFlags: _URI_PARAMS_NONE: No flags set. _URI_PARAMS_CASE_INSENSITIVE: Parameter names are case insensitive. _URI_PARAMS_WWW_FORM: Replace `+` with space character. Only useful for URLs on the web, using the `https` or `http` schemas. _URI_PARAMS_PARSE_RELAXED: See %G_URI_FLAGS_PARSE_RELAXED.
*/
opaque type GUriParamsFlags = CUnsignedInt
object GUriParamsFlags extends _BindgenEnumCUnsignedInt[GUriParamsFlags]:
  given _tag: Tag[GUriParamsFlags] = Tag.UInt
  inline def define(inline a: Long): GUriParamsFlags = a.toUInt
  val G_URI_PARAMS_NONE = define(0)
  val G_URI_PARAMS_CASE_INSENSITIVE = define(1)
  val G_URI_PARAMS_WWW_FORM = define(2)
  val G_URI_PARAMS_PARSE_RELAXED = define(4)
  def getName(value: GUriParamsFlags): Option[String] =
    value match
      case `G_URI_PARAMS_NONE` => Some("G_URI_PARAMS_NONE")
      case `G_URI_PARAMS_CASE_INSENSITIVE` => Some("G_URI_PARAMS_CASE_INSENSITIVE")
      case `G_URI_PARAMS_WWW_FORM` => Some("G_URI_PARAMS_WWW_FORM")
      case `G_URI_PARAMS_PARSE_RELAXED` => Some("G_URI_PARAMS_PARSE_RELAXED")
      case _ => _root_.scala.None
  extension (a: GUriParamsFlags)
    inline def &(b: GUriParamsFlags): GUriParamsFlags = a & b
    inline def |(b: GUriParamsFlags): GUriParamsFlags = a | b
    inline def is(b: GUriParamsFlags): Boolean = (a & b) == b