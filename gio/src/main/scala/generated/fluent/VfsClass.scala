package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GVfsClass
import sn.gnome.gobject.ObjectClass

class VfsClass private[gnome] (raw: Ptr[GVfsClass]):

  def getUnsafeRawPointer(): Ptr[GVfsClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field is_active]: Field is missing <type>")
  private def isActive__ = ???
  @annotation.compileTimeOnly(
    "[field get_file_for_path]: Field is missing <type>"
  )
  private def getFileForPath__ = ???
  @annotation.compileTimeOnly(
    "[field get_file_for_uri]: Field is missing <type>"
  )
  private def getFileForUri__ = ???
  @annotation.compileTimeOnly(
    "[field get_supported_uri_schemes]: Field is missing <type>"
  )
  private def getSupportedUriSchemes__ = ???
  @annotation.compileTimeOnly("[field parse_name]: Field is missing <type>")
  private def parseName__ = ???
  @annotation.compileTimeOnly(
    "[field local_file_add_info]: Field is missing <type>"
  )
  private def localFileAddInfo__ = ???
  @annotation.compileTimeOnly(
    "[field add_writable_namespaces]: Field is missing <type>"
  )
  private def addWritableNamespaces__ = ???
  @annotation.compileTimeOnly(
    "[field local_file_set_attributes]: Field is missing <type>"
  )
  private def localFileSetAttributes__ = ???
  @annotation.compileTimeOnly(
    "[field local_file_removed]: Field is missing <type>"
  )
  private def localFileRemoved__ = ???
  @annotation.compileTimeOnly(
    "[field local_file_moved]: Field is missing <type>"
  )
  private def localFileMoved__ = ???
  @annotation.compileTimeOnly(
    "[field deserialize_icon]: Field is missing <type>"
  )
  private def deserializeIcon__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
end VfsClass

object VfsClass:
  def fromRaw(ptr: Ptr[GVfsClass]): VfsClass = new VfsClass(ptr)
end VfsClass
