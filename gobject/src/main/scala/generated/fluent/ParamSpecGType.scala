package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecGType
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for #GType
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecGType private[gnome] (raw: Ptr[GParamSpecGType])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecGType

object ParamSpecGType:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecGType])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecGType](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecGType(ptr)
    )

end ParamSpecGType
