package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTestDBusFlags: _TEST_DBUS_NONE: No flags.
*/
opaque type GTestDBusFlags = CUnsignedInt
object GTestDBusFlags extends _BindgenEnumCUnsignedInt[GTestDBusFlags]:
  given _tag: Tag[GTestDBusFlags] = Tag.UInt
  inline def define(inline a: Long): GTestDBusFlags = a.toUInt
  val G_TEST_DBUS_NONE = define(0)
  def getName(value: GTestDBusFlags): Option[String] =
    value match
      case `G_TEST_DBUS_NONE` => Some("G_TEST_DBUS_NONE")
      case _ => _root_.scala.None
  extension (a: GTestDBusFlags)
    inline def &(b: GTestDBusFlags): GTestDBusFlags = a & b
    inline def |(b: GTestDBusFlags): GTestDBusFlags = a | b
    inline def is(b: GTestDBusFlags): Boolean = (a & b) == b