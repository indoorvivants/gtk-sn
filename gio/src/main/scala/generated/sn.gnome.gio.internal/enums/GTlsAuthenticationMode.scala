package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsAuthenticationMode: _TLS_AUTHENTICATION_NONE: client authentication not required _TLS_AUTHENTICATION_REQUESTED: client authentication is requested _TLS_AUTHENTICATION_REQUIRED: client authentication is required
*/
opaque type GTlsAuthenticationMode = CUnsignedInt
object GTlsAuthenticationMode extends _BindgenEnumCUnsignedInt[GTlsAuthenticationMode]:
  given _tag: Tag[GTlsAuthenticationMode] = Tag.UInt
  inline def define(inline a: Long): GTlsAuthenticationMode = a.toUInt
  val G_TLS_AUTHENTICATION_NONE = define(0)
  val G_TLS_AUTHENTICATION_REQUESTED = define(1)
  val G_TLS_AUTHENTICATION_REQUIRED = define(2)
  def getName(value: GTlsAuthenticationMode): Option[String] =
    value match
      case `G_TLS_AUTHENTICATION_NONE` => Some("G_TLS_AUTHENTICATION_NONE")
      case `G_TLS_AUTHENTICATION_REQUESTED` => Some("G_TLS_AUTHENTICATION_REQUESTED")
      case `G_TLS_AUTHENTICATION_REQUIRED` => Some("G_TLS_AUTHENTICATION_REQUIRED")
      case _ => _root_.scala.None
  extension (a: GTlsAuthenticationMode)
    inline def &(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a & b
    inline def |(b: GTlsAuthenticationMode): GTlsAuthenticationMode = a | b
    inline def is(b: GTlsAuthenticationMode): Boolean = (a & b) == b