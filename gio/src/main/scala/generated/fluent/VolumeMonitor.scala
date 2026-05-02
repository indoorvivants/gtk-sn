package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Mount
import sn.gnome.gio.fluent.Volume
import sn.gnome.gio.internal.GVolumeMonitor
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GVolumeMonitor is for listing the user interesting devices and volumes on
  * the computer. In other words, what a file selector or file manager would
  * show in a sidebar.
  *
  * #GVolumeMonitor is not [thread-default-context
  * aware][g-main-context-push-thread-default], and so should not be used other
  * than from the main thread, with no thread-default-context active.
  *
  * In order to receive updates about volumes and mounts monitored through GVFS,
  * a main loop must be running.
  */
class VolumeMonitor(raw: Ptr[GVolumeMonitor]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a list of drives connected to the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    */
  def getConnectedDrives(): Ptr[GList] /* None */ =
    g_volume_monitor_get_connected_drives(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds a #GMount object by its UUID (see g_mount_get_uuid())
    */
  def getMountForUuid(
      uuid: String | CString /* Some(CString) */
  )(using Zone): Mount /* None */ = new Mount.Abstract(
    g_volume_monitor_get_mount_for_uuid(
      this.raw.asInstanceOf,
      __sn_extract_string(uuid)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a list of the mounts on the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    */
  def getMounts(): Ptr[GList] /* None */ = g_volume_monitor_get_mounts(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds a #GVolume object by its UUID (see g_volume_get_uuid())
    */
  def getVolumeForUuid(
      uuid: String | CString /* Some(CString) */
  )(using Zone): Volume /* None */ = new Volume.Abstract(
    g_volume_monitor_get_volume_for_uuid(
      this.raw.asInstanceOf,
      __sn_extract_string(uuid)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a list of the volumes on the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    */
  def getVolumes(): Ptr[GList] /* None */ = g_volume_monitor_get_volumes(
    this.raw.asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end VolumeMonitor
