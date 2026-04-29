package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GInetSocketAddress
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32

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
  def getAddress(): InetAddress = new InetAddress(
    g_inet_socket_address_get_address(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `sin6_flowinfo` field from @address, which must be an IPv6
    * address.
    */
  def getFlowinfo(): UInt = g_inet_socket_address_get_flowinfo(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's port.
    */
  def getPort(): UShort = g_inet_socket_address_get_port(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `sin6_scope_id` field from @address, which must be an IPv6
    * address.
    */
  def getScopeId(): UInt = g_inet_socket_address_get_scope_id(
    this.raw.asInstanceOf
  ).value

end InetSocketAddress

object InetSocketAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GInetSocketAddress for @address and @port.
    */
  def apply(address: InetAddress, port: UShort): InetSocketAddress =
    new InetSocketAddress(
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
  def fromString(address: String | CString, port: UInt)(using
      Zone
  ): InetSocketAddress = new InetSocketAddress(
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
