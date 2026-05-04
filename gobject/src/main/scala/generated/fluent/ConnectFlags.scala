package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GConnectFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The connection flags are used to specify the behaviour of a signal's
  * connection.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The connection flags are used to specify the behaviour of a signal's
    * connection.
    */
  enum KnownValue(override val raw: GConnectFlags, name: String)
      extends ConnectFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default behaviour (no special flags). Since: 2.74
      */
    case DEFAULT extends KnownValue(GConnectFlags.G_CONNECT_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If set, the handler should be called after the default handler of the
      * signal. Normally, the handler is called before the default handler.
      */
    case AFTER extends KnownValue(GConnectFlags.G_CONNECT_AFTER, "AFTER")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If set, the instance and data should be swapped when calling the
      * handler; see g_signal_connect_swapped() for an example.
      */
    case SWAPPED extends KnownValue(GConnectFlags.G_CONNECT_SWAPPED, "SWAPPED")
  end KnownValue
end ConnectFlags
