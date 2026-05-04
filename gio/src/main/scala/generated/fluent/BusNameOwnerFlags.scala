package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GBusNameOwnerFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used in g_bus_own_name().
  */
class BusNameOwnerFlags private (val raw: GBusNameOwnerFlags):
  def is(kv: BusNameOwnerFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[BusNameOwnerFlags.KnownValue]
    BusNameOwnerFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"BusNameOwnerFlags(${sb.result().mkString(", ")})"
end BusNameOwnerFlags

object BusNameOwnerFlags:
  export KnownValue.*

  def fromRaw(raw: GBusNameOwnerFlags) = new BusNameOwnerFlags(raw)

  extension (af: BusNameOwnerFlags)
    def &(other: BusNameOwnerFlags) =
      BusNameOwnerFlags(af.raw & other.raw)
    def |(other: BusNameOwnerFlags) =
      BusNameOwnerFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used in g_bus_own_name().
    */
  enum KnownValue(override val raw: GBusNameOwnerFlags, name: String)
      extends BusNameOwnerFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GBusNameOwnerFlags.G_BUS_NAME_OWNER_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow another message bus connection to claim the name.
      */
    case ALLOW_REPLACEMENT
        extends KnownValue(
          GBusNameOwnerFlags.G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT,
          "ALLOW_REPLACEMENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If another message bus connection owns the name and have specified
      * %G_BUS_NAME_OWNER_FLAGS_ALLOW_REPLACEMENT, then take the name from the
      * other connection.
      */
    case REPLACE
        extends KnownValue(
          GBusNameOwnerFlags.G_BUS_NAME_OWNER_FLAGS_REPLACE,
          "REPLACE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If another message bus connection owns the name, immediately return an
      * error from g_bus_own_name() rather than entering the waiting queue for
      * that name. (Since 2.54)
      */
    case DO_NOT_QUEUE
        extends KnownValue(
          GBusNameOwnerFlags.G_BUS_NAME_OWNER_FLAGS_DO_NOT_QUEUE,
          "DO_NOT_QUEUE"
        )
  end KnownValue
end BusNameOwnerFlags
