package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GUnixSocketAddressType

/** The type of name used by a #GUnixSocketAddress. %G_UNIX_SOCKET_ADDRESS_PATH
  * indicates a traditional unix domain socket bound to a filesystem path.
  * %G_UNIX_SOCKET_ADDRESS_ANONYMOUS indicates a socket not bound to any name
  * (eg, a client-side socket, or a socket created with socketpair()).
  *
  * For abstract sockets, there are two incompatible ways of naming them; the
  * man pages suggest using the entire `struct sockaddr_un` as the name, padding
  * the unused parts of the %sun_path field with zeroes; this corresponds to
  * %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED. However, many programs instead just
  * use a portion of %sun_path, and pass an appropriate smaller length to bind()
  * or connect(). This is %G_UNIX_SOCKET_ADDRESS_ABSTRACT.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum UnixSocketAddressType(val raw: GUnixSocketAddressType):
  /** invalid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_INVALID
      )

  /** anonymous
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ANONYMOUS
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ANONYMOUS
      )

  /** a filesystem path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PATH
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_PATH
      )

  /** an abstract name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABSTRACT
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT
      )

  /** an abstract name, 0-padded to the full length of a unix socket name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABSTRACT_PADDED
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED
      )
end UnixSocketAddressType

object UnixSocketAddressType:
  def fromRaw(raw: GUnixSocketAddressType): UnixSocketAddressType =
    raw match
      case GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_INVALID =>
        UnixSocketAddressType.INVALID
      case GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ANONYMOUS =>
        UnixSocketAddressType.ANONYMOUS
      case GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_PATH =>
        UnixSocketAddressType.PATH
      case GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT =>
        UnixSocketAddressType.ABSTRACT
      case GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED =>
        UnixSocketAddressType.ABSTRACT_PADDED
  end fromRaw
end UnixSocketAddressType
