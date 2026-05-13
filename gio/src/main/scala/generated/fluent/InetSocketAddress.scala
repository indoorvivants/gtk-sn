package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{InetAddress, SocketAddress, SocketConnectable}
import sn.gnome.gio.internal.GInetSocketAddress
import sn.gnome.glib.internal.{guint, guint16, guint32}
import sn.gnome.gobject.runtime.*

/** An IPv4 or IPv6 socket address; that is, the combination of a #GInetAddress
  * and a port number.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InetSocketAddress private[gnome] (raw: Ptr[GInetSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets @address's #GInetAddress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAddress()(using Runtime): sn.gnome.gio.fluent.InetAddress /* None */ =
    sn.gnome.gio.fluent.InetAddress.applyUnsafe(
      g_inet_socket_address_get_address(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetSocketAddress]]
      ).asInstanceOf
    )
  end getAddress

  /** Gets the `sin6_flowinfo` field from @address, which must be an IPv6
    * address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlowinfo(): UInt /* None */ =
    g_inet_socket_address_get_flowinfo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetSocketAddress]]
    ).value
  end getFlowinfo

  /** Gets @address's port.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPort(): UShort /* None */ =
    g_inet_socket_address_get_port(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetSocketAddress]]
    ).value
  end getPort

  /** Gets the `sin6_scope_id` field from @address, which must be an IPv6
    * address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScopeId(): UInt /* None */ =
    g_inet_socket_address_get_scope_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetSocketAddress]]
    ).value
  end getScopeId

end InetSocketAddress

object InetSocketAddress:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GInetSocketAddress])(using Runtime) =
    summon[Runtime].getOrCreate[InetSocketAddress](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new InetSocketAddress(ptr)
    )

  /** Creates a new #GInetSocketAddress for @address and @port.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      address: sn.gnome.gio.fluent.InetAddress /* Some(Ptr[GInetAddress]) */,
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  )(using Runtime): InetSocketAddress =
    val raw: Ptr[Byte] = g_inet_socket_address_new(
      address.getUnsafeRawPointer().asInstanceOf,
      guint16(port)
    ).asInstanceOf
    summon[Runtime].getOrCreate[InetSocketAddress](
      raw,
      r => InetSocketAddress.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new #GInetSocketAddress for @address and @port.
    *
    * If @address is an IPv6 address, it can also contain a scope ID (separated
    * from the address by a `%`).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromString(
      address: String /* Some(CString) */,
      port: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone, Runtime): InetSocketAddress =
    val raw: Ptr[Byte] = g_inet_socket_address_new_from_string(
      toCString(address),
      guint(port)
    ).asInstanceOf
    summon[Runtime].getOrCreate[InetSocketAddress](
      raw,
      r => InetSocketAddress.applyUnsafe(r.asInstanceOf)
    )
  end fromString
end InetSocketAddress
