package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDriveIface
import sn.gnome.gobject.TypeInterface

/** Interface for creating #GDrive implementations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DriveIface private[gnome] (raw: Ptr[GDriveIface]):

  def getUnsafeRawPointer(): Ptr[GDriveIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field disconnected]: Field is missing <type>")
  private def disconnected__ = ???
  @annotation.compileTimeOnly("[field eject_button]: Field is missing <type>")
  private def ejectButton__ = ???
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly("[field get_icon]: Field is missing <type>")
  private def getIcon__ = ???
  @annotation.compileTimeOnly("[field has_volumes]: Field is missing <type>")
  private def hasVolumes__ = ???
  @annotation.compileTimeOnly("[field get_volumes]: Field is missing <type>")
  private def getVolumes__ = ???
  @annotation.compileTimeOnly(
    "[field is_media_removable]: Field is missing <type>"
  )
  private def isMediaRemovable__ = ???
  @annotation.compileTimeOnly("[field has_media]: Field is missing <type>")
  private def hasMedia__ = ???
  @annotation.compileTimeOnly(
    "[field is_media_check_automatic]: Field is missing <type>"
  )
  private def isMediaCheckAutomatic__ = ???
  @annotation.compileTimeOnly("[field can_eject]: Field is missing <type>")
  private def canEject__ = ???
  @annotation.compileTimeOnly(
    "[field can_poll_for_media]: Field is missing <type>"
  )
  private def canPollForMedia__ = ???
  @annotation.compileTimeOnly("[field eject]: Field is missing <type>")
  private def eject__ = ???
  @annotation.compileTimeOnly("[field eject_finish]: Field is missing <type>")
  private def ejectFinish__ = ???
  @annotation.compileTimeOnly("[field poll_for_media]: Field is missing <type>")
  private def pollForMedia__ = ???
  @annotation.compileTimeOnly(
    "[field poll_for_media_finish]: Field is missing <type>"
  )
  private def pollForMediaFinish__ = ???
  @annotation.compileTimeOnly("[field get_identifier]: Field is missing <type>")
  private def getIdentifier__ = ???
  @annotation.compileTimeOnly(
    "[field enumerate_identifiers]: Field is missing <type>"
  )
  private def enumerateIdentifiers__ = ???
  @annotation.compileTimeOnly(
    "[field get_start_stop_type]: Field is missing <type>"
  )
  private def getStartStopType__ = ???
  @annotation.compileTimeOnly("[field can_start]: Field is missing <type>")
  private def canStart__ = ???
  @annotation.compileTimeOnly(
    "[field can_start_degraded]: Field is missing <type>"
  )
  private def canStartDegraded__ = ???
  @annotation.compileTimeOnly("[field start]: Field is missing <type>")
  private def start__ = ???
  @annotation.compileTimeOnly("[field start_finish]: Field is missing <type>")
  private def startFinish__ = ???
  @annotation.compileTimeOnly("[field can_stop]: Field is missing <type>")
  private def canStop__ = ???
  @annotation.compileTimeOnly("[field stop]: Field is missing <type>")
  private def stop__ = ???
  @annotation.compileTimeOnly("[field stop_finish]: Field is missing <type>")
  private def stopFinish__ = ???
  @annotation.compileTimeOnly("[field stop_button]: Field is missing <type>")
  private def stopButton__ = ???
  @annotation.compileTimeOnly(
    "[field eject_with_operation]: Field is missing <type>"
  )
  private def ejectWithOperation__ = ???
  @annotation.compileTimeOnly(
    "[field eject_with_operation_finish]: Field is missing <type>"
  )
  private def ejectWithOperationFinish__ = ???
  @annotation.compileTimeOnly("[field get_sort_key]: Field is missing <type>")
  private def getSortKey__ = ???
  @annotation.compileTimeOnly(
    "[field get_symbolic_icon]: Field is missing <type>"
  )
  private def getSymbolicIcon__ = ???
  @annotation.compileTimeOnly("[field is_removable]: Field is missing <type>")
  private def isRemovable__ = ???
end DriveIface

object DriveIface:
  def fromRaw(ptr: Ptr[GDriveIface]): DriveIface = new DriveIface(ptr)
end DriveIface
