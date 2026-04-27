package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsDatabaseVerifyFlags: _TLS_DATABASE_VERIFY_NONE: No verification flags
*/
opaque type GTlsDatabaseVerifyFlags = CUnsignedInt
object GTlsDatabaseVerifyFlags extends _BindgenEnumCUnsignedInt[GTlsDatabaseVerifyFlags]:
  given _tag: Tag[GTlsDatabaseVerifyFlags] = Tag.UInt
  inline def define(inline a: Long): GTlsDatabaseVerifyFlags = a.toUInt
  val G_TLS_DATABASE_VERIFY_NONE = define(0)
  def getName(value: GTlsDatabaseVerifyFlags): Option[String] =
    value match
      case `G_TLS_DATABASE_VERIFY_NONE` => Some("G_TLS_DATABASE_VERIFY_NONE")
      case _ => _root_.scala.None
  extension (a: GTlsDatabaseVerifyFlags)
    inline def &(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a & b
    inline def |(b: GTlsDatabaseVerifyFlags): GTlsDatabaseVerifyFlags = a | b
    inline def is(b: GTlsDatabaseVerifyFlags): Boolean = (a & b) == b