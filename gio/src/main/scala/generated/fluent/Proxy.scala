package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, Cancellable, IOStream, ProxyAddress}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

trait Proxy:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Given @connection to communicate with a proxy (eg, a #GSocketConnection
    * that is connected to the proxy server), this does the necessary handshake
    * to connect to @proxy_address, and if required, wraps the #GIOStream to
    * handle proxy payload.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connect(
      connection: sn.gnome.gio.IOStream /* Some(Ptr[GIOStream]) */,
      proxy_address: sn.gnome.gio.ProxyAddress /* Some(Ptr[GProxyAddress]) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.IOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.IOStream.applyUnsafe(
        g_proxy_connect(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxy]],
          connection.getUnsafeRawPointer().asInstanceOf,
          proxy_address.getUnsafeRawPointer().asInstanceOf,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end connect

  /** Asynchronous version of g_proxy_connect().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectAsync__ = ???

  /** See g_proxy_connect().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.IOStream /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.IOStream.applyUnsafe(
        g_proxy_connect_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxy]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectFinish

  /** Some proxy protocols expect to be passed a hostname, which they will
    * resolve to an IP address themselves. Others, like SOCKS4, do not allow
    * this. This function will return %FALSE if @proxy is implementing such a
    * protocol. When %FALSE is returned, the caller should resolve the
    * destination hostname first, and then pass a #GProxyAddress containing the
    * stringified IP address to g_proxy_connect() or g_proxy_connect_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsHostname(): Boolean /* None */ =
    g_proxy_supports_hostname(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GProxy]]
    ).value.!=(0)
  end supportsHostname

end Proxy

object Proxy:
  class Abstract(raw: Ptr[Byte]) extends Proxy:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Proxy
