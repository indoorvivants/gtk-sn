package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GUnixSocketAddressType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of name used by a #GUnixSocketAddress. %G_UNIX_SOCKET_ADDRESS_PATH
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
  */
enum UnixSocketAddressType(val raw: GUnixSocketAddressType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid
    */
  case INVALID
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * anonymous
    */
  case ANONYMOUS
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ANONYMOUS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a filesystem path
    */
  case PATH
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_PATH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an abstract name
    */
  case ABSTRACT
      extends UnixSocketAddressType(
        GUnixSocketAddressType.G_UNIX_SOCKET_ADDRESS_ABSTRACT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an abstract name, 0-padded to the full length of a unix socket name
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
