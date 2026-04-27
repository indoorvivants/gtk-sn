package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileSetContentsFlags: _FILE_SET_CONTENTS_NONE: No guarantees about file consistency or durability. The most dangerous setting, which is slightly faster than other settings. _FILE_SET_CONTENTS_CONSISTENT: Guarantee file consistency: after a crash, either the old version of the file or the new version of the file will be available, but not a mixture. On Unix systems this equates to an `fsync()` on the file and use of an atomic `rename()` of the new version of the file over the old. _FILE_SET_CONTENTS_DURABLE: Guarantee file durability: after a crash, the new version of the file will be available. On Unix systems this equates to an `fsync()` on the file (if %G_FILE_SET_CONTENTS_CONSISTENT is unset), or the effects of %G_FILE_SET_CONTENTS_CONSISTENT plus an `fsync()` on the directory containing the file after calling `rename()`. _FILE_SET_CONTENTS_ONLY_EXISTING: Only apply consistency and durability guarantees if the file already exists. This may speed up file operations if the file doesn’t currently exist, but may result in a corrupted version of the new file if the system crashes while writing it.
*/
opaque type GFileSetContentsFlags = CUnsignedInt
object GFileSetContentsFlags extends _BindgenEnumCUnsignedInt[GFileSetContentsFlags]:
  given _tag: Tag[GFileSetContentsFlags] = Tag.UInt
  inline def define(inline a: Long): GFileSetContentsFlags = a.toUInt
  val G_FILE_SET_CONTENTS_NONE = define(0)
  val G_FILE_SET_CONTENTS_CONSISTENT = define(1)
  val G_FILE_SET_CONTENTS_DURABLE = define(2)
  val G_FILE_SET_CONTENTS_ONLY_EXISTING = define(4)
  def getName(value: GFileSetContentsFlags): Option[String] =
    value match
      case `G_FILE_SET_CONTENTS_NONE` => Some("G_FILE_SET_CONTENTS_NONE")
      case `G_FILE_SET_CONTENTS_CONSISTENT` => Some("G_FILE_SET_CONTENTS_CONSISTENT")
      case `G_FILE_SET_CONTENTS_DURABLE` => Some("G_FILE_SET_CONTENTS_DURABLE")
      case `G_FILE_SET_CONTENTS_ONLY_EXISTING` => Some("G_FILE_SET_CONTENTS_ONLY_EXISTING")
      case _ => _root_.scala.None
  extension (a: GFileSetContentsFlags)
    inline def &(b: GFileSetContentsFlags): GFileSetContentsFlags = a & b
    inline def |(b: GFileSetContentsFlags): GFileSetContentsFlags = a | b
    inline def is(b: GFileSetContentsFlags): Boolean = (a & b) == b