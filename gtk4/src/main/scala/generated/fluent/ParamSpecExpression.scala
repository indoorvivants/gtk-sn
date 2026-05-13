package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ParamSpec
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkParamSpecExpression

/** A `GParamSpec` for properties holding a `GtkExpression`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamSpecExpression private[gnome] (raw: Ptr[GtkParamSpecExpression])
    extends ParamSpec(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ParamSpecExpression

object ParamSpecExpression:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkParamSpecExpression])(using Runtime) =
    summon[Runtime].getOrCreate[ParamSpecExpression](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ParamSpecExpression(ptr)
    )

end ParamSpecExpression
