package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  NetworkConnectivity,
  SocketConnectable
}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

trait NetworkMonitor:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Attempts to determine whether or not the host pointed to by
    * @connectable
    *   can be reached, without actually trying to connect to it.
    *
    * This may return %TRUE even when #GNetworkMonitor:network-available is
    * %FALSE, if, for example, @monitor can determine that
    * @connectable
    *   refers to a host on a local network.
    *
    * If @monitor believes that an attempt to connect to @connectable will
    * succeed, it will return %TRUE. Otherwise, it will return %FALSE and set @error
    * to an appropriate error (such as %G_IO_ERROR_HOST_UNREACHABLE).
    *
    * Note that although this does not attempt to connect to
    * @connectable,
    *   it may still block for a brief period of time (eg, trying to do
    *   multicast DNS on the local network), so if you do not want to block, you
    *   should use g_network_monitor_can_reach_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canReach(
      connectable: SocketConnectable /* Some(Ptr[GSocketConnectable]) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_network_monitor_can_reach(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkMonitor]],
        connectable.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end canReach

  /** Asynchronously attempts to determine whether or not the host pointed to by @connectable
    * can be reached, without actually trying to connect to it.
    *
    * For more details, see g_network_monitor_can_reach().
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_network_monitor_can_reach_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method can_reach_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def canReachAsync__ = ???

  /** Finishes an async network connectivity test. See
    * g_network_monitor_can_reach_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canReachFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_network_monitor_can_reach_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkMonitor]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end canReachFinish

  /** Gets a more detailed networking state than
    * g_network_monitor_get_network_available().
    *
    * If #GNetworkMonitor:network-available is %FALSE, then the connectivity
    * state will be %G_NETWORK_CONNECTIVITY_LOCAL.
    *
    * If #GNetworkMonitor:network-available is %TRUE, then the connectivity
    * state will be %G_NETWORK_CONNECTIVITY_FULL (if there is full Internet
    * connectivity), %G_NETWORK_CONNECTIVITY_LIMITED (if the host has a default
    * route, but appears to be unable to actually reach the full Internet), or
    * %G_NETWORK_CONNECTIVITY_PORTAL (if the host is trapped behind a "captive
    * portal" that requires some sort of login or acknowledgement before
    * allowing full Internet access).
    *
    * Note that in the case of %G_NETWORK_CONNECTIVITY_LIMITED and
    * %G_NETWORK_CONNECTIVITY_PORTAL, it is possible that some sites are
    * reachable but others are not. In this case, applications can attempt to
    * connect to remote servers, but should gracefully fall back to their
    * "offline" behavior if the connection attempt fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnectivity(): NetworkConnectivity /* None */ =
    NetworkConnectivity.fromRaw(
      g_network_monitor_get_connectivity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkMonitor]]
      )
    )
  end getConnectivity

  /** Checks if the network is available. "Available" here means that the system
    * has a default route available for at least one of IPv4 or IPv6. It does
    * not necessarily imply that the public Internet is reachable. See
    * #GNetworkMonitor:network-available for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNetworkAvailable(): Boolean /* None */ =
    g_network_monitor_get_network_available(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkMonitor]]
    ).value.!=(0)
  end getNetworkAvailable

  /** Checks if the network is metered. See #GNetworkMonitor:network-metered for
    * more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNetworkMetered(): Boolean /* None */ =
    g_network_monitor_get_network_metered(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkMonitor]]
    ).value.!=(0)
  end getNetworkMetered

end NetworkMonitor

object NetworkMonitor:
  class Abstract(raw: Ptr[Byte]) extends NetworkMonitor:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end NetworkMonitor
