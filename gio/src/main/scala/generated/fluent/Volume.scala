package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, Drive, File, Icon, Mount}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

trait Volume:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if a volume can be ejected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canEject(): Boolean /* None */ =
    g_volume_can_eject(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
    ).value.!=(0)
  end canEject

  /** Checks if a volume can be mounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canMount(): Boolean /* None */ =
    g_volume_can_mount(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
    ).value.!=(0)
  end canMount

  /** Ejects a volume. This is an asynchronous operation, and is finished by
    * calling g_volume_eject_finish() with the @volume and #GAsyncResult
    * returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def eject__ = ???

  /** Finishes ejecting a volume. If any errors occurred during the operation,
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
      g_volume_eject_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectFinish

  /** Ejects a volume. This is an asynchronous operation, and is finished by
    * calling g_volume_eject_with_operation_finish() with the @volume and
    * #GAsyncResult data returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def ejectWithOperation__ = ???

  /** Finishes ejecting a volume. If any errors occurred during the operation,
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
      g_volume_eject_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectWithOperationFinish

  /** Gets the kinds of [identifiers][volume-identifier] that @volume has. Use
    * g_volume_get_identifier() to obtain the identifiers themselves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateIdentifiers()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        g_volume_enumerate_identifiers(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
        )
      )
      .map(fromCString(_))
  end enumerateIdentifiers

  /**  Gets the activation root for a #GVolume if it is known ahead of
    *  mount time. Returns %NULL otherwise. If not %NULL and if @volume
    *  is mounted, then the result of g_mount_get_root() on the
    *  #GMount object obtained from g_volume_get_mount() will always
    *  either be equal or a prefix of what this function returns. In
    *  other words, in code
    *
    *  |[<!-- language="C" -->
    *    GMount *mount;
    *    GFile *mount_root
    *    GFile *volume_activation_root;
    *
    *    mount = g_volume_get_mount (volume); // mounted, so never NULL
    *    mount_root = g_mount_get_root (mount);
    *    volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
    *  ]|
    *  then the expression
    *  |[<!-- language="C" -->
    *    (g_file_has_prefix (volume_activation_root, mount_root) ||
    *     g_file_equal (volume_activation_root, mount_root))
    *  ]|
    *  will always be %TRUE.
    *
    *  Activation roots are typically used in #GVolumeMonitor
    *  implementations to find the underlying mount to shadow, see
    *  g_mount_is_shadowed() for more details.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def getActivationRoot(): File /* None */ =
    new File.Abstract(
      g_volume_get_activation_root(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getActivationRoot

  /** Gets the drive for the @volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrive(): Drive /* None */ =
    new Drive.Abstract(
      g_volume_get_drive(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getDrive

  /** Gets the icon for @volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_volume_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getIcon

  /** Gets the identifier of the given kind for @volume. See the
    * [introduction][volume-identifier] for more information about volume
    * identifiers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIdentifier(
      kind: String /* Some(CString) */
  )(using Runtime): String /* None */ =
    fromCString(
      g_volume_get_identifier(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]],
        summon[Runtime].inZone(toCString(kind))
      ).asInstanceOf
    )
  end getIdentifier

  /** Gets the mount for the @volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMount(): Mount /* None */ =
    new Mount.Abstract(
      g_volume_get_mount(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getMount

  /** Gets the name of @volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_volume_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getName

  /** Gets the sort key for @volume, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortKey(): String /* None */ =
    fromCString(
      g_volume_get_sort_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getSortKey

  /** Gets the symbolic icon for @volume.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymbolicIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_volume_get_symbolic_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getSymbolicIcon

  /** Gets the UUID for the @volume. The reference is typically based on the
    * file system UUID for the volume in question and should be considered an
    * opaque string. Returns %NULL if there is no UUID available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUuid(): String /* None */ =
    fromCString(
      g_volume_get_uuid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
      ).asInstanceOf
    )
  end getUuid

  /** Mounts a volume. This is an asynchronous operation, and is finished by
    * calling g_volume_mount_finish() with the @volume and #GAsyncResult
    * returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method mount/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def mount__ = ???

  /** Finishes mounting a volume. If any errors occurred during the operation,
    * @error
    *   will be set to contain the errors and %FALSE will be returned.
    *
    * If the mount operation succeeded, g_volume_get_mount() on @volume is
    * guaranteed to return the mount right after calling this function; there's
    * no need to listen for the 'mount-added' signal on #GVolumeMonitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mountFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_volume_mount_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end mountFinish

  /** Returns whether the volume should be automatically mounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shouldAutomount(): Boolean /* None */ =
    g_volume_should_automount(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVolume]]
    ).value.!=(0)
  end shouldAutomount

end Volume

object Volume:
  class Abstract(raw: Ptr[Byte]) extends Volume:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Volume
