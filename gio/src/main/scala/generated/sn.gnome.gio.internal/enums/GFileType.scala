package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileType: _FILE_TYPE_UNKNOWN: File's type is unknown. _FILE_TYPE_REGULAR: File handle represents a regular file. _FILE_TYPE_DIRECTORY: File handle represents a directory. _FILE_TYPE_SYMBOLIC_LINK: File handle represents a symbolic link (Unix systems). _FILE_TYPE_SPECIAL: File is a "special" file, such as a socket, fifo, block device, or character device. _FILE_TYPE_SHORTCUT: File is a shortcut (Windows systems). _FILE_TYPE_MOUNTABLE: File is a mountable location.
*/
opaque type GFileType = CUnsignedInt
object GFileType extends _BindgenEnumCUnsignedInt[GFileType]:
  given _tag: Tag[GFileType] = Tag.UInt
  inline def define(inline a: Long): GFileType = a.toUInt
  val G_FILE_TYPE_UNKNOWN = define(0)
  val G_FILE_TYPE_REGULAR = define(1)
  val G_FILE_TYPE_DIRECTORY = define(2)
  val G_FILE_TYPE_SYMBOLIC_LINK = define(3)
  val G_FILE_TYPE_SPECIAL = define(4)
  val G_FILE_TYPE_SHORTCUT = define(5)
  val G_FILE_TYPE_MOUNTABLE = define(6)
  def getName(value: GFileType): Option[String] =
    value match
      case `G_FILE_TYPE_UNKNOWN` => Some("G_FILE_TYPE_UNKNOWN")
      case `G_FILE_TYPE_REGULAR` => Some("G_FILE_TYPE_REGULAR")
      case `G_FILE_TYPE_DIRECTORY` => Some("G_FILE_TYPE_DIRECTORY")
      case `G_FILE_TYPE_SYMBOLIC_LINK` => Some("G_FILE_TYPE_SYMBOLIC_LINK")
      case `G_FILE_TYPE_SPECIAL` => Some("G_FILE_TYPE_SPECIAL")
      case `G_FILE_TYPE_SHORTCUT` => Some("G_FILE_TYPE_SHORTCUT")
      case `G_FILE_TYPE_MOUNTABLE` => Some("G_FILE_TYPE_MOUNTABLE")
      case _ => _root_.scala.None
  extension (a: GFileType)
    inline def &(b: GFileType): GFileType = a & b
    inline def |(b: GFileType): GFileType = a | b
    inline def is(b: GFileType): Boolean = (a & b) == b