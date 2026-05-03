package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileCopyFlags: _FILE_COPY_NONE: No flags set. _FILE_COPY_OVERWRITE: Overwrite any existing files _FILE_COPY_BACKUP: Make a backup of any existing files. _FILE_COPY_NOFOLLOW_SYMLINKS: Don't follow symlinks. _FILE_COPY_ALL_METADATA: Copy all file metadata instead of just default set used for copy (see #GFileInfo). _FILE_COPY_NO_FALLBACK_FOR_MOVE: Don't use copy and delete fallback if native move not supported. _FILE_COPY_TARGET_DEFAULT_PERMS: Leaves target file with default perms, instead of setting the source file perms. _FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME: Use default modification timestamps instead of copying them from the source file. Since 2.80
*/
opaque type GFileCopyFlags = CUnsignedInt
object GFileCopyFlags extends _BindgenEnumCUnsignedInt[GFileCopyFlags]:
  given _tag: Tag[GFileCopyFlags] = Tag.UInt
  inline def define(inline a: Long): GFileCopyFlags = a.toUInt
  val G_FILE_COPY_NONE = define(0)
  val G_FILE_COPY_OVERWRITE = define(1)
  val G_FILE_COPY_BACKUP = define(2)
  val G_FILE_COPY_NOFOLLOW_SYMLINKS = define(4)
  val G_FILE_COPY_ALL_METADATA = define(8)
  val G_FILE_COPY_NO_FALLBACK_FOR_MOVE = define(16)
  val G_FILE_COPY_TARGET_DEFAULT_PERMS = define(32)
  val G_FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME = define(64)
  def getName(value: GFileCopyFlags): Option[String] =
    value match
      case `G_FILE_COPY_NONE` => Some("G_FILE_COPY_NONE")
      case `G_FILE_COPY_OVERWRITE` => Some("G_FILE_COPY_OVERWRITE")
      case `G_FILE_COPY_BACKUP` => Some("G_FILE_COPY_BACKUP")
      case `G_FILE_COPY_NOFOLLOW_SYMLINKS` => Some("G_FILE_COPY_NOFOLLOW_SYMLINKS")
      case `G_FILE_COPY_ALL_METADATA` => Some("G_FILE_COPY_ALL_METADATA")
      case `G_FILE_COPY_NO_FALLBACK_FOR_MOVE` => Some("G_FILE_COPY_NO_FALLBACK_FOR_MOVE")
      case `G_FILE_COPY_TARGET_DEFAULT_PERMS` => Some("G_FILE_COPY_TARGET_DEFAULT_PERMS")
      case `G_FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME` => Some("G_FILE_COPY_TARGET_DEFAULT_MODIFIED_TIME")
      case _ => _root_.scala.None
  extension (a: GFileCopyFlags)
    inline def &(b: GFileCopyFlags): GFileCopyFlags = a & b
    inline def |(b: GFileCopyFlags): GFileCopyFlags = a | b
    inline def is(b: GFileCopyFlags): Boolean = (a & b) == b