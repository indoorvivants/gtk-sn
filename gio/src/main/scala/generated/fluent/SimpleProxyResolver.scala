package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ProxyResolver
import sn.gnome.gio.internal.GSimpleProxyResolver
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class SimpleProxyResolver(raw: Ptr[GSimpleProxyResolver])
    extends Object(raw.asInstanceOf),
      ProxyResolver:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setDefaultProxy(default_proxy: String | CString)(using Zone): Unit =
    g_simple_proxy_resolver_set_default_proxy(
      this.raw.asInstanceOf,
      __sn_extract_string(default_proxy).asInstanceOf[Ptr[gchar]]
    )

  // Method set_ignore_hosts contains an array parameter, which is not supported yet

  def setUriProxy(uri_scheme: String | CString, proxy: String | CString)(using
      Zone
  ): Unit = g_simple_proxy_resolver_set_uri_proxy(
    this.raw.asInstanceOf,
    __sn_extract_string(uri_scheme).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(proxy).asInstanceOf[Ptr[gchar]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SimpleProxyResolver
