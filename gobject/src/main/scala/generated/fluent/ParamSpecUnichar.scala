package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecUnichar
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for unichar
  * (unsigned integer) properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecUnichar private[gnome] (raw: Ptr[GParamSpecUnichar])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecUnichar

object ParamSpecUnichar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecUnichar])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecUnichar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecUnichar(ptr)
    )

end ParamSpecUnichar
