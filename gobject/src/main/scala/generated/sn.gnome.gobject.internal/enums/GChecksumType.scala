package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GChecksumType: _CHECKSUM_MD5: Use the MD5 hashing algorithm _CHECKSUM_SHA1: Use the SHA-1 hashing algorithm _CHECKSUM_SHA256: Use the SHA-256 hashing algorithm _CHECKSUM_SHA384: Use the SHA-384 hashing algorithm (Since: 2.51) _CHECKSUM_SHA512: Use the SHA-512 hashing algorithm (Since: 2.36)
*/
opaque type GChecksumType = CUnsignedInt
object GChecksumType extends _BindgenEnumCUnsignedInt[GChecksumType]:
  given _tag: Tag[GChecksumType] = Tag.UInt
  inline def define(inline a: Long): GChecksumType = a.toUInt
  val G_CHECKSUM_MD5 = define(0)
  val G_CHECKSUM_SHA1 = define(1)
  val G_CHECKSUM_SHA256 = define(2)
  val G_CHECKSUM_SHA512 = define(3)
  val G_CHECKSUM_SHA384 = define(4)
  def getName(value: GChecksumType): Option[String] =
    value match
      case `G_CHECKSUM_MD5` => Some("G_CHECKSUM_MD5")
      case `G_CHECKSUM_SHA1` => Some("G_CHECKSUM_SHA1")
      case `G_CHECKSUM_SHA256` => Some("G_CHECKSUM_SHA256")
      case `G_CHECKSUM_SHA512` => Some("G_CHECKSUM_SHA512")
      case `G_CHECKSUM_SHA384` => Some("G_CHECKSUM_SHA384")
      case _ => _root_.scala.None
  extension (a: GChecksumType)
    inline def &(b: GChecksumType): GChecksumType = a & b
    inline def |(b: GChecksumType): GChecksumType = a | b
    inline def is(b: GChecksumType): Boolean = (a & b) == b