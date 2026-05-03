package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsError: _TLS_ERROR_UNAVAILABLE: No TLS provider is available _TLS_ERROR_MISC: Miscellaneous TLS error _TLS_ERROR_BAD_CERTIFICATE: The certificate presented could not be parsed or failed validation. _TLS_ERROR_NOT_TLS: The TLS handshake failed because the peer does not seem to be a TLS server. _TLS_ERROR_HANDSHAKE: The TLS handshake failed because the peer's certificate was not acceptable. _TLS_ERROR_CERTIFICATE_REQUIRED: The TLS handshake failed because the server requested a client-side certificate, but none was provided. See g_tls_connection_set_certificate(). _TLS_ERROR_EOF: The TLS connection was closed without proper notice, which may indicate an attack. See g_tls_connection_set_require_close_notify(). _TLS_ERROR_INAPPROPRIATE_FALLBACK: The TLS handshake failed because the client sent the fallback SCSV, indicating a protocol downgrade attack. Since: 2.60 _TLS_ERROR_BAD_CERTIFICATE_PASSWORD: The certificate failed to load because a password was incorrect. Since: 2.72
*/
opaque type GTlsError = CUnsignedInt
object GTlsError extends _BindgenEnumCUnsignedInt[GTlsError]:
  given _tag: Tag[GTlsError] = Tag.UInt
  inline def define(inline a: Long): GTlsError = a.toUInt
  val G_TLS_ERROR_UNAVAILABLE = define(0)
  val G_TLS_ERROR_MISC = define(1)
  val G_TLS_ERROR_BAD_CERTIFICATE = define(2)
  val G_TLS_ERROR_NOT_TLS = define(3)
  val G_TLS_ERROR_HANDSHAKE = define(4)
  val G_TLS_ERROR_CERTIFICATE_REQUIRED = define(5)
  val G_TLS_ERROR_EOF = define(6)
  val G_TLS_ERROR_INAPPROPRIATE_FALLBACK = define(7)
  val G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD = define(8)
  def getName(value: GTlsError): Option[String] =
    value match
      case `G_TLS_ERROR_UNAVAILABLE` => Some("G_TLS_ERROR_UNAVAILABLE")
      case `G_TLS_ERROR_MISC` => Some("G_TLS_ERROR_MISC")
      case `G_TLS_ERROR_BAD_CERTIFICATE` => Some("G_TLS_ERROR_BAD_CERTIFICATE")
      case `G_TLS_ERROR_NOT_TLS` => Some("G_TLS_ERROR_NOT_TLS")
      case `G_TLS_ERROR_HANDSHAKE` => Some("G_TLS_ERROR_HANDSHAKE")
      case `G_TLS_ERROR_CERTIFICATE_REQUIRED` => Some("G_TLS_ERROR_CERTIFICATE_REQUIRED")
      case `G_TLS_ERROR_EOF` => Some("G_TLS_ERROR_EOF")
      case `G_TLS_ERROR_INAPPROPRIATE_FALLBACK` => Some("G_TLS_ERROR_INAPPROPRIATE_FALLBACK")
      case `G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD` => Some("G_TLS_ERROR_BAD_CERTIFICATE_PASSWORD")
      case _ => _root_.scala.None
  extension (a: GTlsError)
    inline def &(b: GTlsError): GTlsError = a & b
    inline def |(b: GTlsError): GTlsError = a | b
    inline def is(b: GTlsError): Boolean = (a & b) == b