package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecEnum
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for enum
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecEnum private[gnome] (raw: Ptr[GParamSpecEnum])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecEnum

object ParamSpecEnum:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecEnum])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecEnum](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecEnum(ptr)
    )

end ParamSpecEnum
