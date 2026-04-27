package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeInfoFlags: _FILE_ATTRIBUTE_INFO_NONE: no flags set. _FILE_ATTRIBUTE_INFO_COPY_WITH_FILE: copy the attribute values when the file is copied. _FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED: copy the attribute values when the file is moved.
*/
opaque type GFileAttributeInfoFlags = CUnsignedInt
object GFileAttributeInfoFlags extends _BindgenEnumCUnsignedInt[GFileAttributeInfoFlags]:
  given _tag: Tag[GFileAttributeInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeInfoFlags = a.toUInt
  val G_FILE_ATTRIBUTE_INFO_NONE = define(0)
  val G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE = define(1)
  val G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED = define(2)
  def getName(value: GFileAttributeInfoFlags): Option[String] =
    value match
      case `G_FILE_ATTRIBUTE_INFO_NONE` => Some("G_FILE_ATTRIBUTE_INFO_NONE")
      case `G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE` => Some("G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE")
      case `G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED` => Some("G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED")
      case _ => _root_.scala.None
  extension (a: GFileAttributeInfoFlags)
    inline def &(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a & b
    inline def |(b: GFileAttributeInfoFlags): GFileAttributeInfoFlags = a | b
    inline def is(b: GFileAttributeInfoFlags): Boolean = (a & b) == b