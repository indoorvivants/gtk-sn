package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
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
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
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
    "[constructor new/color_stops]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(ColorStop), @type -> DataRecord(GskColorStop)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(7), @type -> DataRecord(const GskColorStop*)))"
  )
  private def apply() = ???

end RepeatingRadialGradientNode
