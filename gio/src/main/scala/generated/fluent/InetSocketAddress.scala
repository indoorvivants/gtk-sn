package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{InetAddress, SocketAddress, SocketConnectable}
import sn.gnome.gio.internal.GInetSocketAddress
import sn.gnome.glib.internal.{guint, guint16, guint32}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An IPv4 or IPv6 socket address; that is, the combination of a #GInetAddress
  * and a port number.
  */
class InetSocketAddress(raw: Ptr[GInetSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's #GInetAddress.
    */
  def getAddress(): InetAddress /* None */ = new InetAddress(
    g_inet_socket_address_get_address(
      this.raw.asInstanceOf[Ptr[GInetSocketAddress]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `sin6_flowinfo` field from @address, which must be an IPv6
    * address.
    */
  def getFlowinfo(): UInt /* None */ = g_inet_socket_address_get_flowinfo(
    this.raw.asInstanceOf[Ptr[GInetSocketAddress]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's port.
    */
  def getPort(): UShort /* None */ = g_inet_socket_address_get_port(
    this.raw.asInstanceOf[Ptr[GInetSocketAddress]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `sin6_scope_id` field from @address, which must be an IPv6
    * address.
    */
  def getScopeId(): UInt /* None */ = g_inet_socket_address_get_scope_id(
    this.raw.asInstanceOf[Ptr[GInetSocketAddress]]
  ).value

end InetSocketAddress

object InetSocketAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GInetSocketAddress for @address and @port.
    */
  def apply(
      address: InetAddress /* Some(Ptr[GInetAddress]) */,
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): InetSocketAddress = new InetSocketAddress(
    g_inet_socket_address_new(
      address.getUnsafeRawPointer().asInstanceOf,
      guint16(port)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GInetSocketAddress for @address and @port.
    *
    * If @address is an IPv6 address, it can also contain a scope ID (separated
    * from the address by a `%`).
    */
  def fromString(
      address: String | CString /* Some(CString) */,
      port: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): InetSocketAddress = new InetSocketAddress(
    g_inet_socket_address_new_from_string(
      __sn_extract_string(address),
      guint(port)
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end InetSocketAddress
