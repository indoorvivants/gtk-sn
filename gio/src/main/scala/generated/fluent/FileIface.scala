package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileIface
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.TypeInterface

/** An interface for writing VFS file handles.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileIface private[gnome] (raw: Ptr[GFileIface]):

  def getUnsafeRawPointer(): Ptr[GFileIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field dup]: Field is missing <type>")
  private def dup__ = ???
  @annotation.compileTimeOnly("[field hash]: Field is missing <type>")
  private def hash__ = ???
  @annotation.compileTimeOnly("[field equal]: Field is missing <type>")
  private def equal__ = ???
  @annotation.compileTimeOnly("[field is_native]: Field is missing <type>")
  private def isNative__ = ???
  @annotation.compileTimeOnly("[field has_uri_scheme]: Field is missing <type>")
  private def hasUriScheme__ = ???
  @annotation.compileTimeOnly("[field get_uri_scheme]: Field is missing <type>")
  private def getUriScheme__ = ???
  @annotation.compileTimeOnly("[field get_basename]: Field is missing <type>")
  private def getBasename__ = ???
  @annotation.compileTimeOnly("[field get_path]: Field is missing <type>")
  private def getPath__ = ???
  @annotation.compileTimeOnly("[field get_uri]: Field is missing <type>")
  private def getUri__ = ???
  @annotation.compileTimeOnly("[field get_parse_name]: Field is missing <type>")
  private def getParseName__ = ???
  @annotation.compileTimeOnly("[field get_parent]: Field is missing <type>")
  private def getParent__ = ???
  @annotation.compileTimeOnly("[field prefix_matches]: Field is missing <type>")
  private def prefixMatches__ = ???
  @annotation.compileTimeOnly(
    "[field get_relative_path]: Field is missing <type>"
  )
  private def getRelativePath__ = ???
  @annotation.compileTimeOnly(
    "[field resolve_relative_path]: Field is missing <type>"
  )
  private def resolveRelativePath__ = ???
  @annotation.compileTimeOnly(
    "[field get_child_for_display_name]: Field is missing <type>"
  )
  private def getChildForDisplayName__ = ???
  @annotation.compileTimeOnly(
    "[field enumerate_children]: Field is missing <type>"
  )
  private def enumerateChildren__ = ???
  @annotation.compileTimeOnly(
    "[field enumerate_children_async]: Field is missing <type>"
  )
  private def enumerateChildrenAsync__ = ???
  @annotation.compileTimeOnly(
    "[field enumerate_children_finish]: Field is missing <type>"
  )
  private def enumerateChildrenFinish__ = ???
  @annotation.compileTimeOnly("[field query_info]: Field is missing <type>")
  private def queryInfo__ = ???
  @annotation.compileTimeOnly(
    "[field query_info_async]: Field is missing <type>"
  )
  private def queryInfoAsync__ = ???
  @annotation.compileTimeOnly(
    "[field query_info_finish]: Field is missing <type>"
  )
  private def queryInfoFinish__ = ???
  @annotation.compileTimeOnly(
    "[field query_filesystem_info]: Field is missing <type>"
  )
  private def queryFilesystemInfo__ = ???
  @annotation.compileTimeOnly(
    "[field query_filesystem_info_async]: Field is missing <type>"
  )
  private def queryFilesystemInfoAsync__ = ???
  @annotation.compileTimeOnly(
    "[field query_filesystem_info_finish]: Field is missing <type>"
  )
  private def queryFilesystemInfoFinish__ = ???
  @annotation.compileTimeOnly(
    "[field find_enclosing_mount]: Field is missing <type>"
  )
  private def findEnclosingMount__ = ???
  @annotation.compileTimeOnly(
    "[field find_enclosing_mount_async]: Field is missing <type>"
  )
  private def findEnclosingMountAsync__ = ???
  @annotation.compileTimeOnly(
    "[field find_enclosing_mount_finish]: Field is missing <type>"
  )
  private def findEnclosingMountFinish__ = ???
  @annotation.compileTimeOnly(
    "[field set_display_name]: Field is missing <type>"
  )
  private def setDisplayName__ = ???
  @annotation.compileTimeOnly(
    "[field set_display_name_async]: Field is missing <type>"
  )
  private def setDisplayNameAsync__ = ???
  @annotation.compileTimeOnly(
    "[field set_display_name_finish]: Field is missing <type>"
  )
  private def setDisplayNameFinish__ = ???
  @annotation.compileTimeOnly(
    "[field query_settable_attributes]: Field is missing <type>"
  )
  private def querySettableAttributes__ = ???
  @annotation.compileTimeOnly(
    "[field _query_settable_attributes_async]: Field is missing <type>"
  )
  private def QuerySettableAttributesAsync__ = ???
  @annotation.compileTimeOnly(
    "[field _query_settable_attributes_finish]: Field is missing <type>"
  )
  private def QuerySettableAttributesFinish__ = ???
  @annotation.compileTimeOnly(
    "[field query_writable_namespaces]: Field is missing <type>"
  )
  private def queryWritableNamespaces__ = ???
  @annotation.compileTimeOnly(
    "[field _query_writable_namespaces_async]: Field is missing <type>"
  )
  private def QueryWritableNamespacesAsync__ = ???
  @annotation.compileTimeOnly(
    "[field _query_writable_namespaces_finish]: Field is missing <type>"
  )
  private def QueryWritableNamespacesFinish__ = ???
  @annotation.compileTimeOnly("[field set_attribute]: Field is missing <type>")
  private def setAttribute__ = ???
  @annotation.compileTimeOnly(
    "[field set_attributes_from_info]: Field is missing <type>"
  )
  private def setAttributesFromInfo__ = ???
  @annotation.compileTimeOnly(
    "[field set_attributes_async]: Field is missing <type>"
  )
  private def setAttributesAsync__ = ???
  @annotation.compileTimeOnly(
    "[field set_attributes_finish]: Field is missing <type>"
  )
  private def setAttributesFinish__ = ???
  @annotation.compileTimeOnly("[field read_fn]: Field is missing <type>")
  private def readFn__ = ???
  @annotation.compileTimeOnly("[field read_async]: Field is missing <type>")
  private def readAsync__ = ???
  @annotation.compileTimeOnly("[field read_finish]: Field is missing <type>")
  private def readFinish__ = ???
  @annotation.compileTimeOnly("[field append_to]: Field is missing <type>")
  private def appendTo__ = ???
  @annotation.compileTimeOnly(
    "[field append_to_async]: Field is missing <type>"
  )
  private def appendToAsync__ = ???
  @annotation.compileTimeOnly(
    "[field append_to_finish]: Field is missing <type>"
  )
  private def appendToFinish__ = ???
  @annotation.compileTimeOnly("[field create]: Field is missing <type>")
  private def create__ = ???
  @annotation.compileTimeOnly("[field create_async]: Field is missing <type>")
  private def createAsync__ = ???
  @annotation.compileTimeOnly("[field create_finish]: Field is missing <type>")
  private def createFinish__ = ???
  @annotation.compileTimeOnly("[field replace]: Field is missing <type>")
  private def replace__ = ???
  @annotation.compileTimeOnly("[field replace_async]: Field is missing <type>")
  private def replaceAsync__ = ???
  @annotation.compileTimeOnly("[field replace_finish]: Field is missing <type>")
  private def replaceFinish__ = ???
  @annotation.compileTimeOnly("[field delete_file]: Field is missing <type>")
  private def deleteFile__ = ???
  @annotation.compileTimeOnly(
    "[field delete_file_async]: Field is missing <type>"
  )
  private def deleteFileAsync__ = ???
  @annotation.compileTimeOnly(
    "[field delete_file_finish]: Field is missing <type>"
  )
  private def deleteFileFinish__ = ???
  @annotation.compileTimeOnly("[field trash]: Field is missing <type>")
  private def trash__ = ???
  @annotation.compileTimeOnly("[field trash_async]: Field is missing <type>")
  private def trashAsync__ = ???
  @annotation.compileTimeOnly("[field trash_finish]: Field is missing <type>")
  private def trashFinish__ = ???
  @annotation.compileTimeOnly("[field make_directory]: Field is missing <type>")
  private def makeDirectory__ = ???
  @annotation.compileTimeOnly(
    "[field make_directory_async]: Field is missing <type>"
  )
  private def makeDirectoryAsync__ = ???
  @annotation.compileTimeOnly(
    "[field make_directory_finish]: Field is missing <type>"
  )
  private def makeDirectoryFinish__ = ???
  @annotation.compileTimeOnly(
    "[field make_symbolic_link]: Field is missing <type>"
  )
  private def makeSymbolicLink__ = ???
  @annotation.compileTimeOnly(
    "[field make_symbolic_link_async]: Field is missing <type>"
  )
  private def makeSymbolicLinkAsync__ = ???
  @annotation.compileTimeOnly(
    "[field make_symbolic_link_finish]: Field is missing <type>"
  )
  private def makeSymbolicLinkFinish__ = ???
  @annotation.compileTimeOnly("[field copy]: Field is missing <type>")
  private def copy__ = ???
  @annotation.compileTimeOnly("[field copy_async]: Field is missing <type>")
  private def copyAsync__ = ???
  @annotation.compileTimeOnly("[field copy_finish]: Field is missing <type>")
  private def copyFinish__ = ???
  @annotation.compileTimeOnly("[field move]: Field is missing <type>")
  private def move__ = ???
  @annotation.compileTimeOnly("[field move_async]: Field is missing <type>")
  private def moveAsync__ = ???
  @annotation.compileTimeOnly("[field move_finish]: Field is missing <type>")
  private def moveFinish__ = ???
  @annotation.compileTimeOnly(
    "[field mount_mountable]: Field is missing <type>"
  )
  private def mountMountable__ = ???
  @annotation.compileTimeOnly(
    "[field mount_mountable_finish]: Field is missing <type>"
  )
  private def mountMountableFinish__ = ???
  @annotation.compileTimeOnly(
    "[field unmount_mountable]: Field is missing <type>"
  )
  private def unmountMountable__ = ???
  @annotation.compileTimeOnly(
    "[field unmount_mountable_finish]: Field is missing <type>"
  )
  private def unmountMountableFinish__ = ???
  @annotation.compileTimeOnly(
    "[field eject_mountable]: Field is missing <type>"
  )
  private def ejectMountable__ = ???
  @annotation.compileTimeOnly(
    "[field eject_mountable_finish]: Field is missing <type>"
  )
  private def ejectMountableFinish__ = ???
  @annotation.compileTimeOnly(
    "[field mount_enclosing_volume]: Field is missing <type>"
  )
  private def mountEnclosingVolume__ = ???
  @annotation.compileTimeOnly(
    "[field mount_enclosing_volume_finish]: Field is missing <type>"
  )
  private def mountEnclosingVolumeFinish__ = ???
  @annotation.compileTimeOnly("[field monitor_dir]: Field is missing <type>")
  private def monitorDir__ = ???
  @annotation.compileTimeOnly("[field monitor_file]: Field is missing <type>")
  private def monitorFile__ = ???
  @annotation.compileTimeOnly("[field open_readwrite]: Field is missing <type>")
  private def openReadwrite__ = ???
  @annotation.compileTimeOnly(
    "[field open_readwrite_async]: Field is missing <type>"
  )
  private def openReadwriteAsync__ = ???
  @annotation.compileTimeOnly(
    "[field open_readwrite_finish]: Field is missing <type>"
  )
  private def openReadwriteFinish__ = ???
  @annotation.compileTimeOnly(
    "[field create_readwrite]: Field is missing <type>"
  )
  private def createReadwrite__ = ???
  @annotation.compileTimeOnly(
    "[field create_readwrite_async]: Field is missing <type>"
  )
  private def createReadwriteAsync__ = ???
  @annotation.compileTimeOnly(
    "[field create_readwrite_finish]: Field is missing <type>"
  )
  private def createReadwriteFinish__ = ???
  @annotation.compileTimeOnly(
    "[field replace_readwrite]: Field is missing <type>"
  )
  private def replaceReadwrite__ = ???
  @annotation.compileTimeOnly(
    "[field replace_readwrite_async]: Field is missing <type>"
  )
  private def replaceReadwriteAsync__ = ???
  @annotation.compileTimeOnly(
    "[field replace_readwrite_finish]: Field is missing <type>"
  )
  private def replaceReadwriteFinish__ = ???
  @annotation.compileTimeOnly(
    "[field start_mountable]: Field is missing <type>"
  )
  private def startMountable__ = ???
  @annotation.compileTimeOnly(
    "[field start_mountable_finish]: Field is missing <type>"
  )
  private def startMountableFinish__ = ???
  @annotation.compileTimeOnly("[field stop_mountable]: Field is missing <type>")
  private def stopMountable__ = ???
  @annotation.compileTimeOnly(
    "[field stop_mountable_finish]: Field is missing <type>"
  )
  private def stopMountableFinish__ = ???

  /** a boolean that indicates whether the #GFile implementation supports
    * thread-default contexts. Since 2.22.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsThreadContexts: Boolean /* None */ =
    (!raw).supports_thread_contexts
      .asInstanceOf[_root_.sn.gnome.glib.internal.gboolean]
  @annotation.compileTimeOnly(
    "[field unmount_mountable_with_operation]: Field is missing <type>"
  )
  private def unmountMountableWithOperation__ = ???
  @annotation.compileTimeOnly(
    "[field unmount_mountable_with_operation_finish]: Field is missing <type>"
  )
  private def unmountMountableWithOperationFinish__ = ???
  @annotation.compileTimeOnly(
    "[field eject_mountable_with_operation]: Field is missing <type>"
  )
  private def ejectMountableWithOperation__ = ???
  @annotation.compileTimeOnly(
    "[field eject_mountable_with_operation_finish]: Field is missing <type>"
  )
  private def ejectMountableWithOperationFinish__ = ???
  @annotation.compileTimeOnly("[field poll_mountable]: Field is missing <type>")
  private def pollMountable__ = ???
  @annotation.compileTimeOnly(
    "[field poll_mountable_finish]: Field is missing <type>"
  )
  private def pollMountableFinish__ = ???
  @annotation.compileTimeOnly(
    "[field measure_disk_usage]: Field is missing <type>"
  )
  private def measureDiskUsage__ = ???
  @annotation.compileTimeOnly(
    "[field measure_disk_usage_async]: Field is missing <type>"
  )
  private def measureDiskUsageAsync__ = ???
  @annotation.compileTimeOnly(
    "[field measure_disk_usage_finish]: Field is missing <type>"
  )
  private def measureDiskUsageFinish__ = ???
end FileIface

object FileIface:
  def fromRaw(ptr: Ptr[GFileIface]): FileIface = new FileIface(ptr)
end FileIface
