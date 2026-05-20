package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMountIface
import sn.gnome.gobject.TypeInterface

/** Interface for implementing operations for mounts.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MountIface private[gnome] (raw: Ptr[GMountIface]):

  def getUnsafeRawPointer(): Ptr[GMountIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field unmounted]: Field is missing <type>")
  private def unmounted__ = ???
  @annotation.compileTimeOnly("[field get_root]: Field is missing <type>")
  private def getRoot__ = ???
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly("[field get_icon]: Field is missing <type>")
  private def getIcon__ = ???
  @annotation.compileTimeOnly("[field get_uuid]: Field is missing <type>")
  private def getUuid__ = ???
  @annotation.compileTimeOnly("[field get_volume]: Field is missing <type>")
  private def getVolume__ = ???
  @annotation.compileTimeOnly("[field get_drive]: Field is missing <type>")
  private def getDrive__ = ???
  @annotation.compileTimeOnly("[field can_unmount]: Field is missing <type>")
  private def canUnmount__ = ???
  @annotation.compileTimeOnly("[field can_eject]: Field is missing <type>")
  private def canEject__ = ???
  @annotation.compileTimeOnly("[field unmount]: Field is missing <type>")
  private def unmount__ = ???
  @annotation.compileTimeOnly("[field unmount_finish]: Field is missing <type>")
  private def unmountFinish__ = ???
  @annotation.compileTimeOnly("[field eject]: Field is missing <type>")
  private def eject__ = ???
  @annotation.compileTimeOnly("[field eject_finish]: Field is missing <type>")
  private def ejectFinish__ = ???
  @annotation.compileTimeOnly("[field remount]: Field is missing <type>")
  private def remount__ = ???
  @annotation.compileTimeOnly("[field remount_finish]: Field is missing <type>")
  private def remountFinish__ = ???
  @annotation.compileTimeOnly(
    "[field guess_content_type]: Field is missing <type>"
  )
  private def guessContentType__ = ???
  @annotation.compileTimeOnly(
    "[field guess_content_type_finish]: Field is missing <type>"
  )
  private def guessContentTypeFinish__ = ???
  @annotation.compileTimeOnly(
    "[field guess_content_type_sync]: Field is missing <type>"
  )
  private def guessContentTypeSync__ = ???
  @annotation.compileTimeOnly("[field pre_unmount]: Field is missing <type>")
  private def preUnmount__ = ???
  @annotation.compileTimeOnly(
    "[field unmount_with_operation]: Field is missing <type>"
  )
  private def unmountWithOperation__ = ???
  @annotation.compileTimeOnly(
    "[field unmount_with_operation_finish]: Field is missing <type>"
  )
  private def unmountWithOperationFinish__ = ???
  @annotation.compileTimeOnly(
    "[field eject_with_operation]: Field is missing <type>"
  )
  private def ejectWithOperation__ = ???
  @annotation.compileTimeOnly(
    "[field eject_with_operation_finish]: Field is missing <type>"
  )
  private def ejectWithOperationFinish__ = ???
  @annotation.compileTimeOnly(
    "[field get_default_location]: Field is missing <type>"
  )
  private def getDefaultLocation__ = ???
  @annotation.compileTimeOnly("[field get_sort_key]: Field is missing <type>")
  private def getSortKey__ = ???
  @annotation.compileTimeOnly(
    "[field get_symbolic_icon]: Field is missing <type>"
  )
  private def getSymbolicIcon__ = ???
end MountIface

object MountIface:
  def fromRaw(ptr: Ptr[GMountIface]): MountIface = new MountIface(ptr)
end MountIface
