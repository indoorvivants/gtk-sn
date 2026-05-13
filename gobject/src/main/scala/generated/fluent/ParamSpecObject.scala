package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecObject
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for object
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecObject private[gnome] (raw: Ptr[GParamSpecObject])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecObject

object ParamSpecObject:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecObject])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecObject](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecObject(ptr)
    )

end ParamSpecObject
