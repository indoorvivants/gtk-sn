package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsPasswordFlags: _TLS_PASSWORD_NONE: No flags _TLS_PASSWORD_RETRY: The password was wrong, and the user should retry. _TLS_PASSWORD_MANY_TRIES: Hint to the user that the password has been wrong many times, and the user may not have many chances left. _TLS_PASSWORD_FINAL_TRY: Hint to the user that this is the last try to get this password right. _TLS_PASSWORD_PKCS11_USER: For PKCS #11, the user PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_SECURITY_OFFICER: For PKCS #11, the security officer PIN is required. Since: 2.70. _TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC: For PKCS #11, the context-specific PIN is required. Since: 2.70.
*/
type GTlsPasswordFlags = _GTlsPasswordFlags
object GTlsPasswordFlags:
  given _tag: Tag[GTlsPasswordFlags] = _GTlsPasswordFlags._tag
  inline def apply(inline o: _GTlsPasswordFlags): GTlsPasswordFlags = o
  extension (v: GTlsPasswordFlags)
    inline def value: _GTlsPasswordFlags = v