package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsCertificateRequestFlags: _TLS_CERTIFICATE_REQUEST_NONE: No flags
*/
opaque type GTlsCertificateRequestFlags = CUnsignedInt
object GTlsCertificateRequestFlags extends _BindgenEnumCUnsignedInt[GTlsCertificateRequestFlags]:
  given _tag: Tag[GTlsCertificateRequestFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsCertificateRequestFlags = a.toUInt
  val G_TLS_CERTIFICATE_REQUEST_NONE = define(0)
  def getName(value: GTlsCertificateRequestFlags): Option[String] =
    value match
      case `G_TLS_CERTIFICATE_REQUEST_NONE` => Some("G_TLS_CERTIFICATE_REQUEST_NONE")
      case _ => _root_.scala.None
  extension (a: GTlsCertificateRequestFlags)
    inline def &(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a & b
    inline def |(b: GTlsCertificateRequestFlags): GTlsCertificateRequestFlags = a | b
    inline def is(b: GTlsCertificateRequestFlags): Boolean = (a & b) == b