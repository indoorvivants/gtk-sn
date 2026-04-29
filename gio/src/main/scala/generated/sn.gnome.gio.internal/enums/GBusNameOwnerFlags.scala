package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusNameOwnerFlags: _BUS_NAME_OWNER_FLAGS_NONE: No flags set. _BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT: Allow another message bus connection to claim the name. _BUS_NAME_OWNER_FLAGS_REPLACE: If another message bus connection owns the name and have specified %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the other connection. _BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE: If another message bus connection owns the name, immediately return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)
*/
opaque type GBusNameOwnerFlags = CUnsignedInt
object GBusNameOwnerFlags extends _BindgenEnumCUnsignedInt[GBusNameOwnerFlags]:
  given _tag: Tag[GBusNameOwnerFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameOwnerFlags = a.toUInt
  val G_BUS_NAME_OWNER_FLAGS_NONE = define(0)
  val G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT = define(1)
  val G_BUS_NAME_OWNER_FLAGS_REPLACE = define(2)
  val G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE = define(4)
  def getName(value: GBusNameOwnerFlags): Option[String] =
    value match
      case `G_BUS_NAME_OWNER_FLAGS_NONE` => Some("G_BUS_NAME_OWNER_FLAGS_NONE")
      case `G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT` => Some("G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT")
      case `G_BUS_NAME_OWNER_FLAGS_REPLACE` => Some("G_BUS_NAME_OWNER_FLAGS_REPLACE")
      case `G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE` => Some("G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE")
      case _ => _root_.scala.None
  extension (a: GBusNameOwnerFlags)
    inline def &(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a & b
    inline def |(b: GBusNameOwnerFlags): GBusNameOwnerFlags = a | b
    inline def is(b: GBusNameOwnerFlags): Boolean = (a & b) == b