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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSocketClient is a lightweight high-level utility class for connecting to a
  * network host using a connection oriented socket type.
  *
  * You create a #GSocketClient object, set any options you want, and then call
  * a sync or async connect operation, which returns a #GSocketConnection
  * subclass on success.
  *
  * The type of the #GSocketConnection object returned depends on the type of
  * the underlying socket that is in use. For instance, for a TCP/IP connection
  * it will be a #GTcpConnection.
  *
  * As #GSocketClient is a lightweight object, you don't need to cache it. You
  * can just create a new one any time you need one.
  */
class SocketClient(raw: Ptr[GSocketClient]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enable proxy protocols to be handled by the application. When the
    * indicated proxy protocol is returned by the #GProxyResolver,
    * #GSocketClient will consider this protocol as supported but will not try
    * to find a #GProxy instance to handle handshaking. The application must
    * check for this case by calling g_socket_connection_get_remote_address() on
    * the returned #GSocketConnection, and seeing if it's a #GProxyAddress of
    * the appropriate type, to determine whether or not it needs to handle the
    * proxy handshaking itself.
    *
    * This should be used for proxy protocols that are dialects of another
    * protocol such as HTTP proxy. It also allows cohabitation of proxy
    * protocols that are reused between protocols. A good example is HTTP. It
    * can be used to proxy HTTP, FTP and Gopher and can also be use as generic
    * socket proxy through the HTTP CONNECT method.
    *
    * When the proxy is detected as being an application proxy, TLS handshake
    * will be skipped. This is required to let the application do the proxy
    * specific handshake.
    */
  def addApplicationProxy(protocol: String | CString)(using Zone): Unit =
    g_socket_client_add_application_proxy(
      this.raw.asInstanceOf,
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tries to resolve the @connectable and make a network connection to it.
    *
    * Upon a successful connection, a new #GSocketConnection is constructed and
    * returned. The caller owns this new object and must drop their reference to
    * it when finished with it.
    *
    * The type of the #GSocketConnection object returned depends on the type of
    * the underlying socket that is used. For instance, for a TCP/IP connection
    * it will be a #GTcpConnection.
    *
    * The socket created will be the same family as the address that the
    * @connectable
    *   resolves to, unless family is set with g_socket_client_set_family() or
    *   indirectly via g_socket_client_set_local_address(). The socket type
    *   defaults to %G_SOCKET_TYPE_STREAM but can be set with
    *   g_socket_client_set_socket_type().
    *
    * If a local address is specified with g_socket_client_set_local_address()
    * the socket will be bound to this address before connecting.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_client_connect().
    *
    * You may wish to prefer the asynchronous version even in synchronous
    * command line programs because, since 2.60, it implements [RFC
    * 8305](https://tools.ietf.org/html/rfc8305) "Happy Eyeballs"
    * recommendations to work around long connection timeouts in networks where
    * IPv6 is broken by performing an IPv4 connection simultaneously without
    * waiting for IPv6 to time out, which is not supported by the synchronous
    * call. (This is not an API guarantee, and may change in the future.)
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_client_connect_finish() to get the result of the operation.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async connect operation. See g_socket_client_connect_async()
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a helper function for g_socket_client_connect().
    *
    * Attempts to create a TCP connection to the named host.
    *
    * @host_and_port
    *   may be in any of a number of recognized formats; an IPv6 address, an
    *   IPv4 address, or a domain name (in which case a DNS lookup is
    *   performed). Quoting with [] is supported for all address types. A port
    *   override may be specified in the usual way with a colon. Ports may be
    *   given as decimal numbers or symbolic names (in which case an
    *   /etc/services lookup is performed).
    *
    * If no port override is given in @host_and_port then @default_port will be
    * used as the port number to connect to.
    *
    * In general, @host_and_port is expected to be provided by the user
    * (allowing them to give the hostname, and a port override if necessary) and
    * @default_port
    *   is expected to be provided by the application.
    *
    * In the case that an IP address is given, a single connection attempt is
    * made. In the case that a name is given, multiple connection attempts may
    * be made, in turn and according to the number of address records in DNS,
    * until a connection succeeds.
    *
    * Upon a successful connection, a new #GSocketConnection is constructed and
    * returned. The caller owns this new object and must drop their reference to
    * it when finished with it.
    *
    * In the event of any failure (DNS error, service not found, no hosts
    * connectable) %NULL is returned and @error (if non-%NULL) is set
    * accordingly.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_client_connect_to_host().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_client_connect_to_host_finish() to get the result of the
    * operation.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async connect operation. See
    * g_socket_client_connect_to_host_async()
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to create a TCP connection to a service.
    *
    * This call looks up the SRV record for @service at @domain for the "tcp"
    * protocol. It then attempts to connect, in turn, to each of the hosts
    * providing the service until either a connection succeeds or there are no
    * hosts remaining.
    *
    * Upon a successful connection, a new #GSocketConnection is constructed and
    * returned. The caller owns this new object and must drop their reference to
    * it when finished with it.
    *
    * In the event of any failure (DNS error, service not found, no hosts
    * connectable) %NULL is returned and @error (if non-%NULL) is set
    * accordingly.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_client_connect_to_service().
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async connect operation. See
    * g_socket_client_connect_to_service_async()
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a helper function for g_socket_client_connect().
    *
    * Attempts to create a TCP connection with a network URI.
    *
    * @uri
    *   may be any valid URI containing an "authority" (hostname/port)
    *   component. If a port is not specified in the URI, @default_port will be
    *   used. TLS will be negotiated if #GSocketClient:tls is %TRUE.
    *   (#GSocketClient does not know to automatically assume TLS for certain
    *   URI schemes.)
    *
    * Using this rather than g_socket_client_connect() or
    * g_socket_client_connect_to_host() allows #GSocketClient to determine when
    * to use application-specific proxy protocols.
    *
    * Upon a successful connection, a new #GSocketConnection is constructed and
    * returned. The caller owns this new object and must drop their reference to
    * it when finished with it.
    *
    * In the event of any failure (DNS error, service not found, no hosts
    * connectable) %NULL is returned and @error (if non-%NULL) is set
    * accordingly.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the asynchronous version of g_socket_client_connect_to_uri().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_client_connect_to_uri_finish() to get the result of the
    * operation.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async connect operation. See
    * g_socket_client_connect_to_uri_async()
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the proxy enable state; see g_socket_client_set_enable_proxy()
    */
  def getEnableProxy(): Boolean =
    g_socket_client_get_enable_proxy(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the socket family of the socket client.
    *
    * See g_socket_client_set_family() for details.
    */
  def getFamily(): GSocketFamily = g_socket_client_get_family(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the local address of the socket client.
    *
    * See g_socket_client_set_local_address() for details.
    */
  def getLocalAddress(): SocketAddress = new SocketAddress(
    g_socket_client_get_local_address(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the protocol name type of the socket client.
    *
    * See g_socket_client_set_protocol() for details.
    */
  def getProtocol(): GSocketProtocol = g_socket_client_get_protocol(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GProxyResolver being used by @client. Normally, this will be the
    * resolver returned by g_proxy_resolver_get_default(), but you can override
    * it with g_socket_client_set_proxy_resolver().
    */
  def getProxyResolver(): ProxyResolver = new ProxyResolver.Abstract(
    g_socket_client_get_proxy_resolver(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the socket type of the socket client.
    *
    * See g_socket_client_set_socket_type() for details.
    */
  def getSocketType(): GSocketType = g_socket_client_get_socket_type(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the I/O timeout time for sockets created by @client.
    *
    * See g_socket_client_set_timeout() for details.
    */
  def getTimeout(): UInt = g_socket_client_get_timeout(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @client creates TLS connections. See
    * g_socket_client_set_tls() for details.
    */
  def getTls(): Boolean =
    g_socket_client_get_tls(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the TLS validation flags used creating TLS connections via
    * @client.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GSocketClient:tls-validation-flags for more
    * information.
    */
  def getTlsValidationFlags(): GTlsCertificateFlags =
    g_socket_client_get_tls_validation_flags(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not @client attempts to make connections via a proxy
    * server. When enabled (the default), #GSocketClient will use a
    * #GProxyResolver to determine if a proxy protocol such as SOCKS is needed,
    * and automatically do the necessary proxy negotiation.
    *
    * See also g_socket_client_set_proxy_resolver().
    */
  def setEnableProxy(enable: Boolean): Unit = g_socket_client_set_enable_proxy(
    this.raw.asInstanceOf,
    gboolean(gint((if enable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the socket family of the socket client. If this is set to something
    * other than %G_SOCKET_FAMILY_INVALID then the sockets created by this
    * object will be of the specified family.
    *
    * This might be useful for instance if you want to force the local
    * connection to be an ipv4 socket, even though the address might be an ipv6
    * mapped to ipv4 address.
    */
  def setFamily(family: GSocketFamily): Unit =
    g_socket_client_set_family(this.raw.asInstanceOf, family)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the local address of the socket client. The sockets created by this
    * object will bound to the specified address (if not %NULL) before
    * connecting.
    *
    * This is useful if you want to ensure that the local side of the connection
    * is on a specific port, or on a specific interface.
    */
  def setLocalAddress(address: SocketAddress): Unit =
    g_socket_client_set_local_address(
      this.raw.asInstanceOf,
      address.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the protocol of the socket client. The sockets created by this object
    * will use of the specified protocol.
    *
    * If @protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
    * protocol for the socket family and type.
    */
  def setProtocol(protocol: GSocketProtocol): Unit =
    g_socket_client_set_protocol(this.raw.asInstanceOf, protocol)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Overrides the #GProxyResolver used by @client. You can call this if you
    * want to use specific proxies, rather than using the system default proxy
    * settings.
    *
    * Note that whether or not the proxy resolver is actually used depends on
    * the setting of #GSocketClient:enable-proxy, which is not changed by this
    * function (but which is %TRUE by default)
    */
  def setProxyResolver(proxy_resolver: ProxyResolver): Unit =
    g_socket_client_set_proxy_resolver(
      this.raw.asInstanceOf,
      proxy_resolver.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the socket type of the socket client. The sockets created by this
    * object will be of the specified type.
    *
    * It doesn't make sense to specify a type of %G_SOCKET_TYPE_DATAGRAM, as
    * GSocketClient is used for connection oriented services.
    */
  def setSocketType(`type`: GSocketType): Unit =
    g_socket_client_set_socket_type(this.raw.asInstanceOf, `type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the I/O timeout for sockets created by @client. @timeout is a time in
    * seconds, or 0 for no timeout (the default).
    *
    * The timeout value affects the initial connection attempt as well, so
    * setting this may cause calls to g_socket_client_connect(), etc, to fail
    * with %G_IO_ERROR_TIMED_OUT.
    */
  def setTimeout(timeout: UInt): Unit =
    g_socket_client_set_timeout(this.raw.asInstanceOf, guint(timeout))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @client creates TLS (aka SSL) connections. If @tls is %TRUE, @client
    * will wrap its connections in a #GTlsClientConnection and perform a TLS
    * handshake when connecting.
    *
    * Note that since #GSocketClient must return a #GSocketConnection, but
    * #GTlsClientConnection is not a #GSocketConnection, this actually wraps the
    * resulting #GTlsClientConnection in a #GTcpWrapperConnection when returning
    * it. You can use g_tcp_wrapper_connection_get_base_io_stream() on the
    * return value to extract the #GTlsClientConnection.
    *
    * If you need to modify the behavior of the TLS handshake (eg, by setting a
    * client-side certificate to use, or connecting to the
    * #GTlsConnection::accept-certificate signal), you can connect to
    * @client's
    *   #GSocketClient::event signal and wait for it to be emitted with
    *   %G_SOCKET_CLIENT_TLS_HANDSHAKING, which will give you a chance to see
    *   the #GTlsClientConnection before the handshake starts.
    */
  def setTls(tls: Boolean): Unit = g_socket_client_set_tls(
    this.raw.asInstanceOf,
    gboolean(gint((if tls == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the TLS validation flags used when creating TLS connections via @client.
    * The default value is %G_TLS_CERTIFICATE_VALIDATE_ALL.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GSocketClient:tls-validation-flags for more
    * information.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketClient with the default options.
    */
  def apply(): SocketClient = new SocketClient(
    g_socket_client_new().asInstanceOf
  )
end SocketClient
