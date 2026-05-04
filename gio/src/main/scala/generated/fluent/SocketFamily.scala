package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketFamily

/** The protocol family of a #GSocketAddress. (These values are identical to the
  * system defines %AF_INET, %AF_INET6 and %AF_UNIX, if available.)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SocketFamily(val raw: GSocketFamily):
  /** no address family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_INVALID)

  /** the UNIX domain family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNIX extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_UNIX)

  /** the IPv4 family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IPV4 extends SocketFamily(GSocketFamily.G_SOCKET_FAMILY_IPV4)

  /** the IPv6 family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
