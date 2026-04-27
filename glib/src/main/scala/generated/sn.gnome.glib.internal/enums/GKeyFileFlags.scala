package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GKeyFileFlags = CUnsignedInt
object GKeyFileFlags extends _BindgenEnumCUnsignedInt[GKeyFileFlags]:
  given _tag: Tag[GKeyFileFlags] = Tag.UInt
  inline def define(inline a: Long): GKeyFileFlags = a.toUInt
  val G_KEY_FILE_NONE = define(0)
  val G_KEY_FILE_KEEP_COMMENTS = define(1)
  val G_KEY_FILE_KEEP_TRANSLATIONS = define(2)
  def getName(value: GKeyFileFlags): Option[String] =
    value match
      case `G_KEY_FILE_NONE` => Some("G_KEY_FILE_NONE")
      case `G_KEY_FILE_KEEP_COMMENTS` => Some("G_KEY_FILE_KEEP_COMMENTS")
      case `G_KEY_FILE_KEEP_TRANSLATIONS` => Some("G_KEY_FILE_KEEP_TRANSLATIONS")
      case _ => _root_.scala.None
  extension (a: GKeyFileFlags)
    inline def &(b: GKeyFileFlags): GKeyFileFlags = a & b
    inline def |(b: GKeyFileFlags): GKeyFileFlags = a | b
    inline def is(b: GKeyFileFlags): Boolean = (a & b) == b