package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecUInt
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for unsigned
  * integer properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecUInt private[gnome] (raw: Ptr[GParamSpecUInt])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecUInt

object ParamSpecUInt:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecUInt])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecUInt](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecUInt(ptr)
    )

end ParamSpecUInt
