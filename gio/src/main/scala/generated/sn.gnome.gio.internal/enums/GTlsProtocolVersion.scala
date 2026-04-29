package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsProtocolVersion: _TLS_PROTOCOL_VERSION_UNKNOWN: No protocol version or unknown protocol version _TLS_PROTOCOL_VERSION_SSL_3_0: SSL 3.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_0: TLS 1.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_1: TLS 1.1, which is insecure and should not be used _TLS_PROTOCOL_VERSION_TLS_1_2: TLS 1.2, defined by [RFC 5246](https://datatracker.ietf.org/doc/html/rfc5246) _TLS_PROTOCOL_VERSION_TLS_1_3: TLS 1.3, defined by [RFC 8446](https://datatracker.ietf.org/doc/html/rfc8446) _TLS_PROTOCOL_VERSION_DTLS_1_0: DTLS 1.0, which is insecure and should not be used _TLS_PROTOCOL_VERSION_DTLS_1_2: DTLS 1.2, defined by [RFC 6347](https://datatracker.ietf.org/doc/html/rfc6347)
*/
opaque type GTlsProtocolVersion = CUnsignedInt
object GTlsProtocolVersion extends _BindgenEnumCUnsignedInt[GTlsProtocolVersion]:
  given _tag: Tag[GTlsProtocolVersion] = Tag.UInt
  inline def define(inline a: Long): GTlsProtocolVersion = a.toUInt
  val G_TLS_PROTOCOL_VERSION_UNKNOWN = define(0)
  val G_TLS_PROTOCOL_VERSION_SSL_3_0 = define(1)
  val G_TLS_PROTOCOL_VERSION_TLS_1_0 = define(2)
  val G_TLS_PROTOCOL_VERSION_TLS_1_1 = define(3)
  val G_TLS_PROTOCOL_VERSION_TLS_1_2 = define(4)
  val G_TLS_PROTOCOL_VERSION_TLS_1_3 = define(5)
  val G_TLS_PROTOCOL_VERSION_DTLS_1_0 = define(201)
  val G_TLS_PROTOCOL_VERSION_DTLS_1_2 = define(202)
  def getName(value: GTlsProtocolVersion): Option[String] =
    value match
      case `G_TLS_PROTOCOL_VERSION_UNKNOWN` => Some("G_TLS_PROTOCOL_VERSION_UNKNOWN")
      case `G_TLS_PROTOCOL_VERSION_SSL_3_0` => Some("G_TLS_PROTOCOL_VERSION_SSL_3_0")
      case `G_TLS_PROTOCOL_VERSION_TLS_1_0` => Some("G_TLS_PROTOCOL_VERSION_TLS_1_0")
      case `G_TLS_PROTOCOL_VERSION_TLS_1_1` => Some("G_TLS_PROTOCOL_VERSION_TLS_1_1")
      case `G_TLS_PROTOCOL_VERSION_TLS_1_2` => Some("G_TLS_PROTOCOL_VERSION_TLS_1_2")
      case `G_TLS_PROTOCOL_VERSION_TLS_1_3` => Some("G_TLS_PROTOCOL_VERSION_TLS_1_3")
      case `G_TLS_PROTOCOL_VERSION_DTLS_1_0` => Some("G_TLS_PROTOCOL_VERSION_DTLS_1_0")
      case `G_TLS_PROTOCOL_VERSION_DTLS_1_2` => Some("G_TLS_PROTOCOL_VERSION_DTLS_1_2")
      case _ => _root_.scala.None
  extension (a: GTlsProtocolVersion)
    inline def &(b: GTlsProtocolVersion): GTlsProtocolVersion = a & b
    inline def |(b: GTlsProtocolVersion): GTlsProtocolVersion = a | b
    inline def is(b: GTlsProtocolVersion): Boolean = (a & b) == b