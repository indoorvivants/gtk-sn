package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskRepeatingLinearGradientNode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node for a repeating linear gradient.
  */
class RepeatingLinearGradientNode(raw: Ptr[GskRepeatingLinearGradientNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end RepeatingLinearGradientNode

object RepeatingLinearGradientNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GskRenderNode` that will create a repeating linear gradient
    * from the given points and color stops, and render that into the area given
    * by @bounds.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Rect), @type -> DataRecord(const graphene_rect_t*)))"
  )
  def `new`() = ???

end RepeatingLinearGradientNode
