package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  FileAttributeInfo,
  FileAttributeInfoFlags,
  FileAttributeInfoList,
  FileAttributeType
}
import sn.gnome.gio.internal.GFileAttributeInfoList

/** Acts as a lightweight registry for possible valid file attributes. The
  * registry stores Key-Value pair formats as #GFileAttributeInfos.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileAttributeInfoList private[gnome] (raw: Ptr[GFileAttributeInfoList]):

  def getUnsafeRawPointer(): Ptr[GFileAttributeInfoList] = this.raw

  /** an array of #GFileAttributeInfos.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def infos: sn.gnome.gio.FileAttributeInfo /* None */ =
    (!raw).infos.asInstanceOf[Ptr[GFileAttributeInfo]]

  /** an array of #GFileAttributeInfos.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def infos_=(value: sn.gnome.gio.FileAttributeInfo /* None */ ): Unit =
    (!raw).infos_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[Ptr[GFileAttributeInfo]]
    )

  /** the number of values in the array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nInfos: Int /* None */ = (!raw).n_infos.asInstanceOf[CInt]

  /** the number of values in the array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nInfos_=(value: Int /* None */ ): Unit =
    (!raw).n_infos_=(value.asInstanceOf[CInt])

  /** Adds a new attribute with @name to the @list, setting its @type and @flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(
      name: scala.Predef.String /* Some(CString) */,
      `type`: sn.gnome.gio.FileAttributeType /* Some(GFileAttributeType) */,
      flags: sn.gnome.gio.FileAttributeInfoFlags /* Some(GFileAttributeInfoFlags) */
  )(using Zone): Unit /* None */ =
    g_file_attribute_info_list_add(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeInfoList]],
      toCString(name),
      `type`.raw,
      flags.raw
    )
  end add

  /** Makes a duplicate of a file attribute info list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dup(): sn.gnome.gio.FileAttributeInfoList /* None */ =
    sn.gnome.gio.FileAttributeInfoList.fromRaw(
      g_file_attribute_info_list_dup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeInfoList]]
      )
    )
  end dup

  /** Gets the file attribute with the name @name from @list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      name: scala.Predef.String /* Some(CString) */
  )(using Zone): sn.gnome.gio.FileAttributeInfo /* None */ =
    sn.gnome.gio.FileAttributeInfo.fromRaw(
      g_file_attribute_info_list_lookup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeInfoList]],
        toCString(name)
      )
    )
  end lookup

  /** References a file attribute info list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.FileAttributeInfoList /* None */ =
    sn.gnome.gio.FileAttributeInfoList.fromRaw(
      g_file_attribute_info_list_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeInfoList]]
      )
    )
  end ref

  /** Removes a reference from the given @list. If the reference count falls to
    * zero, the @list is deleted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_file_attribute_info_list_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GFileAttributeInfoList]]
    )
  end unref

end FileAttributeInfoList

object FileAttributeInfoList:
  def fromRaw(ptr: Ptr[GFileAttributeInfoList]): FileAttributeInfoList =
    new FileAttributeInfoList(ptr)
end FileAttributeInfoList
