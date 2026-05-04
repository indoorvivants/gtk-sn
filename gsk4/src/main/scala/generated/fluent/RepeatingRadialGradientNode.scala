package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRepeatingRadialGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a repeating radial gradient.
  */
class RepeatingRadialGradientNode(raw: Ptr[GskRepeatingRadialGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingRadialGradientNode

object RepeatingRadialGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that draws a repeating radial gradient.
    *
    * The radial gradient starts around @center. The size of the gradient is
    * dictated by @hradius in horizontal orientation and by @vradius in vertical
    * orientation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def `new`() = ???

end RepeatingRadialGradientNode
