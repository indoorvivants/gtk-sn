package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{InetAddress, InetSocketAddress, SocketConnectable}
import sn.gnome.gio.internal.GProxyAddress
import sn.gnome.glib.internal.{gchar, guint16}
import sn.gnome.gobject.runtime.*

/** Support for proxied #GInetSocketAddress.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ProxyAddress private[gnome] (raw: Ptr[GProxyAddress])
    extends InetSocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets @proxy's destination hostname; that is, the name of the host that
    * will be connected to via the proxy, not the name of the proxy itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDestinationHostname()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_destination_hostname(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getDestinationHostname

  /** Gets @proxy's destination port; that is, the port on the destination host
    * that will be connected to via the proxy, not the port number of the proxy
    * itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDestinationPort(): UShort /* None */ =
    g_proxy_address_get_destination_port(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
    ).value
  end getDestinationPort

  /** Gets the protocol that is being spoken to the destination server; eg,
    * "http" or "ftp".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDestinationProtocol()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_destination_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getDestinationProtocol

  /** Gets @proxy's password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPassword()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_password(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getPassword

  /** Gets @proxy's protocol. eg, "socks" or "http"
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProtocol()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getProtocol

  /** Gets the proxy URI that @proxy was constructed from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUri()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_uri(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getUri

  /** Gets @proxy's username.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUsername()(using Zone): String /* None */ =
    fromCString(
      g_proxy_address_get_username(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyAddress]]
      ).asInstanceOf
    )
  end getUsername

end ProxyAddress

object ProxyAddress:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GProxyAddress])(using Runtime) =
    summon[Runtime].getOrCreate[ProxyAddress](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ProxyAddress(ptr)
    )

  /** Creates a new #GProxyAddress for @inetaddr with @protocol that should
    * tunnel through @dest_hostname and @dest_port.
    *
    * (Note that this method doesn't set the #GProxyAddress:uri or
    * #GProxyAddress:destination-protocol fields; use g_object_new() directly if
    * you want to set those.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      inetaddr: sn.gnome.gio.InetAddress /* Some(Ptr[GInetAddress]) */,
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      protocol: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      dest_hostname: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      dest_port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      username: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      password: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone, Runtime): ProxyAddress =
    val raw: Ptr[Byte] = g_proxy_address_new(
      inetaddr.getUnsafeRawPointer().asInstanceOf,
      guint16(port),
      toCString(protocol).asInstanceOf[Ptr[gchar]],
      toCString(dest_hostname).asInstanceOf[Ptr[gchar]],
      guint16(dest_port),
      username
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      password
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ProxyAddress](
      raw,
      r => ProxyAddress.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ProxyAddress
