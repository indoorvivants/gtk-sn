package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNetworkService
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class NetworkService(raw: Ptr[GNetworkService])
    extends Object(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDomain()(using Zone): String = fromCString(
    g_network_service_get_domain(this.raw.asInstanceOf).asInstanceOf
  )

  def getProtocol()(using Zone): String = fromCString(
    g_network_service_get_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  def getScheme()(using Zone): String = fromCString(
    g_network_service_get_scheme(this.raw.asInstanceOf).asInstanceOf
  )

  def getService()(using Zone): String = fromCString(
    g_network_service_get_service(this.raw.asInstanceOf).asInstanceOf
  )

  def setScheme(scheme: String | CString)(using Zone): Unit =
    g_network_service_set_scheme(
      this.raw.asInstanceOf,
      __sn_extract_string(scheme).asInstanceOf[Ptr[gchar]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NetworkService

object NetworkService:
  def apply(
      service: String | CString,
      protocol: String | CString,
      domain: String | CString
  )(using Zone): NetworkService = new NetworkService(
    g_network_service_new(
      __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(domain).asInstanceOf[Ptr[gchar]]
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
end NetworkService
