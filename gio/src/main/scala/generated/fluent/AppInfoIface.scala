package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAppInfoIface
import sn.gnome.gobject.TypeInterface

/** Application Information interface, for operating system portability.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppInfoIface private[gnome] (raw: Ptr[GAppInfoIface]):

  def getUnsafeRawPointer(): Ptr[GAppInfoIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field dup]: Field is missing <type>")
  private def dup__ = ???
  @annotation.compileTimeOnly("[field equal]: Field is missing <type>")
  private def equal__ = ???
  @annotation.compileTimeOnly("[field get_id]: Field is missing <type>")
  private def getId__ = ???
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly(
    "[field get_description]: Field is missing <type>"
  )
  private def getDescription__ = ???
  @annotation.compileTimeOnly("[field get_executable]: Field is missing <type>")
  private def getExecutable__ = ???
  @annotation.compileTimeOnly("[field get_icon]: Field is missing <type>")
  private def getIcon__ = ???
  @annotation.compileTimeOnly("[field launch]: Field is missing <type>")
  private def launch__ = ???
  @annotation.compileTimeOnly("[field supports_uris]: Field is missing <type>")
  private def supportsUris__ = ???
  @annotation.compileTimeOnly("[field supports_files]: Field is missing <type>")
  private def supportsFiles__ = ???
  @annotation.compileTimeOnly("[field launch_uris]: Field is missing <type>")
  private def launchUris__ = ???
  @annotation.compileTimeOnly("[field should_show]: Field is missing <type>")
  private def shouldShow__ = ???
  @annotation.compileTimeOnly(
    "[field set_as_default_for_type]: Field is missing <type>"
  )
  private def setAsDefaultForType__ = ???
  @annotation.compileTimeOnly(
    "[field set_as_default_for_extension]: Field is missing <type>"
  )
  private def setAsDefaultForExtension__ = ???
  @annotation.compileTimeOnly(
    "[field add_supports_type]: Field is missing <type>"
  )
  private def addSupportsType__ = ???
  @annotation.compileTimeOnly(
    "[field can_remove_supports_type]: Field is missing <type>"
  )
  private def canRemoveSupportsType__ = ???
  @annotation.compileTimeOnly(
    "[field remove_supports_type]: Field is missing <type>"
  )
  private def removeSupportsType__ = ???
  @annotation.compileTimeOnly("[field can_delete]: Field is missing <type>")
  private def canDelete__ = ???
  @annotation.compileTimeOnly("[field do_delete]: Field is missing <type>")
  private def doDelete__ = ???
  @annotation.compileTimeOnly(
    "[field get_commandline]: Field is missing <type>"
  )
  private def getCommandline__ = ???
  @annotation.compileTimeOnly(
    "[field get_display_name]: Field is missing <type>"
  )
  private def getDisplayName__ = ???
  @annotation.compileTimeOnly(
    "[field set_as_last_used_for_type]: Field is missing <type>"
  )
  private def setAsLastUsedForType__ = ???
  @annotation.compileTimeOnly(
    "[field get_supported_types]: Field is missing <type>"
  )
  private def getSupportedTypes__ = ???
  @annotation.compileTimeOnly(
    "[field launch_uris_async]: Field is missing <type>"
  )
  private def launchUrisAsync__ = ???
  @annotation.compileTimeOnly(
    "[field launch_uris_finish]: Field is missing <type>"
  )
  private def launchUrisFinish__ = ???
end AppInfoIface

object AppInfoIface:
  def fromRaw(ptr: Ptr[GAppInfoIface]): AppInfoIface = new AppInfoIface(ptr)
end AppInfoIface
