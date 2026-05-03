package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketFamily

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The protocol family of a #GSocketAddress. (These values are identical to the
  * system defines %AF_INET, %AF_INET6 and %AF_UNIX, if available.)
  */
enum SocketFamily(val raw: GSocketFamily):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no address family
    */
  case INVALID extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the UNIX domain family
    */
  case UNIX extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_UNIX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the IPv4 family
    */
  case IPV4 extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_IPV4)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the IPv6 family
    */
  case IPV6 extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_IPV6)
end SocketFamily

object SocketFamily:
  def fromRaw(raw: GSocketFamily): SocketFamily =
    raw match
      case GSocketFamily.G_SOCKET_FAMILY_INVALID => SocketFamily.INVALID
      case GSocketFamily.G_SOCKET_FAMILY_UNIX    => SocketFamily.UNIX
      case GSocketFamily.G_SOCKET_FAMILY_IPV4    => SocketFamily.IPV4
      case GSocketFamily.G_SOCKET_FAMILY_IPV6    => SocketFamily.IPV6
  end fromRaw
end SocketFamily
