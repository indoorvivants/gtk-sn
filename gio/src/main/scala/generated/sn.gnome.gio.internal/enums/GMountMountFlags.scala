package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMountMountFlags: _MOUNT_MOUNT_NONE: No flags set.
*/
opaque type GMountMountFlags = CUnsignedInt
object GMountMountFlags extends _BindgenEnumCUnsignedInt[GMountMountFlags]:
  given _tag: Tag[GMountMountFlags] = Tag.UInt
  inline def define(inline a: Long): GMountMountFlags = a.toUInt
  val G_MOUNT_MOUNT_NONE = define(0)
  def getName(value: GMountMountFlags): Option[String] =
    value match
      case `G_MOUNT_MOUNT_NONE` => Some("G_MOUNT_MOUNT_NONE")
      case _ => _root_.scala.None
  extension (a: GMountMountFlags)
    inline def &(b: GMountMountFlags): GMountMountFlags = a & b
    inline def |(b: GMountMountFlags): GMountMountFlags = a | b
    inline def is(b: GMountMountFlags): Boolean = (a & b) == b