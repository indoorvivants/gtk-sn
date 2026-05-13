package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecUInt64
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for unsigned
  * 64bit integer properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecUInt64 private[gnome] (raw: Ptr[GParamSpecUInt64])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecUInt64

object ParamSpecUInt64:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecUInt64])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecUInt64](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecUInt64(ptr)
    )

end ParamSpecUInt64
