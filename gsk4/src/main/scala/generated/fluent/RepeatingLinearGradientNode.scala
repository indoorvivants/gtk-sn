package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskRepeatingLinearGradientNode

/** A render node for a repeating linear gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RepeatingLinearGradientNode private[gnome] (
    raw: Ptr[GskRepeatingLinearGradientNode]
) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingLinearGradientNode

object RepeatingLinearGradientNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskRepeatingLinearGradientNode])(using Runtime) =
    summon[Runtime].getOrCreate[RepeatingLinearGradientNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RepeatingLinearGradientNode(ptr)
    )

  /** Creates a `GskRenderNode` that will create a repeating linear gradient
    * from the given points and color stops, and render that into the area given
    * by @bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/bounds]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def apply() = ???

end RepeatingLinearGradientNode
