package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GVolumeIface
import sn.gnome.gobject.TypeInterface

/** Interface for implementing operations for mountable volumes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VolumeIface private[gnome] (raw: Ptr[GVolumeIface]):

  def getUnsafeRawPointer(): Ptr[GVolumeIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field removed]: Field is missing <type>")
  private def removed__ = ???
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly("[field get_icon]: Field is missing <type>")
  private def getIcon__ = ???
  @annotation.compileTimeOnly("[field get_uuid]: Field is missing <type>")
  private def getUuid__ = ???
  @annotation.compileTimeOnly("[field get_drive]: Field is missing <type>")
  private def getDrive__ = ???
  @annotation.compileTimeOnly("[field get_mount]: Field is missing <type>")
  private def getMount__ = ???
  @annotation.compileTimeOnly("[field can_mount]: Field is missing <type>")
  private def canMount__ = ???
  @annotation.compileTimeOnly("[field can_eject]: Field is missing <type>")
  private def canEject__ = ???
  @annotation.compileTimeOnly("[field mount_fn]: Field is missing <type>")
  private def mountFn__ = ???
  @annotation.compileTimeOnly("[field mount_finish]: Field is missing <type>")
  private def mountFinish__ = ???
  @annotation.compileTimeOnly("[field eject]: Field is missing <type>")
  private def eject__ = ???
  @annotation.compileTimeOnly("[field eject_finish]: Field is missing <type>")
  private def ejectFinish__ = ???
  @annotation.compileTimeOnly("[field get_identifier]: Field is missing <type>")
  private def getIdentifier__ = ???
  @annotation.compileTimeOnly(
    "[field enumerate_identifiers]: Field is missing <type>"
  )
  private def enumerateIdentifiers__ = ???
  @annotation.compileTimeOnly(
    "[field should_automount]: Field is missing <type>"
  )
  private def shouldAutomount__ = ???
  @annotation.compileTimeOnly(
    "[field get_activation_root]: Field is missing <type>"
  )
  private def getActivationRoot__ = ???
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
end VolumeIface

object VolumeIface:
  def fromRaw(ptr: Ptr[GVolumeIface]): VolumeIface = new VolumeIface(ptr)
end VolumeIface
