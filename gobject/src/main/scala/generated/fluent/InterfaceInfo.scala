package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.internal.GInterfaceInfo

/** A structure that provides information to the type system which is used
  * specifically for managing interface types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InterfaceInfo private[gnome] (raw: Ptr[GInterfaceInfo]):

  def getUnsafeRawPointer(): Ptr[GInterfaceInfo] = this.raw

  /** location of the interface initialization function
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field interface_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(InterfaceInitFunc), @type -> DataRecord(GInterfaceInitFunc)))"
  )
  private def interfaceInit__ = ???

  /** location of the interface finalization function
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field interface_finalize]: Cannot render type Type(List(),ListMap(@name -> DataRecord(InterfaceFinalizeFunc), @type -> DataRecord(GInterfaceFinalizeFunc)))"
  )
  private def interfaceFinalize__ = ???

  /** user-supplied data passed to the interface init/finalize functions
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def interfaceData: Ptr[Byte] /* None */ =
    (!raw).interface_data.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** user-supplied data passed to the interface init/finalize functions
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def interfaceData_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).interface_data_=(
      gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    )
end InterfaceInfo

object InterfaceInfo:
  def fromRaw(ptr: Ptr[GInterfaceInfo]): InterfaceInfo = new InterfaceInfo(ptr)
end InterfaceInfo
