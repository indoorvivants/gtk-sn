package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPasswordSave: _PASSWORD_SAVE_NEVER: never save a password. _PASSWORD_SAVE_FOR_SESSION: save a password for the session. _PASSWORD_SAVE_PERMANENTLY: save a password permanently.
*/
opaque type GPasswordSave = CUnsignedInt
object GPasswordSave extends _BindgenEnumCUnsignedInt[GPasswordSave]:
  given _tag: Tag[GPasswordSave] = Tag.UInt
  inline def define(inline a: Long): GPasswordSave = a.toUInt
  val G_PASSWORD_SAVE_NEVER = define(0)
  val G_PASSWORD_SAVE_FOR_SESSION = define(1)
  val G_PASSWORD_SAVE_PERMANENTLY = define(2)
  def getName(value: GPasswordSave): Option[String] =
    value match
      case `G_PASSWORD_SAVE_NEVER` => Some("G_PASSWORD_SAVE_NEVER")
      case `G_PASSWORD_SAVE_FOR_SESSION` => Some("G_PASSWORD_SAVE_FOR_SESSION")
      case `G_PASSWORD_SAVE_PERMANENTLY` => Some("G_PASSWORD_SAVE_PERMANENTLY")
      case _ => _root_.scala.None
  extension (a: GPasswordSave)
    inline def &(b: GPasswordSave): GPasswordSave = a & b
    inline def |(b: GPasswordSave): GPasswordSave = a | b
    inline def is(b: GPasswordSave): Boolean = (a & b) == b