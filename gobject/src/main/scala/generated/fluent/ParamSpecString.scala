package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecString
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for string
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecString private[gnome] (raw: Ptr[GParamSpecString])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecString

object ParamSpecString:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecString])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecString](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecString(ptr)
    )

end ParamSpecString
