package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusSubtreeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags passed to g_dbus_connection_register_subtree().
  */
class DBusSubtreeFlags private (val raw: GDBusSubtreeFlags):
  def is(kv: DBusSubtreeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusSubtreeFlags.KnownValue]
    DBusSubtreeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusSubtreeFlags(${sb.result().mkString(", ")})"
end DBusSubtreeFlags

object DBusSubtreeFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusSubtreeFlags) = new DBusSubtreeFlags(raw)

  extension (af: DBusSubtreeFlags)
    def &(other: DBusSubtreeFlags) =
      DBusSubtreeFlags(af.raw & other.raw)
    def |(other: DBusSubtreeFlags) =
      DBusSubtreeFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags passed to g_dbus_connection_register_subtree().
    */
  enum KnownValue(override val raw: GDBusSubtreeFlags, name: String)
      extends DBusSubtreeFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GDBusSubtreeFlags.G_DBUS_SUBTREE_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Method calls to objects not in the enumerated range will still be
      * dispatched. This is useful if you want to dynamically spawn objects in
      * the subtree.
      */
    case DISPATCH_TO_UNENUMERATED_NODES
        extends KnownValue(
          GDBusSubtreeFlags.G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES,
          "DISPATCH_TO_UNENUMERATED_NODES"
        )
  end KnownValue
end DBusSubtreeFlags
