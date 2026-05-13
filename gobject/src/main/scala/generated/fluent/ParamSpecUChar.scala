package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecUChar
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for unsigned
  * character properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecUChar private[gnome] (raw: Ptr[GParamSpecUChar])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecUChar

object ParamSpecUChar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecUChar])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecUChar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecUChar(ptr)
    )

end ParamSpecUChar
