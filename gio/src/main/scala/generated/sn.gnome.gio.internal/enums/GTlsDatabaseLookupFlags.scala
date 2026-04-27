package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsDatabaseLookupFlags: _TLS_DATABASE_LOOKUP_NONE: No lookup flags _TLS_DATABASE_LOOKUP_KEYPAIR: Restrict lookup to certificates that have a private key.
*/
opaque type GTlsDatabaseLookupFlags = CUnsignedInt
object GTlsDatabaseLookupFlags extends _BindgenEnumCUnsignedInt[GTlsDatabaseLookupFlags]:
  given _tag: Tag[GTlsDatabaseLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseLookupFlags = a.toUInt
  val G_TLS_DATABASE_LOOKUP_NONE = define(0)
  val G_TLS_DATABASE_LOOKUP_KEYPAIR = define(1)
  def getName(value: GTlsDatabaseLookupFlags): Option[String] =
    value match
      case `G_TLS_DATABASE_LOOKUP_NONE` => Some("G_TLS_DATABASE_LOOKUP_NONE")
      case `G_TLS_DATABASE_LOOKUP_KEYPAIR` => Some("G_TLS_DATABASE_LOOKUP_KEYPAIR")
      case _ => _root_.scala.None
  extension (a: GTlsDatabaseLookupFlags)
    inline def &(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a & b
    inline def |(b: GTlsDatabaseLookupFlags): GTlsDatabaseLookupFlags = a | b
    inline def is(b: GTlsDatabaseLookupFlags): Boolean = (a & b) == b