package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRepeatingRadialGradientNode

/** A render node for a repeating radial gradient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RepeatingRadialGradientNode private[gnome] (
    raw: Ptr[GskRepeatingRadialGradientNode]
) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingRadialGradientNode

object RepeatingRadialGradientNode:
  def applyUnsafe(ptr: Ptr[GskRepeatingRadialGradientNode])(using Runtime) =
    summon[Runtime].getOrCreate[RepeatingRadialGradientNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new RepeatingRadialGradientNode(ptr)
    )

  /** Creates a `GskRenderNode` that draws a repeating radial gradient.
    *
    * The radial gradient starts around @center. The size of the gradient is
    * dictated by @hradius in horizontal orientation and by @vradius in vertical
    * orientation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bounds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  private def `new`() = ???

end RepeatingRadialGradientNode
