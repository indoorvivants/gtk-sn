package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkFixedLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FixedLayoutChild private[gnome] (raw: Ptr[GtkFixedLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the transformation of the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_transform/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def getTransform__ = ???

  /** Sets the transformation of the child of a `GtkFixedLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_transform/<method parameters>/transform]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  private def setTransform__ = ???

end FixedLayoutChild

object FixedLayoutChild:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFixedLayoutChild])(using Runtime) =
    summon[Runtime].getOrCreate[FixedLayoutChild](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FixedLayoutChild(ptr)
    )

end FixedLayoutChild
