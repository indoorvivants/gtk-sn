package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFilesystemPreviewType: _FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS: Only preview files if user has explicitly requested it. _FILESYSTEM_PREVIEW_TYPE_IF_LOCAL: Preview files if user has requested preview of "local" files. _FILESYSTEM_PREVIEW_TYPE_NEVER: Never preview files.
*/
opaque type GFilesystemPreviewType = CUnsignedInt
object GFilesystemPreviewType extends _BindgenEnumCUnsignedInt[GFilesystemPreviewType]:
  given _tag: Tag[GFilesystemPreviewType] = Tag.UInt
  inline def define(inline a: Long): GFilesystemPreviewType = a.toUInt
  val G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS = define(0)
  val G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL = define(1)
  val G_FILESYSTEM_PREVIEW_TYPE_NEVER = define(2)
  def getName(value: GFilesystemPreviewType): Option[String] =
    value match
      case `G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS` => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS")
      case `G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL` => Some("G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL")
      case `G_FILESYSTEM_PREVIEW_TYPE_NEVER` => Some("G_FILESYSTEM_PREVIEW_TYPE_NEVER")
      case _ => _root_.scala.None
  extension (a: GFilesystemPreviewType)
    inline def &(b: GFilesystemPreviewType): GFilesystemPreviewType = a & b
    inline def |(b: GFilesystemPreviewType): GFilesystemPreviewType = a | b
    inline def is(b: GFilesystemPreviewType): Boolean = (a & b) == b