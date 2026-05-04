package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Mount, Volume, VolumeMonitor}
import sn.gnome.gio.internal.GVolumeMonitor
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Drive))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getConnectedDrives__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds a #GMount object by its UUID (see g_mount_get_uuid())
    */
  def getMountForUuid(
      uuid: String | CString /* Some(CString) */
  )(using Zone): Mount /* None */ = new Mount.Abstract(
    g_volume_monitor_get_mount_for_uuid(
      this.raw.asInstanceOf[Ptr[GVolumeMonitor]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Mount))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getMounts__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds a #GVolume object by its UUID (see g_volume_get_uuid())
    */
  def getVolumeForUuid(
      uuid: String | CString /* Some(CString) */
  )(using Zone): Volume /* None */ = new Volume.Abstract(
    g_volume_monitor_get_volume_for_uuid(
      this.raw.asInstanceOf[Ptr[GVolumeMonitor]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Volume))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getVolumes__ = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end VolumeMonitor

object VolumeMonitor:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function should be called by any #GVolumeMonitor implementation when
    * a new #GMount object is created that is not associated with a #GVolume
    * object. It must be called just before emitting the @mount_added signal.
    *
    * If the return value is not %NULL, the caller must associate the returned
    * #GVolume object with the #GMount. This involves returning it in its
    * g_mount_get_volume() implementation. The caller must also listen for the
    * "removed" signal on the returned object and give up its reference when
    * handling that signal
    *
    * Similarly, if implementing g_volume_monitor_adopt_orphan_mount(), the
    * implementor must take a reference to @mount and return it in its
    * g_volume_get_mount() implemented. Also, the implementor must listen for
    * the "unmounted" signal on @mount and give up its reference upon handling
    * that signal.
    *
    * There are two main use cases for this function.
    *
    * One is when implementing a user space file system driver that reads blocks
    * of a block device that is already represented by the native volume monitor
    * (for example a CD Audio file system driver). Such a driver will generate
    * its own #GMount object that needs to be associated with the #GVolume
    * object that represents the volume.
    *
    * The other is for implementing a #GVolumeMonitor whose sole purpose is to
    * return #GVolume objects representing entries in the users "favorite
    * servers" list or similar.
    */
  def adoptOrphanMount(
      mount: Mount /* Some(Ptr[GMount]) */
  ): Volume /* Some(Ptr[GVolume]) */ = new Volume.Abstract(
    g_volume_monitor_adopt_orphan_mount(
      mount.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the volume monitor used by gio.
    */
  def get(): VolumeMonitor /* Some(Ptr[GVolumeMonitor]) */ = new VolumeMonitor(
    g_volume_monitor_get().asInstanceOf
  )

end VolumeMonitor
