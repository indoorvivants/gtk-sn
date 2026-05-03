package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsPasswordFlags: _TLS_PASSWORD_NONE: No flags _TLS_PASSWORD_RETRY: The password was wrong, and the user should retry. _TLS_PASSWORD_MANY_TRIES: Hint to the user that the password has been wrong many times, and the user may not have many chances left. _TLS_PASSWORD_FINAL_TRY: Hint to the user that this is the last try to get this password right. _TLS_PASSWORD_PKCS11_USER: For PKCS #11, the user PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_SECURITY_OFFICER: For PKCS #11, the security officer PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC: For PKCS #11, the context-specific PIN is required. Since: 2.70.
*/
opaque type _GTlsPasswordFlags = CUnsignedInt
object _GTlsPasswordFlags extends _BindgenEnumCUnsignedInt[_GTlsPasswordFlags]:
  given _tag: Tag[_GTlsPasswordFlags] = Tag.UInt
  inline def define(inline a: Long): _GTlsPasswordFlags = a.toUInt
  val G_TLS_PASSWORD_NONE = define(0)
  val G_TLS_PASSWORD_RETRY = define(2)
  val G_TLS_PASSWORD_MANY_TRIES = define(4)
  val G_TLS_PASSWORD_FINAL_TRY = define(8)
  val G_TLS_PASSWORD_PKCS11_USER = define(16)
  val G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER = define(32)
  val G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC = define(64)
  def getName(value: _GTlsPasswordFlags): Option[String] =
    value match
      case `G_TLS_PASSWORD_NONE` => Some("G_TLS_PASSWORD_NONE")
      case `G_TLS_PASSWORD_RETRY` => Some("G_TLS_PASSWORD_RETRY")
      case `G_TLS_PASSWORD_MANY_TRIES` => Some("G_TLS_PASSWORD_MANY_TRIES")
      case `G_TLS_PASSWORD_FINAL_TRY` => Some("G_TLS_PASSWORD_FINAL_TRY")
      case `G_TLS_PASSWORD_PKCS11_USER` => Some("G_TLS_PASSWORD_PKCS11_USER")
      case `G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER` => Some("G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER")
      case `G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC` => Some("G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC")
      case _ => _root_.scala.None
  extension (a: _GTlsPasswordFlags)
    inline def &(b: _GTlsPasswordFlags): _GTlsPasswordFlags = a & b
    inline def |(b: _GTlsPasswordFlags): _GTlsPasswordFlags = a | b
    inline def is(b: _GTlsPasswordFlags): Boolean = (a & b) == b