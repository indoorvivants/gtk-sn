package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceSkeletonFlags: _DBUS_INTERFACE_SKELETON_FLAGS_NONE: No flags set. _DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD: Each method invocation is handled in a thread dedicated to the invocation. This means that the method implementation can use blocking IO without blocking any other part of the process. It also means that the method implementation must use locking to access data structures used by other threads.
*/
opaque type GDBusInterfaceSkeletonFlags = CUnsignedInt
object GDBusInterfaceSkeletonFlags extends _BindgenEnumCUnsignedInt[GDBusInterfaceSkeletonFlags]:
  given _tag: Tag[GDBusInterfaceSkeletonFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusInterfaceSkeletonFlags = a.toUInt
  val G_DBUS_INTERFACE_SKELETON_FLAGS_NONE = define(0)
  val G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD = define(1)
  def getName(value: GDBusInterfaceSkeletonFlags): Option[String] =
    value match
      case `G_DBUS_INTERFACE_SKELETON_FLAGS_NONE` => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_NONE")
      case `G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD` => Some("G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD")
      case _ => _root_.scala.None
  extension (a: GDBusInterfaceSkeletonFlags)
    inline def &(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a & b
    inline def |(b: GDBusInterfaceSkeletonFlags): GDBusInterfaceSkeletonFlags = a | b
    inline def is(b: GDBusInterfaceSkeletonFlags): Boolean = (a & b) == b