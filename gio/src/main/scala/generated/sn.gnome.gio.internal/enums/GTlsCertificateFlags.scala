package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsCertificateFlags: _TLS_CERTIFICATE_NO_FLAGS: No flags set. Since: 2.74 _TLS_CERTIFICATE_UNKNOWN_CA: The signing certificate authority is not known. _TLS_CERTIFICATE_BAD_IDENTITY: The certificate does not match the expected identity of the site that it was retrieved from. _TLS_CERTIFICATE_NOT_ACTIVATED: The certificate's activation time is still in the future _TLS_CERTIFICATE_EXPIRED: The certificate has expired _TLS_CERTIFICATE_REVOKED: The certificate has been revoked according to the #GTlsConnection's certificate revocation list. _TLS_CERTIFICATE_INSECURE: The certificate's algorithm is considered insecure. _TLS_CERTIFICATE_GENERIC_ERROR: Some other error occurred validating the certificate _TLS_CERTIFICATE_VALIDATE_ALL: the combination of all of the above flags
*/
opaque type GTlsCertificateFlags = CUnsignedInt
object GTlsCertificateFlags extends _BindgenEnumCUnsignedInt[GTlsCertificateFlags]:
  given _tag: Tag[GTlsCertificateFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateFlags = a.toUInt
  val G_TLS_CERTIFICATE_NO_FLAGS = define(0)
  val G_TLS_CERTIFICATE_UNKNOWN_CA = define(1)
  val G_TLS_CERTIFICATE_BAD_IDENTITY = define(2)
  val G_TLS_CERTIFICATE_NOT_ACTIVATED = define(4)
  val G_TLS_CERTIFICATE_EXPIRED = define(8)
  val G_TLS_CERTIFICATE_REVOKED = define(16)
  val G_TLS_CERTIFICATE_INSECURE = define(32)
  val G_TLS_CERTIFICATE_GENERIC_ERROR = define(64)
  val G_TLS_CERTIFICATE_VALIDATE_ALL = define(127)
  def getName(value: GTlsCertificateFlags): Option[String] =
    value match
      case `G_TLS_CERTIFICATE_NO_FLAGS` => Some("G_TLS_CERTIFICATE_NO_FLAGS")
      case `G_TLS_CERTIFICATE_UNKNOWN_CA` => Some("G_TLS_CERTIFICATE_UNKNOWN_CA")
      case `G_TLS_CERTIFICATE_BAD_IDENTITY` => Some("G_TLS_CERTIFICATE_BAD_IDENTITY")
      case `G_TLS_CERTIFICATE_NOT_ACTIVATED` => Some("G_TLS_CERTIFICATE_NOT_ACTIVATED")
      case `G_TLS_CERTIFICATE_EXPIRED` => Some("G_TLS_CERTIFICATE_EXPIRED")
      case `G_TLS_CERTIFICATE_REVOKED` => Some("G_TLS_CERTIFICATE_REVOKED")
      case `G_TLS_CERTIFICATE_INSECURE` => Some("G_TLS_CERTIFICATE_INSECURE")
      case `G_TLS_CERTIFICATE_GENERIC_ERROR` => Some("G_TLS_CERTIFICATE_GENERIC_ERROR")
      case `G_TLS_CERTIFICATE_VALIDATE_ALL` => Some("G_TLS_CERTIFICATE_VALIDATE_ALL")
      case _ => _root_.scala.None
  extension (a: GTlsCertificateFlags)
    inline def &(b: GTlsCertificateFlags): GTlsCertificateFlags = a & b
    inline def |(b: GTlsCertificateFlags): GTlsCertificateFlags = a | b
    inline def is(b: GTlsCertificateFlags): Boolean = (a & b) == b