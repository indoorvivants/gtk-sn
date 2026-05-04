package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketMsgFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used in g_socket_receive_message() and g_socket_send_message(). The
  * flags listed in the enum are some commonly available flags, but the values
  * used for them are the same as on the platform, and any other flags are
  * passed in/out as is. So to use a platform specific flag, just include the
  * right system header and pass in the flag.
  */
class SocketMsgFlags private (val raw: GSocketMsgFlags):
  def is(kv: SocketMsgFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SocketMsgFlags.KnownValue]
    SocketMsgFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SocketMsgFlags(${sb.result().mkString(", ")})"
end SocketMsgFlags

object SocketMsgFlags:
  export KnownValue.*

  def fromRaw(raw: GSocketMsgFlags) = new SocketMsgFlags(raw)

  extension (af: SocketMsgFlags)
    def &(other: SocketMsgFlags) =
      SocketMsgFlags(af.raw & other.raw)
    def |(other: SocketMsgFlags) =
      SocketMsgFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used in g_socket_receive_message() and g_socket_send_message(). The
    * flags listed in the enum are some commonly available flags, but the values
    * used for them are the same as on the platform, and any other flags are
    * passed in/out as is. So to use a platform specific flag, just include the
    * right system header and pass in the flag.
    */
  enum KnownValue(override val raw: GSocketMsgFlags, name: String)
      extends SocketMsgFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags.
      */
    case NONE extends KnownValue(GSocketMsgFlags.G_SOCKET_MSG_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Request to send/receive out of band data.
      */
    case OOB extends KnownValue(GSocketMsgFlags.G_SOCKET_MSG_OOB, "OOB")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Read data from the socket without removing it from the queue.
      */
    case PEEK extends KnownValue(GSocketMsgFlags.G_SOCKET_MSG_PEEK, "PEEK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't use a gateway to send out the packet, only send to hosts on
      * directly connected networks.
      */
    case DONTROUTE
        extends KnownValue(GSocketMsgFlags.G_SOCKET_MSG_DONTROUTE, "DONTROUTE")
  end KnownValue
end SocketMsgFlags
