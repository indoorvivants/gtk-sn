package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GBusNameWatcherFlags

/** Flags used in g_bus_watch_name().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BusNameWatcherFlags private (val raw: GBusNameWatcherFlags):
  def is(kv: BusNameWatcherFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[BusNameWatcherFlags.KnownValue]
    BusNameWatcherFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"BusNameWatcherFlags(${sb.result().mkString(", ")})"
end BusNameWatcherFlags

object BusNameWatcherFlags:
  export KnownValue.*

  def fromRaw(raw: GBusNameWatcherFlags) = new BusNameWatcherFlags(raw)

  extension (af: BusNameWatcherFlags)
    def &(other: BusNameWatcherFlags) =
      BusNameWatcherFlags(af.raw & other.raw)
    def |(other: BusNameWatcherFlags) =
      BusNameWatcherFlags(af.raw | other.raw)

  /** Flags used in g_bus_watch_name().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GBusNameWatcherFlags, name: String)
      extends BusNameWatcherFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GBusNameWatcherFlags.G_BUS_NAME_WATCHER_FLAGS_NONE,
          "NONE"
        )

    /** If no-one owns the name when beginning to watch the name, ask the bus to
      * launch an owner for the name.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTO_START
        extends KnownValue(
          GBusNameWatcherFlags.G_BUS_NAME_WATCHER_FLAGS_AUTO_START,
          "AUTO_START"
        )
  end KnownValue
end BusNameWatcherFlags
