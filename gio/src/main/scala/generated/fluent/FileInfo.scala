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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Functionality for manipulating basic metadata for files. #GFileInfo
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
  */
class FileInfo(raw: Ptr[GFileInfo]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears the status information from @info.
    */
  def clearStatus(): Unit /* None */ = g_file_info_clear_status(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
    * and then copies all of the file attributes from @src_info to @dest_info.
    */
  def copyInto(
      dest_info: FileInfo /* Some(Ptr[GFileInfo]) */
  ): Unit /* None */ = g_file_info_copy_into(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    dest_info.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Duplicates a file info structure.
    */
  def dup(): FileInfo /* None */ = new FileInfo(
    g_file_info_dup(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the access time of the current @info and returns it as a #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_ACCESS. If %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is
    * provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC must
    * be queried separately using g_file_info_get_attribute_uint32().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def getAccessDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of an attribute, formatted as a string. This escapes things
    * as needed to make the string valid UTF-8.
    */
  def getAttributeAsString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_as_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a boolean attribute. If the attribute does not contain a
    * boolean value, %FALSE will be returned.
    */
  def getAttributeBoolean(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_get_attribute_boolean(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a byte string attribute. If the attribute does not
    * contain a byte string, %NULL will be returned.
    */
  def getAttributeByteString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_byte_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute type, value and status for an attribute key.
    */
  @annotation.compileTimeOnly(
    "Method get_attribute_data contains an OUT parameter, which is not supported yet"
  )
  def getAttributeData__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a byte string attribute as a file path.
    *
    * If the attribute does not contain a byte string, `NULL` will be returned.
    *
    * This function is meant to be used by language bindings that have specific
    * handling for Unix paths.
    */
  def getAttributeFilePath(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_file_path(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a signed 32-bit integer contained within the attribute. If the
    * attribute does not contain a signed 32-bit integer, or is invalid, 0 will
    * be returned.
    */
  def getAttributeInt32(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CInt /* None */ = g_file_info_get_attribute_int32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a signed 64-bit integer contained within the attribute. If the
    * attribute does not contain a signed 64-bit integer, or is invalid, 0 will
    * be returned.
    */
  def getAttributeInt64(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CLongInt /* None */ = g_file_info_get_attribute_int64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a #GObject attribute. If the attribute does not contain
    * a #GObject, %NULL will be returned.
    */
  def getAttributeObject(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Object /* None */ = new Object(
    g_file_info_get_attribute_object(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute status for an attribute key.
    */
  def getAttributeStatus(
      attribute: String | CString /* Some(CString) */
  )(using Zone): FileAttributeStatus /* None */ = FileAttributeStatus.fromRaw(
    g_file_info_get_attribute_status(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a string attribute. If the attribute does not contain a
    * string, %NULL will be returned.
    */
  def getAttributeString(
      attribute: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    g_file_info_get_attribute_string(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of a stringv attribute. If the attribute does not contain a
    * stringv, %NULL will be returned.
    */
  def getAttributeStringv(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Array[String] /* None */ = __decode_nullable_ptrs(
    g_file_info_get_attribute_stringv(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    )
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute type for an attribute key.
    */
  def getAttributeType(
      attribute: String | CString /* Some(CString) */
  )(using Zone): FileAttributeType /* None */ = FileAttributeType.fromRaw(
    g_file_info_get_attribute_type(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      __sn_extract_string(attribute)
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets an unsigned 32-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 32-bit integer, or is invalid, 0
    * will be returned.
    */
  def getAttributeUint32(
      attribute: String | CString /* Some(CString) */
  )(using Zone): UInt /* None */ = g_file_info_get_attribute_uint32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a unsigned 64-bit integer contained within the attribute. If the
    * attribute does not contain an unsigned 64-bit integer, or is invalid, 0
    * will be returned.
    */
  def getAttributeUint64(
      attribute: String | CString /* Some(CString) */
  )(using Zone): CUnsignedLongInt /* None */ = g_file_info_get_attribute_uint64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file's content type.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    */
  def getContentType()(using Zone): String /* None */ = fromCString(
    g_file_info_get_content_type(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the creation time of the current @info and returns it as a
    * #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_CREATED. If %G_FILE_ATTRIBUTE_TIME_CREATED_USEC is
    * provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC
    * must be queried separately using g_file_info_get_attribute_uint32().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def getCreationDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GDateTime representing the deletion date of the file, as
    * available in %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
    * %G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, %NULL is
    * returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def getDeletionDate__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a display name for a file. This is guaranteed to always be set.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    */
  def getDisplayName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_display_name(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the edit name for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    */
  def getEditName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_edit_name(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the [entity tag][gfile-etag] for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_ETAG_VALUE.
    */
  def getEtag()(using Zone): String /* None */ = fromCString(
    g_file_info_get_etag(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a file's type (whether it is a regular file, symlink, etc). This is
    * different from the file's content type, see
    * g_file_info_get_content_type().
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
    */
  def getFileType(): FileType /* None */ = FileType.fromRaw(
    g_file_info_get_file_type(this.raw.asInstanceOf[Ptr[GFileInfo]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_ICON.
    */
  def getIcon(): Icon /* None */ = new Icon.Abstract(
    g_file_info_get_icon(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a file is a backup file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_BACKUP.
    */
  def getIsBackup(): Boolean /* None */ =
    g_file_info_get_is_backup(this.raw.asInstanceOf[Ptr[GFileInfo]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a file is hidden.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    */
  def getIsHidden(): Boolean /* None */ =
    g_file_info_get_is_hidden(this.raw.asInstanceOf[Ptr[GFileInfo]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a file is a symlink.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    */
  def getIsSymlink(): Boolean /* None */ = g_file_info_get_is_symlink(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the modification time of the current @info and returns it as a
    * #GDateTime.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC
    * is provided, the resulting #GDateTime will additionally have microsecond
    * precision.
    *
    * If nanosecond precision is needed, %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC
    * must be queried separately using g_file_info_get_attribute_uint32().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def getModificationDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the modification time of the current @info and sets it in @result.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED. If %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC
    * is provided it will be used too.
    */
  @annotation.compileTimeOnly(
    "Method get_modification_time contains an OUT parameter, which is not supported yet"
  )
  def getModificationTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name for a file. This is guaranteed to always be set.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_NAME.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    g_file_info_get_name(this.raw.asInstanceOf[Ptr[GFileInfo]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file's size (in bytes). The size is retrieved through the value
    * of the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute and is converted from
    * #guint64 to #goffset before returning the result.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SIZE.
    */
  def getSize(): gint64 /* None */ = g_file_info_get_size(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of the sort_order attribute from the #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    */
  def getSortOrder(): CInt /* None */ = g_file_info_get_sort_order(
    this.raw.asInstanceOf[Ptr[GFileInfo]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the symbolic icon for a file.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    */
  def getSymbolicIcon(): Icon /* None */ = new Icon.Abstract(
    g_file_info_get_symbolic_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the symlink target for a given #GFileInfo.
    *
    * It is an error to call this if the #GFileInfo does not contain
    * %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET.
    */
  def getSymlinkTarget()(using Zone): String /* None */ = fromCString(
    g_file_info_get_symlink_target(
      this.raw.asInstanceOf[Ptr[GFileInfo]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a file info structure has an attribute named @attribute.
    */
  def hasAttribute(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_has_attribute(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a file info structure has an attribute in the specified @name_space.
    */
  def hasNamespace(
      name_space: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = g_file_info_has_namespace(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(name_space)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lists the file info structure's attributes.
    */
  def listAttributes(
      name_space: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Array[String] /* None */ = __decode_nullable_ptrs(
    g_file_info_list_attributes(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      name_space
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all cases of @attribute from @info if it exists.
    */
  def removeAttribute(
      attribute: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_remove_attribute(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC will be cleared.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def setAccessDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given value, if possible. To unset the
    * attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for @type.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeBoolean(
      attribute: String | CString /* Some(CString) */,
      attr_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_boolean(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gboolean(gint((if attr_value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeByteString(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_byte_string(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    *
    * This function is meant to be used by language bindings that have specific
    * handling for Unix paths.
    */
  def setAttributeFilePath(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_file_path(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeInt32(
      attribute: String | CString /* Some(CString) */,
      attr_value: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_int32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gint32(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeInt64(
      attribute: String | CString /* Some(CString) */,
      attr_value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_int64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    gint64(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @mask on @info to match specific attribute types.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FileAttributeMatcher), @type -> DataRecord(GFileAttributeMatcher*)))"
  )
  def setAttributeMask__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeObject(
      attribute: String | CString /* Some(CString) */,
      attr_value: Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_object(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    attr_value.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the attribute status for an attribute key. This is only needed by
    * external code that implement g_file_set_attributes_from_info() or similar
    * functions.
    *
    * The attribute must exist in @info for this to work. Otherwise %FALSE is
    * returned and @info is unchanged.
    */
  def setAttributeStatus(
      attribute: String | CString /* Some(CString) */,
      status: FileAttributeStatus /* Some(GFileAttributeStatus) */
  )(using Zone): Boolean /* None */ = g_file_info_set_attribute_status(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    status.raw
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeString(
      attribute: String | CString /* Some(CString) */,
      attr_value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_string(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    *
    * Sinze: 2.22
    */
  def setAttributeStringv(
      attribute: String | CString /* Some(CString) */,
      attr_value: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_stringv(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    attr_value.map(__sn_extract_string).atUnsafe(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeUint32(
      attribute: String | CString /* Some(CString) */,
      attr_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_uint32(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    guint32(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @attribute to contain the given @attr_value, if possible.
    */
  def setAttributeUint64(
      attribute: String | CString /* Some(CString) */,
      attr_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */
  )(using Zone): Unit /* None */ = g_file_info_set_attribute_uint64(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(attribute),
    guint64(attr_value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the content type attribute for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
    */
  def setContentType(
      content_type: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_content_type(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(content_type)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
    * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_CREATED_NSEC will be cleared.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def setCreationDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the display name for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
    */
  def setDisplayName(
      display_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_display_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(display_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the edit name for the current file. See
    * %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
    */
  def setEditName(
      edit_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_edit_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(edit_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file type in a #GFileInfo to @type. See
    * %G_FILE_ATTRIBUTE_STANDARD_TYPE.
    */
  def setFileType(`type`: FileType /* Some(GFileType) */ ): Unit /* None */ =
    g_file_info_set_file_type(this.raw.asInstanceOf[Ptr[GFileInfo]], `type`.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon for a given #GFileInfo. See %G_FILE_ATTRIBUTE_STANDARD_ICON.
    */
  def setIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_file_info_set_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
    */
  def setIsHidden(
      is_hidden: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_file_info_set_is_hidden(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gboolean(gint((if is_hidden == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
    * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
    */
  def setIsSymlink(
      is_symlink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_file_info_set_is_symlink(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gboolean(gint((if is_symlink == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given date/time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DateTime), @type -> DataRecord(GDateTime*)))"
  )
  def setModificationDateTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
    * given time value.
    *
    * %G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC will be cleared.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(GTimeVal*)))"
  )
  def setModificationTime__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name attribute for the current #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_NAME.
    */
  def setName(
      name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_name(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info to the
    * given size.
    */
  def setSize(
      size: gint64 /* Some(_root_.sn.gnome.glib.internal.goffset) */
  ): Unit /* None */ =
    g_file_info_set_size(this.raw.asInstanceOf[Ptr[GFileInfo]], goffset(size))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sort order attribute in the file info structure. See
    * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
    */
  def setSortOrder(
      sort_order: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  ): Unit /* None */ = g_file_info_set_sort_order(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    gint32(sort_order)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the symbolic icon for a given #GFileInfo. See
    * %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
    */
  def setSymbolicIcon(icon: Icon /* Some(Ptr[GIcon]) */ ): Unit /* None */ =
    g_file_info_set_symbolic_icon(
      this.raw.asInstanceOf[Ptr[GFileInfo]],
      icon.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file
    * info to the given symlink target.
    */
  def setSymlinkTarget(
      symlink_target: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_file_info_set_symlink_target(
    this.raw.asInstanceOf[Ptr[GFileInfo]],
    __sn_extract_string(symlink_target)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unsets a mask set by g_file_info_set_attribute_mask(), if one is set.
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

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end FileInfo

object FileInfo:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new file info structure.
    */
  def apply(): FileInfo = new FileInfo(g_file_info_new().asInstanceOf)
end FileInfo
