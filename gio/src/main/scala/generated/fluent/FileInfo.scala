package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  FileAttributeStatus,
  FileAttributeType,
  FileInfo,
  FileType,
  Icon
}
import sn.gnome.gio.internal.GFileInfo
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
import sn.gnome.gobject.fluent.Object
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
class FileInfo(raw: Ptr[GFileInfo]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Clears the status information from @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearStatus(): Unit /* None */ = g_file_info_clear_status(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  )

  /** First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
    * and then copies all of the file attributes from @src_info to @dest_info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyInto(
      dest_info: FileInfo /* Some(Ptr[GFileInfo]) */
  ): Unit /* None */ = g_file_info_copy_into(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    dest_info.getUnsafeRawPointer().asInstanceOf
  )

  /** Duplicates a file info structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dup(): FileInfo /* None */ = new FileInfo(
    g_file_info_dup(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

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
  @annotation.compileTimeOnly(
    "[method get_access_date_time/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def getAccessDateTime__ = ???

  /** Gets the value of an attribute, formatted as a string. This escapes things
    * as needed to make the string valid UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeAsString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_as_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** Gets the value of a boolean attribute. If the attribute does not contain a
    * boolean value, %FALSE will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeBoolean(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_get_attribute_boolean(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value.!=(0)

  /** Gets the value of a byte string attribute. If the attribute does not
    * contain a byte string, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeByteString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_byte_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

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
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_file_path(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** Gets a signed 32-bit integer contained within the attribute. If the
    * attribute does not contain a signed 32-bit integer, or is invalid, 0 will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeInt32(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CInt /* None */ = g_file_info_get_attribute_int32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** Gets a signed 64-bit integer contained within the attribute. If the
    * attribute does not contain a signed 64-bit integer, or is invalid, 0 will
    * be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeInt64(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CLongInt /* None */ = g_file_info_get_attribute_int64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** Gets the value of a #GObject attribute. If the attribute does not contain
    * a #GObject, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeObject(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Object /* None */ = new Object(
    g_file_info_get_attribute_object(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** Gets the attribute status for an attribute key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeStatus(
      attribute: String | CString /* Some(CString) */
  )(using Zone): FileAttributeStatus /* None */ = FileAttributeStatus.fromRaw(
    g_file_info_get_attribute_status(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    )
  )

  /** Gets the value of a string attribute. If the attribute does not contain a
    * string, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** Gets the value of a stringv attribute. If the attribute does not contain a
    * stringv, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeStringv(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      g_file_info_get_attribute_stringv(
        this.raw.asInstanceOf[Ptr[GFileInfo]],
        __sn_extract_string(attribute)
      )
    )
    .map(fromCString(_))

  /** Gets the attribute type for an attribute key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeType(
      attribute: String | CString /* Some(CString) */
  )(using Zone): FileAttributeType /* None */ = FileAttributeType.fromRaw(
    g_file_info_get_attribute_type(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    )
  )

  /** Gets an unsigned 32-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 32-bit integer, or is invalid, 0
    * will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeUint32(
      attribute: String | CString /* Some(CString) */
  )(using Zone): UInt /* None */ = g_file_info_get_attribute_uint32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** Gets a unsigned 64-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 64-bit integer, or is invalid, 0
    * will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributeUint64(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CUnsignedLongInt /* None */ = g_file_info_get_attribute_uint64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** Gets the file's content type.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentType()(using Zone): String /* None */ = fromCString(
    g_file_info_get_content_type(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

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
  @annotation.compileTimeOnly(
    "[method get_creation_date_time/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def getCreationDateTime__ = ???

  /** Returns the #GDateTime representing the deletion date of the file, as
    * available in %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
    * %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, %NULL is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_deletion_date/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def getDeletionDate__ = ???

  /** Gets a display name for a file. This is guaranteed to always be set.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplayName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_display_name(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** Gets the edit name for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_edit_name(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** Gets the [entity tag][gfile-etag] for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEtag()(using Zone): String /* None */ = fromCString(
    g_file_info_get_etag(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

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
  def getFileType(): FileType /* None */ = FileType.fromRaw(
    g_file_info_get_file_type(this.raw.asInstanceOf[Ptr[GFileInfo]])
  )

  /** Gets the icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ = new Icon.Abstract(
    g_file_info_get_icon(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

  /** Checks if a file is a backup file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_BACKUP.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsBackup(): Boolean /* None */ =
    g_file_info_get_is_backup(this.raw.asInstanceOf[Ptr[GFileInfo]]).value.!=(0)

  /** Checks if a file is hidden.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsHidden(): Boolean /* None */ =
    g_file_info_get_is_hidden(this.raw.asInstanceOf[Ptr[GFileInfo]]).value.!=(0)

  /** Checks if a file is a symlink.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsSymlink(): Boolean /* None */ = g_file_info_get_is_symlink(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).value.!=(0)

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
  @annotation.compileTimeOnly(
    "[method get_modification_date_time/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def getModificationDateTime__ = ???

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
  def getName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_name(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

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
  def getSize(): gint64 /* None */ = g_file_info_get_size(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).asInstanceOf

  /** Gets the value of the sort_order attribute from the #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSortOrder(): CInt /* None */ = g_file_info_get_sort_order(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).value

  /** Gets the symbolic icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymbolicIcon(): Icon /* None */ = new Icon.Abstract(
    g_file_info_get_symbolic_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** Gets the symlink target for a given #GFileInfo.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSymlinkTarget()(using Zone): String /* None */ = fromCString(
    g_file_info_get_symlink_target(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** Checks if a file info structure has an attribute named @attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasAttribute(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_has_attribute(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value.!=(0)

  /** Checks if a file info structure has an attribute in the specified @name_space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasNamespace(
      name_space: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_has_namespace(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(name_space)
  ).value.!=(0)

  /** Lists the file info structure's attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def listAttributes(
      name_space: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      g_file_info_list_attributes(
        this.raw.asInstanceOf[Ptr[GFileInfo]],
        name_space
          .map[CString](o => __sn_extract_string(o))
          .getOrElse(null.asInstanceOf[CString])
      )
    )
    .map(fromCString(_))

  /** Removes all cases of @attribute from @info if it exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAttribute(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_remove_attribute(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  )

  /** Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_access_date_time/<method parameters>/atime]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def setAccessDateTime__ = ???

  /** Sets the @attribute to contain the given value, if possible. To unset the
    * attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttribute(
      attribute: String | CString /* Some(CString) */,
      `type`: FileAttributeType /* Some(GFileAttributeType) */,
      value_p: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    `type`.raw,
    gpointer(value_p)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeBoolean(
      attribute: String | CString /* Some(CString) */,
      attr_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_boolean(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gboolean(gint((if attr_value == true then 1 else 0)))
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeByteString(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_byte_string(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * This function is meant to be used by language bindings that have specific
    * handling for Unix paths.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeFilePath(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_file_path(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt32(
      attribute: String | CString /* Some(CString) */,
      attr_value: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_int32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gint32(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeInt64(
      attribute: String | CString /* Some(CString) */,
      attr_value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_int64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gint64(attr_value)
  )

  /** Sets @mask on @info to match specific attribute types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attribute_mask/<method parameters>/mask]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FileAttributeMatcher), @type -> DataRecord(GFileAttributeMatcher*)))"
  )
  private def setAttributeMask__ = ???

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeObject(
      attribute: String | CString /* Some(CString) */,
      attr_value: Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_object(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    attr_value.getUnsafeRawPointer().asInstanceOf
  )

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
      attribute: String | CString /* Some(CString) */,
      status: FileAttributeStatus /* Some(GFileAttributeStatus) */
  )(using Zone): Boolean /* None */ = g_file_info_set_attribute_status(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    status.raw
  ).value.!=(0)

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeString(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_string(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * Sinze: 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeStringv(
      attribute: String | CString /* Some(CString) */,
      attr_value: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_stringv(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    MemoryWrite.nullTerminatedStringArray(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint32(
      attribute: String | CString /* Some(CString) */,
      attr_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_uint32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    guint32(attr_value)
  )

  /** Sets the @attribute to contain the given @attr_value, if possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributeUint64(
      attribute: String | CString /* Some(CString) */,
      attr_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_uint64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    guint64(attr_value)
  )

  /** Sets the content type attribute for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setContentType(
      content_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_content_type(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(content_type)
  )

  /** Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
    * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_creation_date_time/<method parameters>/creation_time]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def setCreationDateTime__ = ???

  /** Sets the display name for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplayName(
      display_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_display_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(display_name)
  )

  /** Sets the edit name for the current file. See
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEditName(
      edit_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_edit_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(edit_name)
  )

  /** Sets the file type in a #GFileInfo to @type. See
    * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFileType(`type`: FileType /* Some(GFileType) */ ): Unit /* None */ =
    g_file_info_set_file_type(this.raw.asInstanceOf[Ptr[GFileInfo]], `type`.raw)

  /** Sets the icon for a given #GFileInfo. See %G_FILE_ATTRIBUTE_STANDARD_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_file_info_set_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )

  /** Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsHidden(
      is_hidden: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_file_info_set_is_hidden(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gboolean(gint((if is_hidden == true then 1 else 0)))
  )

  /** Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIsSymlink(
      is_symlink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_file_info_set_is_symlink(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gboolean(gint((if is_symlink == true then 1 else 0)))
  )

  /** Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_modification_date_time/<method parameters>/mtime]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  private def setModificationDateTime__ = ???

  /** Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_modification_time/<method parameters>/mtime]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(GTimeVal*)))"
  )
  private def setModificationTime__ = ???

  /** Sets the name attribute for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_NAME.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(name)
  )

  /** Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info to the
    * given size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      size: gint64 /* Some(_root_.sn.gnome.glib.internal.goffset) */
  ): Unit /* None */ =
    g_file_info_set_size(this.raw.asInstanceOf[Ptr[GFileInfo]], goffset(size))

  /** Sets the sort order attribute in the file info structure. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortOrder(
      sort_order: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  ): Unit /* None */ = g_file_info_set_sort_order(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gint32(sort_order)
  )

  /** Sets the symbolic icon for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSymbolicIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_file_info_set_symbolic_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )

  /** Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file
    * info to the given symlink target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSymlinkTarget(
      symlink_target: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_symlink_target(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(symlink_target)
  )

  /** Unsets a mask set by g_file_info_set_attribute_mask(), if one is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetAttributeMask(): Unit /* None */ = g_file_info_unset_attribute_mask(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileInfo

object FileInfo:
  /** Creates a new file info structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): FileInfo = new FileInfo(g_file_info_new().asInstanceOf)
end FileInfo
