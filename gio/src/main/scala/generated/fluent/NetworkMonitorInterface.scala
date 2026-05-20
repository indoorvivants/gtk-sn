package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNetworkMonitorInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GNetworkMonitor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NetworkMonitorInterface private[gnome] (
    raw: Ptr[GNetworkMonitorInterface]
):

  def getUnsafeRawPointer(): Ptr[GNetworkMonitorInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field network_changed]: Field is missing <type>"
  )
  private def networkChanged__ = ???
  @annotation.compileTimeOnly("[field can_reach]: Field is missing <type>")
  private def canReach__ = ???
  @annotation.compileTimeOnly(
    "[field can_reach_async]: Field is missing <type>"
  )
  private def canReachAsync__ = ???
  @annotation.compileTimeOnly(
    "[field can_reach_finish]: Field is missing <type>"
  )
  private def canReachFinish__ = ???
end NetworkMonitorInterface

object NetworkMonitorInterface:
  def fromRaw(ptr: Ptr[GNetworkMonitorInterface]): NetworkMonitorInterface =
    new NetworkMonitorInterface(ptr)
end NetworkMonitorInterface
