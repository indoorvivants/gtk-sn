package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusSubtreeFlags

/** Flags passed to g_dbus_connection_register_subtree().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusSubtreeFlags private (val raw: GDBusSubtreeFlags):
  def is(kv: DBusSubtreeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusSubtreeFlags.KnownValue]
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

  /** Flags passed to g_dbus_connection_register_subtree().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GDBusSubtreeFlags,
      name: scala.Predef.String
  ) extends DBusSubtreeFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GDBusSubtreeFlags.G_DBUS_SUBTREE_FLAGS_NONE, "NONE")

    /** Method calls to objects not in the enumerated range will still be
      * dispatched. This is useful if you want to dynamically spawn objects in
      * the subtree.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DISPATCH_TO_UNENUMERATED_NODES
        extends KnownValue(
          GDBusSubtreeFlags.G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES,
          "DISPATCH_TO_UNENUMERATED_NODES"
        )
  end KnownValue
end DBusSubtreeFlags
