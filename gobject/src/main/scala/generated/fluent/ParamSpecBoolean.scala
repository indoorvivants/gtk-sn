package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecBoolean
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for boolean
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecBoolean private[gnome] (raw: Ptr[GParamSpecBoolean])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecBoolean

object ParamSpecBoolean:
  def applyUnsafe(ptr: Ptr[GParamSpecBoolean])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecBoolean](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecBoolean(ptr)
    )

end ParamSpecBoolean
