package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{
  AsyncResult,
  Cancellable,
  ProxyResolver,
  SocketAddress,
  SocketConnection,
  SocketFamily,
  SocketProtocol,
  SocketType,
  TlsCertificateFlags
}
import sn.gnome.gio.internal.GSocketClient
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint, guint16}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GSocketClient is a lightweight high-level utility class for connecting to a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketClient private[gnome] (raw: Ptr[GSocketClient])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Enable proxy protocols to be handled by the application. When the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addApplicationProxy(
      protocol: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): Unit /* None */ =
    g_socket_client_add_application_proxy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      summon[Runtime].inZone(toCString(protocol)).asInstanceOf[Ptr[gchar]]
    )
  end addApplicationProxy

  /** Tries to resolve the @connectable and make a network connection to it.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject"
  )
  private def connect__ = ???

  /** This is the asynchronous version of g_socket_client_connect().
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectAsync__ = ???

  /** Finishes an async connect operation. See g_socket_client_connect_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectFinish

  /** This is a helper function for g_socket_client_connect().
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToHost(
      host_and_port: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      default_port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_host(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          summon[Runtime]
            .inZone(toCString(host_and_port))
            .asInstanceOf[Ptr[gchar]],
          guint16(default_port),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToHost

  /** This is the asynchronous version of g_socket_client_connect_to_host().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_client_connect_to_host_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_to_host_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectToHostAsync__ = ???

  /** Finishes an async connect operation. See
    * g_socket_client_connect_to_host_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToHostFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_host_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToHostFinish

  /** Attempts to create a TCP connection to a service.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToService(
      domain: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      service: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_service(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          summon[Runtime].inZone(toCString(domain)).asInstanceOf[Ptr[gchar]],
          summon[Runtime].inZone(toCString(service)).asInstanceOf[Ptr[gchar]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToService

  /** This is the asynchronous version of g_socket_client_connect_to_service().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_to_service_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectToServiceAsync__ = ???

  /** Finishes an async connect operation. See
    * g_socket_client_connect_to_service_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToServiceFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_service_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToServiceFinish

  /** This is a helper function for g_socket_client_connect().
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToUri(
      uri: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      default_port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_uri(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          summon[Runtime].inZone(toCString(uri)).asInstanceOf[Ptr[gchar]],
          guint16(default_port),
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToUri

  /** This is the asynchronous version of g_socket_client_connect_to_uri().
    *
    * When the operation is finished @callback will be called. You can then call
    * g_socket_client_connect_to_uri_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect_to_uri_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def connectToUriAsync__ = ???

  /** Finishes an async connect operation. See
    * g_socket_client_connect_to_uri_async()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectToUriFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.SocketConnection /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.SocketConnection.applyUnsafe(
        g_socket_client_connect_to_uri_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end connectToUriFinish

  /** Gets the proxy enable state; see g_socket_client_set_enable_proxy()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableProxy(): Boolean /* None */ =
    g_socket_client_get_enable_proxy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
    ).value.!=(0)
  end getEnableProxy

  /** Gets the socket family of the socket client.
    *
    * See g_socket_client_set_family() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): sn.gnome.gio.SocketFamily /* None */ =
    sn.gnome.gio.SocketFamily.fromRaw(
      g_socket_client_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      )
    )
  end getFamily

  /** Gets the local address of the socket client.
    *
    * See g_socket_client_set_local_address() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLocalAddress()(using Runtime): sn.gnome.gio.SocketAddress /* None */ =
    sn.gnome.gio.SocketAddress.applyUnsafe(
      g_socket_client_get_local_address(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      ).asInstanceOf
    )
  end getLocalAddress

  /** Gets the protocol name type of the socket client.
    *
    * See g_socket_client_set_protocol() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProtocol(): sn.gnome.gio.SocketProtocol /* None */ =
    sn.gnome.gio.SocketProtocol.fromRaw(
      g_socket_client_get_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      )
    )
  end getProtocol

  /** Gets the #GProxyResolver being used by @client. Normally, this will be the
    * resolver returned by g_proxy_resolver_get_default(), but you can override
    * it with g_socket_client_set_proxy_resolver().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProxyResolver(): sn.gnome.gio.ProxyResolver /* None */ =
    new ProxyResolver.Abstract(
      g_socket_client_get_proxy_resolver(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      ).asInstanceOf
    )
  end getProxyResolver

  /** Gets the socket type of the socket client.
    *
    * See g_socket_client_set_socket_type() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSocketType(): sn.gnome.gio.SocketType /* None */ =
    sn.gnome.gio.SocketType.fromRaw(
      g_socket_client_get_socket_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      )
    )
  end getSocketType

  /** Gets the I/O timeout time for sockets created by @client.
    *
    * See g_socket_client_set_timeout() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimeout(): UInt /* None */ =
    g_socket_client_get_timeout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
    ).value
  end getTimeout

  /** Gets whether @client creates TLS connections. See
    * g_socket_client_set_tls() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTls(): Boolean /* None */ =
    g_socket_client_get_tls(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
    ).value.!=(0)
  end getTls

  /** Gets the TLS validation flags used creating TLS connections via
    * @client.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GSocketClient:tls-validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTlsValidationFlags(): sn.gnome.gio.TlsCertificateFlags /* None */ =
    sn.gnome.gio.TlsCertificateFlags.fromRaw(
      g_socket_client_get_tls_validation_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]]
      )
    )
  end getTlsValidationFlags

  /** Sets whether or not @client attempts to make connections via a proxy
    * server. When enabled (the default), #GSocketClient will use a
    * #GProxyResolver to determine if a proxy protocol such as SOCKS is needed,
    * and automatically do the necessary proxy negotiation.
    *
    * See also g_socket_client_set_proxy_resolver().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableProxy(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_socket_client_set_enable_proxy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      gboolean(gint((if enable == true then 1 else 0)))
    )
  end setEnableProxy

  /** Sets the socket family of the socket client. If this is set to something
    * other than %G_SOCKET_FAMILY_INVALID then the sockets created by this
    * object will be of the specified family.
    *
    * This might be useful for instance if you want to force the local
    * connection to be an ipv4 socket, even though the address might be an ipv6
    * mapped to ipv4 address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFamily(
      family: sn.gnome.gio.SocketFamily /* Some(GSocketFamily) */
  ): Unit /* None */ =
    g_socket_client_set_family(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      family.raw
    )
  end setFamily

  /** Sets the local address of the socket client. The sockets created by this
    * object will bound to the specified address (if not %NULL) before
    * connecting.
    *
    * This is useful if you want to ensure that the local side of the connection
    * is on a specific port, or on a specific interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLocalAddress(
      address: Option[
        sn.gnome.gio.SocketAddress /* Some(Ptr[GSocketAddress]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_socket_client_set_local_address(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      address
        .map[Ptr[GSocketAddress]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GSocketAddress]])
    )
  end setLocalAddress

  /** Sets the protocol of the socket client. The sockets created by this object
    * will use of the specified protocol.
    *
    * If @protocol is %G_SOCKET_PROTOCOL_DEFAULT that means to use the default
    * protocol for the socket family and type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProtocol(
      protocol: sn.gnome.gio.SocketProtocol /* Some(GSocketProtocol) */
  ): Unit /* None */ =
    g_socket_client_set_protocol(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      protocol.raw
    )
  end setProtocol

  /** Overrides the #GProxyResolver used by @client. You can call this if you
    * want to use specific proxies, rather than using the system default proxy
    * settings.
    *
    * Note that whether or not the proxy resolver is actually used depends on
    * the setting of #GSocketClient:enable-proxy, which is not changed by this
    * function (but which is %TRUE by default)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProxyResolver(
      proxy_resolver: Option[
        sn.gnome.gio.ProxyResolver /* Some(Ptr[GProxyResolver]) */
      ]
  ): Unit /* None */ =
    g_socket_client_set_proxy_resolver(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      proxy_resolver
        .map[Ptr[GProxyResolver]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GProxyResolver]])
    )
  end setProxyResolver

  /** Sets the socket type of the socket client. The sockets created by this
    * object will be of the specified type.
    *
    * It doesn't make sense to specify a type of %G_SOCKET_TYPE_DATAGRAM, as
    * GSocketClient is used for connection oriented services.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSocketType(
      `type`: sn.gnome.gio.SocketType /* Some(GSocketType) */
  ): Unit /* None */ =
    g_socket_client_set_socket_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      `type`.raw
    )
  end setSocketType

  /** Sets the I/O timeout for sockets created by @client. @timeout is a time in
    * seconds, or 0 for no timeout (the default).
    *
    * The timeout value affects the initial connection attempt as well, so
    * setting this may cause calls to g_socket_client_connect(), etc, to fail
    * with %G_IO_ERROR_TIMED_OUT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTimeout(
      timeout: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_socket_client_set_timeout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      guint(timeout)
    )
  end setTimeout

  /** Sets whether @client creates TLS (aka SSL) connections. If @tls is %TRUE, @client
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTls(
      tls: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_socket_client_set_tls(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      gboolean(gint((if tls == true then 1 else 0)))
    )
  end setTls

  /** Sets the TLS validation flags used when creating TLS connections via @client.
    * The default value is %G_TLS_CERTIFICATE_VALIDATE_ALL.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GSocketClient:tls-validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTlsValidationFlags(
      flags: sn.gnome.gio.TlsCertificateFlags /* Some(GTlsCertificateFlags) */
  ): Unit /* None */ =
    g_socket_client_set_tls_validation_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketClient]],
      flags.raw
    )
  end setTlsValidationFlags

  /** Emitted when @client's activity on @connectable changes state. Among other
    * things, this can be used to provide progress information about a network
    * connection in the UI. The meanings of the different @event values are as
    * follows:
    *
    *   - %G_SOCKET_CLIENT_RESOLVING: @client is about to look up @connectable
    *     in DNS. @connection will be %NULL.
    *   - %G_SOCKET_CLIENT_RESOLVED: @client has successfully resolved
    * @connectable
    *   in DNS. @connection will be %NULL.
    *
    *   - %G_SOCKET_CLIENT_CONNECTING: @client is about to make a connection to
    *     a remote host; either a proxy server or the destination server itself. @connection
    *     is the #GSocketConnection, which is not yet connected. Since GLib
    *     2.40, you can access the remote address via
    *     g_socket_connection_get_remote_address().
    *   - %G_SOCKET_CLIENT_CONNECTED: @client has successfully connected to a
    *     remote host. @connection is the connected #GSocketConnection.
    *   - %G_SOCKET_CLIENT_PROXY_NEGOTIATING: @client is about to negotiate with
    *     a proxy to get it to connect to @connectable. @connection is the
    *     #GSocketConnection to the proxy server.
    *   - %G_SOCKET_CLIENT_PROXY_NEGOTIATED: @client has negotiated a connection
    *     to @connectable through a proxy server. @connection is the stream
    *     returned from g_proxy_connect(), which may or may not be a
    *     #GSocketConnection.
    *   - %G_SOCKET_CLIENT_TLS_HANDSHAKING: @client is about to begin a TLS
    *     handshake. @connection is a #GTlsClientConnection.
    *   - %G_SOCKET_CLIENT_TLS_HANDSHAKED: @client has successfully completed
    *     the TLS handshake. @connection is a #GTlsClientConnection.
    *   - %G_SOCKET_CLIENT_COMPLETE: @client has either successfully connected
    *     to @connectable (in which case @connection is the #GSocketConnection
    *     that it will be returning to the caller) or has failed (in which case @connection
    *     is %NULL and the client is about to return an error).
    *
    * Each event except %G_SOCKET_CLIENT_COMPLETE may be emitted multiple times
    * (or not at all) for a given connectable (in particular, if @client ends up
    * attempting to connect to more than one address). However, if @client emits
    * the #GSocketClient::event signal at all for a given connectable, then it
    * will always emit it with %G_SOCKET_CLIENT_COMPLETE when it is done.
    *
    * Note that there may be additional #GSocketClientEvent values in the
    * future; unrecognized @event values should be ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal event]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(SocketConnectable)))"
  )
  private def onEvent = ???

end SocketClient

object SocketClient:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSocketClient])(using Runtime) =
    summon[Runtime].getOrCreate[SocketClient](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SocketClient(ptr)
    )

  /** Creates a new #GSocketClient with the default options.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): SocketClient =
    val raw: Ptr[Byte] = g_socket_client_new().asInstanceOf
    summon[Runtime].getOrCreate[SocketClient](
      raw,
      r => SocketClient.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SocketClient
