package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNetworkAddress
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object

class NetworkAddress(raw: Ptr[GNetworkAddress])
    extends Object(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getHostname()(using Zone): String = fromCString(
    g_network_address_get_hostname(this.raw.asInstanceOf).asInstanceOf
  )

  def getPort(): UShort = g_network_address_get_port(
    this.raw.asInstanceOf
  ).value

  def getScheme()(using Zone): String = fromCString(
    g_network_address_get_scheme(this.raw.asInstanceOf).asInstanceOf
  )

end NetworkAddress

object NetworkAddress:
  def apply(hostname: String | CString, port: UShort)(using
      Zone
  ): NetworkAddress = new NetworkAddress(
    g_network_address_new(
      __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
      guint16(port)
    ).asInstanceOf
  )
  def loopback(port: UShort): NetworkAddress = new NetworkAddress(
    g_network_address_new_loopback(guint16(port)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NetworkAddress
