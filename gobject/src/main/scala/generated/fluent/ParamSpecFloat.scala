package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecFloat
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for float
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecFloat private[gnome] (raw: Ptr[GParamSpecFloat])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecFloat

object ParamSpecFloat:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecFloat])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecFloat](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecFloat(ptr)
    )

end ParamSpecFloat
