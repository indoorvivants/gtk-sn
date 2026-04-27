package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDriveStartFlags: _DRIVE_START_NONE: No flags set.
*/
opaque type GDriveStartFlags = CUnsignedInt
object GDriveStartFlags extends _BindgenEnumCUnsignedInt[GDriveStartFlags]:
  given _tag: Tag[GDriveStartFlags] = Tag.UInt
  inline def define(inline a: Long): GDriveStartFlags = a.toUInt
  val G_DRIVE_START_NONE = define(0)
  def getName(value: GDriveStartFlags): Option[String] =
    value match
      case `G_DRIVE_START_NONE` => Some("G_DRIVE_START_NONE")
      case _ => _root_.scala.None
  extension (a: GDriveStartFlags)
    inline def &(b: GDriveStartFlags): GDriveStartFlags = a & b
    inline def |(b: GDriveStartFlags): GDriveStartFlags = a | b
    inline def is(b: GDriveStartFlags): Boolean = (a & b) == b