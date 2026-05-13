package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.LayoutChild
import sn.gnome.gtk4.internal.GtkConstraintLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConstraintLayoutChild private[gnome] (raw: Ptr[GtkConstraintLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ConstraintLayoutChild

object ConstraintLayoutChild:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkConstraintLayoutChild])(using Runtime) =
    summon[Runtime].getOrCreate[ConstraintLayoutChild](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ConstraintLayoutChild(ptr)
    )

end ConstraintLayoutChild
