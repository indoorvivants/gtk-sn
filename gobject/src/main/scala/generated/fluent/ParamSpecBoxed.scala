package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecBoxed
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for boxed
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecBoxed private[gnome] (raw: Ptr[GParamSpecBoxed])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecBoxed

object ParamSpecBoxed:
  def applyUnsafe(ptr: Ptr[GParamSpecBoxed])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecBoxed](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecBoxed(ptr)
    )

end ParamSpecBoxed
