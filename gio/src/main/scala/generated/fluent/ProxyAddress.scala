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

class ProxyAddress(raw: Ptr[GProxyAddress])
    extends InetSocketAddress(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDestinationHostname()(using Zone): String = fromCString(
    g_proxy_address_get_destination_hostname(this.raw.asInstanceOf).asInstanceOf
  )

  def getDestinationPort(): UShort = g_proxy_address_get_destination_port(
    this.raw.asInstanceOf
  ).value

  def getDestinationProtocol()(using Zone): String = fromCString(
    g_proxy_address_get_destination_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  def getPassword()(using Zone): String = fromCString(
    g_proxy_address_get_password(this.raw.asInstanceOf).asInstanceOf
  )

  def getProtocol()(using Zone): String = fromCString(
    g_proxy_address_get_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  def getUri()(using Zone): String = fromCString(
    g_proxy_address_get_uri(this.raw.asInstanceOf).asInstanceOf
  )

  def getUsername()(using Zone): String = fromCString(
    g_proxy_address_get_username(this.raw.asInstanceOf).asInstanceOf
  )

end ProxyAddress

object ProxyAddress:
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
