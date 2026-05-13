package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecInt
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for integer
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecInt private[gnome] (raw: Ptr[GParamSpecInt])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecInt

object ParamSpecInt:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecInt])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecInt](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecInt(ptr)
    )

end ParamSpecInt
