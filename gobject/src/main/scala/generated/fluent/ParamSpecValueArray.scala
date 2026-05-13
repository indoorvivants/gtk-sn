package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.internal.GParamSpecValueArray
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for #GValueArray
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecValueArray private[gnome] (raw: Ptr[GParamSpecValueArray])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecValueArray

object ParamSpecValueArray:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecValueArray])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecValueArray](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecValueArray(ptr)
    )

end ParamSpecValueArray
