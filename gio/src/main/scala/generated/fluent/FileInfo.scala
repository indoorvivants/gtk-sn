package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.FileInfo
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GFileAttributeMatcher
import sn.gnome.gio.internal.GFileAttributeStatus
import sn.gnome.gio.internal.GFileAttributeType
import sn.gnome.gio.internal.GFileInfo
import sn.gnome.gio.internal.GFileType
import sn.gnome.glib.internal.GDateTime
import sn.gnome.glib.internal.GTimeVal
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint32
import sn.gnome.glib.internal.gint64
import sn.gnome.glib.internal.goffset
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.guint64
import sn.gnome.gobject.fluent.Object

class FileInfo(raw: Ptr[GFileInfo]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearStatus(): Unit = g_file_info_clear_status(this.raw.asInstanceOf)

  def copyInto(dest_info: FileInfo): Unit = g_file_info_copy_into(
    this.raw.asInstanceOf,
    dest_info.getUnsafeRawPointer().asInstanceOf
  )

  def dup(): FileInfo = new FileInfo(
    g_file_info_dup(this.raw.asInstanceOf).asInstanceOf
  )

  def getAccessDateTime(): Ptr[GDateTime] = g_file_info_get_access_date_time(
    this.raw.asInstanceOf
  )

  def getAttributeAsString(attribute: String | CString)(using Zone): String =
    fromCString(
      g_file_info_get_attribute_as_string(
        this.raw.asInstanceOf,
        __sn_extract_string(attribute)
      ).asInstanceOf
    )

  def getAttributeBoolean(attribute: String | CString)(using Zone): Boolean =
    g_file_info_get_attribute_boolean(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    ).value.!=(0)

  def getAttributeByteString(attribute: String | CString)(using Zone): String =
    fromCString(
      g_file_info_get_attribute_byte_string(
        this.raw.asInstanceOf,
        __sn_extract_string(attribute)
      ).asInstanceOf
    )

  // Method get_attribute_data contains an OUT parameter, which is not supported yet

  def getAttributeFilePath(attribute: String | CString)(using Zone): String =
    fromCString(
      g_file_info_get_attribute_file_path(
        this.raw.asInstanceOf,
        __sn_extract_string(attribute)
      ).asInstanceOf
    )

  def getAttributeInt32(attribute: String | CString)(using Zone): CInt =
    g_file_info_get_attribute_int32(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    ).value

  def getAttributeInt64(attribute: String | CString)(using Zone): CLongInt =
    g_file_info_get_attribute_int64(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    ).value

  def getAttributeObject(attribute: String | CString)(using Zone): Object =
    new Object(
      g_file_info_get_attribute_object(
        this.raw.asInstanceOf,
        __sn_extract_string(attribute)
      ).asInstanceOf
    )

  def getAttributeStatus(
      attribute: String | CString
  )(using Zone): GFileAttributeStatus = g_file_info_get_attribute_status(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute)
  )

  def getAttributeString(attribute: String | CString)(using Zone): String =
    fromCString(
      g_file_info_get_attribute_string(
        this.raw.asInstanceOf,
        __sn_extract_string(attribute)
      ).asInstanceOf
    )

  def getAttributeType(
      attribute: String | CString
  )(using Zone): GFileAttributeType = g_file_info_get_attribute_type(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute)
  )

  def getAttributeUint32(attribute: String | CString)(using Zone): UInt =
    g_file_info_get_attribute_uint32(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    ).value

  def getAttributeUint64(
      attribute: String | CString
  )(using Zone): CUnsignedLongInt = g_file_info_get_attribute_uint64(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute)
  ).value

  def getContentType()(using Zone): String = fromCString(
    g_file_info_get_content_type(this.raw.asInstanceOf).asInstanceOf
  )

  def getCreationDateTime(): Ptr[GDateTime] =
    g_file_info_get_creation_date_time(this.raw.asInstanceOf)

  def getDeletionDate(): Ptr[GDateTime] = g_file_info_get_deletion_date(
    this.raw.asInstanceOf
  )

  def getDisplayName()(using Zone): String = fromCString(
    g_file_info_get_display_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getEditName()(using Zone): String = fromCString(
    g_file_info_get_edit_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getEtag()(using Zone): String = fromCString(
    g_file_info_get_etag(this.raw.asInstanceOf).asInstanceOf
  )

  def getFileType(): GFileType = g_file_info_get_file_type(
    this.raw.asInstanceOf
  )

  def getIcon(): Icon =
    new Icon.Abstract(g_file_info_get_icon(this.raw.asInstanceOf).asInstanceOf)

  def getIsBackup(): Boolean =
    g_file_info_get_is_backup(this.raw.asInstanceOf).value.!=(0)

  def getIsHidden(): Boolean =
    g_file_info_get_is_hidden(this.raw.asInstanceOf).value.!=(0)

  def getIsSymlink(): Boolean =
    g_file_info_get_is_symlink(this.raw.asInstanceOf).value.!=(0)

  def getModificationDateTime(): Ptr[GDateTime] =
    g_file_info_get_modification_date_time(this.raw.asInstanceOf)

  // Method get_modification_time contains an OUT parameter, which is not supported yet

  def getName()(using Zone): String = fromCString(
    g_file_info_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getSize(): gint64 = g_file_info_get_size(
    this.raw.asInstanceOf
  ).asInstanceOf

  def getSortOrder(): CInt = g_file_info_get_sort_order(
    this.raw.asInstanceOf
  ).value

  def getSymbolicIcon(): Icon = new Icon.Abstract(
    g_file_info_get_symbolic_icon(this.raw.asInstanceOf).asInstanceOf
  )

  def getSymlinkTarget()(using Zone): String = fromCString(
    g_file_info_get_symlink_target(this.raw.asInstanceOf).asInstanceOf
  )

  def hasAttribute(attribute: String | CString)(using Zone): Boolean =
    g_file_info_has_attribute(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    ).value.!=(0)

  def hasNamespace(name_space: String | CString)(using Zone): Boolean =
    g_file_info_has_namespace(
      this.raw.asInstanceOf,
      __sn_extract_string(name_space)
    ).value.!=(0)

  def removeAttribute(attribute: String | CString)(using Zone): Unit =
    g_file_info_remove_attribute(
      this.raw.asInstanceOf,
      __sn_extract_string(attribute)
    )

  def setAccessDateTime(atime: Ptr[GDateTime]): Unit =
    g_file_info_set_access_date_time(this.raw.asInstanceOf, atime)

  def setAttribute(
      attribute: String | CString,
      `type`: GFileAttributeType,
      value_p: Ptr[Byte]
  )(using Zone): Unit = g_file_info_set_attribute(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    `type`,
    gpointer(value_p)
  )

  def setAttributeBoolean(attribute: String | CString, attr_value: Boolean)(
      using Zone
  ): Unit = g_file_info_set_attribute_boolean(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    gboolean(gint((if attr_value == true then 1 else 0)))
  )

  def setAttributeByteString(
      attribute: String | CString,
      attr_value: String | CString
  )(using Zone): Unit = g_file_info_set_attribute_byte_string(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  def setAttributeFilePath(
      attribute: String | CString,
      attr_value: String | CString
  )(using Zone): Unit = g_file_info_set_attribute_file_path(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  def setAttributeInt32(attribute: String | CString, attr_value: CInt)(using
      Zone
  ): Unit = g_file_info_set_attribute_int32(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    gint32(attr_value)
  )

  def setAttributeInt64(attribute: String | CString, attr_value: CLongInt)(using
      Zone
  ): Unit = g_file_info_set_attribute_int64(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    gint64(attr_value)
  )

  def setAttributeMask(mask: Ptr[GFileAttributeMatcher]): Unit =
    g_file_info_set_attribute_mask(this.raw.asInstanceOf, mask)

  def setAttributeObject(attribute: String | CString, attr_value: Object)(using
      Zone
  ): Unit = g_file_info_set_attribute_object(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    attr_value.getUnsafeRawPointer().asInstanceOf
  )

  def setAttributeStatus(
      attribute: String | CString,
      status: GFileAttributeStatus
  )(using Zone): Boolean = g_file_info_set_attribute_status(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    status
  ).value.!=(0)

  def setAttributeString(
      attribute: String | CString,
      attr_value: String | CString
  )(using Zone): Unit = g_file_info_set_attribute_string(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    __sn_extract_string(attr_value)
  )

  // Method set_attribute_stringv contains an array parameter, which is not supported yet

  def setAttributeUint32(attribute: String | CString, attr_value: UInt)(using
      Zone
  ): Unit = g_file_info_set_attribute_uint32(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    guint32(attr_value)
  )

  def setAttributeUint64(
      attribute: String | CString,
      attr_value: CUnsignedLongInt
  )(using Zone): Unit = g_file_info_set_attribute_uint64(
    this.raw.asInstanceOf,
    __sn_extract_string(attribute),
    guint64(attr_value)
  )

  def setContentType(content_type: String | CString)(using Zone): Unit =
    g_file_info_set_content_type(
      this.raw.asInstanceOf,
      __sn_extract_string(content_type)
    )

  def setCreationDateTime(creation_time: Ptr[GDateTime]): Unit =
    g_file_info_set_creation_date_time(this.raw.asInstanceOf, creation_time)

  def setDisplayName(display_name: String | CString)(using Zone): Unit =
    g_file_info_set_display_name(
      this.raw.asInstanceOf,
      __sn_extract_string(display_name)
    )

  def setEditName(edit_name: String | CString)(using Zone): Unit =
    g_file_info_set_edit_name(
      this.raw.asInstanceOf,
      __sn_extract_string(edit_name)
    )

  def setFileType(`type`: GFileType): Unit =
    g_file_info_set_file_type(this.raw.asInstanceOf, `type`)

  def setIcon(icon: Icon): Unit = g_file_info_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setIsHidden(is_hidden: Boolean): Unit = g_file_info_set_is_hidden(
    this.raw.asInstanceOf,
    gboolean(gint((if is_hidden == true then 1 else 0)))
  )

  def setIsSymlink(is_symlink: Boolean): Unit = g_file_info_set_is_symlink(
    this.raw.asInstanceOf,
    gboolean(gint((if is_symlink == true then 1 else 0)))
  )

  def setModificationDateTime(mtime: Ptr[GDateTime]): Unit =
    g_file_info_set_modification_date_time(this.raw.asInstanceOf, mtime)

  def setModificationTime(mtime: Ptr[GTimeVal]): Unit =
    g_file_info_set_modification_time(this.raw.asInstanceOf, mtime)

  def setName(name: String | CString)(using Zone): Unit =
    g_file_info_set_name(this.raw.asInstanceOf, __sn_extract_string(name))

  def setSize(size: gint64): Unit =
    g_file_info_set_size(this.raw.asInstanceOf, goffset(size))

  def setSortOrder(sort_order: CInt): Unit =
    g_file_info_set_sort_order(this.raw.asInstanceOf, gint32(sort_order))

  def setSymbolicIcon(icon: Icon): Unit = g_file_info_set_symbolic_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setSymlinkTarget(symlink_target: String | CString)(using Zone): Unit =
    g_file_info_set_symlink_target(
      this.raw.asInstanceOf,
      __sn_extract_string(symlink_target)
    )

  def unsetAttributeMask(): Unit = g_file_info_unset_attribute_mask(
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
end FileInfo

object FileInfo:
  def apply(): FileInfo = new FileInfo(g_file_info_new().asInstanceOf)
end FileInfo
