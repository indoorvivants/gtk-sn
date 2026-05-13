package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait ProxyResolver:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if @resolver can be used on this system. (This is used internally;
    * g_proxy_resolver_get_default() will only return a proxy resolver that
    * returns %TRUE for this method.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSupported(): Boolean /* None */ =
    g_proxy_resolver_is_supported(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxyResolver]]
    ).value.!=(0)
  end isSupported

  /** Looks into the system proxy configuration to determine what proxy, if any,
    * to use to connect to @uri. The returned proxy URIs are of the form
    * `<protocol>://[user[:password]@]host[:port]` or `direct://`, where
    * <protocol> could be http, rtsp, socks or other proxying protocol.
    *
    * If you don't know what network protocol is being used on the socket, you
    * should use `none` as the URI protocol. In this case, the resolver might
    * still return a generic proxy type (such as SOCKS), but would not return
    * protocol-specific proxy types (such as http).
    *
    * `direct://` is used when no proxy is needed. Direct connection should not
    * be attempted unless it is part of the returned array of proxies.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def lookup__ = ???

  /** Asynchronous lookup of proxy. See g_proxy_resolver_lookup() for more
    * details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupAsync__ = ???

  /** Call this function to obtain the array of proxy URIs when
    * g_proxy_resolver_lookup_async() is complete. See g_proxy_resolver_lookup()
    * for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_finish/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def lookupFinish__ = ???

end ProxyResolver

object ProxyResolver:
  class Abstract(raw: Ptr[Byte]) extends ProxyResolver:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ProxyResolver
