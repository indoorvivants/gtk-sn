package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecDouble
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for double
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecDouble private[gnome] (raw: Ptr[GParamSpecDouble])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecDouble

object ParamSpecDouble:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecDouble])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecDouble](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecDouble(ptr)
    )

end ParamSpecDouble
