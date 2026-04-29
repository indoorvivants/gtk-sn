package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsRehandshakeMode: _TLS_REHANDSHAKE_NEVER: Never allow rehandshaking _TLS_REHANDSHAKE_SAFELY: Allow safe rehandshaking only _TLS_REHANDSHAKE_UNSAFELY: Allow unsafe rehandshaking
*/
opaque type GTlsRehandshakeMode = CUnsignedInt
object GTlsRehandshakeMode extends _BindgenEnumCUnsignedInt[GTlsRehandshakeMode]:
  given _tag: Tag[GTlsRehandshakeMode] = Tag.UInt
  inline def define(inline a: Long): GTlsRehandshakeMode = a.toUInt
  val G_TLS_REHANDSHAKE_NEVER = define(0)
  val G_TLS_REHANDSHAKE_SAFELY = define(1)
  val G_TLS_REHANDSHAKE_UNSAFELY = define(2)
  def getName(value: GTlsRehandshakeMode): Option[String] =
    value match
      case `G_TLS_REHANDSHAKE_NEVER` => Some("G_TLS_REHANDSHAKE_NEVER")
      case `G_TLS_REHANDSHAKE_SAFELY` => Some("G_TLS_REHANDSHAKE_SAFELY")
      case `G_TLS_REHANDSHAKE_UNSAFELY` => Some("G_TLS_REHANDSHAKE_UNSAFELY")
      case _ => _root_.scala.None
  extension (a: GTlsRehandshakeMode)
    inline def &(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a & b
    inline def |(b: GTlsRehandshakeMode): GTlsRehandshakeMode = a | b
    inline def is(b: GTlsRehandshakeMode): Boolean = (a & b) == b