package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecULong
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for unsigned
  * long integer properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecULong private[gnome] (raw: Ptr[GParamSpecULong])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecULong

object ParamSpecULong:
  def applyUnsafe(ptr: Ptr[GParamSpecULong])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecULong](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecULong(ptr)
    )

end ParamSpecULong
