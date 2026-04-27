package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeStatus: _FILE_ATTRIBUTE_STATUS_UNSET: Attribute value is unset (empty). _FILE_ATTRIBUTE_STATUS_SET: Attribute value is set. _FILE_ATTRIBUTE_STATUS_ERROR_SETTING: Indicates an error in setting the value.
*/
opaque type GFileAttributeStatus = CUnsignedInt
object GFileAttributeStatus extends _BindgenEnumCUnsignedInt[GFileAttributeStatus]:
  given _tag: Tag[GFileAttributeStatus] = Tag.UInt
  inline def define(inline a: Long): GFileAttributeStatus = a.toUInt
  val G_FILE_ATTRIBUTE_STATUS_UNSET = define(0)
  val G_FILE_ATTRIBUTE_STATUS_SET = define(1)
  val G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING = define(2)
  def getName(value: GFileAttributeStatus): Option[String] =
    value match
      case `G_FILE_ATTRIBUTE_STATUS_UNSET` => Some("G_FILE_ATTRIBUTE_STATUS_UNSET")
      case `G_FILE_ATTRIBUTE_STATUS_SET` => Some("G_FILE_ATTRIBUTE_STATUS_SET")
      case `G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING` => Some("G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING")
      case _ => _root_.scala.None
  extension (a: GFileAttributeStatus)
    inline def &(b: GFileAttributeStatus): GFileAttributeStatus = a & b
    inline def |(b: GFileAttributeStatus): GFileAttributeStatus = a | b
    inline def is(b: GFileAttributeStatus): Boolean = (a & b) == b