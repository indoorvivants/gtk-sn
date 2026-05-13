package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Mount, Volume, VolumeMonitor}
import sn.gnome.gio.internal.GVolumeMonitor
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GVolumeMonitor is for listing the user interesting devices and volumes on
  * the computer. In other words, what a file selector or file manager would
  * show in a sidebar.
  *
  * #GVolumeMonitor is not [thread-default-context
  * aware][g-main-context-push-thread-default], and so should not be used other
  * than from the main thread, with no thread-default-context active.
  *
  * In order to receive updates about volumes and mounts monitored through GVFS,
  * a main loop must be running.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VolumeMonitor private[gnome] (raw: Ptr[GVolumeMonitor])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets a list of drives connected to the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_connected_drives/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Drive))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getConnectedDrives__ = ???

  /** Finds a #GMount object by its UUID (see g_mount_get_uuid())
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMountForUuid(
      uuid: String /* Some(CString) */
  )(using Zone): Mount /* None */ =
    new Mount.Abstract(
      g_volume_monitor_get_mount_for_uuid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolumeMonitor]],
        toCString(uuid)
      ).asInstanceOf
    )
  end getMountForUuid

  /** Gets a list of the mounts on the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_mounts/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Mount))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getMounts__ = ???

  /** Finds a #GVolume object by its UUID (see g_volume_get_uuid())
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVolumeForUuid(
      uuid: String /* Some(CString) */
  )(using Zone): Volume /* None */ =
    new Volume.Abstract(
      g_volume_monitor_get_volume_for_uuid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolumeMonitor]],
        toCString(uuid)
      ).asInstanceOf
    )
  end getVolumeForUuid

  /** Gets a list of the volumes on the system.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_volumes/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Volume))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getVolumes__ = ???

  /** Emitted when a drive changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drive-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))"
  )
  private def onDriveChanged = ???

  /** Emitted when a drive is connected to the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drive-connected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))"
  )
  private def onDriveConnected = ???

  /** Emitted when a drive is disconnected from the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drive-disconnected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))"
  )
  private def onDriveDisconnected = ???

  /** Emitted when the eject button is pressed on @drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drive-eject-button]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))"
  )
  private def onDriveEjectButton = ???

  /** Emitted when the stop button is pressed on @drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drive-stop-button]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Drive)))"
  )
  private def onDriveStopButton = ???

  /** Emitted when a mount is added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal mount-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))"
  )
  private def onMountAdded = ???

  /** Emitted when a mount changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal mount-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))"
  )
  private def onMountChanged = ???

  /** May be emitted when a mount is about to be removed.
    *
    * This signal depends on the backend and is only emitted if GIO was used to
    * unmount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal mount-pre-unmount]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))"
  )
  private def onMountPreUnmount = ???

  /** Emitted when a mount is removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal mount-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Mount)))"
  )
  private def onMountRemoved = ???

  /** Emitted when a mountable volume is added to the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal volume-added]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))"
  )
  private def onVolumeAdded = ???

  /** Emitted when mountable volume is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal volume-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))"
  )
  private def onVolumeChanged = ???

  /** Emitted when a mountable volume is removed from the system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal volume-removed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Volume)))"
  )
  private def onVolumeRemoved = ???

end VolumeMonitor

object VolumeMonitor:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GVolumeMonitor])(using Runtime) =
    summon[Runtime].getOrCreate[VolumeMonitor](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new VolumeMonitor(ptr)
    )

  /** This function should be called by any #GVolumeMonitor implementation when
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def adoptOrphanMount(
      mount: Mount /* Some(Ptr[GMount]) */
  ): Volume /* Some(Ptr[GVolume]) */ = new Volume.Abstract(
    g_volume_monitor_adopt_orphan_mount(
      mount.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Gets the volume monitor used by gio.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get()(using
      Runtime
  ): sn.gnome.gio.VolumeMonitor /* Some(Ptr[GVolumeMonitor]) */ =
    sn.gnome.gio.VolumeMonitor.applyUnsafe(g_volume_monitor_get().asInstanceOf)

end VolumeMonitor
