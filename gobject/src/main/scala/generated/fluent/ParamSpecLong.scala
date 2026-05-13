package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecLong
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for long integer
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecLong private[gnome] (raw: Ptr[GParamSpecLong])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecLong

object ParamSpecLong:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecLong])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecLong](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecLong(ptr)
    )

end ParamSpecLong
