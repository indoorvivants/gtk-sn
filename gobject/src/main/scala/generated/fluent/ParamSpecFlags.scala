package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecFlags
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for flags
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecFlags private[gnome] (raw: Ptr[GParamSpecFlags])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecFlags

object ParamSpecFlags:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecFlags])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecFlags](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecFlags(ptr)
    )

end ParamSpecFlags
