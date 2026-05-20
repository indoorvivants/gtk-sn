package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{
  FileAttributeMatcher,
  FileAttributeStatus,
  FileAttributeType,
  FileInfo,
  FileType,
  Icon
}
import sn.gnome.gio.internal.GFileInfo
import sn.gnome.glib.{DateTime, TimeVal}
import sn.gnome.glib.internal.{
  gboolean,
  gint,
  gint32,
  gint64,
  goffset,
  gpointer,
  guint32,
  guint64
}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Functionality for manipulating basic metadata for files. #GFileInfo
  * implements methods for getting information that all files should contain,
  * and allows for manipulation of extended attributes.
  *
  * See [GFileAttribute][gio-GFileAttribute] for more information on how GIO
  * handles file attributes.
  *
  * To obtain a #GFileInfo for a #GFile, use g_file_query_info() (or its async
  * variant). To obtain a #GFileInfo for a file input or output stream, use
  * g_file_input_stream_query_info() or g_file_output_stream_query_info() (or
  * their async variants).
  *
  * To change the actual attributes of a file, you should then set the attribute
  * in the #GFileInfo and call g_file_set_attributes_from_info() or
  * g_file_set_attributes_async() on a GFile.
  *
  * However, not all attributes can be changed in the file. For instance, the
  * actual size of a file cannot be changed via g_file_info_set_size(). You may
  * call g_file_query_settable_attributes() and
  * g_file_query_writable_namespaces() to discover the settable attributes of a
  * particular file at runtime.
  *
  * The direct accessors, such as g_file_info_get_name(), are slightly more
  * optimized than the generic attribute accessors, such as
  * g_file_info_get_attribute_byte_string().This optimization will matter only
  * if calling the API in a tight loop.
  *
  * It is an error to call these accessors without specifying their required
  * file attributes when creating the #GFileInfo. Use
  * g_file_info_has_attribute() or g_file_info_list_attributes() to check what
  * attributes are specified for a #GFileInfo.
  *
  * #GFileAttributeMatcher allows for searching through a #GFileInfo for
  * attributes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileInfo private[gnome] (raw: Ptr[GFileInfo])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Clears the status information from @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearStatus(): Unit /* None */ =
    g_file_info_clear_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    )
  end clearStatus

  /** First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
    * and then copies all of the file attributes from @src_info to @dest_info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyInto(
      dest_info: sn.gnome.gio.FileInfo /* Some(Ptr[GFileInfo]) */
  )(using Runtime): Unit /* None */ =
    g_file_info_copy_into(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      dest_info.getUnsafeRawPointer().asInstanceOf
    )
  end copyInto

  /** Duplicates a file info structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dup()(using Runtime): sn.gnome.gio.FileInfo /* None */ =
    sn.gnome.gio.FileInfo.applyUnsafe(
      g_file_info_dup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end dup

  /** Gets the access time of the current @info and returns it as a #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_ACCESS. If %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is
    * provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC must
    * be queried separately using g_file_info_get_attribute_uint32().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessDateTime(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_file_info_get_access_date_time(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      )
    )
  end getAccessDateTime

  /** Gets the value of an attribute, formatted as a string. This escapes things
    * as needed to make the string valid UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeAsString(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_attribute_as_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      ).asInstanceOf
    )
  end getAttributeAsString

  /** Gets the value of a boolean attribute. If the attribute does not contain a
    * boolean value, %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeBoolean(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    g_file_info_get_attribute_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value.!=(0)
  end getAttributeBoolean

  /** Gets the value of a byte string attribute. If the attribute does not
    * contain a byte string, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeByteString(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_attribute_byte_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      ).asInstanceOf
    )
  end getAttributeByteString

  /** Gets the attribute type, value and status for an attribute key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attribute_data]: Method get_attribute_data contains an OUT parameter, which is not supported yet"
  )
  private def getAttributeData__ = ???

  /** Gets the value of a byte string attribute as a file path.
    *
    * If the attribute does not contain a byte string, `NULL` will be returned.
    *
    * This function is meant to be used by language bindings that have specific
    * handling for Unix paths.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeFilePath(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_attribute_file_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      ).asInstanceOf
    )
  end getAttributeFilePath

  /** Gets a signed 32-bit integer contained within the attribute. If the
    * attribute does not contain a signed 32-bit integer, or is invalid, 0 will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeInt32(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): CInt /* None */ =
    g_file_info_get_attribute_int32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value
  end getAttributeInt32

  /** Gets a signed 64-bit integer contained within the attribute. If the
    * attribute does not contain a signed 64-bit integer, or is invalid, 0 will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeInt64(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): CLongInt /* None */ =
    g_file_info_get_attribute_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value
  end getAttributeInt64

  /** Gets the value of a #GObject attribute. If the attribute does not contain
    * a #GObject, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeObject(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_file_info_get_attribute_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      ).asInstanceOf
    )
  end getAttributeObject

  /** Gets the attribute status for an attribute key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeStatus(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gio.FileAttributeStatus /* None */ =
    sn.gnome.gio.FileAttributeStatus.fromRaw(
      g_file_info_get_attribute_status(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      )
    )
  end getAttributeStatus

  /** Gets the value of a string attribute. If the attribute does not contain a
    * string, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeString(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_attribute_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      ).asInstanceOf
    )
  end getAttributeString

  /** Gets the value of a stringv attribute. If the attribute does not contain a
    * stringv, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeStringv(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Array[scala.Predef.String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        g_file_info_get_attribute_stringv(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
          summon[Runtime].inZone(toCString(attribute))
        )
      )
      .map(fromCString(_))
  end getAttributeStringv

  /** Gets the attribute type for an attribute key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeType(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gio.FileAttributeType /* None */ =
    sn.gnome.gio.FileAttributeType.fromRaw(
      g_file_info_get_attribute_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
        summon[Runtime].inZone(toCString(attribute))
      )
    )
  end getAttributeType

  /** Gets an unsigned 32-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 32-bit integer, or is invalid, 0
    * will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeUint32(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): UInt /* None */ =
    g_file_info_get_attribute_uint32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value
  end getAttributeUint32

  /** Gets a unsigned 64-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 64-bit integer, or is invalid, 0
    * will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeUint64(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): CUnsignedLongInt /* None */ =
    g_file_info_get_attribute_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value
  end getAttributeUint64

  /** Gets the file's content type.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentType(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_content_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getContentType

  /** Gets the creation time of the current @info and returns it as a
    * #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_CREATED. If %G_FILE_ATTRIBUTE_TIME_CREATED_USEC is
    * provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC
    * must be queried separately using g_file_info_get_attribute_uint32().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCreationDateTime(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_file_info_get_creation_date_time(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      )
    )
  end getCreationDateTime

  /** Returns the #GDateTime representing the deletion date of the file, as
    * available in %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
    * %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, %NULL is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeletionDate(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_file_info_get_deletion_date(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      )
    )
  end getDeletionDate

  /** Gets a display name for a file. This is guaranteed to always be set.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplayName(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_display_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getDisplayName

  /** Gets the edit name for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditName(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_edit_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getEditName

  /** Gets the [entity tag][gfile-etag] for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEtag(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_etag(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getEtag

  /** Gets a file's type (whether it is a regular file, symlink, etc). This is
    * different from the file's content type, see
    * g_file_info_get_content_type().
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileType(): sn.gnome.gio.FileType /* None */ =
    sn.gnome.gio.FileType.fromRaw(
      g_file_info_get_file_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      )
    )
  end getFileType

  /** Gets the icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): sn.gnome.gio.Icon /* None */ =
    new Icon.Abstract(
      g_file_info_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getIcon

  /** Checks if a file is a backup file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_BACKUP.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsBackup(): Boolean /* None */ =
    g_file_info_get_is_backup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    ).value.!=(0)
  end getIsBackup

  /** Checks if a file is hidden.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsHidden(): Boolean /* None */ =
    g_file_info_get_is_hidden(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    ).value.!=(0)
  end getIsHidden

  /** Checks if a file is a symlink.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsSymlink(): Boolean /* None */ =
    g_file_info_get_is_symlink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    ).value.!=(0)
  end getIsSymlink

  /** Gets the modification time of the current @info and returns it as a
    * #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC
    * is provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC
    * must be queried separately using g_file_info_get_attribute_uint32().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModificationDateTime(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_file_info_get_modification_date_time(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      )
    )
  end getModificationDateTime

  /** Gets the modification time of the current @info and sets it in @result.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC
    * is provided it will be used too.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_modification_time]: Method get_modification_time contains an OUT parameter, which is not supported yet"
  )
  private def getModificationTime__ = ???

  /** Gets the name for a file. This is guaranteed to always be set.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getName

  /** Gets the file's size (in bytes). The size is retrieved through the value
    * of the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute and is converted from
    * #guint64 to #goffset before returning the result.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SIZE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): gint64 /* None */ =
    g_file_info_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  end getSize

  /** Gets the value of the sort_order attribute from the #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortOrder(): CInt /* None */ =
    g_file_info_get_sort_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    ).value
  end getSortOrder

  /** Gets the symbolic icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymbolicIcon(): sn.gnome.gio.Icon /* None */ =
    new Icon.Abstract(
      g_file_info_get_symbolic_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getSymbolicIcon

  /** Gets the symlink target for a given #GFileInfo.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymlinkTarget(): scala.Predef.String /* None */ =
    fromCString(
      g_file_info_get_symlink_target(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
      ).asInstanceOf
    )
  end getSymlinkTarget

  /** Checks if a file info structure has an attribute named @attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasAttribute(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    g_file_info_has_attribute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    ).value.!=(0)
  end hasAttribute

  /** Checks if a file info structure has an attribute in the specified @name_space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasNamespace(
      name_space: scala.Predef.String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    g_file_info_has_namespace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(name_space))
    ).value.!=(0)
  end hasNamespace

  /** Lists the file info structure's attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def listAttributes(
      name_space: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): scala.Array[scala.Predef.String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        g_file_info_list_attributes(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
          name_space
            .map[CString](o => summon[Runtime].inZone(toCString(o)))
            .getOrElse(null.asInstanceOf[CString])
        )
      )
      .map(fromCString(_))
  end listAttributes

  /** Removes all cases of @attribute from @info if it exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAttribute(
      attribute: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_remove_attribute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute))
    )
  end removeAttribute

  /** Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessDateTime(
      atime: sn.gnome.glib.DateTime /* Some(Ptr[_root_.sn.gnome.glib.internal.GDateTime]) */
  ): Unit /* None */ =
    g_file_info_set_access_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      atime.getUnsafeRawPointer().asInstanceOf
    )
  end setAccessDateTime

  /** Sets the @attribute to contain the given value, if possible. To unset the
    * attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttribute(
      attribute: scala.Predef.String /* Some(CString) */,
      `type`: sn.gnome.gio.FileAttributeType /* Some(GFileAttributeType) */,
      value_p: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      `type`.raw,
      gpointer(value_p)
    )
  end setAttribute

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeBoolean(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      gboolean(gint((if attr_value == true then 1 else 0)))
    )
  end setAttributeBoolean

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeByteString(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_byte_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      summon[Runtime].inZone(toCString(attr_value))
    )
  end setAttributeByteString

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * This function is meant to be used by language bindings that have specific
    * handling for Unix paths.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeFilePath(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_file_path(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      summon[Runtime].inZone(toCString(attr_value))
    )
  end setAttributeFilePath

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt32(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_int32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      gint32(attr_value)
    )
  end setAttributeInt32

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt64(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      gint64(attr_value)
    )
  end setAttributeInt64

  /** Sets @mask on @info to match specific attribute types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeMask(
      mask: sn.gnome.gio.FileAttributeMatcher /* Some(Ptr[GFileAttributeMatcher]) */
  ): Unit /* None */ =
    g_file_info_set_attribute_mask(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      mask.getUnsafeRawPointer().asInstanceOf
    )
  end setAttributeMask

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeObject(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: sn.gnome.gobject.Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_object(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      attr_value.getUnsafeRawPointer().asInstanceOf
    )
  end setAttributeObject

  /** Sets the attribute status for an attribute key. This is only needed by
    * external code that implement g_file_set_attributes_from_info() or similar
    * functions.
    *
    * The attribute must exist in @info for this to work. Otherwise %FALSE is
    * returned and @info is unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeStatus(
      attribute: scala.Predef.String /* Some(CString) */,
      status: sn.gnome.gio.FileAttributeStatus /* Some(GFileAttributeStatus) */
  )(using Runtime): Boolean /* None */ =
    g_file_info_set_attribute_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      status.raw
    ).value.!=(0)
  end setAttributeStatus

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeString(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      summon[Runtime].inZone(toCString(attr_value))
    )
  end setAttributeString

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * Sinze: 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeStringv(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: scala.Array[scala.Predef.String] /* Some(Ptr[CString]) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_stringv(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(attr_value))
    )
  end setAttributeStringv

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint32(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_uint32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      guint32(attr_value)
    )
  end setAttributeUint32

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint64(
      attribute: scala.Predef.String /* Some(CString) */,
      attr_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_attribute_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(attribute)),
      guint64(attr_value)
    )
  end setAttributeUint64

  /** Sets the content type attribute for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setContentType(
      content_type: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_content_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(content_type))
    )
  end setContentType

  /** Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
    * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCreationDateTime(
      creation_time: sn.gnome.glib.DateTime /* Some(Ptr[_root_.sn.gnome.glib.internal.GDateTime]) */
  ): Unit /* None */ =
    g_file_info_set_creation_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      creation_time.getUnsafeRawPointer().asInstanceOf
    )
  end setCreationDateTime

  /** Sets the display name for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplayName(
      display_name: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_display_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(display_name))
    )
  end setDisplayName

  /** Sets the edit name for the current file. See
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEditName(
      edit_name: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_edit_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(edit_name))
    )
  end setEditName

  /** Sets the file type in a #GFileInfo to @type. See
    * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFileType(
      `type`: sn.gnome.gio.FileType /* Some(GFileType) */
  ): Unit /* None */ =
    g_file_info_set_file_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      `type`.raw
    )
  end setFileType

  /** Sets the icon for a given #GFileInfo. See %G_FILE_ATTRIBUTE_STANDARD_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(
      icon: sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */
  ): Unit /* None */ =
    g_file_info_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )
  end setIcon

  /** Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsHidden(
      is_hidden: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_file_info_set_is_hidden(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      gboolean(gint((if is_hidden == true then 1 else 0)))
    )
  end setIsHidden

  /** Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsSymlink(
      is_symlink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_file_info_set_is_symlink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      gboolean(gint((if is_symlink == true then 1 else 0)))
    )
  end setIsSymlink

  /** Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModificationDateTime(
      mtime: sn.gnome.glib.DateTime /* Some(Ptr[_root_.sn.gnome.glib.internal.GDateTime]) */
  ): Unit /* None */ =
    g_file_info_set_modification_date_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      mtime.getUnsafeRawPointer().asInstanceOf
    )
  end setModificationDateTime

  /** Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModificationTime(
      mtime: sn.gnome.glib.TimeVal /* Some(Ptr[_root_.sn.gnome.glib.internal.GTimeVal]) */
  ): Unit /* None */ =
    g_file_info_set_modification_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      mtime.getUnsafeRawPointer().asInstanceOf
    )
  end setModificationTime

  /** Sets the name attribute for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      name: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(name))
    )
  end setName

  /** Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info to the
    * given size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      size: gint64 /* Some(_root_.sn.gnome.glib.internal.goffset) */
  ): Unit /* None */ =
    g_file_info_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      goffset(size)
    )
  end setSize

  /** Sets the sort order attribute in the file info structure. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortOrder(
      sort_order: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  ): Unit /* None */ =
    g_file_info_set_sort_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      gint32(sort_order)
    )
  end setSortOrder

  /** Sets the symbolic icon for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSymbolicIcon(
      icon: sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */
  ): Unit /* None */ =
    g_file_info_set_symbolic_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )
  end setSymbolicIcon

  /** Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file
    * info to the given symlink target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSymlinkTarget(
      symlink_target: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    g_file_info_set_symlink_target(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]],
      summon[Runtime].inZone(toCString(symlink_target))
    )
  end setSymlinkTarget

  /** Unsets a mask set by g_file_info_set_attribute_mask(), if one is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetAttributeMask(): Unit /* None */ =
    g_file_info_unset_attribute_mask(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileInfo]]
    )
  end unsetAttributeMask

end FileInfo

object FileInfo:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GFileInfo])(using Runtime) = summon[Runtime]
    .getOrCreate[FileInfo](ptr.asInstanceOf[Ptr[Byte]], p => new FileInfo(ptr))

  /** Creates a new file info structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FileInfo =
    val raw: Ptr[Byte] = g_file_info_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FileInfo](raw, r => FileInfo.applyUnsafe(r.asInstanceOf))
  end apply
end FileInfo
