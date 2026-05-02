package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ProxyResolver
import sn.gnome.gio.internal.GSimpleProxyResolver
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSimpleProxyResolver is a simple #GProxyResolver implementation that
  * handles a single default proxy, multiple URI-scheme-specific proxies, and a
  * list of hosts that proxies should not be used for.
  *
  * #GSimpleProxyResolver is never the default proxy resolver, but it can be
  * used as the base class for another proxy resolver implementation, or it can
  * be created and used manually, such as with
  * g_socket_client_set_proxy_resolver().
  */
class SimpleProxyResolver(raw: Ptr[GSimpleProxyResolver])
    extends Object(raw.asInstanceOf),
      ProxyResolver:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default proxy on @resolver, to be used for any URIs that don't
    * match #GSimpleProxyResolver:ignore-hosts or a proxy set via
    * g_simple_proxy_resolver_set_uri_proxy().
    *
    * If @default_proxy starts with "socks://", #GSimpleProxyResolver will treat
    * it as referring to all three of the socks5, socks4a, and socks4 proxy
    * types.
    */
  def setDefaultProxy(
      default_proxy: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_simple_proxy_resolver_set_default_proxy(
    this.raw.asInstanceOf[Ptr[GSimpleProxyResolver]],
    default_proxy
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the list of ignored hosts.
    *
    * See #GSimpleProxyResolver:ignore-hosts for more details on how the
    * @ignore_hosts
    *   argument is interpreted.
    */
  def setIgnoreHosts(
      ignore_hosts: Ptr[
        CString
      ] /* Some(Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]) */
  )(using Zone): Unit /* None */ = g_simple_proxy_resolver_set_ignore_hosts(
    this.raw.asInstanceOf[Ptr[GSimpleProxyResolver]],
    ignore_hosts.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a URI-scheme-specific proxy to @resolver; URIs whose scheme matches @uri_scheme
    * (and which don't match #GSimpleProxyResolver:ignore-hosts) will be proxied
    * via @proxy.
    *
    * As with #GSimpleProxyResolver:default-proxy, if @proxy starts with
    * "socks://", #GSimpleProxyResolver will treat it as referring to all three
    * of the socks5, socks4a, and socks4 proxy types.
    */
  def setUriProxy(
      uri_scheme: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      proxy: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_simple_proxy_resolver_set_uri_proxy(
    this.raw.asInstanceOf[Ptr[GSimpleProxyResolver]],
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
