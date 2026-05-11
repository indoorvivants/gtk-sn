package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait PowerProfileMonitor:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets whether the system is in “Power Saver” mode.
    *
    * You are expected to listen to the
    * #GPowerProfileMonitor::notify::power-saver-enabled signal to know when the
    * profile has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPowerSaverEnabled(): Boolean /* None */ =
    g_power_profile_monitor_get_power_saver_enabled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPowerProfileMonitor]]
    ).value.!=(0)
  end getPowerSaverEnabled

end PowerProfileMonitor

object PowerProfileMonitor:
  class Abstract(raw: Ptr[Byte]) extends PowerProfileMonitor:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PowerProfileMonitor
