package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.DatagramBased
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GSocket
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.gio.internal.GSocketProtocol
import sn.gnome.gio.internal.GSocketType
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GIOCondition
import sn.gnome.glib.internal.GSource
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint64
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class Socket(raw: Ptr[GSocket])
    extends Object(raw.asInstanceOf),
      DatagramBased,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def accept(cancellable: Cancellable): GResult[Socket] =
    GResult.wrap(__errorPtr =>
      new Socket(
        g_socket_accept(
          this.raw.asInstanceOf,
          cancellable.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def bind(address: SocketAddress, allow_reuse: Boolean): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_bind(
        this.raw.asInstanceOf,
        address.getUnsafeRawPointer().asInstanceOf,
        gboolean(gint((if allow_reuse == true then 1 else 0))),
        __errorPtr
      ).value.!=(0)
    )

  def checkConnectResult(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_check_connect_result(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def close(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_close(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def conditionCheck(condition: GIOCondition): GIOCondition =
    g_socket_condition_check(this.raw.asInstanceOf, condition)

  def conditionTimedWait(
      condition: GIOCondition,
      timeout_us: CLongInt,
      cancellable: Cancellable
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_condition_timed_wait(
      this.raw.asInstanceOf,
      condition,
      gint64(timeout_us),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def conditionWait(
      condition: GIOCondition,
      cancellable: Cancellable
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_condition_wait(
      this.raw.asInstanceOf,
      condition,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def connect(
      address: SocketAddress,
      cancellable: Cancellable
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_connect(
      this.raw.asInstanceOf,
      address.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def connectionFactoryCreateConnection(): SocketConnection =
    new SocketConnection(
      g_socket_connection_factory_create_connection(
        this.raw.asInstanceOf
      ).asInstanceOf
    )

  def createSource(
      condition: GIOCondition,
      cancellable: Cancellable
  ): Ptr[GSource] = g_socket_create_source(
    this.raw.asInstanceOf,
    condition,
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def getAvailableBytes(): CLongInt = g_socket_get_available_bytes(
    this.raw.asInstanceOf
  ).value

  def getBlocking(): Boolean =
    g_socket_get_blocking(this.raw.asInstanceOf).value.!=(0)

  def getBroadcast(): Boolean =
    g_socket_get_broadcast(this.raw.asInstanceOf).value.!=(0)

  def getCredentials(): GResult[Credentials] = GResult.wrap(__errorPtr =>
    new Credentials(
      g_socket_get_credentials(this.raw.asInstanceOf, __errorPtr).asInstanceOf
    )
  )

  def getFamily(): GSocketFamily = g_socket_get_family(this.raw.asInstanceOf)

  def getFd(): Int = g_socket_get_fd(this.raw.asInstanceOf)

  def getKeepalive(): Boolean =
    g_socket_get_keepalive(this.raw.asInstanceOf).value.!=(0)

  def getListenBacklog(): Int = g_socket_get_listen_backlog(
    this.raw.asInstanceOf
  ).value

  def getLocalAddress(): GResult[SocketAddress] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_get_local_address(this.raw.asInstanceOf, __errorPtr).asInstanceOf
    )
  )

  def getMulticastLoopback(): Boolean =
    g_socket_get_multicast_loopback(this.raw.asInstanceOf).value.!=(0)

  def getMulticastTtl(): UInt = g_socket_get_multicast_ttl(
    this.raw.asInstanceOf
  ).value

  // Method get_option contains an OUT parameter, which is not supported yet

  def getProtocol(): GSocketProtocol = g_socket_get_protocol(
    this.raw.asInstanceOf
  )

  def getRemoteAddress(): GResult[SocketAddress] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_get_remote_address(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def getSocketType(): GSocketType = g_socket_get_socket_type(
    this.raw.asInstanceOf
  )

  def getTimeout(): UInt = g_socket_get_timeout(this.raw.asInstanceOf).value

  def getTtl(): UInt = g_socket_get_ttl(this.raw.asInstanceOf).value

  def isClosed(): Boolean =
    g_socket_is_closed(this.raw.asInstanceOf).value.!=(0)

  def isConnected(): Boolean =
    g_socket_is_connected(this.raw.asInstanceOf).value.!=(0)

  def joinMulticastGroup(
      group: InetAddress,
      source_specific: Boolean,
      iface: String | CString
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_join_multicast_group(
      this.raw.asInstanceOf,
      group.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if source_specific == true then 1 else 0))),
      __sn_extract_string(iface).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  def joinMulticastGroupSsm(
      group: InetAddress,
      source_specific: InetAddress,
      iface: String | CString
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_join_multicast_group_ssm(
      this.raw.asInstanceOf,
      group.getUnsafeRawPointer().asInstanceOf,
      source_specific.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(iface).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  def leaveMulticastGroup(
      group: InetAddress,
      source_specific: Boolean,
      iface: String | CString
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_leave_multicast_group(
      this.raw.asInstanceOf,
      group.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if source_specific == true then 1 else 0))),
      __sn_extract_string(iface).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  def leaveMulticastGroupSsm(
      group: InetAddress,
      source_specific: InetAddress,
      iface: String | CString
  )(using Zone): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_leave_multicast_group_ssm(
      this.raw.asInstanceOf,
      group.getUnsafeRawPointer().asInstanceOf,
      source_specific.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(iface).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  def listen(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_listen(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  // Method receive contains an array parameter, which is not supported yet

  // Method receive_from contains an array parameter, which is not supported yet

  // Method receive_message contains an array parameter, which is not supported yet

  // Method receive_messages contains an array parameter, which is not supported yet

  // Method receive_with_blocking contains an array parameter, which is not supported yet

  // Method send contains an array parameter, which is not supported yet

  // Method send_message contains an array parameter, which is not supported yet

  // Method send_message_with_timeout contains an array parameter, which is not supported yet

  // Method send_messages contains an array parameter, which is not supported yet

  // Method send_to contains an array parameter, which is not supported yet

  // Method send_with_blocking contains an array parameter, which is not supported yet

  def setBlocking(blocking: Boolean): Unit = g_socket_set_blocking(
    this.raw.asInstanceOf,
    gboolean(gint((if blocking == true then 1 else 0)))
  )

  def setBroadcast(broadcast: Boolean): Unit = g_socket_set_broadcast(
    this.raw.asInstanceOf,
    gboolean(gint((if broadcast == true then 1 else 0)))
  )

  def setKeepalive(keepalive: Boolean): Unit = g_socket_set_keepalive(
    this.raw.asInstanceOf,
    gboolean(gint((if keepalive == true then 1 else 0)))
  )

  def setListenBacklog(backlog: Int): Unit =
    g_socket_set_listen_backlog(this.raw.asInstanceOf, gint(backlog))

  def setMulticastLoopback(loopback: Boolean): Unit =
    g_socket_set_multicast_loopback(
      this.raw.asInstanceOf,
      gboolean(gint((if loopback == true then 1 else 0)))
    )

  def setMulticastTtl(ttl: UInt): Unit =
    g_socket_set_multicast_ttl(this.raw.asInstanceOf, guint(ttl))

  def setOption(level: Int, optname: Int, value: Int): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_socket_set_option(
        this.raw.asInstanceOf,
        gint(level),
        gint(optname),
        gint(value),
        __errorPtr
      ).value.!=(0)
    )

  def setTimeout(timeout: UInt): Unit =
    g_socket_set_timeout(this.raw.asInstanceOf, guint(timeout))

  def setTtl(ttl: UInt): Unit =
    g_socket_set_ttl(this.raw.asInstanceOf, guint(ttl))

  def shutdown(
      shutdown_read: Boolean,
      shutdown_write: Boolean
  ): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_socket_shutdown(
      this.raw.asInstanceOf,
      gboolean(gint((if shutdown_read == true then 1 else 0))),
      gboolean(gint((if shutdown_write == true then 1 else 0))),
      __errorPtr
    ).value.!=(0)
  )

  def speaksIpv4(): Boolean =
    g_socket_speaks_ipv4(this.raw.asInstanceOf).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Socket

object Socket:
  def apply(
      family: GSocketFamily,
      `type`: GSocketType,
      protocol: GSocketProtocol
  ): GResult[Socket] = GResult.wrap(__errorPtr =>
    new Socket(g_socket_new(family, `type`, protocol, __errorPtr).asInstanceOf)
  )
  def fromFd(fd: Int): GResult[Socket] = GResult.wrap(__errorPtr =>
    new Socket(g_socket_new_from_fd(gint(fd), __errorPtr).asInstanceOf)
  )
end Socket
