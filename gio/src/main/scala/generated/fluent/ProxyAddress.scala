package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.InetSocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GProxyAddress
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.guint16

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Support for proxied #GInetSocketAddress.
  */
class ProxyAddress(raw: Ptr[GProxyAddress])
    extends InetSocketAddress(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @proxy's destination hostname; that is, the name of the host that
    * will be connected to via the proxy, not the name of the proxy itself.
    */
  def getDestinationHostname()(using Zone): String = fromCString(
    g_proxy_address_get_destination_hostname(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @proxy's destination port; that is, the port on the destination host
    * that will be connected to via the proxy, not the port number of the proxy
    * itself.
    */
  def getDestinationPort(): UShort = g_proxy_address_get_destination_port(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the protocol that is being spoken to the destination server; eg,
    * "http" or "ftp".
    */
  def getDestinationProtocol()(using Zone): String = fromCString(
    g_proxy_address_get_destination_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @proxy's password.
    */
  def getPassword()(using Zone): String = fromCString(
    g_proxy_address_get_password(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @proxy's protocol. eg, "socks" or "http"
    */
  def getProtocol()(using Zone): String = fromCString(
    g_proxy_address_get_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the proxy URI that @proxy was constructed from.
    */
  def getUri()(using Zone): String = fromCString(
    g_proxy_address_get_uri(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @proxy's username.
    */
  def getUsername()(using Zone): String = fromCString(
    g_proxy_address_get_username(this.raw.asInstanceOf).asInstanceOf
  )

end ProxyAddress

object ProxyAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GProxyAddress for @inetaddr with @protocol that should
    * tunnel through @dest_hostname and @dest_port.
    *
    * (Note that this method doesn't set the #GProxyAddress:uri or
    * #GProxyAddress:destination-protocol fields; use g_object_new() directly if
    * you want to set those.)
    */
  def apply(
      inetaddr: InetAddress,
      port: UShort,
      protocol: String | CString,
      dest_hostname: String | CString,
      dest_port: UShort,
      username: String | CString,
      password: String | CString
  )(using Zone): ProxyAddress = new ProxyAddress(
    g_proxy_address_new(
      inetaddr.getUnsafeRawPointer().asInstanceOf,
      guint16(port),
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(dest_hostname).asInstanceOf[Ptr[gchar]],
      guint16(dest_port),
      __sn_extract_string(username).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(password).asInstanceOf[Ptr[gchar]]
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
end ProxyAddress
