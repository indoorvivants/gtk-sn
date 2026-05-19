package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, DriveStartStopType, Icon}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

trait Drive:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Checks if a drive can be ejected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canEject(): Boolean /* None */ =
    g_drive_can_eject(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end canEject

  /** Checks if a drive can be polled for media changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canPollForMedia(): Boolean /* None */ =
    g_drive_can_poll_for_media(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end canPollForMedia

  /** Checks if a drive can be started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canStart(): Boolean /* None */ =
    g_drive_can_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end canStart

  /** Checks if a drive can be started degraded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canStartDegraded(): Boolean /* None */ =
    g_drive_can_start_degraded(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end canStartDegraded

  /** Checks if a drive can be stopped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canStop(): Boolean /* None */ =
    g_drive_can_stop(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]).value
      .!=(0)
  end canStop

  /** Asynchronously ejects a drive.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_drive_eject_finish() to obtain the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def eject__ = ???

  /** Finishes ejecting a drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ejectFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_drive_eject_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectFinish

  /** Ejects a drive. This is an asynchronous operation, and is finished by
    * calling g_drive_eject_with_operation_finish() with the @drive and
    * #GAsyncResult data returned in the @callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method eject_with_operation/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def ejectWithOperation__ = ???

  /** Finishes ejecting a drive. If any errors occurred during the operation,
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
      g_drive_eject_with_operation_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end ejectWithOperationFinish

  /** Gets the kinds of identifiers that @drive has. Use
    * g_drive_get_identifier() to obtain the identifiers themselves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerateIdentifiers()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        g_drive_enumerate_identifiers(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
        )
      )
      .map(fromCString(_))
  end enumerateIdentifiers

  /** Gets the icon for @drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_drive_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
      ).asInstanceOf
    )
  end getIcon

  /** Gets the identifier of the given kind for @drive. The only identifier
    * currently available is %G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIdentifier(
      kind: String /* Some(CString) */
  )(using Runtime): String /* None */ =
    fromCString(
      g_drive_get_identifier(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        summon[Runtime].inZone(toCString(kind))
      ).asInstanceOf
    )
  end getIdentifier

  /** Gets the name of @drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): String /* None */ =
    fromCString(
      g_drive_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
      ).asInstanceOf
    )
  end getName

  /** Gets the sort key for @drive, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortKey(): String /* None */ =
    fromCString(
      g_drive_get_sort_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
      ).asInstanceOf
    )
  end getSortKey

  /** Gets a hint about how a drive can be started/stopped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartStopType(): DriveStartStopType /* None */ =
    DriveStartStopType.fromRaw(
      g_drive_get_start_stop_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
      )
    )
  end getStartStopType

  /** Gets the icon for @drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymbolicIcon(): Icon /* None */ =
    new Icon.Abstract(
      g_drive_get_symbolic_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
      ).asInstanceOf
    )
  end getSymbolicIcon

  /** Get a list of mountable volumes for @drive.
    *
    * The returned list should be freed with g_list_free(), after its elements
    * have been unreffed with g_object_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_volumes/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Volume))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getVolumes__ = ???

  /** Checks if the @drive has media. Note that the OS may not be polling the
    * drive for media changes; see g_drive_is_media_check_automatic() for more
    * details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasMedia(): Boolean /* None */ =
    g_drive_has_media(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end hasMedia

  /** Check if @drive has any mountable volumes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasVolumes(): Boolean /* None */ =
    g_drive_has_volumes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end hasVolumes

  /** Checks if @drive is capable of automatically detecting media changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMediaCheckAutomatic(): Boolean /* None */ =
    g_drive_is_media_check_automatic(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end isMediaCheckAutomatic

  /** Checks if the @drive supports removable media.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMediaRemovable(): Boolean /* None */ =
    g_drive_is_media_removable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end isMediaRemovable

  /** Checks if the #GDrive and/or its media is considered removable by the
    * user. See g_drive_is_media_removable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRemovable(): Boolean /* None */ =
    g_drive_is_removable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]]
    ).value.!=(0)
  end isRemovable

  /** Asynchronously polls @drive to see if media has been inserted or removed.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_drive_poll_for_media_finish() to obtain the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method poll_for_media/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def pollForMedia__ = ???

  /** Finishes an operation started with g_drive_poll_for_media() on a drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pollForMediaFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_drive_poll_for_media_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end pollForMediaFinish

  /** Asynchronously starts a drive.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_drive_start_finish() to obtain the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method start/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def start__ = ???

  /** Finishes starting a drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_drive_start_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end startFinish

  /** Asynchronously stops a drive.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_drive_stop_finish() to obtain the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method stop/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def stop__ = ???

  /** Finishes stopping a drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stopFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_drive_stop_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDrive]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end stopFinish

end Drive

object Drive:
  class Abstract(raw: Ptr[Byte]) extends Drive:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Drive
