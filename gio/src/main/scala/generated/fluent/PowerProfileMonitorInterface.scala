package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GPowerProfileMonitorInterface

/** The virtual function table for #GPowerProfileMonitor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PowerProfileMonitorInterface private[gnome] (
    raw: Ptr[GPowerProfileMonitorInterface]
):

  def getUnsafeRawPointer(): Ptr[GPowerProfileMonitorInterface] = this.raw

end PowerProfileMonitorInterface

object PowerProfileMonitorInterface:
  def fromRaw(
      ptr: Ptr[GPowerProfileMonitorInterface]
  ): PowerProfileMonitorInterface = new PowerProfileMonitorInterface(ptr)
end PowerProfileMonitorInterface
