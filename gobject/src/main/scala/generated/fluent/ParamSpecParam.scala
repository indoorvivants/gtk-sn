package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecParam
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for
  * %G_TYPE_PARAM properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecParam private[gnome] (raw: Ptr[GParamSpecParam])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecParam

object ParamSpecParam:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecParam])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecParam](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecParam(ptr)
    )

end ParamSpecParam
