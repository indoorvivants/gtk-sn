package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.ProxyResolver
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSocketClient
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.gio.internal.GSocketProtocol
import sn.gnome.gio.internal.GSocketType
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object

class SocketClient(raw: Ptr[GSocketClient]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addApplicationProxy(protocol: String | CString)(using Zone): Unit =
    g_socket_client_add_application_proxy(
      this.raw.asInstanceOf,
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]]
    )

  def connect(
      connectable: SocketConnectable,
      cancellable: Cancellable
  ): GResult[SocketConnection] = GResult.wrap(__errorPtr =>
    new SocketConnection(
      g_socket_client_connect(
        this.raw.asInstanceOf,
        connectable.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def connectAsync(
      connectable: SocketConnectable,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_socket_client_connect_async(
    this.raw.asInstanceOf,
    connectable.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def connectFinish(result: AsyncResult): GResult[SocketConnection] =
    GResult.wrap(__errorPtr =>
      new SocketConnection(
        g_socket_client_connect_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def connectToHost(
      host_and_port: String | CString,
      default_port: UShort,
      cancellable: Cancellable
  )(using Zone): GResult[SocketConnection] = GResult.wrap(__errorPtr =>
    new SocketConnection(
      g_socket_client_connect_to_host(
        this.raw.asInstanceOf,
        __sn_extract_string(host_and_port).asInstanceOf[Ptr[gchar]],
        guint16(default_port),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def connectToHostAsync(
      host_and_port: String | CString,
      default_port: UShort,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_socket_client_connect_to_host_async(
    this.raw.asInstanceOf,
    __sn_extract_string(host_and_port).asInstanceOf[Ptr[gchar]],
    guint16(default_port),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def connectToHostFinish(result: AsyncResult): GResult[SocketConnection] =
    GResult.wrap(__errorPtr =>
      new SocketConnection(
        g_socket_client_connect_to_host_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def connectToService(
      domain: String | CString,
      service: String | CString,
      cancellable: Cancellable
  )(using Zone): GResult[SocketConnection] = GResult.wrap(__errorPtr =>
    new SocketConnection(
      g_socket_client_connect_to_service(
        this.raw.asInstanceOf,
        __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def connectToServiceAsync(
      domain: String | CString,
      service: String | CString,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_socket_client_connect_to_service_async(
    this.raw.asInstanceOf,
    __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def connectToServiceFinish(result: AsyncResult): GResult[SocketConnection] =
    GResult.wrap(__errorPtr =>
      new SocketConnection(
        g_socket_client_connect_to_service_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def connectToUri(
      uri: String | CString,
      default_port: UShort,
      cancellable: Cancellable
  )(using Zone): GResult[SocketConnection] = GResult.wrap(__errorPtr =>
    new SocketConnection(
      g_socket_client_connect_to_uri(
        this.raw.asInstanceOf,
        __sn_extract_string(uri).asInstanceOf[Ptr[gchar]],
        guint16(default_port),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def connectToUriAsync(
      uri: String | CString,
      default_port: UShort,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_socket_client_connect_to_uri_async(
    this.raw.asInstanceOf,
    __sn_extract_string(uri).asInstanceOf[Ptr[gchar]],
    guint16(default_port),
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def connectToUriFinish(result: AsyncResult): GResult[SocketConnection] =
    GResult.wrap(__errorPtr =>
      new SocketConnection(
        g_socket_client_connect_to_uri_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def getEnableProxy(): Boolean =
    g_socket_client_get_enable_proxy(this.raw.asInstanceOf).value.!=(0)

  def getFamily(): GSocketFamily = g_socket_client_get_family(
    this.raw.asInstanceOf
  )

  def getLocalAddress(): SocketAddress = new SocketAddress(
    g_socket_client_get_local_address(this.raw.asInstanceOf).asInstanceOf
  )

  def getProtocol(): GSocketProtocol = g_socket_client_get_protocol(
    this.raw.asInstanceOf
  )

  def getProxyResolver(): ProxyResolver = new ProxyResolver.Abstract(
    g_socket_client_get_proxy_resolver(this.raw.asInstanceOf).asInstanceOf
  )

  def getSocketType(): GSocketType = g_socket_client_get_socket_type(
    this.raw.asInstanceOf
  )

  def getTimeout(): UInt = g_socket_client_get_timeout(
    this.raw.asInstanceOf
  ).value

  def getTls(): Boolean =
    g_socket_client_get_tls(this.raw.asInstanceOf).value.!=(0)

  def getTlsValidationFlags(): GTlsCertificateFlags =
    g_socket_client_get_tls_validation_flags(this.raw.asInstanceOf)

  def setEnableProxy(enable: Boolean): Unit = g_socket_client_set_enable_proxy(
    this.raw.asInstanceOf,
    gboolean(gint((if enable == true then 1 else 0)))
  )

  def setFamily(family: GSocketFamily): Unit =
    g_socket_client_set_family(this.raw.asInstanceOf, family)

  def setLocalAddress(address: SocketAddress): Unit =
    g_socket_client_set_local_address(
      this.raw.asInstanceOf,
      address.getUnsafeRawPointer().asInstanceOf
    )

  def setProtocol(protocol: GSocketProtocol): Unit =
    g_socket_client_set_protocol(this.raw.asInstanceOf, protocol)

  def setProxyResolver(proxy_resolver: ProxyResolver): Unit =
    g_socket_client_set_proxy_resolver(
      this.raw.asInstanceOf,
      proxy_resolver.getUnsafeRawPointer().asInstanceOf
    )

  def setSocketType(`type`: GSocketType): Unit =
    g_socket_client_set_socket_type(this.raw.asInstanceOf, `type`)

  def setTimeout(timeout: UInt): Unit =
    g_socket_client_set_timeout(this.raw.asInstanceOf, guint(timeout))

  def setTls(tls: Boolean): Unit = g_socket_client_set_tls(
    this.raw.asInstanceOf,
    gboolean(gint((if tls == true then 1 else 0)))
  )

  def setTlsValidationFlags(flags: GTlsCertificateFlags): Unit =
    g_socket_client_set_tls_validation_flags(this.raw.asInstanceOf, flags)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SocketClient

object SocketClient:
  def apply(): SocketClient = new SocketClient(
    g_socket_client_new().asInstanceOf
  )
end SocketClient
