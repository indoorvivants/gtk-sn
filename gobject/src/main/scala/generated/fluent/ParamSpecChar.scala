package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecChar
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for character
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecChar private[gnome] (raw: Ptr[GParamSpecChar])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecChar

object ParamSpecChar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecChar])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecChar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecChar(ptr)
    )

end ParamSpecChar
