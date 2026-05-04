package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GConnectFlags

/** The connection flags are used to specify the behaviour of a signal's
  * connection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConnectFlags private (val raw: GConnectFlags):
  def is(kv: ConnectFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ConnectFlags.KnownValue]
    ConnectFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ConnectFlags(${sb.result().mkString(", ")})"
end ConnectFlags

object ConnectFlags:
  export KnownValue.*

  def fromRaw(raw: GConnectFlags) = new ConnectFlags(raw)

  extension (af: ConnectFlags)
    def &(other: ConnectFlags) =
      ConnectFlags(af.raw & other.raw)
    def |(other: ConnectFlags) =
      ConnectFlags(af.raw | other.raw)

  /** The connection flags are used to specify the behaviour of a signal's
    * connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GConnectFlags, name: String)
      extends ConnectFlags(raw):
    override def toString(): String = this.name

    /** Default behaviour (no special flags). Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT extends KnownValue(GConnectFlags.G_CONNECT_DEFAULT, "DEFAULT")

    /** If set, the handler should be called after the default handler of the
      * signal. Normally, the handler is called before the default handler.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AFTER extends KnownValue(GConnectFlags.G_CONNECT_AFTER, "AFTER")

    /** If set, the instance and data should be swapped when calling the
      * handler; see g_signal_connect_swapped() for an example.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SWAPPED extends KnownValue(GConnectFlags.G_CONNECT_SWAPPED, "SWAPPED")
  end KnownValue
end ConnectFlags
