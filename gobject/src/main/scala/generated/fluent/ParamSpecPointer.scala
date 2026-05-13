package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GParamSpecPointer
import sn.gnome.gobject.runtime.*

/** A #GParamSpec derived structure that contains the meta data for pointer
  * properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecPointer private[gnome] (raw: Ptr[GParamSpecPointer])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecPointer

object ParamSpecPointer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GParamSpecPointer])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecPointer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecPointer(ptr)
    )

end ParamSpecPointer
