package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskColorNode

/** A render node for a solid color.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorNode private[gnome] (raw: Ptr[GskColorNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the color of the given @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getColor__ = ???

end ColorNode

object ColorNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskColorNode])(using Runtime) =
    summon[Runtime].getOrCreate[ColorNode](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColorNode(ptr)
    )

  /** Creates a `GskRenderNode` that will render the color specified by @rgba
    * into the area given by @bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/rgba]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def apply() = ???

end ColorNode
