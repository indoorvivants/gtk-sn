package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUriHideFlags: _URI_HIDE_NONE: No flags set. _URI_HIDE_USERINFO: Hide the userinfo. _URI_HIDE_PASSWORD: Hide the password. _URI_HIDE_AUTH_PARAMS: Hide the auth_params. _URI_HIDE_QUERY: Hide the query. _URI_HIDE_FRAGMENT: Hide the fragment.
*/
opaque type GUriHideFlags = CUnsignedInt
object GUriHideFlags extends _BindgenEnumCUnsignedInt[GUriHideFlags]:
  given _tag: Tag[GUriHideFlags] = Tag.UInt
  inline def define(inline a: Long): GUriHideFlags = a.toUInt
  val G_URI_HIDE_NONE = define(0)
  val G_URI_HIDE_USERINFO = define(1)
  val G_URI_HIDE_PASSWORD = define(2)
  val G_URI_HIDE_AUTH_PARAMS = define(4)
  val G_URI_HIDE_QUERY = define(8)
  val G_URI_HIDE_FRAGMENT = define(16)
  def getName(value: GUriHideFlags): Option[String] =
    value match
      case `G_URI_HIDE_NONE` => Some("G_URI_HIDE_NONE")
      case `G_URI_HIDE_USERINFO` => Some("G_URI_HIDE_USERINFO")
      case `G_URI_HIDE_PASSWORD` => Some("G_URI_HIDE_PASSWORD")
      case `G_URI_HIDE_AUTH_PARAMS` => Some("G_URI_HIDE_AUTH_PARAMS")
      case `G_URI_HIDE_QUERY` => Some("G_URI_HIDE_QUERY")
      case `G_URI_HIDE_FRAGMENT` => Some("G_URI_HIDE_FRAGMENT")
      case _ => _root_.scala.None
  extension (a: GUriHideFlags)
    inline def &(b: GUriHideFlags): GUriHideFlags = a & b
    inline def |(b: GUriHideFlags): GUriHideFlags = a | b
    inline def is(b: GUriHideFlags): Boolean = (a & b) == b