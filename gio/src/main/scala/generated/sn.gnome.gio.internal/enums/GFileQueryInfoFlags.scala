package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileQueryInfoFlags: _FILE_QUERY_INFO_NONE: No flags set. _FILE_QUERY_INFO_NOFOLLOW_SYMLINKS: Don't follow symlinks.
*/
opaque type GFileQueryInfoFlags = CUnsignedInt
object GFileQueryInfoFlags extends _BindgenEnumCUnsignedInt[GFileQueryInfoFlags]:
  given _tag: Tag[GFileQueryInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileQueryInfoFlags = a.toUInt
  val G_FILE_QUERY_INFO_NONE = define(0)
  val G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS = define(1)
  def getName(value: GFileQueryInfoFlags): Option[String] =
    value match
      case `G_FILE_QUERY_INFO_NONE` => Some("G_FILE_QUERY_INFO_NONE")
      case `G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS` => Some("G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS")
      case _ => _root_.scala.None
  extension (a: GFileQueryInfoFlags)
    inline def &(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a & b
    inline def |(b: GFileQueryInfoFlags): GFileQueryInfoFlags = a | b
    inline def is(b: GFileQueryInfoFlags): Boolean = (a & b) == b