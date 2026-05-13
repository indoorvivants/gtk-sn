package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecInt64
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for 64bit
  * integer properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecInt64 private[gnome] (raw: Ptr[GParamSpecInt64])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecInt64

object ParamSpecInt64:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecInt64])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecInt64](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecInt64(ptr)
    )

end ParamSpecInt64
