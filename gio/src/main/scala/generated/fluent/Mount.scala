package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, Drive, File, Icon, Volume}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}

trait Mount:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if @mount can be ejected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canEject(): Boolean /* None */ =
    g_mount_can_eject(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
    ).value.!=(0)
  end canEject

  /** Checks if @mount can be unmounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canUnmount(): Boolean /* None */ =
    g_mount_can_unmount(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
    ).value.!=(0)
  end canUnmount

  /** Ejects a mount. This is an asynchronous operation, and is finished by
    * calling g_mount_eject_finish() with the @mount and #GAsyncResult data
    * returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def eject__ = ???

  /** Finishes ejecting a mount. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ejectFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_mount_eject_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectFinish

  /** Ejects a mount. This is an asynchronous operation, and is finished by
    * calling g_mount_eject_with_operation_finish() with the @mount and
    * #GAsyncResult data returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def ejectWithOperation__ = ???

  /** Finishes ejecting a mount. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ejectWithOperationFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_mount_eject_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectWithOperationFinish

  /** Gets the default location of @mount. The default location of the given
    * @mount
    *   is a path that reflects the main entry point for the user (e.g. the home
    *   directory, or the root of the volume).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultLocation(): File /* None */ =
    new File.Abstract(
      g_mount_get_default_location(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getDefaultLocation

  /** Gets the drive for the @mount.
    *
    * This is a convenience method for getting the #GVolume and then using that
    * object to get the #GDrive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrive(): Drive /* None */ =
    new Drive.Abstract(
      g_mount_get_drive(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getDrive

  /** Gets the icon for @mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_mount_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getIcon

  /** Gets the name of @mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_mount_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getName

  /** Gets the root directory on @mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRoot(): File /* None */ =
    new File.Abstract(
      g_mount_get_root(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getRoot

  /** Gets the sort key for @mount, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortKey(): String /* None */ =
    fromCString(
      g_mount_get_sort_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getSortKey

  /** Gets the symbolic icon for @mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymbolicIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_mount_get_symbolic_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getSymbolicIcon

  /** Gets the UUID for the @mount. The reference is typically based on the file
    * system UUID for the mount in question and should be considered an opaque
    * string. Returns %NULL if there is no UUID available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUuid(): String /* None */ =
    fromCString(
      g_mount_get_uuid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getUuid

  /** Gets the volume for the @mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVolume(): Volume /* None */ =
    new Volume.Abstract(
      g_mount_get_volume(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
      ).asInstanceOf
    )
  end getVolume

  /** Tries to guess the type of content stored on @mount. Returns one or more
    * textual identifiers of well-known content types (typically prefixed with
    * "x-content/"), e.g. x-content/image-dcf for camera memory cards. See the
    * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
    * specification for more on x-content types.
    *
    * This is an asynchronous operation (see g_mount_guess_content_type_sync()
    * for the synchronous version), and is finished by calling
    * g_mount_guess_content_type_finish() with the
    * @mount
    *   and #GAsyncResult data returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_content_type/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def guessContentType__ = ???

  /** Finishes guessing content types of @mount. If any errors occurred during
    * the operation, @error will be set to contain the errors and %FALSE will be
    * returned. In particular, you may get an %G_IO_ERROR_NOT_SUPPORTED if the
    * mount does not support content guessing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_content_type_finish/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def guessContentTypeFinish__ = ???

  /** Tries to guess the type of content stored on @mount. Returns one or more
    * textual identifiers of well-known content types (typically prefixed with
    * "x-content/"), e.g. x-content/image-dcf for camera memory cards. See the
    * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
    * specification for more on x-content types.
    *
    * This is a synchronous operation and as such may block doing IO; see
    * g_mount_guess_content_type() for the asynchronous version.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_content_type_sync/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def guessContentTypeSync__ = ???

  /** Determines if @mount is shadowed. Applications or libraries should avoid
    * displaying @mount in the user interface if it is shadowed.
    *
    * A mount is said to be shadowed if there exists one or more user visible
    * objects (currently #GMount objects) with a root that is inside the root of @mount.
    *
    * One application of shadow mounts is when exposing a single file system
    * that is used to address several logical volumes. In this situation, a
    * #GVolumeMonitor implementation would create two #GVolume objects (for
    * example, one for the camera functionality of the device and one for a SD
    * card reader on the device) with activation URIs
    * `gphoto2://[usb:001,002]/store1/` and `gphoto2://[usb:001,002]/store2/`.
    * When the underlying mount (with root `gphoto2://[usb:001,002]/`) is
    * mounted, said #GVolumeMonitor implementation would create two #GMount
    * objects (each with their root matching the corresponding volume activation
    * root) that would shadow the original mount.
    *
    * The proxy monitor in GVfs 2.26 and later, automatically creates and manage
    * shadow mounts (and shadows the underlying mount) if the activation root on
    * a #GVolume is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isShadowed(): Boolean /* None */ =
    g_mount_is_shadowed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]]
    ).value.!=(0)
  end isShadowed

  /** Remounts a mount. This is an asynchronous operation, and is finished by
    * calling g_mount_remount_finish() with the @mount and #GAsyncResults data
    * returned in the @callback.
    *
    * Remounting is useful when some setting affecting the operation of the
    * volume has been changed, as these may need a remount to take affect. While
    * this is semantically equivalent with unmounting and then remounting not
    * all backends might need to actually be unmounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def remount__ = ???

  /** Finishes remounting a mount. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remountFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_mount_remount_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end remountFinish

  /** Increments the shadow count on @mount. Usually used by #GVolumeMonitor
    * implementations when creating a shadow mount for
    * @mount,
    *   see g_mount_is_shadowed() for more information. The caller will need to
    *   emit the #GMount::changed signal on @mount manually.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shadow(): Unit /* None */ =
    g_mount_shadow(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]])
  end shadow

  /** Unmounts a mount. This is an asynchronous operation, and is finished by
    * calling g_mount_unmount_finish() with the @mount and #GAsyncResult data
    * returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unmount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def unmount__ = ???

  /** Finishes unmounting a mount. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmountFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_mount_unmount_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end unmountFinish

  /** Unmounts a mount. This is an asynchronous operation, and is finished by
    * calling g_mount_unmount_with_operation_finish() with the @mount and
    * #GAsyncResult data returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unmount_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def unmountWithOperation__ = ???

  /** Finishes unmounting a mount. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmountWithOperationFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_mount_unmount_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end unmountWithOperationFinish

  /** Decrements the shadow count on @mount. Usually used by #GVolumeMonitor
    * implementations when destroying a shadow mount for
    * @mount,
    *   see g_mount_is_shadowed() for more information. The caller will need to
    *   emit the #GMount::changed signal on @mount manually.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unshadow(): Unit /* None */ =
    g_mount_unshadow(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMount]])
  end unshadow

end Mount

object Mount:
  class Abstract(raw: Ptr[Byte]) extends Mount:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Mount
