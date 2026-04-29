package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMountUnmountFlags: _MOUNT_UNMOUNT_NONE: No flags set. _MOUNT_UNMOUNT_FORCE: Unmount even if there are outstanding file operations on the mount.
*/
opaque type GMountUnmountFlags = CUnsignedInt
object GMountUnmountFlags extends _BindgenEnumCUnsignedInt[GMountUnmountFlags]:
  given _tag: Tag[GMountUnmountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountUnmountFlags = a.toUInt
  val G_MOUNT_UNMOUNT_NONE = define(0)
  val G_MOUNT_UNMOUNT_FORCE = define(1)
  def getName(value: GMountUnmountFlags): Option[String] =
    value match
      case `G_MOUNT_UNMOUNT_NONE` => Some("G_MOUNT_UNMOUNT_NONE")
      case `G_MOUNT_UNMOUNT_FORCE` => Some("G_MOUNT_UNMOUNT_FORCE")
      case _ => _root_.scala.None
  extension (a: GMountUnmountFlags)
    inline def &(b: GMountUnmountFlags): GMountUnmountFlags = a & b
    inline def |(b: GMountUnmountFlags): GMountUnmountFlags = a | b
    inline def is(b: GMountUnmountFlags): Boolean = (a & b) == b