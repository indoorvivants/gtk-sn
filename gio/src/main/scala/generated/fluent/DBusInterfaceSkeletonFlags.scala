package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusInterfaceSkeletonFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags describing the behavior of a #GDBusInterfaceSkeleton instance.
  */
class DBusInterfaceSkeletonFlags private (val raw: GDBusInterfaceSkeletonFlags):
  def is(kv: DBusInterfaceSkeletonFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusInterfaceSkeletonFlags.KnownValue]
    DBusInterfaceSkeletonFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusInterfaceSkeletonFlags(${sb.result().mkString(", ")})"
end DBusInterfaceSkeletonFlags

object DBusInterfaceSkeletonFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusInterfaceSkeletonFlags) =
    new DBusInterfaceSkeletonFlags(raw)

  extension (af: DBusInterfaceSkeletonFlags)
    def &(other: DBusInterfaceSkeletonFlags) =
      DBusInterfaceSkeletonFlags(af.raw & other.raw)
    def |(other: DBusInterfaceSkeletonFlags) =
      DBusInterfaceSkeletonFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags describing the behavior of a #GDBusInterfaceSkeleton instance.
    */
  enum KnownValue(override val raw: GDBusInterfaceSkeletonFlags, name: String)
      extends DBusInterfaceSkeletonFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusInterfaceSkeletonFlags.G_DBUS_INTERFACE_SKELETON_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Each method invocation is handled in a thread dedicated to the
      * invocation. This means that the method implementation can use blocking
      * IO without blocking any other part of the process. It also means that
      * the method implementation must use locking to access data structures
      * used by other threads.
      */
    case HANDLE_METHOD_INVOCATIONS_IN_THREAD
        extends KnownValue(
          GDBusInterfaceSkeletonFlags.G_DBUS_INTERFACE_SKELETON_FLAGS_HANDLE_METHOD_INVOCATIONS_IN_THREAD,
          "HANDLE_METHOD_INVOCATIONS_IN_THREAD"
        )
  end KnownValue
end DBusInterfaceSkeletonFlags
