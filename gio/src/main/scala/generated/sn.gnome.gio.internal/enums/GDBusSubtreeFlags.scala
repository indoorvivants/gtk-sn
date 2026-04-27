package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSubtreeFlags: _DBUS_SUBTREE_FLAGS_NONE: No flags set. _DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES: Method calls to objects not in the enumerated range will still be dispatched. This is useful if you want to dynamically spawn objects in the subtree.
*/
opaque type GDBusSubtreeFlags = CUnsignedInt
object GDBusSubtreeFlags extends _BindgenEnumCUnsignedInt[GDBusSubtreeFlags]:
  given _tag: Tag[GDBusSubtreeFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSubtreeFlags = a.toUInt
  val G_DBUS_SUBTREE_FLAGS_NONE = define(0)
  val G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES = define(1)
  def getName(value: GDBusSubtreeFlags): Option[String] =
    value match
      case `G_DBUS_SUBTREE_FLAGS_NONE` => Some("G_DBUS_SUBTREE_FLAGS_NONE")
      case `G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES` => Some("G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES")
      case _ => _root_.scala.None
  extension (a: GDBusSubtreeFlags)
    inline def &(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a & b
    inline def |(b: GDBusSubtreeFlags): GDBusSubtreeFlags = a | b
    inline def is(b: GDBusSubtreeFlags): Boolean = (a & b) == b